package io.goutham.strings;

public class MaxDiffBtwIncreasingElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(maximumDifference(new int[] {7,1,5,4}));
	}
	
	 static public int maximumDifference(int[] nums) {
	        int result=-1;
	        int min = Integer.MAX_VALUE;
	        for(int i=0;i<nums.length;i++){
	           if(min>nums[i]) {
	        	   min=nums[i];
	           }else {
	        	   result = Math.max(result, nums[i]-min);
	           }
	           
	           
	           
	        }
	        return result;
	    }

}
