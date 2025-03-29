package Tech_22;

public class Knapsack {
    public static void main(String[] args) {
		 
		int[] weights= {2,3,4,5};
		int[] profits= {1,2,5,6};
		int capacity=3;
		int maxprofit=knapsack(weights,profits,capacity);
		System.out.println(maxprofit);
	    	
	    }

	private static int knapsack(int[] weights, int[] profits, int capacity) {
		// TODO Auto-generated method stub
		
		int n=weights.length;
		int[][] dp= new int[n+1][capacity+1];
		for(int i=1;i<=n;i++)
		{
			for(int w=1;w<=capacity;w++)
			{
				if(weights[i-1]>w)
				{
					dp[i][w]=dp[i-1][w];
				}
				else{
					dp[i][w]=Math.max(dp[i-1][w],profits[i-1]+dp[i-1][w-weights[i-1]]);
					
				}
			}
		}
		
		
		
		
		return dp[n][capacity];
	}

}
