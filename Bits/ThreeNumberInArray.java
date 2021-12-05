package com.company.Bits;
import java.util.Arrays;

public class ThreeNumberInArray {
    public static void main(String[] args) {
        int[] nums = {5,5,5,3,3,3,6};
        Arrays.sort(nums);
        int n = nums[nums.length-1];
        int length =(int)(Math.log(n)/Math.log(2))+1;
        int[] ans = new int[length];
        for(int i=0;i<nums.length;i++){
            int temp = nums[i];
            for(int j=length-1;j>=0;j--){
                int r = temp % 2;
                temp /= 2;
                ans[j] += r;
            }
        }
        for(int i=0;i<length;i++)
        {
            ans[i] = ans[i] % 3;
        }
        int number = 0;
        int base = 1;
        for(int i=length-1;i>=0;i--){
            number += ans[i] * base;
            base *= 2;
        }
        System.out.println(Arrays.toString(ans));
        System.out.println(number);
    }
    }
