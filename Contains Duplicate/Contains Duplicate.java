public class Solution {
    public boolean containsDuplicate(int[] nums) {
        if(nums.length == 0 || nums == null){
            return false;
        }
        
        HashMap map = new HashMap();
        
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                return true;
            }
            map.put(nums[i], i);
        }
        
        return false;
    }
    
}