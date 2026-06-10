class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Pointer for the last actual number in nums1
        int i = m - 1;     
        
        // Pointer for the last number in nums2
        int j = n - 1;     
        
        // Pointer for the very last empty spot at the back of nums1
        int k = m + n - 1; 
        
        // We compare and fill elements from the back so we don't overwrite any data
        while (j >= 0) {
            // If nums1 has elements left and its number is bigger than nums2's number
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k] = nums1[i]; // Put the bigger number at the back
                i--; // Move the nums1 pointer back
            } else {
                // Otherwise, nums2's number is bigger or nums1 is exhausted
                nums1[k] = nums2[j]; 
                j--; // Move the nums2 pointer back
            }
            k--; // Always move the main position pointer back
        }
    }
}