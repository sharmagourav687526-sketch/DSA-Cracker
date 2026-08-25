package Leetcode;

import java.util.Arrays;

public class SortColors75 {
    public static void main(String[] args) {
        // Test Case 1: General mixed array
        int[] nums1 = {2,0,1};
        System.out.println("Original Array 1: " + Arrays.toString(nums1));
        sortColors(nums1);
        System.out.println("Sorted Array 1:   " + Arrays.toString(nums1));
        System.out.println();

        // Test Case 2: Standard 3-element permutation
        int[] nums2 = {2, 0, 1};
        System.out.println("Original Array 2: " + Arrays.toString(nums2));
        sortColors(nums2);
        System.out.println("Sorted Array 2:   " + Arrays.toString(nums2));
        System.out.println();

        // Test Case 3: Edge case (Already sorted)
        int[] nums3 = {0, 0, 1, 2, 2};
        System.out.println("Original Array 3: " + Arrays.toString(nums3));
        sortColors(nums3);
        System.out.println("Sorted Array 3:   " + Arrays.toString(nums3));
    }

    static void sortColors(int[] nums) {
        int size = nums.length;
        int low = 0;
        int high = size - 1;
        int mid =0;

        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else { // nums[mid] == 2
                swap(nums, mid, high);
                high--;
            }
        }
    }



    static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}
