package com.aayush;
//Reverse of a number in java :
//
//
//        In this article, we will create a java program to reverse a number. Here we will ask the user to enter a number and then by the help of the java code we will reverse the number and display it on the screen.
//
//
//
//        Reversing of a number generally means printing the number in reverse order.
//
//
//
//        On most of the sites, the reverse of a number is done in wrong way because if you put 90, 100, 1300 and many other inputs which have ‘ 0 ’ in last digits of the number then it will neglect 0 in their output. So, below mentioned code is made after considering all the cases.
//
//
//
//        For better understanding let’s consider some examples :
//
//        1900 : Reverse is 0091
//        95724 : Reverse is 42759

import java.util.Scanner;

public class reverseANum {
    public static void main(String[] args) {
        System.out.println("enter the Number:");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        String s="";
        int rem;
        while(num > 0){
            rem = num%10;
            s = s + Integer.toString(rem);
            num = num/10;
        }
        System.out.println(s);
    }
}
