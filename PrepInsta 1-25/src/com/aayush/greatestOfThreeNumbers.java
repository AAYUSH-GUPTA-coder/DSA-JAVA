package com.aayush;

import java.util.Scanner;

public class greatestOfThreeNumbers {
    public static void main(String[] args) {
        System.out.println("Enter three numbers");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        System.out.println(Greatest(num1,num2,num3));
    }

    static String Greatest(int num1,int num2,int num3){
        if(num1 > num2 && num1 > num3){
            return (num1+" is greater than " +num2 + " and "+ num3);
        }else if(num2 > num1 && num2 > num3){
            return (num2+" is greater than " +num1 + " and "+ num3);
        }else if(num3 > num2 && num3 > num1){
            return (num3+" is greater than " +num1 + " and "+ num2);
        }else{
            return (num1 + ","+ num2+ " and "+ num3 + " are all same");
        }
    }
}
