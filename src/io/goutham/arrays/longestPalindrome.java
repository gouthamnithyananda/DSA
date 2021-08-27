package io.goutham.arrays;

import java.util.Scanner;

public class longestPalindrome {

	int resultStart;
    int resultLength;

	private static Scanner in;
	public static void main(String[] args) {
		

		in = new Scanner(System.in);

		System.out.println("Enter your String now: ");
		String str= in.next();
		System.out.println("String eneterd : " +str);
     String result = new longestPalindrome().longestPalindromeSolution(str);
     System.out.println(result);
    		 

	}

    public String longestPalindromeSolution(String s) {
        int strLength = s.length();
        if(strLength<2){ //handling the base case where string has single chars or less
            return s;
        }
        for (int begin=0;begin<strLength-1;begin++){
            expandRange(s,begin,begin);
             expandRange(s,begin,begin+1);
            
        }
        return s.substring(resultStart,resultStart+resultLength);
    }
    public void expandRange(String str, int begin,int end){
        while(begin>=0 && end<str.length() && str.charAt(begin)==str.charAt(end)){
            begin--;
            end++;
        }
        if(resultStart<end-begin-1){
            resultStart=begin+1;
            resultLength=end-begin-1;
        }
    }
}
