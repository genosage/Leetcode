public class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length < 2 || prices == null){
            return 0;
        }
        
        int min[] = new int[prices.length];
        int dp[] = new int[prices.length];
        
        min[0] = prices[0];
        dp[0] = 0;
        
        for(int i = 1; i < prices.length; i++){
            min[i] = Math.min(min[i - 1], prices[i]);
        }
        
        for(int i = 1; i < prices.length; i++){
            dp[i] = Math.max(dp[i - 1], (prices[i] - min[i - 1]));
        }
        
        return dp[prices.length - 1];
    }
}