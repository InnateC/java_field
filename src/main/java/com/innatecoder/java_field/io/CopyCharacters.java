package com.innatecoder.java_field.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyCharacters {
    public static void main(String[] args) throws IOException {
        FileReader inputStream = null;
        FileWriter outputStream = null;

        try {
            
            inputStream = new FileReader("src/text_examples/Fog.txt");
            outputStream = new FileWriter("target/classes/com/innatecoder/java_field/io/characters.txt");

            int c;

            while ((c = inputStream.read()) != -1) {
                System.out.println("Writing character: " + (char) c);
                outputStream.write(c);
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
