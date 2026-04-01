package DSA.array;

public class buynsell {
//     public int maxProfit(int[] prices) {
//        int buy=0;
//        int sell=0;
//        int maxprofit=0;
//        int profit=0;
//         for(int i=0;i<prices.length;i++)
//         {   
//             buy=prices[i];
//             for(int j=i+1;j<prices.length;j++)
//             {
//               sell=prices[j];
//               profit=sell-buy;
//               maxprofit=Math.max(profit,maxprofit);
//             }
//         }
//         return maxprofit;
//     }
// }  
              //Optimal Solution

    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int maxprofit = 0;

        for (int i = 0; i < prices.length; i++) {
            
            if (prices[i] < min) { //pahle wale se hi hum min maan k chalenge aur profit k liye usi price se ya fir aglw price se minus krke chechk krte rhenege bcz we can sell it after buying not before it..
                min = prices[i];//if we find different minimum do the same process again 
            } else {
                int profit = prices[i] - min;
                maxprofit = Math.max(maxprofit, profit);
            }
        }

        return maxprofit;
    }
}