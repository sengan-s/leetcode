class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        int[] fre=new int[101];
        for(int num:nums){
            fre[num]++;
            if(fre[num]>2){
                return false;

            }
        }
        return true;
        
    }
}