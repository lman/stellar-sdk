/*
 * Copyright (C) 2007 The Guava Authors
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

import static org.solteam.stellar.baseencoding.Strings.lenientFormat;

@GwtCompatible
public final class Preconditions {
  private Preconditions() {}

  /**
   * Ensures the truth of an expression involving one or more parameters to the calling method.
   *
   * @param expression a boolean expression
   * @throws IllegalArgumentException if {@code expression} is false
   */
  public static void checkArgument(boolean expression) {
    if (!expression) {
      throw new IllegalArgumentException();
    }
  }

  /**
   * Ensures the truth of an expression involving one or more parameters to the calling method.
   *
   * @param expression a boolean expression
   * @param errorMessage the exception message to use if the check fails; will be converted to a
   *     string using {@link String#valueOf(Object)}
   * @throws IllegalArgumentException if {@code expression} is false
   */
  public static void checkArgument(boolean expression,  Object errorMessage) {
    if (!expression) {
      throw new IllegalArgumentException(String.valueOf(errorMessage));
    }
  }

  /**
   * Ensures the truth of an expression involving one or more parameters to the calling method.
   *
   * @param expression a boolean expression
   * @param errorMessageTemplate a template for the exception message should the check fail. The
   *     message is formed by replacing each {@code %s} placeholder in the template with an
   *     argument. These are matched by position - the first {@code %s} gets {@code
   *     errorMessageArgs[0]}, etc. Unmatched arguments will be appended to the formatted message in
   *     square braces. Unmatched placeholders will be left as-is.
   * @param errorMessageArgs the arguments to be substituted into the message template. Arguments
   *     are converted to strings using {@link String#valueOf(Object)}.
   * @throws IllegalArgumentException if {@code expression} is false
   */
  public static void checkArgument(
      boolean expression,
       String errorMessageTemplate,
       Object... errorMessageArgs) {
    if (!expression) {
      throw new IllegalArgumentException(lenientFormat(errorMessageTemplate, errorMessageArgs));
    }
  }

  /**
   * Ensures the truth of an expression involving one or more parameters to the calling method.
   *
   * <p>See {@link #checkArgument(boolean, String, Object...)} for details.
   *
   * @since 20.0 (varargs overload since 2.0)
   */
  public static void checkArgument(boolean b,  String errorMessageTemplate, char p1) {
    if (!b) {
      throw new IllegalArgumentException(lenientFormat(errorMessageTemplate, p1));
    }
  }

  /**
   * Ensures the truth of an expression involving one or more parameters to the calling method.
   *
   * <p>See {@link #checkArgument(boolean, String, Object...)} for details.
   *
   * @since 20.0 (varargs overload since 2.0)
   */
  public static void checkArgument(boolean b,  String errorMessageTemplate, int p1) {
    if (!b) {
      throw new IllegalArgumentException(lenientFormat(errorMessageTemplate, p1));
    }
  }

  /**
   * Ensures the truth of an expression involving one or more parameters to the calling method.
   *
   * <p>See {@link #checkArgument(boolean, String, Object...)} for details.
   *
   * @since 20.0 (varargs overload since 2.0)
   */
  public static void checkArgument(boolean b,  String errorMessageTemplate, long p1) {
    if (!b) {
      throw new IllegalArgumentException(lenientFormat(errorMessageTemplate, p1));
    }
  }

  /**
   * Ensures the truth of an expression involving one or more parameters to the calling method.
   *
   * <p>See {@link #checkArgument(boolean, String, Object...)} for details.
   *
   * @since 20.0 (varargs overload since 2.0)
   */
  public static void checkArgument(
      boolean b,  String errorMessageTemplate,  Object p1) {
    if (!b) {
      throw new IllegalArgumentException(lenientFormat(errorMessageTemplate, p1));
    }
  }

  /**
   * Ensures the truth of an expression involving one or more parameters to the calling method.
   *
   * <p>See {@link #checkArgument(boolean, String, Object...)} for details.
   *
   * @since 20.0 (varargs overload since 2.0)
   */
  public static void checkArgument(
      boolean b,  String errorMessageTemplate, char p1, char p2) {
    if (!b) {
      throw new IllegalArgumentException(lenientFormat(errorMessageTemplate, p1, p2));
    }
  }

  /**
   * Ensures the truth of an expression involving one or more parameters to the calling method.
   *
   * <p>See {@link #checkArgument(boolean, String, Object...)} for details.
   *
   * @since 20.0 (varargs overload since 2.0)
   */
  public static void checkArgument(
      boolean b,  String errorMessageTemplate, char p1, int p2) {
    if (!b) {
      throw new IllegalArgumentException(lenientFormat(errorMessageTemplate, p1, p2));
    }
  }

  /**
   * Ensures the truth of an expression involving one or more parameters to the calling method.
   *
   * <p>See {@link #checkArgument(boolean, String, Object...)} for details.
   *
   * @since 20.0 (varargs overload since 2.0)
   */
  public static void checkArgument(
      boolean b,  String errorMessageTemplate, char p1, long p2) {
    if (!b) {
      throw new IllegalArgumentException(lenientFormat(errorMessageTemplate, p1, p2));
    }
  }

  /**
   * Ensures the truth of an expression involving one or more parameters to the calling method.
   *
   * <p>See {@link #checkArgument(boolean, String, Object...)} for details.
   *
   * @since 20.0 (varargs overload since 2.0)
   */
  public static void checkArgument(
      boolean b,  String errorMessageTemplate, char p1,  Object p2) {
    if (!b) {
      throw new IllegalArgumentException(lenientFormat(errorMessageTemplate, p1, p2));
    }
  }

  /**
   * Ensures the truth of an expression involving one or more parameters to the calling method.
   *
   * <p>See {@link #checkArgument(boolean, String, Object...)} for details.
   *
   * @since 20.0 (varargs overload since 2.0)
   */
  public static void checkArgument(
      boolean b,  String errorMessageTemplate, int p1, char p2) {
    if (!b) {
      throw new IllegalArgumentException(lenientFormat(errorMessageTemplate, p1, p2));
    }
  }

  /**
   * Ensures the truth of an expression involving one or more parameters to the calling method.
   *
   * <p>See {@link #checkArgument(boolean, String, Object...)} for details.
   *
   * @since 20.0 (varargs overload since 2.0)
   */
  public static void checkArgument(
      boolean b,  String errorMessageTemplate, int p1, int p2) {
    if (!b) {
      throw new IllegalArgumentException(lenientFormat(errorMessageTemplate, p1, p2));
    }
  }

  /**
   * Ensures the truth of an expression involving one or more parameters to the calling method.
   *
   * <p>See {@link #checkArgument(boolean, String, Object...)} for details.
   *
   * @since 20.0 (varargs overload since 2.0)
   */
  public static void checkArgument(
      boolean b,  String errorMessageTemplate, int p1, long p2) {
    if (!b) {
      throw new IllegalArgumentException(lenientFormat(errorMessageTemplate, p1, p2));
    }
  }

  /**
   * Ensures the truth of an expression involving one or more parameters to the calling method.
   *
   * <p>See {@link #checkArgument(boolean, String, Object...)} for details.
   *
   * @since 20.0 (varargs overload since 2.0)
   */
  public static void checkArgument(
      boolean b,  String errorMessageTemplate, int p1,  Object p2) {
    if (!b) {
      throw new IllegalArgumentException(lenientFormat(errorMessageTemplate, p1, p2));
    }
  }

  /**
   * Ensures the truth of an expression involving one or more parameters to the calling method.
   *
   * <p>See {@link #checkArgument(boolean, String, Object...)} for details.
   *
   * @since 20.0 (varargs overload since 2.0)
   */
  public static void checkArgument(
      boolean b,  String errorMessageTemplate, long p1, char p2) {
    if (!b) {
      throw new IllegalArgumentException(lenientFormat(errorMessageTemplate, p1, p2));
    }
  }

  /**
   * Ensures the truth of an expression involving one or more parameters to the calling method.
   *
   * <p>See {@link #checkArgument(boolean, String, Object...)} for details.
   *
   * @since 20.0 (varargs overload since 2.0)
   */
  public static void checkArgument(
      boolean b,  String errorMessageTemplate, long p1, int p2) {
    if (!b) {
      throw new IllegalArgumentException(lenientFormat(errorMessageTemplate, p1, p2));
    }
  }

  /**
   * Ensures the truth of an expression involving one or more parameters to the calling method.
   *
   * <p>See {@link #checkArgument(boolean, String, Object...)} for details.
   *
   * @since 20.0 (varargs overload since 2.0)
   */
  public static void checkArgument(
      boolean b,  String errorMessageTemplate, long p1, long p2) {
    if (!b) {
      throw new IllegalArgumentException(lenientFormat(errorMessageTemplate, p1, p2));
    }
  }

  /**
   * Ensures the truth of an expression involving one or more parameters to the calling method.
   *
   * <p>See {@link #checkArgument(boolean, String, Object...)} for details.
   *
   * @since 20.0 (varargs overload since 2.0)
   */
  public static void checkArgument(
      boolean b,  String errorMessageTemplate, long p1,  Object p2) {
    if (!b) {
      throw new IllegalArgumentException(lenientFormat(errorMessageTemplate, p1, p2));
    }
  }

  /**
   * Ensures the truth of an expression involving one or more parameters to the calling method.
   *
   * <p>See {@link #checkArgument(boolean, String, Object...)} for details.
   *
   * @since 20.0 (varargs overload since 2.0)
   */
  public static void checkArgument(
      boolean b,  String errorMessageTemplate,  Object p1, char p2) {
    if (!b) {
      throw new IllegalArgumentException(lenientFormat(errorMessageTemplate, p1, p2));
    }
  }

  /**
   * Ensures the truth of an expression involving one or more parameters to the calling method.
   *
   * <p>See {@link #checkArgument(boolean, String, Object...)} for details.
   *
   * @since 20.0 (varargs overload since 2.0)
   */
  public static void checkArgument(
      boolean b,  String errorMessageTemplate,  Object p1, int p2) {
    if (!b) {
      throw new IllegalArgumentException(lenientFormat(errorMessageTemplate, p1, p2));
    }
  }

  /**
   * Ensures the truth of an expression involving one or more parameters to the calling method.
   *
   * <p>See {@link #checkArgument(boolean, String, Object...)} for details.
   *
   * @since 20.0 (varargs overload since 2.0)
   */
  public static void checkArgument(
      boolean b,  String errorMessageTemplate,  Object p1, long p2) {
    if (!b) {
      throw new IllegalArgumentException(lenientFormat(errorMessageTemplate, p1, p2));
    }
  }

  /**
   * Ensures the truth of an expression involving one or more parameters to the calling method.
   *
   * <p>See {@link #checkArgument(boolean, String, Object...)} for details.
   *
   * @since 20.0 (varargs overload since 2.0)
   */
  public static void checkArgument(
      boolean b,
       String errorMessageTemplate,
       Object p1,
       Object p2) {
    if (!b) {
      throw new IllegalArgumentException(lenientFormat(errorMessageTemplate, p1, p2));
    }
  }

  /**
   * Ensures the truth of an expression involving one or more parameters to the calling method.
   *
   * <p>See {@link #checkArgument(boolean, String, Object...)} for details.
   *
   * @since 20.0 (varargs overload since 2.0)
   */
  public static void checkArgument(
      boolean b,
       String errorMessageTemplate,
       Object p1,
       Object p2,
       Object p3) {
    if (!b) {
      throw new IllegalArgumentException(lenientFormat(errorMessageTemplate, p1, p2, p3));
    }
  }

  /**
   * Ensures the truth of an expression involving one or more parameters to the calling method.
   *
   * <p>See {@link #checkArgument(boolean, String, Object...)} for details.
   *
   * @since 20.0 (varargs overload since 2.0)
   */
  public static void checkArgument(
      boolean b,
       String errorMessageTemplate,
       Object p1,
       Object p2,
       Object p3,
       Object p4) {
    if (!b) {
      throw new IllegalArgumentException(lenientFormat(errorMessageTemplate, p1, p2, p3, p4));
    }
  }

  public static void checkState(boolean expression) {
    if (!expression) {
      throw new IllegalStateException();
    }
  }


  public static void checkState(boolean expression,  Object errorMessage) {
    if (!expression) {
      throw new IllegalStateException(String.valueOf(errorMessage));
    }
  }

  public static void checkState(
      boolean expression,
       String errorMessageTemplate,
       Object... errorMessageArgs) {
    if (!expression) {
      throw new IllegalStateException(lenientFormat(errorMessageTemplate, errorMessageArgs));
    }
  }

  /**
   * Ensures the truth of an expression involving the state of the calling instance, but not
   * involving any parameters to the calling method.
   *
   * <p>See {@link #checkState(boolean, String, Object...)} for details.
   *
   * @since 20.0 (varargs overload since 2.0)
   */
  public static void checkState(boolean b,  String errorMessageTemplate, char p1) {
    if (!b) {
      throw new IllegalStateException(lenientFormat(errorMessageTemplate, p1));
    }
  }

  /**
   * Ensures the truth of an expression involving the state of the calling instance, but not
   * involving any parameters to the calling method.
   *
   * <p>See {@link #checkState(boolean, String, Object...)} for details.
   *
   * @since 20.0 (varargs overload since 2.0)
   */
  public static void checkState(boolean b,  String errorMessageTemplate, int p1) {
    if (!b) {
      throw new IllegalStateException(lenientFormat(errorMessageTemplate, p1));
    }
  }

  /**
   * Ensures the truth of an expression involving the state of the calling instance, but not
   * involving any parameters to the calling method.
   *
   * <p>See {@link #checkState(boolean, String, Object...)} for details.
   *
   * @since 20.0 (varargs overload since 2.0)
   */
  public static void checkState(boolean b,  String errorMessageTemplate, long p1) {
    if (!b) {
      throw new IllegalStateException(lenientFormat(errorMessageTemplate, p1));
    }
  }

  /**
   * Ensures the truth of an expression involving the state of the calling instance, but not
   * involving any parameters to the calling method.
   *
   * <p>See {@link #checkState(boolean, String, Object...)} for details.
   *
   * @since 20.0 (varargs overload since 2.0)
   */
  public static void checkState(
      boolean b,  String errorMessageTemplate,  Object p1) {
    if (!b) {
      throw new IllegalStateException(lenientFormat(errorMessageTemplate, p1));
    }
  }

  /**
   * Ensures the truth of an expression involving the state of the calling instance, but not
   * involving any parameters to the calling method.
   *
   * <p>See {@link #checkState(boolean, String, Object...)} for details.
   *
   * @since 20.0 (varargs overload since 2.0)
   */
  public static void checkState(
      boolean b,  String errorMessageTemplate, char p1, char p2) {
    if (!b) {
      throw new IllegalStateException(lenientFormat(errorMessageTemplate, p1, p2));
    }
  }

  /**
   * Ensures the truth of an expression involving the state of the calling instance, but not
   * involving any parameters to the calling method.
   *
   * <p>See {@link #checkState(boolean, String, Object...)} for details.
   *
   * @since 20.0 (varargs overload since 2.0)
   */
  public static void checkState(
      boolean b,  String errorMessageTemplate, char p1, int p2) {
    if (!b) {
      throw new IllegalStateException(lenientFormat(errorMessageTemplate, p1, p2));
    }
  }

  /**
   * Ensures the truth of an expression involving the state of the calling instance, but not
   * involving any parameters to the calling method.
   *
   * <p>See {@link #checkState(boolean, String, Object...)} for details.
   *
   * @since 20.0 (varargs overload since 2.0)
   */
  public static void checkState(
      boolean b,  String errorMessageTemplate, char p1, long p2) {
    if (!b) {
      throw new IllegalStateException(lenientFormat(errorMessageTemplate, p1, p2));
    }
  }

  /**
   * Ensures the truth of an expression involving the state of the calling instance, but not
   * involving any parameters to the calling method.
   *
   * <p>See {@link #checkState(boolean, String, Object...)} for details.
   *
   * @since 20.0 (varargs overload since 2.0)
   */
  public static void checkState(
      boolean b,  String errorMessageTemplate, char p1,  Object p2) {
    if (!b) {
      throw new IllegalStateException(lenientFormat(errorMessageTemplate, p1, p2));
    }
  }

  /**
   * Ensures the truth of an expression involving the state of the calling instance, but not
   * involving any parameters to the calling method.
   *
   * <p>See {@link #checkState(boolean, String, Object...)} for details.
   *
   * @since 20.0 (varargs overload since 2.0)
   */
  public static void checkState(
      boolean b,  String errorMessageTemplate, int p1, char p2) {
    if (!b) {
      throw new IllegalStateException(lenientFormat(errorMessageTemplate, p1, p2));
    }
  }

  /**
   * Ensures the truth of an expression involving the state of the calling instance, but not
   * involving any parameters to the calling method.
   *
   * <p>See {@link #checkState(boolean, String, Object...)} for details.
   *
   * @since 20.0 (varargs overload since 2.0)
   */
  public static void checkState(
      boolean b,  String errorMessageTemplate, int p1, int p2) {
    if (!b) {
      throw new IllegalStateException(lenientFormat(errorMessageTemplate, p1, p2));
    }
  }

  /**
   * Ensures the truth of an expression involving the state of the calling instance, but not
   * involving any parameters to the calling method.
   *
   * <p>See {@link #checkState(boolean, String, Object...)} for details.
   *
   * @since 20.0 (varargs overload since 2.0)
   */
  public static void checkState(
      boolean b,  String errorMessageTemplate, int p1, long p2) {
    if (!b) {
      throw new IllegalStateException(lenientFormat(errorMessageTemplate, p1, p2));
    }
  }

  /**
   * Ensures the truth of an expression involving the state of the calling instance, but not
   * involving any parameters to the calling method.
   *
   * <p>See {@link #checkState(boolean, String, Object...)} for details.
   *
   * @since 20.0 (varargs overload since 2.0)
   */
  public static void checkState(
      boolean b,  String errorMessageTemplate, int p1,  Object p2) {
    if (!b) {
      throw new IllegalStateException(lenientFormat(errorMessageTemplate, p1, p2));
    }
  }

  /**
   * Ensures the truth of an expression involving the state of the calling instance, but not
   * involving any parameters to the calling method.
   *
   * <p>See {@link #checkState(boolean, String, Object...)} for details.
   *
   * @since 20.0 (varargs overload since 2.0)
   */
  public static void checkState(
      boolean b,  String errorMessageTemplate, long p1, char p2) {
    if (!b) {
      throw new IllegalStateException(lenientFormat(errorMessageTemplate, p1, p2));
    }
  }

  /**
   * Ensures the truth of an expression involving the state of the calling instance, but not
   * involving any parameters to the calling method.
   *
   * <p>See {@link #checkState(boolean, String, Object...)} for details.
   *
   * @since 20.0 (varargs overload since 2.0)
   */
  public static void checkState(
      boolean b,  String errorMessageTemplate, long p1, int p2) {
    if (!b) {
      throw new IllegalStateException(lenientFormat(errorMessageTemplate, p1, p2));
    }
  }

  /**
   * Ensures the truth of an expression involving the state of the calling instance, but not
   * involving any parameters to the calling method.
   *
   * <p>See {@link #checkState(boolean, String, Object...)} for details.
   *
   * @since 20.0 (varargs overload since 2.0)
   */
  public static void checkState(
      boolean b,  String errorMessageTemplate, long p1, long p2) {
    if (!b) {
      throw new IllegalStateException(lenientFormat(errorMessageTemplate, p1, p2));
    }
  }

  /**
   * Ensures the truth of an expression involving the state of the calling instance, but not
   * involving any parameters to the calling method.
   *
   * <p>See {@link #checkState(boolean, String, Object...)} for details.
   *
   * @since 20.0 (varargs overload since 2.0)
   */
  public static void checkState(
      boolean b,  String errorMessageTemplate, long p1,  Object p2) {
    if (!b) {
      throw new IllegalStateException(lenientFormat(errorMessageTemplate, p1, p2));
    }
  }

  /**
   * Ensures the truth of an expression involving the state of the calling instance, but not
   * involving any parameters to the calling method.
   *
   * <p>See {@link #checkState(boolean, String, Object...)} for details.
   *
   * @since 20.0 (varargs overload since 2.0)
   */
  public static void checkState(
      boolean b,  String errorMessageTemplate,  Object p1, char p2) {
    if (!b) {
      throw new IllegalStateException(lenientFormat(errorMessageTemplate, p1, p2));
    }
  }

  /**
   * Ensures the truth of an expression involving the state of the calling instance, but not
   * involving any parameters to the calling method.
   *
   * <p>See {@link #checkState(boolean, String, Object...)} for details.
   *
   * @since 20.0 (varargs overload since 2.0)
   */
  public static void checkState(
      boolean b,  String errorMessageTemplate,  Object p1, int p2) {
    if (!b) {
      throw new IllegalStateException(lenientFormat(errorMessageTemplate, p1, p2));
    }
  }

  /**
   * Ensures the truth of an expression involving the state of the calling instance, but not
   * involving any parameters to the calling method.
   *
   * <p>See {@link #checkState(boolean, String, Object...)} for details.
   *
   * @since 20.0 (varargs overload since 2.0)
   */
  public static void checkState(
      boolean b,  String errorMessageTemplate,  Object p1, long p2) {
    if (!b) {
      throw new IllegalStateException(lenientFormat(errorMessageTemplate, p1, p2));
    }
  }

  /**
   * Ensures the truth of an expression involving the state of the calling instance, but not
   * involving any parameters to the calling method.
   *
   * <p>See {@link #checkState(boolean, String, Object...)} for details.
   *
   * @since 20.0 (varargs overload since 2.0)
   */
  public static void checkState(
      boolean b,
       String errorMessageTemplate,
       Object p1,
       Object p2) {
    if (!b) {
      throw new IllegalStateException(lenientFormat(errorMessageTemplate, p1, p2));
    }
  }

  /**
   * Ensures the truth of an expression involving the state of the calling instance, but not
   * involving any parameters to the calling method.
   *
   * <p>See {@link #checkState(boolean, String, Object...)} for details.
   *
   * @since 20.0 (varargs overload since 2.0)
   */
  public static void checkState(
      boolean b,
       String errorMessageTemplate,
       Object p1,
       Object p2,
       Object p3) {
    if (!b) {
      throw new IllegalStateException(lenientFormat(errorMessageTemplate, p1, p2, p3));
    }
  }

  /**
   * Ensures the truth of an expression involving the state of the calling instance, but not
   * involving any parameters to the calling method.
   *
   * <p>See {@link #checkState(boolean, String, Object...)} for details.
   *
   * @since 20.0 (varargs overload since 2.0)
   */
  public static void checkState(
      boolean b,
       String errorMessageTemplate,
       Object p1,
       Object p2,
       Object p3,
       Object p4) {
    if (!b) {
      throw new IllegalStateException(lenientFormat(errorMessageTemplate, p1, p2, p3, p4));
    }
  }

  public static <T> T checkNotNull(T reference) {
    if (reference == null) {
      throw new NullPointerException();
    }
    return reference;
  }

  public static <T> T checkNotNull(T reference,  Object errorMessage) {
    if (reference == null) {
      throw new NullPointerException(String.valueOf(errorMessage));
    }
    return reference;
  }

  public static <T> T checkNotNull(
      T reference,
       String errorMessageTemplate,
       Object... errorMessageArgs) {
    if (reference == null) {
      throw new NullPointerException(lenientFormat(errorMessageTemplate, errorMessageArgs));
    }
    return reference;
  }

  public static <T> T checkNotNull(T obj,  String errorMessageTemplate, char p1) {
    if (obj == null) {
      throw new NullPointerException(lenientFormat(errorMessageTemplate, p1));
    }
    return obj;
  }

  public static <T> T checkNotNull(T obj,  String errorMessageTemplate, int p1) {
    if (obj == null) {
      throw new NullPointerException(lenientFormat(errorMessageTemplate, p1));
    }
    return obj;
  }

  public static <T> T checkNotNull(T obj,  String errorMessageTemplate, long p1) {
    if (obj == null) {
      throw new NullPointerException(lenientFormat(errorMessageTemplate, p1));
    }
    return obj;
  }

  public static <T> T checkNotNull(
      T obj,  String errorMessageTemplate,  Object p1) {
    if (obj == null) {
      throw new NullPointerException(lenientFormat(errorMessageTemplate, p1));
    }
    return obj;
  }

  public static <T> T checkNotNull(
      T obj,  String errorMessageTemplate, char p1, char p2) {
    if (obj == null) {
      throw new NullPointerException(lenientFormat(errorMessageTemplate, p1, p2));
    }
    return obj;
  }

  public static <T> T checkNotNull(
      T obj,  String errorMessageTemplate, char p1, int p2) {
    if (obj == null) {
      throw new NullPointerException(lenientFormat(errorMessageTemplate, p1, p2));
    }
    return obj;
  }

  public static <T> T checkNotNull(
      T obj,  String errorMessageTemplate, char p1, long p2) {
    if (obj == null) {
      throw new NullPointerException(lenientFormat(errorMessageTemplate, p1, p2));
    }
    return obj;
  }

  public static <T> T checkNotNull(
      T obj,  String errorMessageTemplate, char p1,  Object p2) {
    if (obj == null) {
      throw new NullPointerException(lenientFormat(errorMessageTemplate, p1, p2));
    }
    return obj;
  }

  public static <T> T checkNotNull(
      T obj,  String errorMessageTemplate, int p1, char p2) {
    if (obj == null) {
      throw new NullPointerException(lenientFormat(errorMessageTemplate, p1, p2));
    }
    return obj;
  }

  public static <T> T checkNotNull(
      T obj,  String errorMessageTemplate, int p1, int p2) {
    if (obj == null) {
      throw new NullPointerException(lenientFormat(errorMessageTemplate, p1, p2));
    }
    return obj;
  }

  public static <T> T checkNotNull(
      T obj,  String errorMessageTemplate, int p1, long p2) {
    if (obj == null) {
      throw new NullPointerException(lenientFormat(errorMessageTemplate, p1, p2));
    }
    return obj;
  }

  public static <T> T checkNotNull(
      T obj,  String errorMessageTemplate, int p1,  Object p2) {
    if (obj == null) {
      throw new NullPointerException(lenientFormat(errorMessageTemplate, p1, p2));
    }
    return obj;
  }

  public static <T> T checkNotNull(
      T obj,  String errorMessageTemplate, long p1, char p2) {
    if (obj == null) {
      throw new NullPointerException(lenientFormat(errorMessageTemplate, p1, p2));
    }
    return obj;
  }

  public static <T> T checkNotNull(
      T obj,  String errorMessageTemplate, long p1, int p2) {
    if (obj == null) {
      throw new NullPointerException(lenientFormat(errorMessageTemplate, p1, p2));
    }
    return obj;
  }

  public static <T> T checkNotNull(
      T obj,  String errorMessageTemplate, long p1, long p2) {
    if (obj == null) {
      throw new NullPointerException(lenientFormat(errorMessageTemplate, p1, p2));
    }
    return obj;
  }

  public static <T> T checkNotNull(
      T obj,  String errorMessageTemplate, long p1,  Object p2) {
    if (obj == null) {
      throw new NullPointerException(lenientFormat(errorMessageTemplate, p1, p2));
    }
    return obj;
  }

  public static <T> T checkNotNull(
      T obj,  String errorMessageTemplate,  Object p1, char p2) {
    if (obj == null) {
      throw new NullPointerException(lenientFormat(errorMessageTemplate, p1, p2));
    }
    return obj;
  }

  public static <T> T checkNotNull(
      T obj,  String errorMessageTemplate,  Object p1, int p2) {
    if (obj == null) {
      throw new NullPointerException(lenientFormat(errorMessageTemplate, p1, p2));
    }
    return obj;
  }

  public static <T> T checkNotNull(
      T obj,  String errorMessageTemplate,  Object p1, long p2) {
    if (obj == null) {
      throw new NullPointerException(lenientFormat(errorMessageTemplate, p1, p2));
    }
    return obj;
  }

  public static <T> T checkNotNull(
      T obj,
       String errorMessageTemplate,
       Object p1,
       Object p2) {
    if (obj == null) {
      throw new NullPointerException(lenientFormat(errorMessageTemplate, p1, p2));
    }
    return obj;
  }

  public static <T> T checkNotNull(
      T obj,
       String errorMessageTemplate,
       Object p1,
       Object p2,
       Object p3) {
    if (obj == null) {
      throw new NullPointerException(lenientFormat(errorMessageTemplate, p1, p2, p3));
    }
    return obj;
  }

  public static <T> T checkNotNull(
      T obj,
       String errorMessageTemplate,
       Object p1,
       Object p2,
       Object p3,
       Object p4) {
    if (obj == null) {
      throw new NullPointerException(lenientFormat(errorMessageTemplate, p1, p2, p3, p4));
    }
    return obj;
  }


  private static String badPositionIndex(int index, int size,  String desc) {
    if (index < 0) {
      return lenientFormat("%s (%s) must not be negative", desc, index);
    } else if (size < 0) {
      throw new IllegalArgumentException("negative size: " + size);
    } else { // index > size
      return lenientFormat("%s (%s) must not be greater than size (%s)", desc, index, size);
    }
  }

  public static void checkPositionIndexes(int start, int end, int size) {
    // Carefully optimized for execution by hotspot (explanatory comment above)
    if (start < 0 || end < start || end > size) {
      throw new IndexOutOfBoundsException(badPositionIndexes(start, end, size));
    }
  }

  private static String badPositionIndexes(int start, int end, int size) {
    if (start < 0 || start > size) {
      return badPositionIndex(start, size, "start index");
    }
    if (end < 0 || end > size) {
      return badPositionIndex(end, size, "end index");
    }
    // end < start
    return lenientFormat("end index (%s) must not be less than start index (%s)", end, start);
  }
}
