package io.goutham.linkedList;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import io.goutham.arrays.SetMatrixZeros;

//git config user.email goutham9964@gmail.com
public class Test {
	private static Scanner in;
	public static void main(String[] args) {
//		 List<List<String>> result = new Test().groupAnagramsSol(new String[] {"eat","tea","tan","ate","nat","bat"});
//		 System.out.println(result);
		
		
		
//		 List<List<Integer>>  resultThreesum = new Test().threeSum(new int[] {-1,0,1,2,-1,-4});
//		 System.out.println(resultThreesum);
		
	
		
		
		
		
//		in = new Scanner(System.in);
//
//		System.out.println("Enter your number Columns: ");
//		int columns= in.nextInt();
//		
//		System.out.println("Enter your number Rows: ");
//		int rows= in.nextInt();
//		
//		int[][] matrix = new int[columns][rows];
//		
//		for(int i=0;i<columns;i++) {
//			System.out.println("Enter values for "+i+" Column");
//			for(int j=0;j<rows;j++) {
//				matrix[i][j]= in.nextInt();
//			}
//			System.out.println("Values for "+i+" Column enetered");
//		}
//		System.out.println("Enter Matrix is: ");
//		System.out.println(Arrays.deepToString(matrix));
//		int[][] results = new Test().setZeroes(matrix);
//		System.out.println("Final Output Matrix is: ");
//		System.out.println(Arrays.deepToString(results));

		
		int i=new Test().lengthOfLongestSubstring("pwwkew");
		System.out.println(i);
		 
	}
	
	public List<List<String>> groupAnagramsSol(String[] strs) {
		List<List<String>> result = new ArrayList<List<String>>();
		Map<String,LinkedList<String>> anagrmMap= new HashMap<String,LinkedList<String>>();
		for ( String str: strs) {
			char[] charArray = str.toCharArray();
			Arrays.sort(charArray);
			String sortedStr = new String(charArray);
			if(!anagrmMap.containsKey(sortedStr)) {
				anagrmMap.put(sortedStr,new LinkedList<String>());
			}
			anagrmMap.get(sortedStr).add(str);
		}
		for(String e : anagrmMap.keySet()) {
			List<String> grpLst =  new ArrayList<String>();
			for(String val:anagrmMap.get(e))
			{
				grpLst.add(val);
			}
			result.add(grpLst);
		}
		return result;
		
	}
	
	 public List<List<Integer>> threeSum(int[] nums) {
		 List<List<Integer>> result = new ArrayList<List<Integer>>();
		 int secondplace;
		 int thirdplace;
		 int firstplace;
		 int sum;
		 Arrays.sort(nums);
		 for( int i=0;i<=nums.length-2;i++) {
			 if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
			 firstplace= i;
			 secondplace= i+1;
			 thirdplace = nums.length-1;
			 while(secondplace<thirdplace) {
				 sum = nums[firstplace]+nums[secondplace]+nums[thirdplace];
				 if(sum==0) {
					 result.add(Arrays.asList(new Integer[] 
							 {
					nums[firstplace],nums[secondplace],nums[thirdplace]}));
					 while (secondplace < thirdplace && (nums[secondplace] == nums[secondplace + 1]))
					 { secondplace += 1;}
						while (secondplace < thirdplace && (nums[thirdplace] == nums[thirdplace - 1]))
							{thirdplace -= 1;}
						
						secondplace += 1;
						thirdplace -= 1;
				 }else if(sum>0) {
					 
					 thirdplace-=1;
					
				 }else {
					 secondplace+=1;
				 }
			 }
			 }
		 }
		 
		 return result;
	 }
	 
	 public int[][] setZeroes(int[][] matrix) {
		 
		 int rowsize = matrix.length;
		 if(rowsize==0)return matrix;
		 int columnsize = matrix[1].length;
		 
		 List<List<Integer>> zeroLocation = new ArrayList<List<Integer>>();
		 
		 for (int i=0;i<rowsize;i++) {
			for(int j=0;j<columnsize;j++) {
				if(matrix[i][j]==0) {
					zeroLocation.add(Arrays.asList(new Integer[] {i,j}));
				}
			}
		 }
		 
		 for (int k=0;k<zeroLocation.size();k++) {
			 for (int i=0;i<rowsize;i++) {
				matrix[i][zeroLocation.get(k).get(1)]=0;
			 }
			 for(int j=0;j<columnsize;j++) {
					matrix[zeroLocation.get(k).get(0)][j]=0;
				 }
		 }
		 return matrix;
	 }
	 public int lengthOfLongestSubstring(String s) {
	    	int max=0;
	    	int a_pointer=0;
	    	int b_pointer=0;
	    	HashSet<Character> chSet = new HashSet<Character>();
	    	char[] chArray = s.toCharArray();
	    	while(a_pointer<chArray.length) {
	    		if(!chSet.contains(chArray[a_pointer])) {
	    			chSet.add(chArray[a_pointer]);
	    			a_pointer++;
	    			max= Math.max(max, chSet.size());
	    		}else {
	    			chSet.remove(chArray[b_pointer]);
	    			b_pointer++;
	    		}
	    	}
	    	
	    	return max;
	    }

}
