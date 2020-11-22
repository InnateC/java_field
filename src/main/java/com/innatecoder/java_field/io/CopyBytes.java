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

            System.out.println("The file contains " + in.available() + " bytes");
            int character;
            
            
            while((character = in.read()) != -1) {
                System.out.println("The file contains " + in.available() + " bytes");

                out.write(character);
                
                System.out.println("In output file was written " + (char)character + " character");
            }
            
            System.out.println("Done!");
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
