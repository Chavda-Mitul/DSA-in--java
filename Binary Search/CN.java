package com.company;

public class CN {
   public static void main(String[] args)
   {
//       int[] arr  = {1,3,5,7,9,12,15,19,23,26,33};
       int target = 8;
       int Ans = arrangeCoins(target);
       System.out.println(Ans);
   }
   public static int Bs(int[] arr, int target)
   {
       int s = 0, e = arr.length - 1,mid;
       while(s<=e)
       {
           mid = (s+e)/2;
           if(arr[mid] <= target)
           {
               s = mid + 1;
           }
           else if(arr[mid] == target)
           {
               return arr[mid];
           }
           else if(arr[mid] > target){
               e = mid - 1;
           }
       }
       return arr[e];
   }


    public static int arrangeCoins(int n) {
        int s=1,e=n,mid;
        while(s<=e)
        {
            mid = s + (e-s)/2;
            if((mid*(mid+1))/2 < n)
            {
                s = mid + 1;
            }
            else if((mid*(mid+1))/2 == n)
            {
                return mid;
            }
            else{
                e = mid - 1;
            }
        }
        return e;
    }
}
