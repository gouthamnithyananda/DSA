package io.goutham.strings;

import java.util.Scanner;

public class CheckIpV4Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "";
		Scanner in = new Scanner(System.in);
		if(in.hasNext()) input = in.next();
		 String PATTERN = "^((0|1\\d?\\d?|2[0-4]?\\d?|25[0-5]?|[3-9]\\d?)\\.){3}(0|1\\d?\\d?|2[0-4]?\\d?|25[0-5]?|[3-9]\\d?)$";
		 System.out.println(input.matches(PATTERN));

	}
	
	

}
