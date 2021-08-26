package io.goutham.arrays;

import java.util.HashSet;
import java.util.Scanner;

public class LongestSubstring {

	private static Scanner in;
	public static void main(String[] args) {
		
		in = new Scanner(System.in);

		System.out.println("Enter your String now: ");
		String str= in.next();
		
		System.out.println("Enterd value: " + str);
		
		int result = new LongestSubstring().lengthOfLongestSubstring(str);
		
		System.out.println(result);

	}
	
	public int lengthOfLongestSubstring(String s) {
        int a_pointer=0;
        int b_pointer=0;
        int max=0;
        HashSet<Character> hashset = new HashSet<Character>();
        while(b_pointer<s.length()){
            if(!hashset.contains(s.charAt(b_pointer))){
                hashset.add(s.charAt(b_pointer));
                b_pointer++;
                max = Math.max(hashset.size(),max);          
            }else{
                hashset.remove(s.charAt(a_pointer));
                a_pointer++;
            }
            
        }
        
        return max;
        
    }

}
