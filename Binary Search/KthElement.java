package com.company;
import java.util.*;
import java.lang.reflect.Array;

public class KthElement {
    public static void main(String[] args)
    {
        int[] arr = {1,2,4,5,6,7};
        int target=2;
        int ans = findKthPositive(arr,target);
        System.out.println(ans);
    }
    public static int findKthPositive(int[] arr, int k) {
      int[] refArray = new int[10];
      int[] ansArray = new int[10];
      for(int i=1;i<10;i++)
      {
          refArray[i] = i;
      }
      for(int i=1;i<arr.length;i++)
      {
          if(arr[i] == refArray[i])
          {
              ansArray[i] = refArray[i];
              System.out.println(refArray[i]);
          }
      }
      return ansArray[k];
    }
}
