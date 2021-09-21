package com.aayush;
//Even or Odd number

import java.util.*;
public class evenOdd {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int num = input.nextInt();
    System.out.println(IsEvenOdd(num));
  }

  static String IsEvenOdd(int num){
    if(num % 2 == 0 ){
      return "Even";
    }
    return "Odd";
  }
}
