package io.goutham.arrays;

public class SmallestElememntRoatedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int[] arr = { 20, 23, 45, 56, 78, 90, 96, 100,16, 19}; 
		 int smallindex = findSmallIndex(arr);
		 System.out.println(arr[smallindex]);

	};
	
	
	static public int findSmallIndex(int[] arr) {
		int start =0;
		int end = arr.length-1;
		int small = -1;
		int n =arr.length;
		
		while(start<=end) {
			int mid = start + (end-start)/2;
			
			if(arr[mid]<arr[(mid+n-1)%n] && arr[mid]<arr[(mid+1)%n]) {
				return mid;
			}
			if(arr[mid]>arr[start]) {
				start=mid+1;
			}else if(arr[mid]<arr[end]) {
				end=mid-1;
			}
			}
		
		return small;
	}

}
