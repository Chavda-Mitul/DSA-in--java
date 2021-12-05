package com.company.Bits;

public class FindTheIthBit {
    public static void main(String[] args) {
        int n = 4; // 1 0 0
//        System.out.println();
//        System.out.println(Integer.toBinaryString(4&(-4)));
        System.out.println(Integer.toBinaryString(22));
        System.out.println(Integer.toBinaryString(-22));
        int mask;
        for (int i = 0; i < 4; i++) {
            mask = 1<<i;
            if((n&mask) != 0){
                System.out.println(i+1);
                break;
            }
        }
    }
}
