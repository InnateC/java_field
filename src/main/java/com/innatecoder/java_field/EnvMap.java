package com.innatecoder.java_field;

import java.util.Map;

public class EnvMap
{
    public static void main( String[] args ) {

       printEnv();
        
    }

    public static void printEnv() {

        Map<String,String> env = System.getenv();
        for (String envName : env.keySet()) {
            System.out.format("%s=%s%n", envName, env.get(envName));
        }

    }

}
