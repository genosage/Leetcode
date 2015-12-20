public class Solution {
    public void sortColors(int[] nums) {
        int L = 0, R = nums.length - 1;
        int i = 0;
        while(i <= R){
            if(nums[i] == 2){
                swap(nums, i, R);
                R--;
            }
            if(nums[i] == 0){
                swap(nums, i, L);
                L++;
                i++;
            }else if(nums[i] == 1){
                i++;
            }
        }
    }
    public void swap(int[] nums, int a, int b){
        int c = nums[a];
        nums[a] = nums[b];
        nums[b] = c;
    }
}