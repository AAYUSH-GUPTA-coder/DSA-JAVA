package com.aayush;

import java.util.Scanner;

public class PrimeNumbersTwist {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        check(num);
        System.out.println(isPrime(num));
    }

    static void check(int num){
        if(num < 0){
            System.out.println("please enter the positive number");
        }
    }

    static boolean isPrime(int num){
        if(num == 1){
            return false;
        }
        int c = 2;
        while( c*c <= num){
            if(num % c == 0){
                return false;
            }
            c++;
        }
        return true;
    }
}
