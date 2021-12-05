package com.company.Bits;

import java.util.Arrays;

public class CountingBIts {
    public static void main(String[] args) {
        int n=5;
        int[] ans = new int[n];
        for(int i=0;i<ans.length;i++){
            ans[i] = Counts(i);
        }
        System.out.println(Arrays.toString(ans));
    }
    public static int  Counts(int n){
        int ct=0;
        while(n>0){
            n = n & (n-1);
            ct++;
        }

        return ct;
    }
}