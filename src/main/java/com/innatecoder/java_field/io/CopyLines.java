package com.innatecoder.java_field.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.IOException;

public class CopyLines {
    public static void main(String[] args) throws IOException {
        BufferedReader inputStream = null;
        PrintWriter outputStream = null;

        try {

            inputStream = new BufferedReader(new FileReader("src/text_examples/Fog.txt"));
            outputStream = new PrintWriter(new FileWriter("target/classes/com/innatecoder/java_field/io/lines.txt"));

            String str;
            while ((str = inputStream.readLine()) != null) {
                System.out.println("Writing: " + str);
                outputStream.println(str);
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}
