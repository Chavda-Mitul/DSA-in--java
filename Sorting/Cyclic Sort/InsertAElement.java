package com.company;

import java.util.Arrays;

public class InsertAElement {
    public static void main(String[] args) {
        int[] arrr = {0,1,3};
        int ans = sort(arrr);
        System.out.println(ans);

    }
    public  static int sort(int[] array){
        int i=0;
        while(i<array.length){
            if(array[i]<array.length && array[i] != array[array[i]]){
                swap(array,i,array[array[i]]);
            }else {
                i++;
            }
        }
        for(int j=0;j<array.length;j++){
            if(array[j] != j){
                return j;
            }
        }
        return array.length;
    }
    public static void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}
