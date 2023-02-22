package com.patrickreinan;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TransformationClassTest {

    private TransformationClass transformation;

    public TransformationClassTest() {
        this.transformation = new TransformationClass();
    }


    @Test
    public void shouldBeTrue(){

        String value = "My default value";

        TransformationResult result= transformation.transform(value);

        assertEquals(result.getValue(), value);
    }


}
