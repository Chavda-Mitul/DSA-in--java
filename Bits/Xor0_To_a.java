package com.company.Bits;

public class Xor0_To_a {
    public static void main(String[] args) {
        int a = 104;
        int ans = xorTill0(a);
        System.out.println(ans);
    }

    private static int xorTill0(int a) {
        if(a%4==0){
            return 0;
        }else if(a%4==1){
            return 1;
        }else if(a%4==3){
            return 0;
        }else {
            return (a + 1);
        }
    }
}
