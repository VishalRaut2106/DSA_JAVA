public class Practice2 {

    public static int  maxArray(int prices[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i = 1 ; i<prices.length ; i++){
            if(buyPrice < prices[i]){
                int profit = prices[i]- buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }else {
                buyPrice = prices[i];
            }

            
        }
        return maxProfit ; 
    }

    public static void main(String[] args) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println(maxArray(prices));

    }

}
