
// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/

public class Best_Time_to_Buy_and_Sell_Stock_121 {
    public int maxProfit(int[] prices) {
        int profit = 0, minimum = prices[0];

        for (int  i = 1; i < prices.length; i++) {
            int cost = prices[i] - minimum;
            profit = Math.max(profit, cost);
            minimum = Math.min(minimum, prices[i]);
        }

        return profit;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        Best_Time_to_Buy_and_Sell_Stock_121 obj = new Best_Time_to_Buy_and_Sell_Stock_121();
        System.out.println(obj.maxProfit(prices));
    }
}
