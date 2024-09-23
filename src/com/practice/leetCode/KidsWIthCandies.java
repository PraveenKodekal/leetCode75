package com.practice.leetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * There are n kids with candies. You are given an integer array candies, where
 * each candies[i] represents the number of candies the ith kid has, and an
 * integer extraCandies, denoting the number of extra candies that you have.
 * 
 * Return a boolean array result of length n, where result[i] is true if, after
 * giving the ith kid all the extraCandies, they will have the greatest number
 * of candies among all the kids, or false otherwise.
 * 
 * Note that multiple kids can have the greatest number of candies.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: candies = [2,3,5,1,3], extraCandies = 3 Output:
 * [true,true,true,false,true]
 */
public class KidsWIthCandies {
	
	public static void main(String[] args) {
		int []candies= {2,3,5,1,3};
		int extraCandies=3;
		System.out.println(kidsWithCandies(candies, extraCandies));
		
	}

	private static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

		int [] arr=new int[candies.length];
		List<Boolean> list=new ArrayList<>();
		for(int i=0;i<candies.length;i++) {
		arr[i]=candies[i]+extraCandies;
		//System.out.print(arr[i]);
		}
		System.out.println();
		for(int q=0; q<arr.length;q++) {
			int temp=arr[0];
			if(arr[q]<temp) {
				temp=arr[q];
				//System.out.print(false);

				list.add(false);
			}else {
				//System.out.print(true);

				list.add(true);
			}
			//System.out.println(arr[q]);
		}return list;
			
	}

}
