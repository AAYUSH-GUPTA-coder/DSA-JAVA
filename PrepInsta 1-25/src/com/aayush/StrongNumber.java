package com.aayush;

import java.util.Scanner;

//Strong Number is the number whose sum of factorial of the digits in any number is equal to the given number.
//
//        Simply, if we have  a number then firstly calculate the factorial of each digit of the number and then calculate the sum of factorial of each digit.
//
//        Let us consider an example :
//
//        Suppose we have a number 145 then,
//
//        Factorial of all digits –
//        Factorial of 1 = 1 ;
//
//        Factorial of 4 = 24 ;
//
//        Factorial of 5 = 120 ;
//
//        Sum of Factorial of all digits –
//        1 + 24 + 120 = 145 ;
//
//        Here the calculated result is equal to the given number ;
//
//        So, 145 is a Strong Number.
//
//        In this article we will create a java program to check whether the given number is a Strong number or not.
public class StrongNumber {
    public static void main(String[] args) {
        System.out.println("enter the Number:");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println(isStrongNum(num));
    }

    static boolean isStrongNum(int num){
        int num1 = num;
        int sum =0, totalSum =0;
        while(num1 > 0){
            int rem = num1 % 10;
            sum = factoral(rem);
            num1 = num1 /10 ;
            totalSum = totalSum +sum;
        }
        return totalSum == num;
    }

    static int factoral(int num){
        int sum =1;
        while(num > 0){
            sum = sum * num;
            num--;
        }
        return sum;
    }
}
