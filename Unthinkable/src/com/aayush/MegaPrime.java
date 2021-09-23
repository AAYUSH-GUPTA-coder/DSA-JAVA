package com.aayush;
import java.util.*;
public class MegaPrime {
    public static void main(String[] args) {
        int start = 1 , end = 100;
        List<Integer> primeNumbers = primeNumbers(start,end);
        System.out.println(MegaPrimeList(primeNumbers));
    }
    static List<Integer> primeNumbers(int start, int end){
        List<Integer> arrlist  = new ArrayList<>();
        for(int i=start;i<=end;i++){
            if (isPrime(i) == true){
                arrlist.add(i);
            }
        }
        return arrlist;
    }

    static boolean isMegaPrime(int num){
        while(num > 0){
            int rem = num % 10;
            num = num/10;
            if(isPrime(rem)){
                continue;
            }else{
                return false;
            }
        }
        return true;
    }

    static List<Integer> MegaPrimeList(List<Integer> arrList){
        List<Integer> megaPrime = new ArrayList<>();
        for(int i=0 ;i< arrList.size();i++){
            int num = arrList.get(i);
            if(isMegaPrime(num)){
                megaPrime.add(num);
            }
        }
        return megaPrime;
    }

    static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        int c=2;
        while(c*c <= n){
            if(n % c == 0){
                return false;
            }
            c++;
        }
        return c*c > n;
    }
}

