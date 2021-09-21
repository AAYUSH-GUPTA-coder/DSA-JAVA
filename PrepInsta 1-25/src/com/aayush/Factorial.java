package com.aayush;
//Factorial of a number is the product of all numbers or integers which are between the range of the number and one. Or can say, factorial of an integer is the product of all the integers below it, till 1.
//
//        For 0, the factorial is 1 ;
//        For negative numbers, the factorial values are not defined.
//
//
//        In this article we will create a program to calculate the factorial of a number. For better understanding let’s consider some examples :
//
//        5 : Factorial of 5 is 5 * 4 * 3 * 2 * 1 = 120 ,
//        7 : Factorial of 7 is 7 * 6 * 5 * 4 * 3 * 2 * 1 = 5040

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("enter the Number:");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println(FactorialSum(num));
    }

    static int FactorialSum(int num1){
        int total=1;
        while (num1 > 0){
            total = total * num1;
            num1--;
        }
        return total;
    }
}
