class Solution {
    public int maxProfit(int[] prices) {
        int buy = 0, prof = 0;
        for(int i = 0; i < prices.length; i++){
            buy = prices[i];
            for(int j = i+1; j < prices.length; j++){
                prof = Math.max(prices[j] - buy, prof);
            }
        }
        return prof;
    }
}
