package com.aayush;

import java.util.Scanner;

//Leap year is a year which is completely divisible by 4, but the year should not be a century year except when the year is divisible by 400. For better understanding let’s consider an example.
//
//        Example : Suppose a year is 2016,
//
//        Then, check that it should be completely divisible by 4 and should not be a century year or can say that the year should not be completely divisible by 100 .
//
//        Yes, 2016 is completely divisible by 4 and not a century year, because it is not completely divisible by 400.
//
//        And now if the above condition do not gets true then check that the year is completely divisible by 400 or not.
//          1000
//        If either of the above conditions get true, then the year is a Leap Year, otherwise the year is not a Leap Year
public class leapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println(IsLeapYear(num));
    }

    static boolean IsLeapYear(int num){
        return((num % 4 == 0 && num % 100 != 0) || num % 400 == 0);
    }
}
