package com.aayush;

import java.util.Scanner;

//An Armstrong Number of three digits is the number whose sum of the cubes of its digits is equal to the given number or can say the number itself should be the result.
//
//        Let us consider an example for understanding it in a better way.
//
//        Example :
//
//        Suppose a number is 407 ;
//        Cubes of its digits are :
//        Cube of 4 = 64 ;
//
//        Cube of 0 = 0 ;
//
//        Cube of 7 =  343 ;
//
//        Sum of all digit’s cube :
//        64 + 0 + 343 =407
//
//        Here the calculated result is equal to the given number ;
//
//        So, 407 is an Armstrong Number.
public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println("enter the Number:");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println(isArmstrong(num));
    }

    static boolean isArmstrong(int num1){
        int num = num1;
        int sum=0, totalSum=0;

        while(num > 0){
            int rem = num % 10;
            sum = rem * rem * rem;
            totalSum = totalSum+ sum;
            num = num /10;
        }
        return totalSum == num1;
    }
}
