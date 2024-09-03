package P4_BestTimeToBuyAndSellStocks;

public class BestTimeToBuyAndSellStocks {

    public static void main(String[] args) {
        int[] prices1 = {7,6,4,3,1};
        int[] prices2 = {7,1,5,3,6,4};

        System.out.println(maxProfit(prices1));
        System.out.println(maxProfit(prices2));

    }

    public static int maxProfit(int[] prices) {
        // Edge case: if prices array is empty or has one element, no profit can be made
        if (prices == null || prices.length <= 1) {
            return 0;
        }

        int minPrice = Integer.MAX_VALUE; // Initialize minPrice to a very high value
        int maxProfit = 0; // Initialize maxProfit to 0, since no profit can be negative in this context

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                // Update minPrice if the current price is lower
                minPrice = prices[i];
            } else if (prices[i] - minPrice > maxProfit) {
                // Calculate potential profit and update maxProfit if this profit is higher
                maxProfit = prices[i] - minPrice;
            }
        }

        return maxProfit; // Return the maximum profit found
    }

    //  Time Complexity: O(n), where n is the number of elements in the prices array, we only traverse the array once.
    //  Space Complexity: O(1), as we are only using a few extra variables.

}
