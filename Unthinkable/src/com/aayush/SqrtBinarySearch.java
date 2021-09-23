package com.aayush;

public class SqrtBinarySearch {
    public static void main(String[] args) {
        System.out.println(squareRoot(50, 3));
    }

    static float squareRoot(int num ,int p) {
        int start=0,end=num,mid;
        double ans = 0.0;
        while(start<=end){
            mid = (start+end)/2;
            if(mid*mid == num){
                ans = mid;
                break;
            }else if(mid*mid < num){
                ans = mid;
                start = mid+1;
            }else{
                end = mid-1;
            }
        }

        double increment = 0.1;
        for(int i=0;i<p;i++) {
            while (ans * ans <= num) {
                ans += increment;
            }
            ans = ans - increment;
            increment = increment / 10;
        }
        return (float)ans;
    }
}

