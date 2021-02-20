package com.virtualpairprogrammers.isbntools;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ValidateISBNTest {

	@Test
	void checkValidISBN() {
		ISBNvalidator validator = new ISBNvalidator();
		boolean result = validator.checkISBN(140449116);
		assertTrue(result);
	}

}
