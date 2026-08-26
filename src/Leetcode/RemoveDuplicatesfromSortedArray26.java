package Leetcode;

import java.util.Arrays;

public class RemoveDuplicatesfromSortedArray26 {

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        System.out.println("Original: " + Arrays.toString(nums));
        System.out.println("Number of Unique Elements: " + NumOfUniqueElements(nums));
        System.out.println("Unique Elements: " + Arrays.toString(removeDuplicates(nums)));

    }
    static int NumOfUniqueElements(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        if (nums.length == 1)
            return 1;
        int k =0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i+1]) {
                k++;
            }
        }

        return k = nums.length-k;
    }

    static int[] removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0)
            return new int[]{};
        if (nums.length == 1)
            return nums;

        int left = 0;
        int right = 1;
        while(right < nums.length){
            if (nums[left] == nums[right]){
                right++;
            } else {
                nums[++left] = nums[right++];
            }
        }
        return nums;
    }
}
