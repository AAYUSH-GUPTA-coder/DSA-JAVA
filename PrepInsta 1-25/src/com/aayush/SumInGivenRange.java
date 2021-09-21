package com.aayush;

import java.util.Scanner;

//Sum of numbers in a given range :
//
//        In this article we will perform addition on natural numbers in a given range. So for this, we have to ask the user to enter two numbers which will denote the starting and ending of the range for adding all natural numbers between that range.
//
//
//
//        For better understanding let’s suppose two values 3 and 8,
//
//        Then, Sum of all natural numbers between 3 and 8 will be (3+4+5+6+7+8) = 33.
public class SumInGivenRange {
    public static void main(String[] args) {
        System.out.println("Enter the Range");
        Scanner input = new Scanner(System.in);
        int firstNum = input.nextInt();
        int lastNum = input.nextInt();
        System.out.println(SumInRange(firstNum,lastNum));
    }

    static int SumInRange(int firstNum,int lastNum){
        int sum=0;
        while(lastNum >= firstNum){
            sum+= lastNum;
            lastNum--;
        }
        return sum;
    }
}
