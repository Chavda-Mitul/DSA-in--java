package com.company.Bits;

public class XorArray {
    public static void main(String[] args) {
        int[] arr = {0,2,4,6,8};
        int a=0;
        for (int i = 0; i < arr.length; i++) {
           a ^= arr[i];
        }
        System.out.println(a);
    }
}
