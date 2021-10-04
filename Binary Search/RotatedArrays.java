package com.company;

public class RotatedArrays {
    public static void main(String[] args) {
        int[] array = {2,9,2,2,2,2,2,2};
        //to search in the rotated arrays you have to search for pivot of the rotated array
        //then apply binary search for that segment.
        int target = 9;
        int answer = search(array,target);
        System.out.println(answer);
    }


    public static int search(int[] nums, int target){
        int pivot = binarySearchPivot(nums);

        // if you did not find a pivot, it means the array is not rotated
        if (pivot == -1) {
            // just do normal binary search
            return binary_search_with_start_end(nums, target, 0 , nums.length - 1);
        }

        // if pivot is found, you have found 2 asc sorted arrays
        if (nums[pivot] == target) {
            return pivot;
        }

        if (target >= nums[0]) {
            return binary_search_with_start_end(nums, target, 0, pivot - 1);
        }

        return binary_search_with_start_end(nums, target, pivot + 1, nums.length - 1);
    }

    public static int binarySearchPivot(int[] array){
        int s=0,e=array.length-1,mid;
        while(s<=e){
            mid = (s+e)/2;
            if(mid < e && array[mid] > array[mid+1]) {
                return mid;
            }if(mid > s && array[mid-1] > array[mid]){
                return (mid-1);
            }if(array[mid] <= array[s]){
                e = mid - 1;
            }else {
                s = mid + 1;
            }
        }
        return -1;
    }



    public static int binarySearchPivotForDuplicate(int[] array){
        int s=0,e=array.length-1,mid;
        while(s<=e){
            mid = (s+e)/2;
            if(mid < e && array[mid] > array[mid+1]) {
                return mid;
            }if(mid > s && array[mid-1] > array[mid]){
                return (mid-1);
            }if(array[mid] == array[s] && array[mid] == array[e]){
                //Note:- it is possible that start and end both are pivot, so we can not skip it.
                if(array[s] > array[s+1]){
                   return s;
                }
                s++;
                //To check whether the end is pivot or not.
                if(array[e] < array[e-1]){
                    return (e-1);
                }
                    e--;
            }else if(array[mid] <= array[s]){
                e = mid - 1;
            }
            else {
                s = mid + 1;
            }
        }
        return -1;
    }


    public static int binary_search_with_start_end(int[] array, int target, int s, int e){
        int mid;
        while(s<=e){
            mid = (s+e)/2;
            if(array[mid]>target){
                e = mid-1;
            }else if(array[mid]<target){
                s = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
