public class BestTimeToBuy {
    public static void main(String[] args) {
        int[] prices = {1,2,3,5};
        int low = Integer.MAX_VALUE;
        int maxProfit = 0;
        int profit = 0;

        for(int i = 0; i < prices.length; i++) {
            if(prices[i] < low) {
                low = prices[i];
            }
            profit = prices[i] - low;

            if(maxProfit < profit) {
                maxProfit = profit;
            }
        }
        System.out.println(maxProfit);
    }
}
