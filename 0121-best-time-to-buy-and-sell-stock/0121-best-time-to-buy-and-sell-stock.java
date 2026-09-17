class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int j =0;
        for(int i=1; i<prices.length; i++){
                if(prices[j] < prices[i]){
                int prft = prices[i] - prices[j];
                max = Math.max(max,prft);
            }
            else{
                j =i;
            }
             

            }
        
        return max;
    }
}