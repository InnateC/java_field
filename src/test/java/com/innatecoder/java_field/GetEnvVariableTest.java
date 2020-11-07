package com.innatecoder.java_field;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class GetEnvVariableTest {

    @Test
    public void testEnvExtraction() {

        String var = GetEnvVariable.getEnv("DESKTOP_SESSION");
        assertEquals("strings should be equal", var, "gnome");


    }
}