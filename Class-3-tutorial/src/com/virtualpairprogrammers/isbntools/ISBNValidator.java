package com.virtualpairprogrammers.isbntools;

public class ISBNValidator
{
	public boolean checkISBN(String isbn)
	{
		if (isbn.length() != 10) 
		{
			throw new NumberFormatException("ISBN numbers must be 10 digits");
		}
		
		int total = 0;

		for (int i = 0; i < 10; i++) 
		{
			
			if(!Character.isDigit(isbn.charAt(i))) 
			{
				throw new NumberFormatException("ISBN numbers can only be numeric digits");
			}
			
			
			total += isbn.charAt(i) * (10 - i);
		}

		if (total % 11 == 0) 
		{
			return true;
		}

		return false;
	}
}
