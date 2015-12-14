public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[]{0, 0};
        
        if(nums.length == 0 || nums == null){
            return result;
        }
        
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], i);
        }
        
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(target - nums[i]) && i != map.get(target - nums[i])){
                result[0] = i + 1;
                result[1] = map.get(target - nums[i]) + 1;
                return result;
            }
        }
        
        return result;
    }
}