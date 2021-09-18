package com.aayush;

public class Palindrome {
    public static void main(String[] args) {
        String str = "abcd@cba";
        System.out.println(isPalindome(str));
    }

    static boolean isPalindome(String str){
        if(str == null || str.length() == 0){
            return true;
        }

        str = str.replaceAll("[^0-9A-Za-z]","").toLowerCase();
        int i=0, j = str.length()-1;

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
