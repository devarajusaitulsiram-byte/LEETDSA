class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int m = Integer.MAX_VALUE;
        int n = prices.length;
        for(int i =0;i<n;i++){
            m = Math.min(m,prices[i]);
            profit = Math.max(profit,prices[i]-m);
        }
        return profit;
    }
}