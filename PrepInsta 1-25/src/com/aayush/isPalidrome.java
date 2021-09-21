package com.aayush;

import java.util.Scanner;

public class isPalidrome {
    public static void main(String[] args) {
        System.out.println("enter the String:");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        System.out.println(isPalidrome1(str));
    }

    static boolean isPalidrome1(String str){
        str = str.replaceAll("[^0-9a-zA-Z]","").toLowerCase();
        int i=0,j=str.length()-1;
        while(i<=j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
