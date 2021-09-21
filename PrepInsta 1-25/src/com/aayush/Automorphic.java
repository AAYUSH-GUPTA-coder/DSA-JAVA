package com.aayush;
//Automorphic number is a number whose square ends in the same digits as the number itself.
//
//        For better understanding lets consider an example :
//
//        Suppose a number 5.
//        Square of 5 is 25.
//        and we see that 25 ends in the same digit as the number itself, means 5.
//        Hence we can conclude that 5 is an Automorphic Number.
//
//        Some more Automorphic Numbers are : 5 , 6 , 76 , 376 and 890625.

import java.util.Scanner;

public class Automorphic {
    public static void main(String[] args) {
        System.out.println("enter the Number:");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println(isAutoMorphic(num));
    }

    static boolean isAutoMorphic(int num){
        String s1 = Integer.toString(num);
        int l1 = s1.length();
        int sqr = num * num;
        String s2 = Integer.toString(sqr);
        int l2 = s2.length();
        String s3 = s2.substring(l2-l1);
        return (s1.equals(s3));
    }
}
