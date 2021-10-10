package com.company;

public class MaxProduct {
    public static void main(String[] args) {
        int[] array = {3,4,5,2};
        int answer = maxProduct(array);
        System.out.println(answer);
    }

    public static int maxProduct(int[] array) {
        int max1, max2;
        max1 = max2 = 0;
        for(int i=0;i<array.length;i++){
            if(array[i]>max1){
                max2 = max1;
                max1 = array[i];
            }else if(array[i]>max2){
                max2 = array[i];
            }
        }
        return ((max1-1)*(max2-1));
    }


}
