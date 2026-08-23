package Leetcode;

class Solution {
    public int singleNumber(int[] nums) {
        int singleNumber = nums[0];
        for (int i = 1;i < nums.length; i++){
            singleNumber = singleNumber ^ nums[i];
        }
        return singleNumber;
    }
}

public class SingleNumber136 {
    public static void main(String[] args) {
        int[] nums = {1,1,2,2,3,3,6,6,4,4,8,8,9};

        Solution solution = new Solution();
        System.out.println("Single Number is: "+solution.singleNumber(nums));
    }
}
