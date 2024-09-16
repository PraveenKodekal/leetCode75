package com.practice.leetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * You are given two strings word1 and word2. Merge the strings by adding
 * letters in alternating order, starting with word1. If a string is longer than
 * the other, append the additional letters onto the end of the merged string.
 * 
 * Return the merged string.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: word1 = "abc", word2 = "pqr" Output: "apbqcr" Explanation: The merged
 * string will be merged as so:
 * 
 */
public class MergeString {

	public static void main(String[] args) {
		String word1 = "ab";
		String word2 = "pqrsr";
		System.out.print(mergeString(word1, word2));
		System.out.println("--");
		System.out.print(mergerAlternate(word1,word2));
		
	}

	private static String mergerAlternate(String word1, String word2) {

		StringBuilder build= new StringBuilder();
		for(int i=0; i<word1.length() && i<word2.length();i++) {
			if(i<word1.length())
				build.append(word1.charAt(i));
			if(i<word2.length())
				build.append(word2.charAt(i));
		}
		return build.toString();
	}

	private static String mergeString(String word1, String word2) {
		StringBuilder builder= new StringBuilder();
		int i=0;
		
		while(i<word1.length() || i<word2.length()) {
			if(i<word1.length())
				builder.append(word1.charAt(i));
			if(i<word2.length())
				builder.append(word2.charAt(i));
				i++;
		}
		return builder.toString();
	}

}
