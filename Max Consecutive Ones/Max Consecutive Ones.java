public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0, current = 0;
        
        for(int n : nums){
            current = n == 0 ? 0 : (current + 1);
            max = current > max ? current : max;
        }
        
        return max;
    }
}