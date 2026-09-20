class Solution {
    public int findDuplicate(int[] nums) {
        int low = 1;
        int high = nums.length - 1; // Since array length is n + 1, max value is n
        
        while (low < high) {
            int mid = low + (high - low) / 2;
            int count = 0;
            
            // Count how many numbers in the array are less than or equal to 'mid'
            for (int num : nums) {
                if (num <= mid) {
                    count++;
                }
            }
            
            // Pigeonhole Principle: if count > mid, the duplicate is in the lower half
            if (count > mid) {
                high = mid;
            } else {
                // Otherwise, the duplicate is in the upper half
                low = mid + 1;
            }
        }
        
        return low;
    }
}