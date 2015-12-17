public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        
        for(int i = 0, x = 1; i < nums.length; i++){
            output[i] = x;
            x *= nums[i];
        }
        
        for(int i = nums.length - 1, x = 1; i >= 0; i--){
            output[i] *= x;
            x *= nums[i];
        }
        
        return output;
    }
}