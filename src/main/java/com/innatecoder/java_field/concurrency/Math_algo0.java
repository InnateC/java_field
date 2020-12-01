package com.innatecoder.java_field.concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


// Static type
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

class DataGeneric {

    public static <T> List<T> fill(int numOfElements, T elem) {

        List<T> data = new ArrayList<T>();
        
        
        //Random random = new Random();
        
        for(int i = 0; i < numOfElements; i++)
            data.add(elem);

        return data;
    }
}



   



public class Math_algo0 {

     public static void main(String[] args) {
        //var arr = Data.fill(20);
        var arr = DataGeneric.fill(10, 5);
        System.out.println(arr.toString());
}
}
