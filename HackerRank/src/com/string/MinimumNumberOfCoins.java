package com.string;

/*
 Find minimum number of coins that make a given value
Input: coins[] = {25, 10, 5}, V = 30
Output: Minimum 2 coins required
We can use one coin of 25 cents and one of 5 cents 

Input: coins[] = {9, 6, 5, 1}, V = 11
Output: Minimum 2 coins required
We can use one coin of 6 cents and 1 coin of 5 cents
 * */

public class MinimumNumberOfCoins {
	public static void main(String[] args) {
		int coins[] =  {9, 6, 4, 1}; 
		int m = coins.length; 
		int V = 11; 
		System.out.println("Minimum coins required is "+ minCoins(coins, m, V) ); 
	}

	static int  minCoins(int[] coins, int m, int v) {
		//base case
		if(v ==0)
			return 0;
		
		//Initilze the result 
		int res = Integer.MAX_VALUE;
		for(int i=0; i<m ;i++) {
			if(coins[i] <= v) {
				int sub_res = minCoins(coins, m, v-coins[i]);
				
				// Check for INT_MAX to avoid overflow and see if 
	             // result can minimized 
				if(sub_res != Integer.MAX_VALUE && sub_res+1 < res)
					res = sub_res+1;
			}
		}
		return res;
	}
}
