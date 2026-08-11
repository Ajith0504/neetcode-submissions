class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0, left = 0, right = 1;
        while(left < right && left < prices.length-1 && right < prices.length){
            if(prices[left] > prices[right]){
                left = right;
                right++;
            }
            else{
                profit = Math.max(prices[right] - prices[left], profit);
                right++;
            }
        }
        return profit;
    }
}
