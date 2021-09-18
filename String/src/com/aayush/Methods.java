package com.aayush;

import java.util.Arrays;
import java.util.Locale;

public class Methods {
    public static void main(String[] args) {
        String name = "Aayush Gupta";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name.indexOf('t'));
        System.out.println("          Aayush      ".strip());
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
