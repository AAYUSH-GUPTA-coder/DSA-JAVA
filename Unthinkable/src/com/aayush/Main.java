package com.aayush;
//Find the count of substrings in alphabetic order

//Input : str = "refjhlmnbv"
//        Output : 2
//        Substrings are: "ef", "mn"
//
//        Input : str = "qwertyuiopasdfghjklzxcvbnm"
//        Output : 3

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(words("refjhlmnbv"));
    }

    static int words(String str){
        int result=0;
        for(int i=0;i<str.length()-1;i++) {
            if (str.charAt(i) + 1 == str.charAt(i + 1)) {
                result++;
                while (str.charAt(i) + 1 == str.charAt(i + 1)) {
                    i++;
                }
            }
        }
        return result;
    }
}
