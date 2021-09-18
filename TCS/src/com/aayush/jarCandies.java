package com.aayush;
//TCS Coding Question
//        There is a JAR full of candies for sale at a mall counter. JAR has the capacity N,
//        that is JAR can contain maximum N candies when JAR is full. At any point of time. JAR can have M number of Candies
//        where M<=N. Candies are served to the customers. JAR is never remain empty as when last k candies are left.
//        JAR if refilled with new candies in such a way that JAR get full.

//        Write a code to implement above scenario. Display JAR at counter with available number of candies.
//        Input should be the number of candies one customer can order at point of time. Update the JAR after each purchase and
//        display JAR at Counter.
//
//        Output should give number of Candies sold and updated number of Candies in JAR.
//
//        If Input is more than candies in JAR, return: “INVALID INPUT”
//Given,
//
//        N=10, where N is NUMBER OF CANDIES AVAILABLE
//
//        K =< 5, where k is number of minimum candies that must be inside JAR ever.
//
//        Example 1:(N = 10, k =< 5)
//
//        Input Value
//        3
//        Output Value
//        NUMBER OF CANDIES SOLD : 3
//        NUMBER OF CANDIES AVAILABLE : 7
//
//
//        Example : (N=10, k<=5)
//
//        Input Value
//        0
//        Output Value
//        INVALID INPUT
//        NUMBER OF CANDIES LEFT : 10
//

import java.util.*;

public class jarCandies {
    public static void main(String[] args) {
        int n=10 ,k =5;
        System.out.println("CANDIES SOLD:");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        if(num>1 && num <= k){
            System.out.println("NUMBER OF CANDIES SOLD: "+ num);
            System.out.println("NUMBER OF CANDIES LEFT: "+ (n- num));
        } else{
            System.out.println("INVALID VALUE");
            System.out.println("NUMBER OF CANDIES LEFT: "+ n);
        }
    }
}
