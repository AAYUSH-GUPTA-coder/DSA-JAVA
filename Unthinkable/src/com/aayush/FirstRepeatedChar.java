package com.aayush;
//Find the first repeated character in a string
import java.util.Arrays;
import java.util.HashSet;

public class FirstRepeatedChar {
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        System.out.println(str);
        char[] arr = str.toCharArray();
        System.out.println(Arrays.toString(arr));
        System.out.println(Duplicate(arr));
    }

    static char Duplicate(char[] arr) {
        HashSet<Character> hash = new HashSet<>();
        for(int i=0;i<arr.length;i++) {
            char c = arr[i];
           if(hash.contains(c)){
               return c;
           }else{
               hash.add(c);
           }
        }
        return '0';
    }
}
