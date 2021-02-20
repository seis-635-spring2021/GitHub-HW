package com.virtualpairprogrammers.isbntools;

import org.junit.Test;
import static org.junit.Assert.*;

public class ISBNValidatorTest {

    @Test
    public void checkAValidISBN(){
        ISBNValidator validator = new ISBNValidator();
        boolean result = validator.checkISBN(140449116);
        assertTrue(result);
    }

}
