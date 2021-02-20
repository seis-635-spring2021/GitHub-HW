package com.virtualpairprogrammers.isbntools;

import static org.junit.Assert.*;

import org.junit.Test;

public class ValidateISBNTest {

	@Test
	public void checkAvalidISBN() {
		ValidatorISBN validator = new ValidatorISBN();
		boolean result = validator.checkISBN(130234887); // not add 0 as the first number
		assertTrue(result); //return true if the result return true
	}

}
