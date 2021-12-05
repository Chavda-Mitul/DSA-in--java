package com.company.Bits;

import java.util.Arrays;

public class SortByBits {
    public static void main(String[] args) {
        int[] arr = {7,0,1,2,3,8};
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(Integer.bitCount(arr[i])>Integer.bitCount(arr[j]))
                {
                    swap(arr,i,j);
                }else if(Integer.bitCount(arr[i])==Integer.bitCount(arr[j]))
                {
                    if(arr[i]>arr[j])
                    {
                        swap(arr,i,j);
                    }
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int[] array, int first,int second)
    {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}
