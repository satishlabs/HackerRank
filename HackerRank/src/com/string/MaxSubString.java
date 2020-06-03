package com.string;
/*
 Lexicographical Maximum substring of string
Given a string s we have to find the lexicographical maximum substring of a string

Examples:

Input : s = "ababaa"
Output : babaa
Explanation : "babaa" is the maximum lexicographic susbtring formed from this string

Input : s = "asdfaa"
Output : sdfaa 
 */
public class MaxSubString {
	public static void main(String[] args) {
		String str= "ababaa";
		System.out.println(subString(str));
	}

	public static String subString(String str) {
		// substring in the substring array 
		String max = "";
		for(int i=0; i<str.length();i++) {
			if(max.compareTo(str.substring(i))<=0) {
				max = str.substring(i);
			}
		}
		return max;
	}
}
