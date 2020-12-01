package com.innatecoder.java_field.concurrency;

public class MyRunnable implements Runnable {

    private boolean isHalted = false;

    public synchronized void stopIt() {
        this.isHalted = true;
    }

    public synchronized boolean running() {
        return isHalted ? false : true;
    }

    @Override
    public void run() {
        while(running()) {
            System.out.println("running");
            try {
                Thread.sleep(3L * 1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    };
    
}
