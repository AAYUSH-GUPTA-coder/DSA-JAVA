package com.aayush;
//Java program to check whether the number is prime number or not :
//
//
//        Prime Number are the whole numbers which have two factors i.e. 1 and the number by itself. Some of the facts for the prime numbers are given below :-
//
//        0 and 1 are not considered as prime number.
//        Except for 0 and 1, a number is either a prime number or a composite number.
//        Numbers that have more than two factors are called composite numbers.
//        The  1 is neither prime nor composite.
//        Except 2, all other even numbers are not prime.
//        The first 25 prime numbers (all the prime numbers less than 100) are : 2, 3, 5, 7, 11, 13, 17, 19, 23
//        29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97.
import java.util.*;

public class isPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println(isPrime(num));
    }

    static boolean isPrime(int num){
        if(num == 1){
            return false;
        }
        int c=2;
        while(c*c <= num){
            if(num % c == 0){
                return false;
            }
            c++;
        }
        return true;
    }
}
