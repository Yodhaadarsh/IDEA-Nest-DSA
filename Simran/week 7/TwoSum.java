class Solution {
    public int[] twoSum(int[] nums, int target) {
        // First loop: picks each number from the array one by one
        for (int i = 0; i < nums.length; i++) {
            // Second loop: checks all the numbers coming after the first number
            for (int j = i + 1; j < nums.length; j++) {
                // If the sum of both numbers matches the target, return their positions
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        // If no such pair is found in the entire array, return an empty array
        return new int[]{};
    }
}
