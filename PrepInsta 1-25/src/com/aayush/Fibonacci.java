package com.aayush;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("enter the Number:");
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();
        if(count == 1){
            System.out.println("0");
        }
        if(count == 2){
            System.out.println("0 1");
        }
        int first_num=0,second_num=1,s=0;
        System.out.print("Fibonacci Series: "+first_num+" "+second_num);
        for(int i=1;i<count;i++){
            s= first_num+second_num;
            first_num = second_num;
            second_num = s;
            System.out.print(" "+s);
        }
    }
}
