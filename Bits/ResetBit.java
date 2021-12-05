package com.company.Bits;

public class ResetBit {
    public static void main(String[] args) {
        int n = 7;
        int ithBit = 2;
        ithBit -= 1;
        int mask = 1 << ithBit;
        mask = ~mask;
        int ans = n & mask;
        System.out.println(ans);
    }
}
