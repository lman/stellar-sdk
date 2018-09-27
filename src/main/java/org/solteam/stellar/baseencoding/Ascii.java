/*
 * Copyright (C) 2010 The Guava Authors
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

@GwtCompatible
public final class Ascii {

  private Ascii() {}

  public static final char MAX = 127;

  private static final char CASE_MASK = 0x20;

  public static String toLowerCase(String string) {
    int length = string.length();
    for (int i = 0; i < length; i++) {
      if (isUpperCase(string.charAt(i))) {
        char[] chars = string.toCharArray();
        for (; i < length; i++) {
          char c = chars[i];
          if (isUpperCase(c)) {
            chars[i] = (char) (c ^ CASE_MASK);
          }
        }
        return String.valueOf(chars);
      }
    }
    return string;
  }

  public static char toUpperCase(char c) {
    return isLowerCase(c) ? (char) (c ^ CASE_MASK) : c;
  }

  public static boolean isLowerCase(char c) {
    // Note: This was benchmarked against the alternate expression "(char)(c - 'a') < 26" (Nov '13)
    // and found to perform at least as well, or better.
    return (c >= 'a') && (c <= 'z');
  }

  public static boolean isUpperCase(char c) {
    return (c >= 'A') && (c <= 'Z');
  }

}
