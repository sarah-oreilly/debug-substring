package edu.mills.cs180a;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringUtilitiesTester {
	@Test
	void testNullInputs() {
		assertThrows(
				NullPointerException.class,
				() -> StringUtilities.isSubstring(null, "foo"));
		assertThrows(
				NullPointerException.class,
				() -> StringUtilities.isSubstring("foo", null));
		assertThrows(
				NullPointerException.class,
				() -> StringUtilities.isSubstring(null, null));
	}
	
	@Test
	void testEmptyStrings() {
		assertTrue(StringUtilities.isSubstring("", "foo"));
		// TODO: write rest
	}
	
	@Test
	void testMatchingStrings() {
		// TODO: write
	}
	
	@Test
	void testNotMatchingStrings() {
		// TODO: write
	}
}
