// Basically in this problem we will work on formula {{Profit = SellingPrice - BuyingPrice}}
// The Time Complexity of this problem is O(n).

public class StockProblem {
    public static void main(String args[]){
        int price[] = {7,1,5,3,6,4};
        System.out.println(BuySellStocks(price));
    }
    public static int BuySellStocks(int price[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit  = 0;

        // For calculating Profit 
        
        for(int i=0;i<price.length;i++){
            if(buyPrice < price[i]){
                int profit = price[i]-buyPrice;
                maxProfit = Math.max(maxProfit,profit);
            }else{
                buyPrice = price[i];
            }
        }
        return maxProfit;
    }
}
