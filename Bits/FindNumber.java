package com.company.Bits;

public class FindNumber {
    public static void main(String[] args) {
        int[] array = {2,3,4,1,2,1,3,6,4};
        int[] arr =  {-1,-2,-3,-4,1,2,3,4,5};
        int ans=0;
        for (int j : arr) {
            ans = ans + j;
        }
        System.out.println(ans);
    }
}
