package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	int[] array = {3,5,2,1,4};
	CyclicSort(array);
	System.out.println(Arrays.toString(array));
    }

    public static void CyclicSort(int[] array) {
        int i=0;
        int n=array.length;
        while(i<n){
          if(array[i] != i+1){
              swap(array,array[i]-1,i);
          }else{
              i++;
          }
        }
    }

    public static void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}
