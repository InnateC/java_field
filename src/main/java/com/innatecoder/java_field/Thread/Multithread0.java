package com.innatecoder.java_field.Thread;

/**
    Example of anonymous thread class
*/

public class Multithread0 {
    public static void main(String[] args) {
        Thread thread = new Thread("thread1") {
            public void run() {
                System.out.println("thread is started");
            }
        };

        thread.start();
        System.out.println("Starting new thread: " + thread.getName());
    }
}
