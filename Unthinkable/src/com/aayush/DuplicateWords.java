package com.aayush;

import java.util.*;

//Count the number of duplicate words in a given sentence

public class DuplicateWords {
    public static void main(String[] args) {
        String str = "big black bug bit a big black dog on his big black nose";
        System.out.println(duplicate(str));
    }

    static int duplicate(String str){
        ArrayList<String> duplicateWords = new ArrayList<>();
        str = str.toLowerCase();
        String[] words = str.split(" ");
        System.out.println(Arrays.toString(words));
        int duplicate = 0;
        for(int i =0;i<words.length-1;i++){
            int count =1;
            for(int j = i+1 ; j < words.length-1;j++){
                if(words[i].equals(words[j])){
                    count++;
                    words[j] = "0";
                }
            }
            if(count > 1 && words[i] != "0"){
                duplicateWords.add(words[i]);
        }
    }
        return duplicateWords.size();
    }
}
