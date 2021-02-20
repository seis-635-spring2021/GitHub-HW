package com.viturialpairprogrammers.isbntools;

public class ValidateISBN 
{

	public static boolean checkISBN(String isbn) 
	{
		if(isbn.length() != 10)
		{
			throw new NumberFormatException("ISBN Numbers must be 10 Digits long");
		}
		int total = 0;
		
		for (int i = 0; i < 10; i++ )
		{
			if(!Character.isDigit(isbn.charAt(i)))
			{
				throw new NumberFormatException("ISBN Numbers mmust be digits not characters");
			}
			total += isbn.charAt(i) * (10 - i);
		}
		
		if ( (total % 11 ) == 0 ) {
			return true;
		}
		else 
		{
			return false;
		}
	}

}
