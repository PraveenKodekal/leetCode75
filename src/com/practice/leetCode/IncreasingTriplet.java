package com.practice.leetCode;

/**Given an integer array nums, return true if there exists a triple of indices (i, j, k) such that i < j < k and nums[i] < nums[j] < nums[k]. If no such indices exists, return false.

 

Example 1:

Input: nums = [1,2,3,4,5]
Output: true
Explanation: Any triplet where i < j < k is valid.
Example 2:

Input: nums = [5,4,3,2,1]
Output: false
Explanation: No triplet exists.
 * 
 */
public class IncreasingTriplet {
	public static void main(String[] args) {
		int [] arr= {20,100,10,12,5,13};
		boolean triplet=increasingTriplet(arr);
		System.out.println(triplet);
	}

	private static boolean increasingTriplet(int[] arr) {
		for(int i=1; i<=arr.length-3;i++) {
			for(int j=2;j<=arr.length-2;j++) {
				if(arr[i]<arr[j]) {
					for(int k=3;k<=arr.length-1;k++) {
						if(arr[j]<arr[k]) {
							return true;
						}
					}
				}
			}
			
		}
		
		return false;
	}

}














