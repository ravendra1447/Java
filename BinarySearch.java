package JAVA;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = {2, 3, 4, 10, 40, 50};
        System.out.println("Sorted Array: " + Arrays.toString(arr));
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number to search: ");
        int target = scanner.nextInt();

        int result = binarySearch(arr, target);

        if (result == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at index: " + result);
        }
	}
	
	public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2; // Prevents overflow

            // Check if the target is at mid
            if (arr[mid] == target) {
                return mid;
            }

            // If target is greater, ignore left half
            if (arr[mid] < target) {
                low = mid + 1;
            } else {
                // If target is smaller, ignore right half
                high = mid - 1;
            }
        }
        return -1; // Element not found
    }

}
