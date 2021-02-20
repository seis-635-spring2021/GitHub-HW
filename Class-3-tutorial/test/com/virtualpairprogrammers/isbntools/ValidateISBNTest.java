package com.virtualpairprogrammers.isbntools;

import static org.junit.Assert.*;

import org.junit.Test;

public class ValidateISBNTest {

	@Test
	public void checkAValidISBN() {		
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
	
	@Test (expected = NumberFormatException.class)
	public void nine_digit_ISBNs_are_not_allowed() {
		ISBNValidator validator = new ISBNValidator();
		validator.checkISBN("123456789");
	}
	
	@Test (expected = NumberFormatException.class)
	public void non_numeric_isbns_are_not_allowed() {
		ISBNValidator validator = new ISBNValidator();
		validator.checkISBN("hellow world");
	}

}
