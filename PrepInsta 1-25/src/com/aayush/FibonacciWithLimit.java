package com.aayush;
//Fibonacci series is a series of numbers in which each number is the sum of the two preceding numbers. For example,
//
//        0 , 1 , 1 , 2 , 3 , 5 , 8 , 13 , 21 , 34 , 55 , 89……….n
//
//        Where n is the maximum limit of the series.
//
//        Suppose, the value of n is 15 then the series will be,
//
//        0 , 1 , 1 , 2 , 3 , 5 , 8 ,13
//
//        In this article we will create a java program to print the above series up to n numbers.
import java.util.Scanner;

//0 , 1 , 1 , 2 , 3 , 5 , 8 , 13 , 21 , 34 , 55 , 89……….n
public class FibonacciWithLimit {
    public static void main(String[] args) {
        System.out.println("enter the Number:");
        Scanner input = new Scanner(System.in);
        int lim = input.nextInt();
        int first_num=0,second_num=1,s=0;
        if(lim < 2){
            System.out.println(lim);
        }
        System.out.print("Fibonnaci Series: "+first_num+" "+second_num+" ");
        while(s <= lim){
            s = first_num+second_num;
            first_num = second_num;
            second_num = s;

            if(second_num <= lim){
                System.out.print(second_num+ " ");
            }
        }
    }
}
