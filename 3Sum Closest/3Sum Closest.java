public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        if (nums.length < 3) return 0;
        
        int sum;
        int closest;
        
        Arrays.sort(nums);
        
        sum = nums[0] + nums[1] + nums[2];
        closest = sum;
        
        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            
            if (i == 0 || i > 0 && nums[i] != nums[i - 1]) {
                while (j < k) {
                    sum = nums[i] + nums[j] + nums[k];
                    
                    if (Math.abs(sum - target) < Math.abs(closest - target)) closest = sum;
                    
                    if (sum == target) return sum;
                    
                    if (sum > target) k--;
                    
                    if (sum < target) j++;
                }
            }
        }
        return closest;
    }
}