package com.company.Bits;

public class Number_Compliment {
    public static void main(String[] args) {
        int num = 5;
        int i = 0;
        int j = 0;

        while (i < num)
        {
            i += Math.pow(2, j);
            j++;
        }
        System.out.println(i-num);
        System.out.println(Integer.toBinaryString(i));
        System.out.println(Integer.toBinaryString(i-num));
    }
}
