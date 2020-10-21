public class BestTimeToBuyAndSellStockIII {

	public static int maxProfit(int[] prices) {
		if (prices.length <= 1) {
            return 0;
        }
        
        int n = prices.length;
        int[] result = new int[n];
        int lowest = Integer.MAX_VALUE;
        int highest = Integer.MIN_VALUE;
        
        int maxLeft = 0, maxRight = 0;
        // Form the left array
        for (int i = 0; i < n; i++) {
        	lowest = Math.min(lowest, prices[i]);
            highest = Math.max(highest, prices[n-i-1]);
            
        	maxLeft = Math.max(maxLeft, prices[i] - lowest);
        	maxRight = Math.max(maxRight, highest - prices[n-i-1]);
            
            result[i] += maxLeft;        
        	result[n-i-1] += maxRight;
        }
        
        // Find the maximum profit
        int profit = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
        	if (result[i] > profit) {
        		profit = result[i];
        	}
        }
        return profit;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prices = {3,3,5,0,0,3,1,4};
		System.out.println(maxProfit(prices));
	}

}
