package com.aayush;
//Friendly Pair are two natural numbers whose sum of factors of first number and sum of factors of second number is equal to
// second number and first number respectively.
//
//        In other words, Sum of factors of first number is equal to the second number and Sum of factors of second number is
//        equal to the first number.
//
//        For better understanding let us consider an example.
//
//
//
//        Example :
//
//        Suppose two numbers 220 and 284.
//        Factors of both numbers :
//        – Factors of 220 = 1 , 2 , 4 , 5 , 10 , 11 , 20 , 22 , 44 , 55 and 110 ;
//
//        – Factors of 284 = 1 , 2 , 4 , 71 and 142.
//
//        Sum of factors of both numbers :
//        – Sum of factors of 220 =
//
//        1 + 2 + 4 + 5 + 10 + 11 + 20 + 22 + 44 + 55 + 110 = 284
//
//        – Sum of factors of 284 =
//
//        1 + 2 + 4 + 71 + 142 = 220
//
//        Here we see that Sum of factors of first number is equal to the second number and Sum of factors of
//        second number is equal to the first number.
//        Hence, these both numbers are Friendly Pair to each other.

import java.util.Scanner;

public class FriendlyPair {
    public static void main(String[] args) {
        System.out.println("enter the tow Numbers:");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        System.out.println(isFriendlyPair(num1,num2));
    }
    static boolean isFriendlyPair(int num1,int num2){
        int sum1= 0 ;
        int sum2 = 0;
        for(int i=1 ; i< num1;i++){
            if(num1 % i == 0){
                sum1 = sum1 + i;
            }
        }

        for(int j=1; j< num2;j++){
            if(num2 % j == 0){
                sum2 = sum2 + j;
            }
        }
        return (sum2 == num1 && sum1 == num2);
    }
}
