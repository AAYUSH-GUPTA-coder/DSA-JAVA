package com.aayush;
//The Caesar cipher is a type of substitution cipher in which each alphabet in the plaintext or messages is shifted by a number of places
// down the alphabet.
//        For example,with a shift of 1, P would be replaced by Q, Q would become R, and so on.
//        To pass an encrypted message from one person to another, it is first necessary that both parties have the ‘Key’ for the cipher,
//        so that the sender may encrypt and the receiver may decrypt it.
//        Key is the number of OFFSET to shift the cipher alphabet. Key can have basic shifts from 1 to 25 positions as there are 26 total alphabets.
//        As we are designing custom Caesar Cipher, in addition to alphabets, we are considering numeric digits from 0 to 9.
//        Digits can also be shifted by key places.
//        For Example, if a given plain text contains any digit with values 5 and keyy =2, then 5 will be replaced by 7, “-”(minus sign)
//        will remain as it is. Key value less than 0 should result into “INVALID INPUT”
//
//        Example 1:
//        Enter your PlainText: All the best
//        Enter the Key: 1
//
//        The encrypted Text is: Bmm uif Cftu

import java.util.Scanner;

public class CaesarCipher{
    public static void main(String[] args) {
        StringBuilder upgraded = new StringBuilder();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your PlainText: ");
        String message = input.nextLine();
        System.out.print("Enter the Key: ");
        int key = input.nextInt();

        for(int i=0;i<message.length();i++){
            char ch = message.charAt(i);

            if(ch >= 'a' && ch <= 'z'){
                ch = (char)(ch + key);
                if(ch > 'z'){
                    ch = (char)(ch - 'z' + 'a' - 1);
                }
                upgraded.append(ch);
            }else if(ch >= 'A' && ch <= 'Z'){
                ch = (char)(ch + key);
                    if(ch > 'Z'){
                        ch = (char) (ch - 'Z' + 'A' -1);
                    }
                upgraded.append(ch);
            } else{
                upgraded.append(ch);
            }
        }
        System.out.println(upgraded);
    }
}