package com.aayush;
//Find the 15th term of the series?
//
//        0,0,7,6,14,12,21,18, 28
//
//        Explanation : In this series the odd term is increment of 7 {0, 7, 14, 21, 28, 35 – – – – – – }
//
//        And even term is a increment of 6 {0, 6, 12, 18, 24, 30 – – – – – – }
public class NumberSeries {
    public static void main(String[] args) {
        int a=7 ,b=0,c=0;
        for(int i=1;i<8;i++){
            c = a*b;
            System.out.print(c + " "+(c-b)+" ");
            b++;
        }
        c= a*b;
        System.out.println(c);
        System.out.println("15th number is : "+ c);
    }
}
