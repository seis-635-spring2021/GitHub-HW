package com.virtualpairprogrammers.isbntools;

public class ISBNValidator {

	public boolean checkISBN(String isbn) {
		if (isbn.length() != 10) {
			throw new NumberFormatException("ISBN number didgits must be 10");
		}
		int total = 0;
		for (int i =0; i<10; i++) {
			if (!Character.isDigit(isbn.charAt(i))) {
				throw new NumberFormatException("ISBN number didgits must be 10");
			}
			total += isbn.charAt(i) * (10-i);
		}
		if (total % 11 ==0) {
			return true;
		}
		else {
			return false;
		}
	}

}
