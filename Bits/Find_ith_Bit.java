package com.company.Bits;

import java.sql.SQLOutput;

public class Find_ith_Bit {
    public static void main(String[] args) {
//        int a = 0;
//        int bit = 2;
//        int opp = 1<<bit;
//        int and = opp & a;
//        int ans = and  >> bit;
//        if(ans==1){
//            System.out.println("1");
//        }else{
//            System.out.println("0");
//        }

        int a = 10;
        int shift = 4;
        int bit = 1 << shift;

//        if((bit&a) == 0){
//            System.out.println("0");
//        }else{
//            System.out.println("1");
//        }
        if((5&(1<<1)) ==0){
            System.out.println(0);
        }else{
            System.out.println(1);
        }
//        shift = 0;
//        bit = 1<<shift;
//        if((a&bit) == 0){
//            System.out.println("even");
//        }else{
//            System.out.println("odd");
//        }
    }
}
