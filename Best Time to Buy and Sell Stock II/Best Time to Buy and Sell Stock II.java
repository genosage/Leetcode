public class Solution {
    public int maxProfit(int[] prices) {
        
        if(prices.length == 0 || prices == null){
            return 0;
        }
        
        int profit = 0;
        
        for(int i = 0; i < prices.length - 1; i++){
            prices[i] = prices[i + 1] - prices[i];
        }
        
        for(int i = 0; i < prices.length - 1; i++){
            profit += prices[i] > 0? prices[i] : 0;
        }
        
        return profit;
    }
}