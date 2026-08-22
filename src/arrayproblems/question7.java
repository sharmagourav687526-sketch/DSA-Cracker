// Sort an array of 0 and 1's

package arrayproblems;

import java.util.Arrays;

public class question7 {
    public static void main(String[] args) {
        int[] binary = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1};
        System.out.println("Original Array: " + Arrays.toString(binary));
        sort0And1(binary);
        System.out.println("Sorted Array is: " + Arrays.toString(binary));
    }

    /**
     * Sorts an array containing only 0s and 1s in-place.
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     */
    static void sort0And1(int[] arr) {
        if (arr == null || arr.length <= 1) return;

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            // Shift left pointer forward if it's already 0
            while (left < right && arr[left] == 0) {
                left++;
            }
            // Shift right pointer backward if it's already 1
            while (left < right && arr[right] == 1) {
                right--;
            }
            // If pointers haven't crossed, swap misplaced elements
            if (left < right) {
                arr[left] = 0;
                arr[right] = 1;
                left++;
                right--;
            }
        }
    }
}