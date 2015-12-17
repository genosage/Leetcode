public class Solution {
    public boolean containsDuplicate(int[] nums) {
        if(nums.length == 0 || nums == null){
            return false;
        }
        
        Set set = new HashSet();
        
        for(int i = 0; i < nums.length; i++){
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
        }
        
        return false;
    }
    
}