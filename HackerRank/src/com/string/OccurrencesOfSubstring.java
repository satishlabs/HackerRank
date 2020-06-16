package com.string;

import java.util.regex.Pattern;

//Occurrences of substring in a string
public class OccurrencesOfSubstring {
	public static void main(String[] args) {
		String str = "helloslkhellodjladfjhello";
		String findStr = "hello";
		//subString(str,findStr);
		//subString1(str,findStr);
		subString2(str,findStr);
	}

	private static void subString2(String str, String findStr) {
		int lastIndex = 0;
		int count = 0;
		while((lastIndex = str.indexOf(findStr, lastIndex)) != -1) {
			count++;
			lastIndex += findStr.length() -1;
		}
		System.out.println(count);
	}

	private static void subString1(String str, String findStr) {
		int searchLength = findStr.length(); 
		int totalLength = str.length(); 
		int k = 0;
		for (int i = 0; i < totalLength - searchLength + 1; i++) {
			String subStr = str.substring(i, searchLength + i);
			if (subStr.equals(findStr)) {
				k++;
			}

		}
		System.out.println(k);
	}

	private static void subString(String str, String findStr) {
		int lastIndex = 0;
		int count=0;
		while(lastIndex != -1) {
			lastIndex = str.indexOf(findStr, lastIndex);

			if(lastIndex != -1) {
				count++;
				lastIndex += findStr.length();
			}

		}
		System.out.println(count);
	}

}


