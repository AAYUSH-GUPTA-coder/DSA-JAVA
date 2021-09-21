package com.aayush;

import java.util.Scanner;

//Sum of digits of a number using java :
//        In this article we will find the sum of digits of an integer. For this purpose we will use a loop and a variable to sum the digits of the number entered by the user. Let us consider some examples for better understanding :
//
//        Input : 27
//
//        Output : Sum of Digits = 9
//
//        Input : 12345
//
//        Output : Sum of Digits = 15
public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println("enter the Number:");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println(Sum(num));
    }

    static int Sum(int num){
        // 23
        int Sum =0;
        while(num > 0){
            int rem = num % 10;
            Sum += rem;
            num = num/10;
        }
        return Sum;
    }
}
