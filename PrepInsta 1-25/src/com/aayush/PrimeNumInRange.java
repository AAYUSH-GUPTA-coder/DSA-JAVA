package com.aayush;

import java.util.Scanner;

//Prime numbers in a given range using java :
//        In this article we will create a java program to find all prime numbers between the given range. For this purpose we will ask the user to enter starting range and ending range so that all prime numbers between this range can be find and prime number are the whole numbers which have two factors i.e. 1 and the number by itself. Some of the facts for the prime numbers are given below :-
//
//        0 and 1 are not considered as prime number.
//        Except for 0 and 1, a number is either a prime number or a composite number.
//        Numbers that have more than two factors are called composite numbers.
//        The  1 is neither prime nor composite.
//        Except 2, all other even numbers are not prime.
//        The first 25 prime numbers (all the prime numbers less than 100) are : 2, 3, 5, 7, 11, 13, 17, 19, 23
//        29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97.
public class PrimeNumInRange {
    public static void main(String[] args) {
        System.out.println("enter the range:");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        PrimeNumInGivenRange(num1, num2);
    }

    static void PrimeNumInGivenRange(int num1,int num2){
        while(num1 <= num2){
            if(isPrime(num1)){
                System.out.print(num1 + " ");
            }
            num1++;
        }
    }

    static boolean isPrime(int num1){
        if(num1 == 1){
            return false;
        }
        int c=2;
        while(c*c <= num1){
            if(num1 % c == 0) return false;
            c++;
        }
        return true;
    }
}
