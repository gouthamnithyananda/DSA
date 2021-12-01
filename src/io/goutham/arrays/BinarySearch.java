package io.goutham.arrays;

import java.util.Scanner;

public class BinarySearch {
	private static Scanner s;

	public  final static void main(String[] args) {
		 int[] arr = {16, 19, 20, 23, 45, 56, 78, 90, 96, 100};  
		 s = new Scanner(System.in);
		 System.out.println("Eneter key to search");
		 int searchKey = s.nextInt();
		 Boolean result;
//		  result =BinarySearchUtilrecursion(arr,0,arr.length-1,searchKey);
//		 System.out.println( result);
		  result =BinarySearchUtil(arr,0,arr.length-1,searchKey);
		 System.out.println( result);
		 
		 
		  
		      
		
	}

	private static Boolean BinarySearchUtil(int[] arr, int start, int end, int searchKey) {
         int mid;
		
		while(start<=end) {
			mid = (start+end)/2;
			if(arr[mid]==searchKey) {
				return true;
			}else if(searchKey<arr[mid]) {
				end=mid-1;
			
			}else {
				start = mid+1;
			}
		}
		
		return false;
	}

	private static Boolean  BinarySearchUtilrecursion(int[] arr, int start, int end, int searchKey) {
		
		int mid;
		
		if(start<=end) {
			mid = (start+end)/2;
			if(arr[mid]==searchKey) {
				return true;
			}else if(searchKey<arr[mid]) {
				return BinarySearchUtil(arr,start,mid-1,searchKey);
			}else {
				return BinarySearchUtil(arr,mid+1,end,searchKey);
			}
		}
		
		return false;
	}
}
