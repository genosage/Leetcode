public class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0) {
            return 0;
        }
        
        int next = 0;
        
        for(int i = 1; i < nums.length - 1; i++) {
            if(nums[i] != nums[i - 1] || nums[i] != nums[i + 1]) {
                next++;
                nums[next] = nums[i];
            }
        }
        
        if(nums.length > 1) {
            next++;
            nums[next] = nums[nums.length - 1];
        }
        
        return ++next;
    }
}