package com.company.Bits;

public class SetIthBit {
    public static void main(String[] args) {
        int n = 5;  // 1 0 1
        int ithBit = 2; // set the 2nd bit
        ithBit -=1;     // as the conting starts from the 0 from the left-hand side
        int mask = 1 << ithBit; // this will shift the 1 to 1 position 0 1 0
        int ans = n | mask; // this will perform the or operation and will make 0 to 1 and 1 to 1 only
        System.out.println(ans); // and 101 will get converted to 111
    }
}
