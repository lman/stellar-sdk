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

import static java.lang.Math.abs;
import static java.math.RoundingMode.HALF_EVEN;
import static java.math.RoundingMode.HALF_UP;
import static org.solteam.stellar.baseencoding.MathPreconditions.checkRoundingUnnecessary;
import static org.solteam.stellar.baseencoding.Preconditions.checkNotNull;

import java.math.RoundingMode;

@GwtCompatible(emulated = true)
public final class IntMath {

  public static int divide(int p, int q, RoundingMode mode) {
    checkNotNull(mode);
    if (q == 0) {
      throw new ArithmeticException("/ by zero"); // for GWT
    }
    int div = p / q;
    int rem = p - q * div; // equal to p % q

    if (rem == 0) {
      return div;
    }
    int signum = 1 | ((p ^ q) >> (Integer.SIZE - 1));
    boolean increment;
    switch (mode) {
      case UNNECESSARY:
        checkRoundingUnnecessary(rem == 0);
        // fall through
      case DOWN:
        increment = false;
        break;
      case UP:
        increment = true;
        break;
      case CEILING:
        increment = signum > 0;
        break;
      case FLOOR:
        increment = signum < 0;
        break;
      case HALF_EVEN:
      case HALF_DOWN:
      case HALF_UP:
        int absRem = abs(rem);
        int cmpRemToHalfDivisor = absRem - (abs(q) - absRem);
        // subtracting two nonnegative ints can't overflow
        // cmpRemToHalfDivisor has the same sign as compare(abs(rem), abs(q) / 2).
        if (cmpRemToHalfDivisor == 0) { // exactly on the half mark
          increment = (mode == HALF_UP || (mode == HALF_EVEN & (div & 1) != 0));
        } else {
          increment = cmpRemToHalfDivisor > 0; // closer to the UP value
        }
        break;
      default:
        throw new AssertionError();
    }
    return increment ? div + signum : div;
  }
}
