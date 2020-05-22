package com.string;

import java.util.HashSet;

/*
 Check if a given array contains duplicate elements within k distance from each other
  
 Input: k = 3, arr[] = {1, 2, 3, 4, 1, 2, 3, 4}
Output: false
All duplicates are more than k distance away.

Input: k = 3, arr[] = {1, 2, 3, 1, 4, 5}
Output: true
1 is repeated at distance 3.

Input: k = 3, arr[] = {1, 2, 3, 4, 5}
Output: false

Input: k = 3, arr[] = {1, 2, 3, 4, 4}
Output: true 
 */

public class CheckDuplicatesWithinK {
	public static void main(String[] args) {
		int[] arr = {2, 4, 3, 2, 4, 3, 5};
		if(checkDuplicatesWithinK(arr,3)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

	private static boolean checkDuplicatesWithinK(int[] arr, int k) {
		 // Creates an empty hashset 
		HashSet<Integer> set = new HashSet<>();
		
		// Traverse the input array 
		for(int i=0; i<arr.length; i++) {
			
			// If already present n hash, then we found  
            // a duplicate within k distance 
			if(set.contains(arr[i]))
				return true;
			
			// Add this item to hashset 
			set.add(arr[i]);
			
			// Remove the k+1 distant item 
			if(i >= k) {
				set.remove(arr[i-k]);
			}
			
		}
		return false;
	}
}
