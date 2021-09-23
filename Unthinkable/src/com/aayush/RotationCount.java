package com.aayush;
//Find the Rotation Count in Rotated Sorted array
//Input : arr[] = {15, 18, 2, 3, 6, 12}
//        Output: 2
//        Explanation : Initial array must be {2, 3,
//        6, 12, 15, 18}. We get the given array after
//        rotating the initial array twice.
//
//        Input : arr[] = {7, 9, 11, 12, 5}
//        Output: 4
//
//        Input: arr[] = {7, 9, 11, 12, 15};
//        Output: 0


public class RotationCount {
    public static void main(String[] args){
      int[] arr = {15, 18, 2, 3, 6, 12};
//        int[] arr = {15, 18,18, 2, 3,4,4,4,5,6,6,6,6,6,6,7,8,12,12};

        System.out.println(pivot(arr));
    }

    static int pivot(int[] arr){
        int pivot = findPivotWithoutDuplicate(arr);
//        int pivot = findPivotWithDuplicate(arr);
        return pivot+1;
    }

    // without duplicate
    static int findPivotWithoutDuplicate(int[] arr){
        int start = 0, end = arr.length-1;
        while(start < end){
            int mid = (int) Math.floor((start+end)/2);
            if(mid > start && arr[mid] < arr[mid-1]){
                return mid-1;
            }else if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
//            {15, 18, 2, 3,4,5 6,7,8 12};
            else if(arr[mid] < arr[end]){
                end = mid-1;
            }else{
                start= mid+1;
            }
        }
        return -1;
    }

    // with duplicate
    static int findPivotWithDuplicate(int[] arr){
        //            {15, 18,18,18, 2, 3,4,4,4,5 6,7,8 12};

        int start =0 , end= arr.length-1;
        while(start<=end){
            int mid = start+ (end-start)/2;
            if(mid > start && arr[mid]<arr[mid-1]){
                return mid-1;
            }if(mid<end && arr[mid] > arr[mid+1]){
                return mid;
            }
            // duplicate elements
            if(arr[start] == arr[mid] && arr[start] == arr[end]){
                if(arr[start] > arr[start+1]){
                    return start;
                }
                start++;
                if(arr[end] < arr[end-1]){
                    return end-1;
                }
            }
            // pivot on right side
            if(arr[start] < arr[mid] || arr[start] == arr[mid] && arr[mid] > arr[end]){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
}


