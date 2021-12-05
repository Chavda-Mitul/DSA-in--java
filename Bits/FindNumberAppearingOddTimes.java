package com.company.Bits;

import java.util.Arrays;

public class FindNumberAppearingOddTimes {
    public static void main(String[] args) {
        int[] arr = {2,2,3,2,7,7,8,7,8,8};
//        int[] arr = {1,1,1,2,2,2,3,3,3,4,4,4,5};
        Arrays.sort(arr);
        int max_index = (int)(Math.log(arr[arr.length-1])/Math.log(2) + 1); //To calculate total number of bits of the maximum number
        int[] ans = new int[max_index];

        for(int num: arr) {
            int idx = ans.length-1;
            while(num > 0) {
                int bit = num & 1;
                ans[idx] += bit;
                idx--;
                num = num >> 1;
            }
        }

        int result = 0;
        for(int num: ans) {
            num %= 3;
            result += Math.pow(2, max_index-1) * num;
            max_index--;
        }

        System.out.println(result);
    }
}
