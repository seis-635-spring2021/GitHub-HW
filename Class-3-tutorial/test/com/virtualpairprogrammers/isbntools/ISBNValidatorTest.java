package com.virtualpairprogrammers.isbntools;

import org.junit.Test;
import static org.junit.Assert.*;

public class ISBNValidatorTest {

    @Test
    //   10 Digits ISBN Valid
    public void check_10Digit_Valid() {
        ISBNValidator validator = new ISBNValidator();
        boolean result = validator.checkISBN( "0140449116" );
        assertTrue( "first book", result );
        result = validator.checkISBN( "0140177396" );
        assertTrue( "second book", result );
    }

    @Test
    //   10 Digits ISBN Invalid
    public void check_10Digits_Invalid() {
        ISBNValidator validator = new ISBNValidator();
        boolean result = validator.checkISBN( "0140449117" );
        assertFalse( result );
    }

    @Test(expected = NumberFormatException.class)
    //   9 Digits ISBN Not Allowed
    public void Nine_Digit_NotAllowed() {
        ISBNValidator validator = new ISBNValidator();
        validator.checkISBN( "123456789" );
    }

    @Test(expected = NumberFormatException.class)
    //   non Number ISBN Not Allowed
    public void Non_Numeric_NotAllowed() {
        ISBNValidator validator = new ISBNValidator();
        validator.checkISBN( "Hello World" );
    }

    @Test
    //   10 Digits ISBN end with X
    public void check_10Digits_EndX() {
        ISBNValidator validator = new ISBNValidator();
        boolean result = validator.checkISBN( "012000030X" );
        assertTrue( result );
    }

    @Test
    //   13 Digits ISBN Valid
    public void check_13Digit_Valid() {
        ISBNValidator validator = new ISBNValidator();
        boolean result = validator.checkISBN( "9781853260087" );
        assertTrue( "first book", result );
        result = validator.checkISBN( "9781853267338" );
        assertTrue( "second book", result );
    }

    @Test
    //   13 Digits ISBN Invalid
    public void check_13Digits_Invalid() {
        ISBNValidator validator = new ISBNValidator();
        boolean result = validator.checkISBN( "9781853267336" );
        assertFalse( result );
    }
}
