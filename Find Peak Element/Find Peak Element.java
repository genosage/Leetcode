public class Solution {
    public int findPeakElement(int[] nums) {
        if(nums == null || nums.length == 0) {
            return 0;
        }
        
        int index = 0;
        int max = nums[0];
        
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > max) {
                index = i;
                max = nums[i];
            }
        }
        
        return index;
    }
}