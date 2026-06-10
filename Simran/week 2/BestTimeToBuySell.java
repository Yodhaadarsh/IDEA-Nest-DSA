class Solution {
    public int maxProfit(int[] prices) {
        // Assume the first day has the lowest buying price for now
        int minPrice = prices[0]; 
        
        // This will keep track of the highest profit we can make
        int maxProfit = 0;        
        
        // Start checking the prices from the second day onwards
        for (int i = 1; i < prices.length; i++) {
            // If we find a price cheaper than our minimum, update it
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else {
                // Otherwise, calculate how much profit we make if we sell today
                int currentProfit = prices[i] - minPrice;
                
                // If today's profit is better than our max profit, lock it in
                if (currentProfit > maxProfit) {
                    maxProfit = currentProfit;
                }
            }
        }
        return maxProfit;
    }
}