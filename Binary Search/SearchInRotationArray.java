package com.company;

public class SearchInRotationArray {
    public static void main(String[] args) {
        int[] array = {3,4,5,6,7,8,9,10,11,2,1,0};
        int target = 4;
        System.out.println(search(array));
    }
    public static int search(int[] arr){
        int s=0,e=arr.length,mid;
        int mm=0;
        while(s<e){
            mid = (s+e)/2;
            if(arr[mid]>arr[s]){
                s = mid + 1;
            } else if(arr[mid]<arr[mid-1]){
                return (mid-1);
            }
            else if(arr[mid]>arr[mid+1]){
                return mid;
            }else if(arr[mid]<arr[s]){
                e = mid - 1;
            }
        }
        return s;
    }
}
