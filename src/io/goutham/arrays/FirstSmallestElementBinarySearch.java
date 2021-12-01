package io.goutham.arrays;

public class FirstSmallestElementBinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int[] arr = {16, 19, 20, 23, 45, 56, 78, 90, 96, 100};  
		 System.out.println(arr[BinarySearchUtil(arr,0,arr.length-1,44)]);
	}
	
	private static int BinarySearchUtil(int[] arr, int start, int end, int searchKey) {
        int mid;
        int tmp=-1;
		
		while(start<=end) {
			mid = start + (end-start)/2;
			 if(arr[mid]>=searchKey) {
				end=mid-1;
				
			}else {
				start=mid+1;
				tmp=mid;
			}
		}
		
		return tmp;
	}


}
