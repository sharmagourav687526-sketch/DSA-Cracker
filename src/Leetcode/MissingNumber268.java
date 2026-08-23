package Leetcode;

class Solution268 {
    public int missingNumber(int[] nums) {
        int xorSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            xorSum ^= nums[i];
        }

        for (int j = 0; j <= nums.length; j++) {
            xorSum ^= j;
        }
        return xorSum;
    }
}

class MissingNumber {
    public static void main(String[] args) {

    }
}