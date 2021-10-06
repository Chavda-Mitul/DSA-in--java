package com.company;
public class FindDuplicateNumber {
    public static void main(String[] args) {
        int[] array = {1,1,2};
        System.out.println(CyclicSort(array));
    }

    public static int CyclicSort(int[] array){
        int i=0;
        int current;
        while(i<array.length) {
            if (array[i] != i + 1) {
                current = array[i] - 1;
                if (array[i] != array[current]) {
                    swap(array, i, current);
                } else {
                    return array[i];
                }
            }else{
                i++;
            }
        }
      return -1;
    }


    public static void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }

}
