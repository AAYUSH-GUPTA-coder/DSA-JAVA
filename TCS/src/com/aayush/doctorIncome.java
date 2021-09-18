package com.aayush;
//A doctor has a clinic where he serves his patients. The doctor’s consultation fees are different for different groups of patients depending
// on their age. If the patient’s age is below 17, fees is 200 INR. If the patient’s age is between 17 and 40, fees is 400 INR.
// If patient’s age is above 40, fees is 300 INR. Write a code to calculate earnings in a day for which one array/List of values
// representing age of patients visited on that day is passed as input.
//
//        Note:
//
//        Age should not be zero or less than zero or above 120
//        Doctor consults a maximum of 20 patients a day
//        Enter age value (press Enter without a value to stop):
//        Example 1:
//
//        Input
//        20
//        30
//        40
//        50
//        2
//        3
//        14
//        Output
//        Total Income 2000 INR
//        Note: Input and Output Format should be same as given in the above example.
//        For any wrong input display INVALID INPUT
//
//        Output Format
//
//        Total Income 2100 INR

import java.util.Scanner;

public class doctorIncome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int flag = 0, fee_sum = 0, count = 0;

        while(true){
            String age1 = input.nextLine();
            if(age1.equals("")){
                break;
            }
            int age = Integer.parseInt(age1);
            if(age<=0 && age>120)
            {
                flag=1;
                break;
            }

            count++;

            if(age<17) fee_sum +=200;

            else if(age>=17 && age<=40) fee_sum += 400;

        else fee_sum += 300;
        }

        if(count > 20 && flag != 1)
        System.out.println("INVALID INPUT");
        else
        System.out.println("Total income "+ fee_sum+ " INR");
    }
}
