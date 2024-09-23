package com.practice.leetCode;

/**
 * Given an integer array nums, return true if any value appears more than once
 * in the array, otherwise return false.
 * 
 * Example 1:
 * 
 * Input: nums = [1, 2, 3, 3]
 * 
 * Output: true
 * 
 */
public class ContainsDupicates {
	public static void main(String[] args) {
		int [] nums= {1,3,5,4};
		System.out.println(containsDuplicate(nums));
	}

	private static boolean containsDuplicate(int[] nums) {

		for(int i=1; i<nums.length;i++) {
			int temp=nums[0];
			if(nums[i]!=temp) {
				temp++;
				return false; 
			}
		}
		return true;
	}
	

}
