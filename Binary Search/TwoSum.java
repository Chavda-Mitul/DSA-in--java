package com.company;
import java.util.Arrays;
public class TwoSum {
    public static void main(String[] args) {
        int[] twoSum = {-1,0};
        int target = -1;
        int[] ans = twoSum(twoSum,target);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j <= numbers.length - 1; j++) {
                if (numbers[i] + numbers[j] == target) {
                    return (new int[]{i + 1, j + 1});
                }
            }
        }
        return (new int[] {-1,-1});
    }
}
