package io.goutham.arrays;

public class SubStringChk {

	public static void main(String[] args) {
		String s1 = "for";
		String s2 = "fo0rest";
		System.out.println(new SubStringChk().isSubString(s1,s2));
	}
	
	private Boolean isSubString( String s1,String s2) {
		
		if(s1==null || s2==null) return false;
		
		int s1Len = s1.length();
		int s2Len = s2.length();
		
		for (int i=0;i<=s2Len-s1Len;i++) {
			System.out.println(s2.charAt(i));
			for (int j=0;j<s1Len;j++) {
				if(s2.charAt(i+j)!=s1.charAt(j))break;
				if(j==s1Len-1) return true;
			}
		}
		
		return false;
	}

}
