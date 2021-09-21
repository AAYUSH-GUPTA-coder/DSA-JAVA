package com.aayush;

import java.util.Scanner;

//A number is positive or negative using java :
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println(CheckNegative(num));
    }

    static String CheckNegative(int num){
        if(num < 0){
            return "Negative Number";
        }else if(num > 0){
            return "Positive Number";
        }else{
            return "Zero";
        }
    }
}
