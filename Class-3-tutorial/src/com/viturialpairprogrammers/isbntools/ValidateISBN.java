package com.viturialpairprogrammers.isbntools;

public class ValidateISBN 
{

	public static boolean checkISBN(String isbn) 
	{
		
		int total = 0;
		
		for (int i = 0; i < 10; i++ )
		{
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
