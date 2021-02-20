package com.virtualpairprogrammers.isbntools;

public class ValidateISBN {
	
	private static final int SHORT_ISBN_LENGTH = 10;
	private static final int LONG_ISBN_LENGTH = 13;
	
	private static final int SHORT_ISBN_MULTIPLIER = 11;
	private static final int LONG_ISBN_MULTIPLIER = 10;
	
	public boolean checkISBN(String isbn) {
		
		if (isbn.length() == LONG_ISBN_LENGTH) {
			return isThisAValid13DigitISBN(isbn);
		} else {
			if(isbn.length() != SHORT_ISBN_LENGTH) {
				throw new NumberFormatException("ISBN must be 10 digits long");
			}
			return isThisAValid10DigitISBN(isbn);
		}
	}
	
	public boolean isThisAValid10DigitISBN(String isbn) {
		int total = 0;
		
		for (int i=0; i<SHORT_ISBN_LENGTH; i++) {
			if (!Character.isDigit(isbn.charAt(i))) {
				if (i==9 && isbn.charAt(i) == 'X') {
					total += 10;
				} else {
					throw new NumberFormatException("ISBN can not have non numeric characters");
				}
			} else  {
				total += Character.getNumericValue(isbn.charAt(i)) * (SHORT_ISBN_LENGTH-i);
			}
		}
		
		
		if (total % SHORT_ISBN_MULTIPLIER == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isThisAValid13DigitISBN(String isbn) {
		int total = 0;
		
		for (int i=0; i<LONG_ISBN_LENGTH; i++) {
			if (i % 2 == 0) {
				total += Character.getNumericValue(isbn.charAt(i));
			} else {
				total += Character.getNumericValue(isbn.charAt(i)) * 3;
			}
		}
		
		if (total % LONG_ISBN_MULTIPLIER == 0) {
			return true;
		} else {
			return false;
		}
	}
	
}
