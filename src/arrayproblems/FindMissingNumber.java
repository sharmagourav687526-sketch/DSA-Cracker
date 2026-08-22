package arrayproblems;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] arr = new int[99];

        int idx = 0;
        for (int i = 901; i <= 1000; i++) {
            if (i == 974) continue; // skip target missing number
            arr[idx++] = i;
        }

        int[] range = {901, 1000};
        long missingNumber = findMissingNumOfArray(arr, range);
        System.out.println("Missing number is: " + missingNumber);
        missingNumber = findMissingNumXOR(arr, range);
        System.out.println("Missing number is: " + missingNumber);
    }

    /**
     * Finds the missing number in a contiguous range [L, R] using AP summation.
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     */
    public static long findMissingNumOfArray(int[] arr, int[] range) {
        if (range == null || range.length < 2) {
            throw new IllegalArgumentException("Range must contain [lowerBound, upperBound]");
        }

        long low = range[0];
        long high = range[1];
        long totalCount = high - low + 1;

        // Multiply before division using 64-bit integers to prevent truncation and precision loss
        long expectedSum = totalCount * (low + high) / 2;

        long actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }


    /**
     * Finds the missing number using Bitwise XOR.
     * Prevents any possibility of integer overflow.
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     */
    public static int findMissingNumXOR(int[] arr, int[] range) {
        if (range == null || range.length < 2) {
            throw new IllegalArgumentException("Invalid range array.");
        }

        int xorSum = 0;

        // Step 1: XOR all numbers expected in the full range [L, R]
        for (int i = range[0]; i <= range[1]; i++) {
            xorSum ^= i;
        }

        // Step 2: XOR all numbers present in the array
        for (int num : arr) {
            xorSum ^= num;
        }

        // All duplicate numbers cancel out to 0; only the missing number remains
        return xorSum;
    }
}