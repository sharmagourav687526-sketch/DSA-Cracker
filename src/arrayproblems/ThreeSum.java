package arrayproblems;

import java.util.Arrays;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {2, 2, 2, 7};
        int target = 11;
        int[] result = ThreeSum(nums, target);
        System.out.println(Arrays.toString(result));
    }

    static int[] ThreeSum(int[] nums, int target) {
        if (nums == null || nums.length <= 2) {
            return new int[]{-1, -1, -1};
        }

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if ((nums[i] + nums[j] + nums[k]) == target) {
                        return new int[]{i, j, k};
                    }
                }
            }
        }
        return new int[]{-1, -1, -1};
    }
}