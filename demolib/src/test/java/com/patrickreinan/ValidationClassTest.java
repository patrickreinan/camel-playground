package com.patrickreinan;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ValidationClassTest {

    private ValidationClass validation;

    public ValidationClassTest(){
         validation  = new ValidationClass();
    }

    @Test
    public void shouldBeFalse(){
        String value = null;

        boolean result = validation.Validate(value);

        assertFalse(result);
    }

    @Test
    public void shouldBeTrue(){
        String value = "is a valid value";
        boolean result = validation.Validate(value);
        assertTrue(result);
    }

}
