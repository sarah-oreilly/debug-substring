package edu.mills.cs180a;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class StringUtilitiesTester {
  @Test
  void isSubstring_False_null() {
    assertThrows(NullPointerException.class, () -> StringUtilities.isSubstring(null, "foo"));
    assertThrows(NullPointerException.class, () -> StringUtilities.isSubstring("foo", null));
    assertThrows(NullPointerException.class, () -> StringUtilities.isSubstring(null, null));
  }

  @Test
  void isSubstring_False_EmptyString() {
    assertTrue(StringUtilities.isSubstring("", "foo"));
    // TODO: write rest
  }
}
