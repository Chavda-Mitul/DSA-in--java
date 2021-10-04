package com.company;

public class Binary_search_insert_element {
    public static void main(String[] args) {
        int arr[] = {1,2,6};
        int target = 5;
        int ans = binary_search(arr,target);
        System.out.println(ans);
    }
    public static int binary_search(int[] nums, int target)
    {
        int s=0,e=nums.length-1,mid=0;
        while(s<=e){
            mid = (s+e)/2;
            if(nums[mid] < target) {
                s=mid+1;
            }
            else if(nums[mid] == target)
            {
                return mid;
            }else {
                e = mid - 1;
            }
        }
        if(nums[0] > target) {
            return 0;
        }else {
            return (e + (target - nums[e]));
        }
    }
}
