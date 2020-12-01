package com.innatecoder.java_field.concurrency;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Math_algo {
    public static void main(String[] args) {
        Executor executor = Executors.newCachedThreadPool();
        for(int i = 0; i<10;i++)
            executor.execute(new Task());

        ThreadPoolExecutor pool = (ThreadPoolExecutor) executor;
        pool.shutdown();
    }
    
    static class Task implements Runnable {
        public void run() {
            try {
                Long duration = (long) (Math.random() * 5);
                System.out.println("Running Task! Thread: " + Thread.currentThread().getId());
                TimeUnit.SECONDS.sleep(duration);
                System.out.println("Task Completed Thread: " + Thread.currentThread().getId());

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
