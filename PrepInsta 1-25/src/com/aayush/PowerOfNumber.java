package com.aayush;
//Power of a number using java :
//        In this article we will create a java program to calculate power of a number. The power of a number is the number multiplied to itself for the number of times it has been raised to. To calculate the power of a number we can directly use power() function, but we have created the program without using power function to make the program more  simple and easier.
//
//        For better understanding let us consider an example :
//
//        Suppose, 5 is the number and it is raised with the power 2 then its resultant will be 25.
//
//        5 ^ 2 = 25 ;
//
//        where 5 is said to be the base and 2 is said to be the exponent.

import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        System.out.println("enter the Base:");
        Scanner input = new Scanner(System.in);
        int base = input.nextInt();
        System.out.println("enter the exponent:");
        int exp = input.nextInt();
        System.out.println(power(base,exp));
    }

    static int power(int base,int exp){
        int total=1;
        int exp1 = exp;
        while(exp1 > 0){
            total = total * base;
            exp1--;
        }
        return total;
    }

}
