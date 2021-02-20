package com.virtualpairprogrammers.isbntools;

import static org.junit.Assert.*;

import org.junit.Test;

public class ValidateISBNTest
{

	@Test
	public void checkAValidISBN()
	{
		ValidateISBN validator = new ValidateISBN();
		boolean result = validator.checkISBN("0140449116");
		assertTrue("first ISBN", result);
		
		result = validator.checkISBN("01400177396");
		assertTrue("second ISBN", result);
		
	}
	
	@Test
	public void checkAnInvalidISBN()
	{
		ValidateISBN validator = new ValidateISBN();
		boolean result = validator.checkISBN("0140449116");
		
		assertFalse(result);
	}

}
