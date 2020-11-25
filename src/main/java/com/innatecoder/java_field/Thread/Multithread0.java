package com.innatecoder.java_field.Thread;

/**
    Example of anonymous thread class
*/

public class Multithread0 {

    static void callLambdaThread(String name){
        Runnable runnable = () -> {System.out.printf("%s is started%n", name);};
        Thread thread = new Thread(runnable,name);
        thread.start();
    };
    static void callAnonymousThread(String name){

        Thread thread = new Thread(name) {
            public void run() {
                System.out.printf("%s is started%n", name);
            }
        };

        thread.start();
        
    };

    public static void main(String[] args) {

        callAnonymousThread("thread1");
        callLambdaThread("thread2");

        for(int i = 0; i < 10; i++) {
            callAnonymousThread("Loop" + i);
        }

        
    }
}
