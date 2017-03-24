public class Solution {
    public int thirdMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        
        Integer fst = null;
        Integer snd = null;
        Integer trd = null;
        
        for (Integer n : nums) {
            if (n.equals(fst) || n.equals(snd) || n.equals(trd)) continue;
            
            if (fst == null || n > fst) {
                trd = snd;
                snd = fst;
                fst = n;
            } else if (snd == null || n > snd) {
                trd = snd;
                snd = n;
            } else if (trd == null || n > trd) {
                trd = n;
            }
        }
        
        return trd == null ? fst : trd;
        
    }
}