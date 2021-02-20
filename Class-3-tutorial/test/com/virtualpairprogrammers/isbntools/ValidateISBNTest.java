package com.virtualpairprogrammers.isbntools;

import static org.junit.Assert.*;

import org.junit.Test;

public class ValidateISBNTest {

	@Test
	public void checkAvalidISBN() {
		ValidatorISBN validator = new ValidatorISBN();
		boolean result = validator.checkISBN("0140449116"); // not add 0 as the first number
		assertTrue("First value", result); //return true if the result return true
		
		result = validator.checkISBN("0140177396"); 
		assertTrue("Second value", result); 
		
	}
	
	@Test
	public void checkAInvalidISBN() {
		ValidatorISBN validator = new ValidatorISBN();
		boolean result = validator.checkISBN("0140449117"); // not add 0 as the first number
		assertFalse(result); 
	}
	
	@Test(expected = NumberFormatException.class)
	public void nine_Digit_ISBNs_Are_Not_Allowed() {
		ValidatorISBN validator = new ValidatorISBN();
		validator.checkISBN("123456789");
		
	}
	
	@Test(expected = NumberFormatException.class)
	public void nonNumbericISBN_are_allowed() {
		ValidatorISBN validator = new ValidatorISBN();
		validator.checkISBN("helloworld");
	}

}
