package com.aayush;

import java.util.ArrayList;
import java.util.Arrays;

public class Concatenation {
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println((char)('a' + 3));
        System.out.println('a' + 3);

        System.out.println("a" + 1);

        System.out.println("kunal" + new ArrayList<>());
        // ArrayList<>() is converted into string using toString();

        System.out.println("Kunal" + new Integer(56));


    }
}
