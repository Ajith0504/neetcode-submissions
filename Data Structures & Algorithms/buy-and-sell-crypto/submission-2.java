class Solution {
    public int maxProfit(int[] prices) {
        // int buy = 0, prof = 0;
        // for(int i = 0; i < prices.length; i++){
        //     buy = prices[i];
        //     for(int j = i+1; j < prices.length; j++){
        //         prof = Math.max(prices[j] - buy, prof);
        //     }
        // }
        // return prof;
        int left = 0, right = 1, maxProf = 0;
        while(left < right && left < prices.length-1 && right < prices.length){
            if(prices[left] > prices[right]){
                left = right;
                right++;
            }
            else{
                maxProf = Math.max(prices[right] - prices[left], maxProf);
                right++;
            }
            

        }
        return maxProf;
        

    }
}
