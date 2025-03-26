package JAVA;

import java.util.Arrays;

public class SortArray {

    public static void main(String[] args) {
        int[] arr1 = {3, 5, 1, 4};
        int[] arr2 = {8, 2, 7, 6};
        int[] mergedArray = mergeSortArray(arr1, arr2);
        System.out.println(Arrays.toString(mergedArray));
    }

    public static int[] mergeSortArray(int[] arr1, int[] arr2) {
        int[] mergedArray = new int[arr1.length + arr2.length];
        
        // Copy arr1 to mergedArray
        for (int i = 0; i < arr1.length; i++) {
            mergedArray[i] = arr1[i];
        }
        
        // Copy arr2 to mergedArray
        for (int i = 0; i < arr2.length; i++) {
            mergedArray[arr1.length + i] = arr2[i];
        }
        
        // Sort the merged array
        Arrays.sort(mergedArray);
        return mergedArray;
    }
}
