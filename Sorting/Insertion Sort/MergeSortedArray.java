package com.company;

public class MergeSortedArray  {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,0,0,0};
        int[] array2 = {2,5,6};
        int m=3,n=3;
        merge(array1,m,array2,n);
    }

    public static void merge(int[] array1, int m, int[] array2, int n) {
        for(int i=0;i<n;i++){
            array1[i+m] = array2[i];
        }
        InsertionSort(array1);
    }

    public static  void InsertionSort(int[] array){
        for (int i = 0; i <= array.length-2; i++) {
            for (int j = i+1; j > 0; j--) {
                if(array[j]<array[j-1]){
                    swap(array,j,j-1);
                }else{
                    break;
                }
            }
        }
    }

    public static void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}
