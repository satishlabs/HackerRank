package com.string;
/*
 Java Program to Find the closest pair from two sorted arrays
 Input:  ar1[] = {1, 4, 5, 7};
        ar2[] = {10, 20, 30, 40};
        x = 32      
Output:  1 and 30

Input:  ar1[] = {1, 4, 5, 7};
        ar2[] = {10, 20, 30, 40};
        x = 50      
Output:  7 and 40
 
 * */


public class ClosestPair {
	public static void main(String[] args) {
		ClosestPair ob = new ClosestPair(); 
        int ar1[] = {1, 4, 5, 7}; 
        int ar2[] = {10, 20, 30, 40}; 
        int m = ar1.length; 
        int n = ar2.length; 
        int x = 32; 
        ob.printClosest(ar1, ar2, m, n, x);
	}

	private void printClosest(int[] arr1, int[] arr2, int m, int n, int x) {
		int diff = Integer.MAX_VALUE;
		
		// res_l and res_r are result indexes from ar1[] and ar2[] 
        // respectively 
		int res_l = 0;
		int res_r = 0;
		
		// Start from left side of ar1[] and right side of ar2[]
		int l =0;
		int r = n-1;
		
		while(l < m && r >= 0) {
			if(Math.abs(arr1[l] + arr2[r] - x) < diff){
				res_l = l;
				res_r = r;
				diff = Math.abs(arr1[l]+arr2[r]-x);
			}
			
			if(arr1[l]+arr2[r] > x) 
				r--;
			else
				l++;
		}
		System.out.println("[ "+arr1[res_l]+" , "+arr2[res_r]+" ]");
	}
}
