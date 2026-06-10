class Solution {
    public int removeElement(int[] nums, int val) {
        // 'count' keeps track of where to place the valid numbers at the front
        int count = 0; 
        
        // Loop through the entire array element by element
        for (int i = 0; i < nums.length; i++) {
            // If the current number is NOT equal to the target 'val' (meaning it's useful)
            if (nums[i] != val) {
                nums[count] = nums[i]; // move this useful number to the 'count' position
                count++; // move the counter forward for the next valid number
            }
        }
        // At the end, 'count' gives the exact total of valid numbers left in the array
        return count; 
    }
}