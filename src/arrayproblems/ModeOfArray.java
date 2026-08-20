// Finding the Mod of the Array

package arrayproblems;

import java.util.HashMap;
import java.util.Map;

public class ModeOfArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 3, 7, 4, 5, 6, 7, 7, 8, 9};
        System.out.println("Mode of the Array is: " + findMode(arr));
    }

    /**
     * Finds the most frequent element in an integer array.
     * Time Complexity: O(N)
     * Space Complexity: O(N)
     */
    public static int findMode(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be empty or null");
        }

        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Step 1: Count frequencies
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Identify the maximum frequency key using entrySet
        int maxFrequency = 0;
        int mode = arr[0];

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
                mode = entry.getKey();
            }
        }

        return mode;
    }
}
