class Solution {
    //function max profit takes in array of integer values prices
    public int maxProfit(int[] prices) {
        //intitilize max profits to zero
        int maxprofit = 0;
        //for beggining to end prices length
        for(int i = 0; i < prices.length - 1; i++){
            //for the current iteration of to the end of prices length
            for(int j = i + 1; j < prices.length; j++){
                //****************************************************************
                //set profit equal to the price of  j prices - i prices
                int profit = prices[j] - prices[i];
                
                //if the current profit is greater then it becomes the max profit
                if(profit > maxprofit)
                    maxprofit = profit;
              //********************************************************************  
            }
        }
        return maxprofit;
            
    }
}
