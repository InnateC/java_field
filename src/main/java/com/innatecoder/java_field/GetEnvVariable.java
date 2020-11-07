package com.innatecoder.java_field;

public class GetEnvVariable {

    public static String getEnv(String variable) {
        
        String value = System.getenv(variable);
        return value;
        
    }
}