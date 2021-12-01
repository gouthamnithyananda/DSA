package io.goutham.arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int[] result=twoSumOptimized(new int[] {2,7,11,15},13);
		 for(int i: result) {
			 System.out.println(i);
		 }

	}
	
	static  public int[] twoSumBruteForce(int[] nums, int target) {
	       int[] result = new int[2];
	       
	       for(int i =0;i<nums.length;i++) {
	    	   for(int j=i+1;j<nums.length;j++) {
	    		   if(nums[i]+nums[j]==target) {
	    			   result[0]=i;
	    			   result[1]=j;
	    			   return result;
	    		   }
	    	   }
	       }
	       
	       return result;
	        
	    }
	
	static  public int[] twoSumOptimized(int[] nums, int target) {
	       int[] result = new int[2];
	       Map<Integer,Integer> hs = new HashMap<Integer,Integer>();
	       for(int i =0;i<nums.length;i++) {
	    	if(hs.containsKey(target-nums[i])) {
	    		
	    		result[0]=hs.get(target-nums[i]);
	    		result[1]=i;
	    		
	    		return result;
	    		
	    	}else {
	    		hs.put(nums[i],i);
	    	}
	       }
	       
	       return result;
	        
	    }

}
