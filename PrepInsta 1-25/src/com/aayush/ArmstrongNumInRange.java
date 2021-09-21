package com.aayush;

import java.util.Scanner;

//Enter Starting Number : 10
//        Enter Ending Number : 1000
//        Armstrong numbers between 10 and 1000 are :
//        153
//        370
//        371
//        407
public class ArmstrongNumInRange {
    public static void main(String[] args) {
        System.out.println("enter Range:");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        ArmStrongRange(num1,num2);
    }

    static void ArmStrongRange(int num1,int num2) {
        while (num1 <= num2) {
            if (isArmStrong(num1)) {
                System.out.print(num1+ " ");
            }
            num1++;
        }
    }

    static boolean isArmStrong(int num1){
        int num = num1;
        int sum=0,totalSum=0;
        while(num > 0){
            int rem = num % 10;
            sum = rem *rem * rem;
            totalSum = sum+totalSum;
            num = num/10;
        }
        return totalSum == num1;
    }
}
