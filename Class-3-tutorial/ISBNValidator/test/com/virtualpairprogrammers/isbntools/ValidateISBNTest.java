package com.virtualpairprogrammers.isbntools;

import static org.junit.Assert.*;

import org.junit.Test;

public class ValidateISBNTest {

	@Test
	public void checkValid10ISDN() {
		//fail();
		ValidateISBN validator = new ValidateISBN();
		boolean result = validator.checkISBN("0140449116");
		assertTrue("first value", result);//if result == true -> pass; if result == false -> fail
		result = validator.checkISBN("0140177396");
		assertTrue("second value", result);
		
	}
	
	@Test
	public void checkAaValid13DigitISBN() {
		//fail();
		ValidateISBN validator = new ValidateISBN();
		boolean result = validator.checkISBN("9781853260087");
		assertTrue("first value",result);
		result = validator.checkISBN("9781853267338");
		assertTrue("second value", result);
	}
	
	@Test
	public void TenDigitsISBNNumbersEndingInAnXAreValid() {
		ValidateISBN validator = new ValidateISBN();
		boolean result = validator.checkISBN("012000030x");
		assertTrue("first value", result);
	}

	@Test
	public void checkInvalid10DigitISDN() {
		//fail();
		ValidateISBN validator = new ValidateISBN();
		boolean result = validator.checkISBN("0140449117");
		//fail();
		assertFalse(result);//if result == false -> pass; if result == true -> fail
		
	}
	
	@Test
	public void checkInvalid13DigitISDN() {
		//fail();
		ValidateISBN validator = new ValidateISBN();
		boolean result = validator.checkISBN("9782498573463");
		assertFalse(result);//if result == false -> pass; if result == true -> fail
		
	}
	
	
	@Test(expected = NumberFormatException.class)//if exception is thrown, test pass
	public void nineDigitISBNAreNotAllowed() {
		//fail();
		ValidateISBN validator = new ValidateISBN();
		validator.checkISBN("123456789");
		
	}
	
	@Test(expected = NumberFormatException.class)
	public void notNumericISBNsAreNotAllowed() {
		ValidateISBN validator = new ValidateISBN();
		validator.checkISBN("helloworld");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
