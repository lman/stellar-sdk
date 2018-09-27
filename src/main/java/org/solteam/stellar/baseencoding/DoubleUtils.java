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

import static java.lang.Double.MAX_EXPONENT;
import static java.lang.Double.MIN_EXPONENT;
import static java.lang.Double.doubleToRawLongBits;
import static java.lang.Double.longBitsToDouble;
import static java.lang.Math.getExponent;
import static org.solteam.stellar.baseencoding.Preconditions.checkArgument;

@GwtIncompatible
final class DoubleUtils {
    private DoubleUtils() {
    }

    static final long ONE_BITS = 0x3ff0000000000000L;

    static final long SIGNIFICAND_MASK = 0x000fffffffffffffL;

    static final int SIGNIFICAND_BITS = 52;

    static final long IMPLICIT_BIT = SIGNIFICAND_MASK + 1;

    static long getSignificand(double d) {
        checkArgument(isFinite(d), "not a normal value");
        int exponent = getExponent(d);
        long bits = doubleToRawLongBits(d);
        bits &= SIGNIFICAND_MASK;
        return (exponent == MIN_EXPONENT - 1) ? bits << 1 : bits | IMPLICIT_BIT;
    }

    static boolean isFinite(double d) {
        return getExponent(d) <= MAX_EXPONENT;
    }

    static boolean isNormal(double d) {
        return getExponent(d) >= MIN_EXPONENT;
    }

    static double scaleNormalize(double x) {
        long significand = doubleToRawLongBits(x) & SIGNIFICAND_MASK;
        return longBitsToDouble(significand | ONE_BITS);
    }

}
