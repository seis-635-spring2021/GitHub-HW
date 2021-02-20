package com.virtualpairprogrammers.isbntools;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ValidateISBNTest {

	@Test
	public void checkAValid10DigitISBN() {
		ValidateISBN isbnValidator = new ValidateISBN();
		boolean result = isbnValidator.checkISBN("0140449116");
		assertTrue("first value", result);
		result = isbnValidator.checkISBN("0140177396");
		assertTrue("second value", result);
	}

	@Test
	public void checkAValid13DigitISBN() {
		ValidateISBN isbnValidator = new ValidateISBN();
		boolean result = isbnValidator.checkISBN("9781853260087");
		assertTrue("first value", result);
		result = isbnValidator.checkISBN("9781853267338");
		assertTrue("second value", result);
	}

	@Test
	public void TenDigitISBNNumbersEndingInAnXAreValid() {
		ValidateISBN isbnValidator = new ValidateISBN();
		boolean result = isbnValidator.checkISBN("012000030X");
		assertTrue(result);
	}

	@Test
	public void checkAnInvalid10DigitISBN() {
		ValidateISBN isbnValidator = new ValidateISBN();
		boolean result = isbnValidator.checkISBN("0140449117");
		assertFalse(result);
	}

	@Test
	public void checkAnInvalid13DigitISBN() {
		ValidateISBN isbnValidator = new ValidateISBN();
		boolean result = isbnValidator.checkISBN("9781853267336");
		assertFalse(result);
	}

	@Test(expected = NumberFormatException.class)
	public void nineDigitISBNsAreNotAllowed() {
		ValidateISBN isbnValidator = new ValidateISBN();
		isbnValidator.checkISBN("123456789");
	}

	@Test(expected = NumberFormatException.class)
	public void nonNumericISBNsAreNotAllowed() {
		ValidateISBN isbnValidator = new ValidateISBN();
		isbnValidator.checkISBN("helloworld");
	}

}
