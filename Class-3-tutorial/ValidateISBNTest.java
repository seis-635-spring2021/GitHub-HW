package com.virtualpairprogrammers.isbntools;

import static org.junit.Assert.*;

import org.junit.Test;

public class ValidateISBNTest {

	@Test
	public void checkValidISBN() {
		ISBNValidator validator = new ISBNValidator();
		boolean result = validator.checkISBN("0140449116");
		assertTrue("first value", result);
		result = validator.checkISBN("0140177396");
		assertTrue("second value", result);
	}
	
	@Test
	public void checkAnInvalidISBN() {
		ISBNValidator validator = new ISBNValidator();
		boolean result = validator.checkISBN("0140449117");
		assertFalse(result);
	}
	
	@Test(expected = NumberFormatException.class)
	public void nineDigitISBNsNotAllowed() {
		ISBNValidator validator = new ISBNValidator();
		boolean result = validator.checkISBN("123456789");
		assertFalse(result);
	}
	
	@Test(expected = NumberFormatException.class)
	public void nonNumericISBNsNotAllowed() {
		ISBNValidator validator = new ISBNValidator();
		validator.checkISBN("helloworld");
	}
}
