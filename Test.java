public class Test {

    public int thirdMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        
        int fst = nums[0];
        int snd = nums[0];
        int trd = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            fst = nums[i] > fst ? nums[i] : fst;
        }
        
        for (int i = 1; i < nums.length; i++) {
            if (snd == fst && nums[i] < fst) {
                snd = nums[i];
            }
            snd = (nums[i] > snd && nums[i] != fst) ? nums[i] : snd;
        }
        
        for (int i = 1; i < nums.length; i++) {
            if (trd >= snd && nums[i] < snd) {
                trd = nums[i];
            }
            trd = (nums[i] > trd && nums[i] < snd) ? nums[i] : trd;
        }
        
        if (trd >= snd) return fst;
        
        return trd;
    }

    public static void main(String[] args) {
        Test test = new Test();

        int[] nums = {5,8,32,8,3,6,2,-45,6,8,3,7,3,6};
        int result = test.thirdMax(nums);

        System.out.println(result);
        // System.out.println("This is for test!");
    }
}