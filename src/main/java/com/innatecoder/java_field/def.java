package com.innatecoder.java_field;

interface One {
    default void method() {
        System.out.println("One");
        
        
    }
}

interface Two {
    default void method() {
        System.out.println("Two");
    }
}

class three implements One,Two {
    
    public void method() {
        Two.super.method();
        One.super.method();
        
    }
    
}

public class def {
    public static void main(String[] args) {
        three obj = new three();
        obj.method();
    }


    
    
}
