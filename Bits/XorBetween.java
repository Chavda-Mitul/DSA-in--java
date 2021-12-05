package com.company.Bits;

public class XorBetween {
    public static void main(String[] args) {
        //range xor for a, b    = xor (b) ^ xor(a-1)
       int a = 3;
       int b = 9;
       int ans = xorTill0(b) ^ xorTill0(a-1);
        System.out.println(ans);
    }
    // This gives xor form 0 to a
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
