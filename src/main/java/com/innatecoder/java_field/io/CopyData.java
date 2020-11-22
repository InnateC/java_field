package com.innatecoder.java_field.io;

import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;

public class CopyData {

    static final String dataFile ="target/classes/com/innatecoder/java_field/io/data.txt";
    static final double[] prices = { 11.11, 4.22, 5.53, 8.53, 2.25 };
    static final int[] units = {3, 5, 6, 1, 9};
    static final String[] descs = {
        "Pen",
        "Desk",
        "Table",
        "Chair",
        "Cup"
    };
    public static void main(String[] args) throws IOException{
      
        DataOutputStream out = null;
        DataInputStream in = null;

        try {
            out = new DataOutputStream(new BufferedOutputStream(
                new FileOutputStream(dataFile)));
                
                for (int i = 0; i < prices.length; i++) {
                    out.writeDouble(prices[i]);
                    out.writeInt(units[i]);
                    out.writeUTF(descs[i]);
                    
                }
                
            out.close();
                
            in = new DataInputStream(new BufferedInputStream(new FileInputStream(dataFile)));

            double price;
            int un;
            String desc;
            double total = 0.0;

            try {
                while(true) {
                    price = in.readDouble();
                    un = in.readInt();
                    desc = in.readUTF();
                    System.out.format("You ordered %d" + " units of %s at $%.2f%n", un, desc,price);
                    total += un * price;
                } 
            } catch (EOFException e) {

            }

            System.out.format("Total price: $%.2f%n", total);
            

        } finally {
            if (out != null) {
                out.close();
            }
            if (in != null) {
                in.close();
            }
        }
    }
    
}
