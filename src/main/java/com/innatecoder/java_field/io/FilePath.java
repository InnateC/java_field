package com.innatecoder.java_field.io;

import java.nio.file.Path;
import java.nio.file.Paths;

public class FilePath {

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("example: FilePath file");
            System.exit(-1);
        }
        Path inputPath = Paths.get(args[0]);

        Path fullPath = inputPath.toAbsolutePath();
        System.out.format("You cand find file at %s%n", fullPath);

    }
    
}
