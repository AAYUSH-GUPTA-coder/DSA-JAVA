package com.aayush;
//Factors of a number using java :
//        In this article we will create a java program to find factors(divisors) of a number. Factors of a number are the numbers which completely divides that number.
//
//        Suppose a number is 8, so its factors will be 1 , 2 , 4 and 8.
//
//        Point to remember :
//
//        Factors of a number are always starts with 1 and ends with the number itself.
//        All the factors of a number are always smaller than the number whose factors is to be calculated.

import java.util.Scanner;

public class FactorsOfNum {
    public static void main(String[] args) {
        System.out.println("enter the Number:");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        for(int i=1;i<=num;i++){
            if(num % i == 0){
                System.out.print(i + " ");
            }
        }
    }
}
