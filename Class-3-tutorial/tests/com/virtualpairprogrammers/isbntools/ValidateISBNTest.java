package com.virtualpairprogrammers.isbntools;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class ValidateISBNTest {

	@Test
	void checkValidISBN() {
		ISBNvalidator validator = new ISBNvalidator();
		boolean result = validator.checkISBN("0140449116");
		assertTrue(result);
		
		result = validator.checkISBN("0140177396");
		assertTrue(result);
	}
	
	@Test
	void checkInvalidISBN() {
		ISBNvalidator validator = new ISBNvalidator();
		boolean result = validator.checkISBN("0140449117");
		assertFalse(result);
	}
	
	@Test //need to fix this because is Junit 4 i'm using Junit5 (expected=NumberFormatException.class)
	public void nineDigitISBNnotallowed()
	{
		ISBNvalidator validator = new ISBNvalidator();
		boolean result = validator.checkISBN("123456789");
		
		
		
	}
	
	@Test
	public void nonNumericISBNs()
	{
		fail();
		
	}

}
