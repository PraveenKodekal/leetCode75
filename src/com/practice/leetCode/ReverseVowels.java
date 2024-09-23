package com.practice.leetCode;

import java.util.LinkedList;
import java.util.List;

/**
 * Given a string s, reverse only all the vowels in the string and return it.
 * 
 * The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower
 * and upper cases, more than once.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: s = "IceCreAm"
 * 
 * Output: "AceCreIm"
 * 
 */
public class ReverseVowels {
	public static void main(String[] args) {
		String s="IceCreAm";
		reverseVowels(s);
//		System.out.println(reverseVowels(s));
	}

	private static void reverseVowels(String s) {
		char[] str=s.toCharArray();
		int start=0;
		int last=str.length-1;
		
		while(start<last) {
			if(isVowel(str[start]) && isVowel(str[last])) {
				
				char temp=str[start];
				str[start]=str[last];
				str[last]=temp;
				start++;
				last++;
			}else if(!isVowel(str[start]))
				start++;
			else
				last--;
		}
		
		for(char st :str) {
			System.out.print(st);
		}
		
	}
	private static boolean isVowel(char x) {
		if(x=='A'||x=='E'||x=='I'||x=='O'||x=='U'||
				x=='a'||x=='e'||x=='i'||x=='o'||x=='u') {
			return true;
		}
		return false;
	}

}
