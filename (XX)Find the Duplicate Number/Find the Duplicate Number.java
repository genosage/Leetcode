public class Solution {
    public int findDuplicate(int[] nums) {
        int min = 1;
        int max = nums.length - 1;
        while(min <= max){
            int mid = min + (max - min) / 2;
            int count = 0;
            for(int i = 0; i < nums.length; i++){
                if(nums[i] <= mid){
                    count++;
                }
            }
            if(count <= mid){
                min = mid + 1;
            }else {
                max = mid - 1;
            }
        }
        return min;
    }
}