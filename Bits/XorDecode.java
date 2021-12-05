package com.company.Bits;

import java.util.Arrays;

public class XorDecode {
    public static void main(String[] args) {
        int[] encoded = {1,2,3};

        int first = 1;
        int[] ans = new int[encoded.length+1];
        ans[0] = first;
        for (int i = 0; i < ans.length-1; i++) {
            ans[i+1] = ans[i] ^ encoded[i];
        }
        System.out.println(Arrays.toString(ans));
    }
}
