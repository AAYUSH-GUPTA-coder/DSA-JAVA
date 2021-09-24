package com.aayush;

public class Main {
    public static void main(String[] args) {
	// write your code here
        pattern1(5);
        pattern2(5);
        pattern3(5);
        pattern4(5);
        pattern5(5);
        pattern28(5);
        pattern30(5);
        pattern17(5);
        pattern31(4);
    }
    static void pattern1(int n){
        for(int row = 1 ; row <= n ;row++){

            for(int col=1 ; col <= n; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void pattern2(int n){
        for(int row = 1 ; row <= n ;row++){
            for(int col=1 ; col <= row; col++){
                System.out.print("* ");
            }

            System.out.println();
        }
        System.out.println();
    }

    static void pattern3(int n){
        for(int row = 5 ; row >= 1 ;row--){

            for(int col=1 ; col <= row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }
    //    1
//        1 2
//        1 2 3
//        1 2 3 4
//        1 2 3 4 5

    static void pattern4(int n){
        for(int i=1;i<=n;i++){
            for (int j=1; j<=i ; j++){
                System.out.print(j+" " );
            }
            System.out.println();
        }
        System.out.println();
    }

//            *                                                 1
//            **                                                2
//            ***                                               3
//            ****                                              4
//            *****                                             5
//            ****                                              6
//            ***                                               7
//            **                                                8
//            *                                                 9
    static void pattern5(int n){
        for(int row = 0 ; row < 2*n ; row++){
            int totalColsInRow = row > n ? 2*n - row : row;
            for(int col = 0 ;col < totalColsInRow ;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void pattern28(int n){
        for(int row =0 ; row < 2*n ; row++){
            int numColInRow = row > n ? 2*n - row : row;
            int spaces =  n - numColInRow;

            for(int s = 0 ; s< spaces ; s++){
                System.out.print(" ");
            }
            for (int col = 0 ; col<numColInRow ; col++){
                System.out.print("* ");
            }
            System.out.println();
            System.out.println();
        }
    }

    static void pattern30(int n){
        for(int row = 1 ;row<= n ;row++){
            int spaces = n - row;
            for(int s = 1 ; s<= spaces ; s++){
                System.out.print("  ");
            }
            for(int col = row ; col >= 1 ; col--){
                System.out.print(col+ " ");
            }
            for(int col=2 ; col<= row;col++){
                System.out.print(col+ " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void pattern17(int n){
        for(int row = 1 ; row < 2*n ; row++){
            int totalColsInRow = row > n ? 2*n-row : row;

            for(int space = 0 ; space < n-totalColsInRow; space++){
                System.out.print("  ");
            }
            for(int col=totalColsInRow ; col >= 1 ; col--){
                System.out.print(col+ " ");
            }
            for(int col = 2 ;col <= totalColsInRow ; col++ ){
                System.out.print(col+ " ");
            }
            System.out.println();
        }
    }

    static void pattern31a(int n){
        for(int row = 0; row<= 2*n ; row++){
            for (int col = 0; col <= 2*n ; col++){
                int atEveryIndex = Math.min(Math.min(col,row),Math.min(2*n-row, 2*n-col));
                System.out.print(atEveryIndex +" ");
            }
            System.out.println();
        }
    }

    static void pattern31(int n){
        int originalN = n;
        for(int row = 1; row<= 2*n-1 ; row++){
            for (int col = 1; col <= 2*n-1 ; col++){
                int atEveryIndex = originalN - Math.min(Math.min(col,row),Math.min(2*n-row, 2*n-col));
                System.out.print(atEveryIndex +" ");
            }
            System.out.println();
        }
    }
}
