package io.goutham.arrays;

public class DutchNationalFlagAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] result=sort(new int[] {1,1,2,0,1,1,0,2,1});
		for(int i :result)
		System.out.println(i);
		
		System.out.println("***********");
		int[] result1=sort(new int[] {1,1,0,0,1,1,0,1,1,0});
		for(int i :result1)
		System.out.println(i);
	}
	
	
	
	static int[] sort(int[] arr) {
		int low=0;
		int mid=0;
		int high=arr.length-1;
		
		while(mid<=high) {
			
			if(arr[mid]==0) {
			   arr[mid]=arr[low];
			   arr[low]=0;
			   ++low;
			   ++mid;
			}else if(arr[mid]==2) {
				arr[mid]=arr[high];
				   arr[high]=2;
				   --high;
				   ++mid;
			}else {
				++mid;
			}
		}
		
		return arr;
	}
	
	static int[] sort011s(int[] arr) {
		int low=0;
		int high=0;
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[high]==0) {
			   arr[high]=arr[low];
			   arr[low]=0;
			   ++low;
			   ++high;
			}else {
				++high;
			}
		}
		
		return arr;
	}

}
