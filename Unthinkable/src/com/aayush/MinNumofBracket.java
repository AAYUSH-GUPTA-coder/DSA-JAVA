package com.aayush;
//Minimum number of bracket reversals needed to make an expression balanced
//Given an expression with only ‘}’ and ‘{‘. The expression may not be balanced. Find minimum number of bracket reversals to make the expression balanced.
//        Examples:
//
//        Input:  exp = "}{"
//        Output: 2
//        We need to change '}' to '{' and '{' to
//        '}' so that the expression becomes balanced,
//        the balanced expression is '{}'
//
//        Input:  exp = "{{{"
//        Output: Can't be made balanced using reversals
//
//        Input:  exp = "{{{{"
//        Output: 2
//
//        Input:  exp = "{{{{}}"
//        Output: 1
//
//        Input:  exp = "}{{}}{{{"
//        Output: 3

public class MinNumofBracket {
    public static void main(String[] args) {
        System.out.println(countBraces("}{{}}{{{"));
    }

    static int countBraces(String str) {
        int len = str.length();
        int ans = 0;
        if (len % 2 != 0) {
            return -1;
        }

        int left_bracket = 0, right_bracket = 0;
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == '{') {
                left_bracket++;
            } else {
                if (left_bracket == 0) {
                    right_bracket++;
                } else {
                    left_bracket--;
                }
            }
        }
        ans = (int) (Math.ceil((0.0 + left_bracket) / 2) + Math.ceil((0.0 + right_bracket) / 2));
        return ans;
    }
}
