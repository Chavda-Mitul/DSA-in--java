package com.company;
import java.util.Arrays;

public class Selection_SortV2 {
    public static void main(String[] args) {
        int[] array = {5,3,1,2,4};
        SelectionSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void SelectionSort(int[] array){
        for(int i=0;i<array.length;i++){
            int MinElementIndex = gitMinIndex(array, i);
            swap(array,MinElementIndex,i);
        }
    }

    public static void swap(int[] array, int MinElementIndex, int i) {
        int temp = array[MinElementIndex];
        array[MinElementIndex] = array[i];
        array[i] = temp;
    }

    public static int gitMinIndex(int[] array,int first) {
        int minIndex=first;
        for(int i=first;i<array.length;i++){
           if(array[i]<array[minIndex]){
               minIndex = i;
           }
        }
        return minIndex;
    }
}
