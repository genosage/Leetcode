public class Solution {
    public int missingNumber(int[] nums) {
        int sum1 = 0;
        int sum2 = 0;
        
        for(int i = 0; i < nums.length; i++){
            sum1 += i;
            sum2 += nums[i];
        }
        
        sum1 += nums.length;
        
        return sum1 - sum2;
    }
}