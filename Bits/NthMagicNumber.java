package com.company.Bits;

public class NthMagicNumber {
    public static void main(String[] args) {
        // number & 1 gives the last bit of the number.
//         int n =3;
//         int ans =0;
//         int i=1;
//       while(n>0){
//            ans += (int) ((n & 1) * Math.pow(5,i));
//            n =  n >> 1;
//            i++;
//        }
//        System.out.println(ans);

        int base = 5;
        int n=6;
        int ans = 0;
        while(n>0){
            if((n&1)==1){
                ans += base;
            }
            base *= 5;
            n = n>>1;

//            int last = n & 1; // second approch
//            ans = last * base;
//            base = base * 5;
//            n = n>>1;
        }
        System.out.println(ans);
    }
}
