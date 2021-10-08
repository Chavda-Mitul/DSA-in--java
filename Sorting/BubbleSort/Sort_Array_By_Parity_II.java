package com.company;

import java.util.Arrays;

public class Sort_Array_By_Parity_II {
    public static void main(String[] args) {
        int[] array = {4,1,2,1};
        sortPartyII(array);
//        System.out.println(Arrays.toString(array));
    }

    public static void sortPartyII(int[] array){
        int[] ans = new int[array.length];
        int j=0;
        for(int i=0;i<array.length;i++){
            if(array[i]%2==0){
               ans[j] = array[i];
               j+=2;
            }
        }

        int k=1;
        for(int i=0;i<array.length;i++){
            if(array[i]%2!=0){
                ans[k] = array[i];
                k+=2;
            }
        }

        System.out.println(Arrays.toString(ans));
    }

    public static void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}
