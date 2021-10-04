package com.company;

public class ValidPerfectSquare {
    public static void main(String[] args)
    {
        int nums = 5;
        System.out.println(isPerfectSquare(nums));
    }

    public static boolean isPerfectSquare(int num) {
        int s=1,e=num,mid;
        while(s<=e)
        {
            mid = s + (e-s)/2;
//            mid = (s+e)/2;
            if(mid  == (double) num / mid)
            {
                return true;
            }
            else if(mid  >  (double) num/ mid)
            {
                e = mid - 1;
            }
            else
            {
                s = mid + 1;
            }
        }
        return false;
    }
}
