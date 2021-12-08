package io.goutham.strings;

public class MergeStringChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "apple";
		String str2 = "orange";
		StringBuilder result = new StringBuilder();
		

	
		for (int i=0;i<str1.length()||i<str2.length();i++) {
			if(i<str1.length()) {
				result.append(str1.charAt(i));
			}
			if(i<str2.length()) {
				result.append(str2.charAt(i));
			}
		}
		System.out.println(result.toString());
	}

}
