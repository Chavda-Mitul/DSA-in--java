package com.company.Bits;

public class IsPowerOfTwo {
    public static void main(String[] args) {
        int n = 32,mask=1,NoOfBits = (int)(Math.log(n) / Math.log(2))+1;
        mask = mask << NoOfBits-1;
        System.out.println("  "+Integer.toBinaryString(n));
        System.out.println("^ "+Integer.toBinaryString(mask));
        System.out.println("   "+Integer.toBinaryString(n^mask));
        if((n ^ mask) == 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }




//        if((n & (n-1)) == 0 && n != 0){ // Note it will not work if n = 0 so take care of it
//            System.out.println("Yes");
//        }else
//            System.out.println("No");



        /*
        * while(n>0){
            n = n>>1;
            if((n&1) == 1 && n > 0){
                System.out.println("NO");
                break;
            }
        }

        */
    }
}
