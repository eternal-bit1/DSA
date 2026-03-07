package DSA.array;

public class buynsell {
    public int maxProfit(int[] prices) {
       int buy=0;
       int sell=0;
       int maxprofit=0;
       int profit=0;
        for(int i=0;i<prices.length;i++)
        {   
            buy=prices[i];
            for(int j=i+1;j<prices.length;j++)
            {
              sell=prices[j];
              profit=sell-buy;
              maxprofit=Math.max(profit,maxprofit);
            }
        }
        return maxprofit;
    }
}  

