package com.company.Bits;

public class OddEven {
    public static void main(String[] args) {
        int a = 32;
        // 10101
      // &
        // 00001
//        if the lsb is one the the number is odd
//        else the number is even
        if((a&1)==1){
            System.out.println("odd");
        }else{
            System.out.println("even");
        }
    }
}
