package com.practice.leetCode;

/**
 * Given an input string s, reverse the order of the words.
 * 
 * A word is defined as a sequence of non-space characters. The words in s will
 * be separated by at least one space.
 * 
 * Return a string of the words in reverse order concatenated by a single space.
 * 
 * Note that s may contain leading or trailing spaces or multiple spaces between
 * two words. The returned string should only have a single space separating the
 * words. Do not include any extra spaces.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: s = "the sky is blue" Output: "blue is sky the"
 * 
 */
public class ReverseWords {
	public static void main(String[] args) {
		String str = "the sky is blue";

		System.out.println(reverseWords(str));
	}

	private static String reverseWords(String str) {
		// trim removes extra spaces from both the ends to
		str = str.trim();
		// count number of spaces
		int spaces = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ')
				spaces++;
		}
		System.out.println(spaces);
		// create an array of strings which is length of the number of spaces
		// create string [] words to store the split words

		String[] words = new String[spaces + 1];
		int j = 0;
		for (int i = 0; i < str.length(); i++) {
			String s = "";
			while (i < str.length() && str.charAt(i) != ' ') {
				s = s + str.charAt(i);
				i++;
			}
			words[j] = s;
			j++;
		}
		// System.out.println(words);
		StringBuilder st = new StringBuilder();
		for (int i = words.length - 1; i >= 0; i--) {
			if (words[i] == "") {
				continue;
			}
			st.append(words[i]);
			if (i > 0) {
				st.append(" ");
			}

		}
		return st.toString();

	}
}