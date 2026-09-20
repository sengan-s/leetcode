class Solution {
    public int findDuplicate(int[] nums) {
        // Step 1: Find the intersection point of the two runners
        int slow = nums[0];
        int fast = nums[0];
        
        do {
            slow = nums[slow];           // moves 1 step
            fast = nums[nums[fast]];     // moves 2 steps
        } while (slow != fast);
        
        // Step 2: Find the entrance to the cycle (the duplicate number)
        slow = nums[0]; // reset slow to the start
        
        while (slow != fast) {
            slow = nums[slow];           // both move 1 step
            fast = nums[fast];
        }
        
        return slow; // or fast, they are the same at the entrance
    }
}