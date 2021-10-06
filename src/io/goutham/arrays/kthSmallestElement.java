package io.goutham.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class kthSmallestElement {
	
	public static void main(String[] args) {
		
		int[] array = {9,3,2,7,2,5,3,8};
		System.out.println(new kthSmallestElement().kthSmallestElementIs(array, 4));
	}

	private int kthSmallestElementIs(int[] array,int k) {
		
		Arrays.sort(array);
		Set arraySet = new HashSet<Integer>();
		
		for(int i:array)arraySet.add(i);
		
		return (int) arraySet.toArray()[k-1];
		
	}
}
