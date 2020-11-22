package com.innatecoder.java_field.io;

import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.Scanner;

public class TextScanner {
    public static void main(String[] args) throws IOException {
        
        final String file = "src/text_examples/Fog.txt";
        Scanner s = null;
        
        try {
            s = new Scanner(new BufferedReader(new FileReader(file)));
            s.useDelimiter("\n");
            
            while (s.hasNext()) {
                System.out.println(s.next());
            }
        } finally {
            if (s != null) {
                s.close();
            }
        }
    }
}
