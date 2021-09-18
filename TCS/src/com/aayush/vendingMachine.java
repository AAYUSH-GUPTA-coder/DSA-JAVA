package com.aayush;
//FULLY AUTOMATIC VENDING MACHINE – dispenses your cuppa on just press of button. A vending machine can serve range of products as follows:
//
//        Coffee
//
//        Espresso Coffee
//        Cappuccino Coffee
//        Latte Coffee
//        Tea
//
//        Plain Tea
//        Assam Tea
//        Ginger Tea
//        Cardamom Tea
//        Masala Tea
//        Lemon Tea
//        Green Tea
//        Organic Darjeeling Tea
//        Soups
//
//        Hot and Sour Soup
//        Veg Corn Soup
//        Tomato Soup
//        Spicy Tomato Soup
//        Beverages
//
//        Hot Chocolate Drink
//        Badam Drink
//        Badam-Pista Drink
//        Write a program to take input for main menu & sub menu and display the name of sub menu selected in the following format (enter the
//        first letter to select main menu):
//
//        Welcome to CCD
//
//        Enjoy your
//
//        Example 1:
//
//        Input:
//        c
//        1
//        Output
//        Welcome to CCD!
//        Enjoy your Espresso Coffee!
//        Example 2:
//
//        Input
//        t
//        9
//        Output
//        INVALID OUTPUT!

import java.util.Scanner;

public class vendingMachine {
    public static void main(String[] args) {
        String[] c = { "Espresso Coffee","Cappuccino Coffee","Latte Coffee"};
        String[] s = {"Hot and Sour Soup","Veg Corn Soup","Tomato Soup","Spicy Tomato Soup"};

        Scanner input = new Scanner(System.in);
        String ch = input.nextLine();
        int i = input.nextInt();
        String res = "INVALID OUTPUT";

        if(ch.equals("c") && i <= 3){
                 res = c[i-1];
        }
        if(ch.equals("s") && i<= 4){
            res = s[i-1];
        }

        if(res.equals("INVALID OUTPUT")){
            System.out.println("INVALID OUTPUT");
        }else {
            System.out.println("Welcome to CCD!");
            System.out.println("Enjoy your " + res);
        }

    }
}
