package Leetcode;

import java.util.Arrays;

public class TwoSum1 {
    public static void main(String[] args) {
        int[] nums = {2, 2, 2, 7};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }

    static int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length < 2) {
            return new int[0];
        }

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int currentSum = nums[left] + nums[right];

            if (currentSum == target) {
                return new int[]{left, right};
            } else if (currentSum < target) {
                left++;  // Sum too small: move to a larger value
            } else {
                right--; // Sum too large: move to a smaller value
            }
        }

        return new int[0];
    }
}
