package com.aayush;
//Consider the following series: 1, 1, 2, 3, 4, 9, 8, 27, 16, 81, 32, 243, 64, 729, 128, 2187 …
//
//        This series is a mixture of 2 series – all the odd terms in this series form a geometric series and all the even terms form yet
//        another geometric series. Write a program to find the Nth term in the series.
//
//        The value N in a positive integer that should be read from STDIN. The Nth term that is calculated by the program should be written
//        to STDOUT. Other than value of n th term,no other character / string or message should be written to STDOUT. For example , if N=16,
//        the 16th term in the series is 2187, so only value 2187 should be printed to STDOUT.
//
//        You can assume that N will not exceed 30.

import java.util.*;
public class NumberSeries2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //input value of n
        System.out.print("Enter the value of N:");
        int n = sc.nextInt();
        int a=1,b=1;
        if(n % 2 == 0)
        {
            for(int i = 1 ; i <= (n-2) ; i = i+2)
            {
                a = a * 2;
                b = b * 3;
            }
            System.out.print(n+" element of the series is = "+b);
        }
        //statement for odd value of n
        else
        {
            for(int i = 1 ; i < (n-2) ; i = i+2)
            {
                a = a * 2;
                b = b * 3;
            }
            a = a * 2;
            System.out.print(n+" element of the series is = "+a);
        }
    }
}
