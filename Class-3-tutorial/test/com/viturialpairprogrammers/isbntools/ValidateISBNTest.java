package com.viturialpairprogrammers.isbntools;

import static org.junit.Assert.*;

import org.junit.Test;

public class ValidateISBNTest {

	@Test
	public void checkvalidISBN() {
		ValidateISBN val = new ValidateISBN();
		boolean result = ValidateISBN.checkISBN(140449116);
		assertTrue(result);
	}

}
