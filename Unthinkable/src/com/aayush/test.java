package com.aayush;

public class test {
    public static void main(String[] args) {
        System.out.println(test("A man, a plan, a canal: Panama"));
    }

    static String test(String s){
        System.out.println(s);
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(s);
        return s;
    }
}
