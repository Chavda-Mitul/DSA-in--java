package com.company.Bits;

public class GrayCode {
    public static void main(String[] args) {
        int n = 2;
        int lowLimit = 1 <<( n-1);
        int uppLimit = (int)Math.pow(2,n)-1;
//        System.out.println(lowLimit);
//        System.out.println(uppLimit);
//        System.out.println(Integer.bitCount(6^7));
        for(int i = lowLimit;i<=uppLimit;i++) {
            if (Integer.bitCount((i+1)^i) == 1){
                System.out.println(i);
                System.out.println(i+1);
            }
        }

    }
}
