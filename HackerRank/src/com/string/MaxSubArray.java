package com.string;
/*
 Given an integer array nums, find the contiguous subarray (containing at least one number)
  which has the largest sum and return its sum.
Example:
Input: [-2,1,-3,4,-1,2,1,-5,4],
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
 */
public class MaxSubArray {
	public static void main(String[] args) {
		int [] arr = {-2, -3, 4, -1, -2, 1, 5, -3}; 
		maxSubArraySum(arr); 
	}

	private static void maxSubArraySum(int[] arr) {
		int size = arr.length;
		int max_so_far = Integer.MIN_VALUE, 
				max_ending_here = 0,start = 0, 
				end = 0, s = 0; 

		for (int i = 0; i < size; i++)  
		{ 
			max_ending_here += arr[i]; 

			if (max_so_far < max_ending_here)  
			{ 
				max_so_far = max_ending_here; 
				start = s; 
				end = i; 
			} 

			if (max_ending_here < 0)  
			{ 
				max_ending_here = 0; 
				s = i + 1; 
			} 
		} 
		System.out.println("Maximum contiguous sum is " 
				+ max_so_far); 
		System.out.println("Starting index " + start); 
		System.out.println("Ending index " + end); 
	}

}
