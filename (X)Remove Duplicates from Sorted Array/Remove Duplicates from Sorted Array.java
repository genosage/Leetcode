public class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }
        
        int next = 0;
        
        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i] != nums[i + 1]) {
                next++;
                nums[next] = nums[i + 1];
            }
        }
        
        return ++next;
    }
}