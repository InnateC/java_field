package com.innatecoder.java_field;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class GetEnvVariableTest {

    @Test
    public void testEnvExtraction() {

        String var = GetEnvVariable.getEnv("HOME");
        assertEquals("strings should be equal", var, "/home/denis");


    }
}