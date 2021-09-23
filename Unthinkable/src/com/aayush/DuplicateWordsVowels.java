package com.aayush;

import java.util.*;

public class DuplicateWordsVowels {
    public static void main(String[] args){
        String str = "www www Big black bug bit a big black dog on his big black aay aay nose";
        System.out.println(duplicate(str));
    }

    static ArrayList<String> duplicate(String str){
        int count;
        ArrayList<String> duplicate = new ArrayList<>();
        str = str.toLowerCase();
        String words[] = str.split(" ");
        System.out.println(Arrays.toString(words));
        for(int i=0;i<words.length;i++){
            count=1;
            for(int j=i+1;j<words.length;j++){
                if(words[i].equals(words[j])){
                    count++;
                    words[j]="0";
                }
            }
            if(count > 1 && words[i] != "0"){
                duplicate.add(words[i]);
            }
        }
        return ConVowels(duplicate);
    }

    static ArrayList<String> ConVowels(ArrayList<String> duplicate){
        for(int i=0;i<duplicate.size();i++){
            if(duplicate.get(i).contains("a") || duplicate.get(i).contains("e") || duplicate.get(i).contains("i")  || duplicate.get(i).contains("o")  ||duplicate.get(i).contains("u")){
                continue;
            }else{
                duplicate.remove(i);
            }
        }
        alphabeticalOrder(duplicate);
        return duplicate;
    }

    static ArrayList<String> alphabeticalOrder(ArrayList<String> duplicate){
        Collections.sort(duplicate);
        return duplicate;
    }
}
