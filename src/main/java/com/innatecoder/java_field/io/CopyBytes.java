package com.innatecoder.java_field.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBytes {
    public static void main(String[] args) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            System.out.println("We are copying Fog.txt to retyped.txt");

            in = new FileInputStream("src/text_examples/Fog.txt");
            out = new FileOutputStream("target/classes/com/innatecoder/java_field/io/retyped.txt");

            int c;
            while((c = in.read()) != -1) {
                out.write(c);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
    
}
