package com.aayush;
import java.util.*;

public class MegaPrimeNumber {
    public static void main(String[] args) {
        long first = 1 , last = 100;
        List<Long> primeNumbers1 = primeNumbers(first,last);
        System.out.println(MegaPrimeList(primeNumbers1));
    }

    static List<Long> primeNumbers(long start, long end){
        List<Long> arrlist  = new ArrayList<>();
        for(long i=start;i<=end;i++){
            if (isPrime(i) == true){
                arrlist.add(i);
            }
        }
        return arrlist;
    }

    static boolean isMegaPrime(long num){
        while(num > 0){
            long rem = num % 10;
            num = num/10;
            if(isPrime(rem)){
                continue;
            }else{
                return false;
            }
        }
        return true;
    }

    static long MegaPrimeList(List<Long> arrList){
        long megaPrime=0;
        for(int i=0 ;i< arrList.size();i++){
            long num = arrList.get(i);
            if(isMegaPrime(num)){
                megaPrime++;
            }
        }
        return megaPrime;
    }

    static boolean isPrime(long n){
        if(n <= 1){
            return false;
        }
        long c=2;
        while(c*c <= n){
            if(n % c == 0){
                return false;
            }
            c++;
        }
        return c*c > n;
    }
}

