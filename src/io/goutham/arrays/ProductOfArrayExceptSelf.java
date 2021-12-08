package io.goutham.arrays;

public class ProductOfArrayExceptSelf {

	/*
	 * Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.

 

Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]
Example 2:

Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]
	 */
	public static void main(String[] args) {
		int[] results = productExceptSelf( new int[] {-1,1,0,-3,3});
		for(int i:results) System.out.println(i);
		


	}

	
    static public int[] productExceptSelf(int[] nums) {
    	
    	int[] results = new int[nums.length];
    	int product = 1;
    	for(int i : nums) {
    		product = product* i;
    	}
    	for(int j=0;j<nums.length;j++) {
    		if(nums[j]!=0 ) {
    			results[j]=product/nums[j];
    		}else {
    			int p=1;
    			for(int k=0;k<nums.length;k++) {
    				if(j!=k) p=p*nums[k];
    			}
    			results[j]=p;
    		}
    	}
    	
    	return results;
        
    }
}
