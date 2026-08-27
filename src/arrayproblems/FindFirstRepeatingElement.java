package arrayproblems;

import java.util.HashSet;

public class FindFirstRepeatingElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 2, 4, 5};

        System.out.println("Brute Force: " + findFirstRepeatingElement(arr));
        System.out.println("Optimized Set: " + findFirstRepeatingElement2(arr));
    }

    // Brute Force: O(N^2) time, O(1) space
    static int findFirstRepeatingElement(int[] arr) {
        int size = arr.length;
        int duplicate = -1; // Changed from 0 to -1 to safely handle cases with 0s
        boolean flag = false;
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] == arr[j]) {
                    duplicate = arr[i];
                    flag = true;
                    break;
                }
            }
            if (flag) {
                break;
            }
        }
        return duplicate;
    }

    // Optimized Single-Pass: O(N) time, O(N) space using HashSet traversing from right to left
    static int findFirstRepeatingElement2(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        int firstRepeating = -1;

        // Traverse the array from right to left
        for (int i = arr.length - 1; i >= 0; i--) {
            // If the element is already present in the set, it is a repeating element
            if (set.contains(arr[i])) {
                firstRepeating = arr[i];
            } else {
                set.add(arr[i]);
            }
        }
        return firstRepeating;
    }
}
