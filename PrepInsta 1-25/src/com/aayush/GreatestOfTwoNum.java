package com.aayush;

import java.util.Scanner;

//Greatest of two numbers
public class GreatestOfTwoNum {
    public static void main(String[] args) {
        System.out.println("Enter two numbers");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        System.out.println(Greatest(num1,num2));
    }

    static String Greatest(int num1,int num2){
        if(num1 > num2){
            return (num1+" is greater");
        }else if (num2 > num1){
            return (num2+" is greater");
        }else{
            return "Both are same";
        }
    }
}
