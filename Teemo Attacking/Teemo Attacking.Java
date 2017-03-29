public class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if (timeSeries == null || timeSeries.length == 0) return 0;
        
        int result = 0;
        
        for (int i = 1; i < timeSeries.length; i++) {
            result += (timeSeries[i] - timeSeries[i - 1]) > duration ? duration : (timeSeries[i] - timeSeries[i - 1]);
        }
        
        result += duration;
        
        return result;
    }
}