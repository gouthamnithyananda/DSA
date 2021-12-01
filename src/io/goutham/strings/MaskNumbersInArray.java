package io.goutham.strings;

import java.util.LinkedList;
import java.util.Queue;

public class MaskNumbersInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//mask every 2nd alternative element in an array until element in array is one
		System.out.println(mask(new int[] {1,2,3,4,5,6,7}, 2));

	}
	
	static public int mask(int[] arr, int round) {
		
		Queue<Integer> tmpQ = new LinkedList<Integer>();
		
		for(int i:arr)tmpQ.add(i);
		
		while(tmpQ.size()>1) {
			int k;
			for(k=1;k<round;k++) {
				tmpQ.add(tmpQ.poll());
			}
			if(k==round)tmpQ.remove();
		}
		
		System.out.println(tmpQ.peek());
		
		return tmpQ.peek();
		
	}

}
