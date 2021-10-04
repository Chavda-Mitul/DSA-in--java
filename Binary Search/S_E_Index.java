package com.company;

public class S_E_Index{
public static void main(String[]args){
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int s=0,e=1;
        int target = 4;
        while(arr[e] < target){
            int temp = s;
            s = e;
            e = e + (e-temp)*2 + 1;
        }
        System.out.println(e + " " + s);
        int ans = BS(arr,target,s,e);
        System.out.println(ans);
    }

    public static int BS(int[] arr, int target, int s, int e)
    {
        int mid;
        while(s<=e)
        {
            mid = (s + e)/2;
            if(target > arr[mid])
            {
                s = mid + 1;
            }
            else if(target < arr[mid])
            {
                e = mid - 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
