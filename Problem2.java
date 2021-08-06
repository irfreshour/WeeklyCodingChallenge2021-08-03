// Problem 2:
// Write java Program to Find Smallest and Largest Element in an Array.
// Note: Number can not be repeated in the array.

import java.util.Arrays;

public class Problem2 {
    public static void main(String[] args) {
        int[] arr1 = {7, 5, 6, 1, 4, 2};
        MinMax(arr1);
    }

    public static void MinMax(int[] arr) {
        Arrays.sort(arr);
        int min = arr[0];
        int max = arr[arr.length - 1];
        int miss = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i != 0 && arr[i] != arr[i - 1] + 1) {
                miss = arr[i] - 1;
            }
        }
        System.out.println("Minimum number is: " + min);
        System.out.println("Maximum number is: " + max);
        System.out.println("Missing number is: " + miss);
    }
}
