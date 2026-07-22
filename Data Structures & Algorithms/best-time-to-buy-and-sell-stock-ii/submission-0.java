class Solution {
    public int maxProfit(int[] prices) {
        int maxProf=0;
        for(int i=0; i<prices.length-1; i++){
            int profit=0;
            if(prices[i]<prices[i+1]){
                profit= prices[i+1]- prices[i];
            }

            maxProf+=profit;
        }
    return maxProf; 
    }
}