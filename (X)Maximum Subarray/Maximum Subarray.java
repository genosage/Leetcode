public class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length == 0 || nums == null){
            return 0;
        }
        int sum = nums[0];
        int max = nums[0];
        for(int i = 1; i < nums.length; i++){
            sum = sum > 0 ? (sum + nums[i]) : nums[i];
            max = max > sum ? max : sum;
        }
        return max;
    }
}