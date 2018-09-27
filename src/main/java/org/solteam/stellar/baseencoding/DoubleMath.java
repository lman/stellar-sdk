/*
 * Copyright (C) 2011 The Guava Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package org.solteam.stellar.baseencoding;


import java.math.RoundingMode;

import static java.lang.Math.getExponent;
import static org.solteam.stellar.baseencoding.DoubleUtils.IMPLICIT_BIT;
import static org.solteam.stellar.baseencoding.DoubleUtils.SIGNIFICAND_BITS;
import static org.solteam.stellar.baseencoding.DoubleUtils.getSignificand;
import static org.solteam.stellar.baseencoding.DoubleUtils.isFinite;
import static org.solteam.stellar.baseencoding.DoubleUtils.isNormal;
import static org.solteam.stellar.baseencoding.DoubleUtils.scaleNormalize;
import static org.solteam.stellar.baseencoding.MathPreconditions.checkRoundingUnnecessary;
import static org.solteam.stellar.baseencoding.Preconditions.checkArgument;

/**
 * A class for arithmetic on doubles that is not covered by {@link Math}.
 *
 * @author Louis Wasserman
 * @since 11.0
 */
@GwtCompatible(emulated = true)
public final class DoubleMath {

    @GwtIncompatible // com.google.common.math.DoubleUtils
    public static boolean isPowerOfTwo(double x) {
        if (x > 0.0 && isFinite(x)) {
            long significand = getSignificand(x);
            return (significand & (significand - 1)) == 0;
        }
        return false;
    }

    @GwtIncompatible // java.lang.Math.getExponent, com.google.common.math.DoubleUtils
    @SuppressWarnings("fallthrough")
    public static int log2(double x, RoundingMode mode) {
        checkArgument(x > 0.0 && isFinite(x), "x must be positive and finite");
        int exponent = getExponent(x);
        if (!isNormal(x)) {
            return log2(x * IMPLICIT_BIT, mode) - SIGNIFICAND_BITS;
            // Do the calculation on a normal value.
        }
        // x is positive, finite, and normal
        boolean increment;
        switch (mode) {
            case UNNECESSARY:
                checkRoundingUnnecessary(isPowerOfTwo(x));
                // fall through
            case FLOOR:
                increment = false;
                break;
            case CEILING:
                increment = !isPowerOfTwo(x);
                break;
            case DOWN:
                increment = exponent < 0 & !isPowerOfTwo(x);
                break;
            case UP:
                increment = exponent >= 0 & !isPowerOfTwo(x);
                break;
            case HALF_DOWN:
            case HALF_EVEN:
            case HALF_UP:
                double xScaled = scaleNormalize(x);
                // sqrt(2) is irrational, and the spec is relative to the "exact numerical result,"
                // so log2(x) is never exactly exponent + 0.5.
                increment = (xScaled * xScaled) > 2.0;
                break;
            default:
                throw new AssertionError();
        }
        return increment ? exponent + 1 : exponent;
    }

}
