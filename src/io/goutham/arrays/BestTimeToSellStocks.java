package io.goutham.arrays;

public class BestTimeToSellStocks {

	public static void main(String[] args) {
		 int result=maxProfitOptimal(new int[] {7,1,5,3,6,4});
	
			 System.out.println(result);
		 

	}
	
	static   public int maxProfitBruteForce(int[] prices) {
        
        int result =0;
        for(int i=0;i<prices.length;i++){
            int diff;
             for(int j=i+1;j<prices.length;j++){
                 diff = prices[j]-prices[i];
                 System.out.println(diff);
                 result = Math.max(result,diff);
                 
             }
        }
        return result;
    }
	
static  public int maxProfitOptimal(int[] prices) {
        
        int min = prices[0];
        int profit = 0;
        for(int i=0;i<prices.length;i++){
           
        	profit = Math.max(profit, prices[i]-min);
        	min = Math.min(min, prices[i]);
        }
        return profit;
    }

}
