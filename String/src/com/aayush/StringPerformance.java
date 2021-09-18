package com.aayush;

public class StringPerformance {
    public static void main(String[] args) {
//        String series = "";
//        for(int i=0;i<26;i++){
//            char ch = (char)('a'+i);
////            System.out.print(ch+ "  ");
//            series = series + ch;
//        }
        // O(N^2)
//        System.out.println(series);

        StringBuilder series = new StringBuilder();
        for(int i=0;i<26;i++){
            char ch = (char)('a'+i);
            series.append(ch);
        }
        //O(N)
        System.out.println(series);
    }
}
