package io.goutham.arrays;

public class EvenOddInteger {
	
	public static void main(String[] args) {
		
		int[] array = {2,1,4,6,2,6,7,5,7,5,6};
		String output="";
		
		for( int i = 0; i<array.length-1;i++) {
			if(i==0)output=String.valueOf(array[i]);
			
			if(array[i]%2==0 && array[i+1]%2==0) {
				output+="*"+String.valueOf(array[i+1]);
			}else if(array[i]%2!=0 && array[i+1]%2!=0) {
				output+="-"+String.valueOf(array[i+1]);
			}else {
				output+=String.valueOf(array[i+1]);
			}
			
		}
		
		System.out.println(output);
	}
 
	

}
