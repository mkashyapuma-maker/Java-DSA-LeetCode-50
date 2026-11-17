class Solution {
    public int maxProfit(int[] prices) {
        int minimumPrice = Integer.MAX_VALUE, bestProfit = 0;
        for (int price : prices) {
            minimumPrice = Math.min(minimumPrice, price);
            bestProfit = Math.max(bestProfit, price - minimumPrice);
        }
        return bestProfit;
    }
}
