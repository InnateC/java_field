package com.innatecoder.java_field;

import org.junit.Test;
import static org.junit.Assert.assertNotEquals;;


public class GetEnvVariableTest {

    @Test
    public void testEnvExtraction() {

        String var = GetEnvVariable.getEnv("PATH");
        assertNotEquals("strings should not equal", var, null);


    }
}