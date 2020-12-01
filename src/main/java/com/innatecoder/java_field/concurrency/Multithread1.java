package com.innatecoder.java_field.concurrency;


class MyThread implements Runnable {
    String name;
    Thread thread;

    MyThread(String threadName) {
        name = threadName;
        thread = new Thread(this, name);
        System.out.println("I'm " + thread);
        thread.start();
    }

    public void run() {
        try {
            for(int i = 5; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
                    System.out.println(name + " Interrupted");
        }

        System.out.println(name + " exited");
    }
}



public class Multithread1 {

    public static void main(String args[]) {
        System.out.println("You have " + Runtime.getRuntime().availableProcessors() + " processors on your machine");

        new MyThread("one");
        new MyThread("two");
        new MyThread("three");

        System.out.println( "All threads started. Sincerely your " + Thread.currentThread().getName());
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("Main thread Interrupted");
        }
        System.out.println("Main thread exiting.");
    }
    
}
