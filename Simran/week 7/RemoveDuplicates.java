class Solution {
    public int removeDuplicates(int[] nums) {
        // If the array is empty, there are 0 unique elements
        if (nums.length == 0) return 0;
        
        // 'i' starts at the beginning and keeps track of the last unique element's spot
        int i = 0; 
        
        // 'j' starts from the second number and scans through the rest of the array
        for (int j = 1; j < nums.length; j++) {
            // If 'j' finds a new number that is different from our last unique number
            if (nums[j] != nums[i]) {
                i++; // move the unique counter one step forward
                nums[i] = nums[j]; // copy this new unique number into that new spot
            }
        }
        // Since array indexing starts at 0, the total count of unique elements is i + 1
        return i + 1; 
    }
}