package com.innatecoder.java_field.concurrency;

import java.util.Random;


class Data {

    public static int[] fill(int numOfElements) {
        int[] data;
        Random random = new Random();
        data = new int [numOfElements];
        for(int i = 0; i<numOfElements; i++)
            data[i] = random.nextInt();

        return data;
    }
}


public class Math_algo0 {
    public static void main(String[] args) {
        var arr = Data.fill(20);
        System.out.println(arr[2]);
}
}
