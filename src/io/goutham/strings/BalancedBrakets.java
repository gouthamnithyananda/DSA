package io.goutham.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class BalancedBrakets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int count = 0;
		
		Scanner in = new Scanner(System.in);
		if(in.hasNext()) count = in.nextInt();
		
		for(int i=0;i<count;i++) {
		String input=null;
		Boolean empty=false;
		Boolean match=true;
		Stack<Character> s = new Stack<Character>();
		if(in.hasNext())input=in.next();
		for(int k=0;k<input.length();k++) {
			char c = input.charAt(k);
			
			if(c=='('||c=='{'||c=='[') {
				s.push(c);
			}else if(s.isEmpty()){
				empty=true;
				break;
			}else if(c==')') {
				if(s.pop()!='(') {
					match=false;
					break;
				}
			}else if(c=='}') {
				if(s.pop()!='{') {
					match=false;
					break;
				}
			}else if(c==']') {
				if(s.pop()!='[') {
					match=false;
					break;
				}
			}
		}
		
		if(empty || !match) {
			System.out.println("NO");
		}else {
			System.out.println("YES");
		}
		
		}

	}

}
