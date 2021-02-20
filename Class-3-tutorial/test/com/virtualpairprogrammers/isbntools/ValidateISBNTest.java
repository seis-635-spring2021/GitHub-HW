package com.virtualpairprogrammers.isbntools;

import static org.junit.Assert.*;

import org.junit.Test;

public class ValidateISBNTest
{

	@Test
	public void checkAValidISBN()
	{
		ISBNValidator validator = new ISBNValidator();
		boolean result = validator.checkISBN("0140449116");
		assertTrue("first ISBN", result);
		
		result = validator.checkISBN("0140177396");
		assertTrue("second ISBN", result);
	}

	@Test
	public void checkAnInvalidISBN()
	{
		ISBNValidator validator = new ISBNValidator();
		boolean result = validator.checkISBN("0140449117");	
		assertFalse(result);
	}

}
