public class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length == 0 || nums == null){
            return 0;
        }
        
        int dp[] = new int[nums.length];
        dp[0] = nums[0];
        int max = nums[0];
        
        for(int i = 1; i < nums.length; i++){
            dp[i] = nums[i] + (dp[i - 1] > 0 ? dp[i - 1] : 0);
            max = Math.max(max, dp[i]);
        }
        
        return max;
    }
}