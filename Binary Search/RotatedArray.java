package com.company;

import java.util.Arrays;

public class RotatedArray {
    public static void main(String[] args){
        int[] array = {1,2,3,4,5};
            int n = array.length;
            leftRotate(array,3,5);
        System.out.println(Arrays.toString(array));
    }
   static void leftRotate(int arr[], int d, int n)
    {
        for (int i = 0; i < d; i++)
            leftRotatebyOne(arr, n);
    }

   static void leftRotatebyOne(int arr[], int n)
    {
        int i, temp;
        temp = arr[0];
        for (i = 0; i < n - 1; i++)
            arr[i] = arr[i + 1];
        arr[n-1] = temp;
    }

}
