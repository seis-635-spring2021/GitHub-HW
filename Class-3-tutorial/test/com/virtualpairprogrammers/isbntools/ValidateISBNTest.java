package com.virtualpairprogrammers.isbntools;

import static org.junit.Assert.*;

import org.junit.Test;

public class ValidateISBNTest {

	
	@Test
	public void checkAValidISBN() {
		ValidateISBN validator = new ValidateISBN();
		
		boolean result = validator.checkISBN("0140449116");
		assertTrue("First Value", result);
		
		result = validator.checkISBN("0140177396");
		assertTrue("Second Value", result);
	}
	
	@Test
	public void checkAnInvalidISBN() {
		ValidateISBN validator = new ValidateISBN();
		
		boolean result = validator.checkISBN("0140449117");
		
		assertFalse(result);
	}
	
	@Test(expected= NumberFormatException.class)
	public void nineDigitsISBNsAreNotAllowed() {
		
		ValidateISBN validator = new ValidateISBN();
		
		boolean result = validator.checkISBN("123456789");
		fail();
	}
	
	@Test(expected = NumberFormatException.class)
	public void nonNumericISBNAreNotAllowed() {
		ValidateISBN validator = new ValidateISBN();
		
		boolean result = validator.checkISBN("helloworld");
	}

}
