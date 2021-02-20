package com.virtualpairprogrammers.isbntools;

public class ISBNValidator {

    public boolean checkISBN(String isbn){
        //   13 Digits ISBN
        if (isbn.length() == 13) {
            //   add total to count
            int total = 0;

            for (int i = 0; i < 13; i++) {
                if (i % 2 == 0) {
                    //   digit is even
                    total += Character.getNumericValue( isbn.charAt( i ) );
                } else {
                    //   digit is odd
                    total += Character.getNumericValue( isbn.charAt( i ) ) * 3;
                }
            }
            return total % 10 == 0;
        }
        else {
            //   Check ISBN is 10 digits or not
            if (isbn.length() != 10) {
                throw new NumberFormatException( "ISBN number must be 10 digits long" );
            }

            //   add total to count
            int total = 0;

            //   ISBN is 10 Digits
            for (int i = 0; i < 10; i++) {
                if (!Character.isDigit( isbn.charAt( i ) )) {
                    if (i == 9 && isbn.charAt( i ) == 'X') {
                        //   last digit is +10
                        total += 10;
                    } else {
                        //   ISBN is not a digit
                        throw new NumberFormatException( "ISBN number must numeric digits" );
                    }
                } else {
                    total += Character.getNumericValue( isbn.charAt( i ) ) * (10 - i);
                }
            }
            return total % 11 == 0;
        }
    }

}
