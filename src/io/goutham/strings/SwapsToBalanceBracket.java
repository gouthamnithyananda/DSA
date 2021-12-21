package io.goutham.strings;

import java.util.LinkedList;
import java.util.Queue;

public class SwapsToBalanceBracket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int minimumSwaps(String brackets) {
	    // Write your code here
	    System.out.println(brackets);
	    if(brackets.length()%2!=0) return -1;
	    
	    Queue<Character> q = new LinkedList<Character>();
	    int counter=0;
	    for(Character c: brackets.toCharArray()){
	      //  System.out.println(c);
	        if(c=='('){
	            if(counter>0){
	             --counter; 
	               
	            }else{
	                 q.add(c); 
	            }
	         
	          
	        //    System.out.println("adding");
	        }else if(c==')'){
	            if(!q.isEmpty()){
	                q.remove();
	             //    System.out.println("removing");
	            }else{
	               counter++; 
	            //    System.out.println("incrementing");
	            }
	        }
	    }
  return counter;
	}
}
