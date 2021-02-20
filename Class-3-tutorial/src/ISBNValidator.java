package com.virtualpairprogrammers.isbntools;

public class ISBNValidator {

	public boolean checkISBN(String isbn) {
		if (isbn.length() != 10) 
			throw new NumberFormatException("isbn must have ten chars");
		int total = 0;
		for (int i = 0; i < 10; i++) {
			if (!Character.isDigit(isbn.charAt(i))) 
				throw new NumberFormatException("all chars must be digits");
			total += isbn.charAt(i) * (10 - i);
		}
		if (total % 11 == 0) return true;
		return false;
	}
}
