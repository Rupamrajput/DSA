package ArraysQues;

public class BuyAndSellStock {
    public int maxProfit(int[] prices) {
        int maxSoFar = 0;
        int currMaxDiff = 0;
        for(int i=1; i<prices.length;i++){
            currMaxDiff = Math.max(0, currMaxDiff + (prices[i] - prices[i - 1]));
            maxSoFar = Math.max(currMaxDiff,maxSoFar);
        }
        return maxSoFar;
    }
}
