package arrayproblems;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 2, 2, 7};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }

    static int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length < 2) {
            return new int[]{-1, -1};
        }

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if ((nums[i] + nums[j]) == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
