package com.company;

public class SearchInMountainArray {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,6,4,2};
        int target = 2;
        int peak = peakIndexInMountainArray(arr);
        int ans = orderAgnosticBS(arr,target,0,peak);
        if(ans == -1){
            ans = orderAgnosticBS(arr,target,peak+1,arr.length-1);
        }
        System.out.println(ans);

    }
    public static int peakIndexInMountainArray(int[] arr) {

        int s=1,e=arr.length-1,mid=0;
        while(s<=e)
        {
            mid = (s+e)/2;
            if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]){
                return mid;
            }
            else if(arr[mid] > arr[mid-1]){
                s = mid + 1;
            }
            else if(arr[mid] > arr[mid+1]){
                e = mid - 1;
            }
        }
        return -1;

    }

    static int orderAgnosticBS(int[] arr, int target, int start, int end) {
        // find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

}
