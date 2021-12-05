package com.company.Bits;
public class FindSetBit {
    public static void main(String[] args) {
        int n = 100;
        System.out.println(Integer.toBinaryString(n));
        int counter = 0;
        while(n>0)
        {
            n = (n & (n-1));
            counter++;
        }
        System.out.println(counter);
    }
}
