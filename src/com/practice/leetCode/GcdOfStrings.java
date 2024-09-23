package com.practice.leetCode;

/**
 * For two strings s and t, we say "t divides s" if and only if s = t + t + t +
 * ... + t + t (i.e., t is concatenated with itself one or more times).
 * 
 * Given two strings str1 and str2, return the largest string x such that x
 * divides both str1 and str2.
 * 
 * Input: str1 = "ABCABC", str2 = "ABC"
	Output: "ABC"
 * 
 */
public class GcdOfStrings {
	
	public static void main(String[] args) {
		String str1="ABABABAB";
		String str2="ABAB";
		
		System.out.println(gcdOfString(str1, str2));
	}

	private static String gcdOfString(String str1, String str2) {
		
		// if str1 strats withh str2 return str1 that is the gcd
		
		if(str2.equals(str1))
			return str1;
		
		// if(str2 .length < str1.length
		if(str2.length()<str1.length())
			return str2;
		
		// str1.length< str2.length
		if(str1.length()<str2.length())
			return gcdOfString(str2, str1);
		
		return "";
	}
}
