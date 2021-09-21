package com.aayush;
//An abundant number is a number for which the sum of its proper factors is greater than the number itself.
// For better understanding lets consider an example so that we can easily understand that exactly what is an abundant number.
//
//        Abundant number is also known as Excessive number.
//
//        Example :
//
//        Suppose an integer value is 24 , then its proper factors are 1, 2, 3, 4, 6, 8, and 12, whose sum is 36.
//        Because 36 is more than 24, the number 24 is abundant. Its abundance is 36 − 24 = 12.
//

import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {
        System.out.println("enter the Number:");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println(isAbundantNumber(num));
    }

    static boolean isAbundantNumber(int num){
        int sum =0;
        for(int i=1;i< num;i++){
            if(num % i == 0){
                System.out.println(i);
                sum = sum+i;
            }
        }
        System.out.println(sum);
        return sum > num;
    }
}
