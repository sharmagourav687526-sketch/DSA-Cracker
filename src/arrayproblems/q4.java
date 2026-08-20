// Finding the Highest and Lowest Frequency
package arrayproblems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class q4 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 3, 7, 4, 5, 6, 7, 7, 8, 9};
        int[] result = getHighestLowestFreqElement(arr);
        System.out.println("Highest Freq Element: " + result[0]);
        System.out.println("Lowest Freq Element: " + result[1]);

    }

    /**
     * Finds the most frequent element in an integer array.
     * Time Complexity: O(N)
     * Space Complexity: O(N)
     */
    public static int[] getHighestLowestFreqElement(int[] arr) {
        int[] result = new int[2];
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

        int minFrequency = Integer.MAX_VALUE;


        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
                result[0] = entry.getKey();
            }
            if (entry.getValue() < minFrequency) {
                minFrequency = entry.getValue();
                result[1] = entry.getKey();
            }
        }

        return result;
    }
}
