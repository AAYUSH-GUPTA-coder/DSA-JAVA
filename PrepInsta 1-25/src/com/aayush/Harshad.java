package com.aayush;

//Harshad number is a number or an integer in base 10 which is completely divisible by sum of  its digits.
//
//        For better understanding let us consider an example.
//
//        Example :
//
//        Suppose a number 24 .
//        Calculate the sum of digits of the number (2 + 4) = 6 .
//        Check whether the number entered by user is completely divisible by sum of its digits or not.
//        Below are first few Harshad Numbers represented in base 10 :
//
//        1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 18, 20………
//
//        In this article, we will create a java program to check whether the number entered by the user is Harshad number or not.

import java.util.Scanner;

public class Harshad {
    public static void main(String[] args) {
        System.out.println("enter the Number:");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println(isHarshadNumber(num));
    }

    static boolean isHarshadNumber(int num){
//        1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 18, 20………
        int sum = 0;
        int num1 = num;
        while(num1 > 0 ){
            int rem = num1 % 10;
            sum = sum + rem;
            num1 = num1 / 10;
        }
//        System.out.println("sum: "+ sum);
        return (num % sum == 0);
    }
}
