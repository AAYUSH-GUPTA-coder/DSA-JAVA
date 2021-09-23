package com.aayush;

public class MaxDecimal {
    public static void main(String[] args) {
        char[][] matrix = {
                            {'0', '0', '1', '0', '0'},
                            {'1', '0', '1', '1', '1'},
                            {'1', '1', '1', '1', '1'},
                            {'1', '0', '0', '1', '0'},
 //                           {'3','1','3','3','2'};
                          };
        System.out.println(maximalRectangle(matrix));
    }

    static int maximalRectangle(char[][] matrix) {
        if (matrix.length <= 0) return 0;
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] dp = new int[n][m];
        int maxArea = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == 0)
                    dp[i][j] = matrix[i][j] == '1' ? 1 : 0;
                else
                    dp[i][j] = matrix[i][j] == '1' ? (dp[i-1][j] + 1) : 0;
                int min = dp[i][j];
                for (int k = j; k >= 0; k--) {
                    if (min == 0) break;
                    if (dp[i][k] < min) min = dp[i][k];
                    maxArea = Math.max(maxArea, min * (j - k + 1));
                    System.out.println("min :" + min);
                    System.out.println("j: "+ j );
                    System.out.println("k : " + k);
                    System.out.println(maxArea);
                }
            }
        }
        return maxArea;
    }
}
