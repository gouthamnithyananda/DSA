package io.goutham.arrays;


import java.util.Arrays;
import java.util.List;

public class ActivateFountain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(fountainActivation1(Arrays.asList(new Integer[] {3,1,1,1})));
		

	}
	

	 public static int fountainActivation2(List<Integer> locations) {
		int tap=0;
		int min=0;
		int max=0;
		int n = locations.size();
		while(max<n) {
			for(int i=0;i<n;i++) {
				if(i-locations.get(i)<=min && i+locations.get(1)>max) {
					max=i+locations.get(1);
				}
			}
			 if(min==max)return -1;
			tap++;
			min=max;
		}
		return tap;
	 }
	
	 public static int fountainActivation1(List<Integer> locations) {
		
		    int n = locations.size();
		    int[] arr = new int[n];
		    for(int i=0;i<n;i++){
		        arr[i]=locations.get(i);
		    }
		    int[] interval = new int[n];
		    int count =1;
		    for( int i=1;i<=n;i++){
		        int left = Math.max(i-arr[i-1],1);
		        int right = Math.min(i+arr[i-1], n);
		        interval[left-1]=right;
		    }
		    int right = interval[0];
		    int currMax = right;
		    for(int i=1;i<n;i++){
		        currMax = Math.max(currMax, interval[i]);
		        if(i==right){
		            count++;
		            right = currMax;
		        }
		    }
		    return count;
		   
	 }
	
	


}
