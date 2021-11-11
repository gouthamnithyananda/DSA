package io.goutham.strings;


import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonDuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str ="apple";
		char[] array = str.toCharArray();
		Map<Character,Integer> countMap = new LinkedHashMap<Character,Integer>();
		
		for(char c:array) {
			if(countMap.get(c)==null) {
				countMap.put(c, 1);
			}else {
				countMap.put(c, countMap.get(c)+1);
			}
		}
		System.out.println(countMap);
		for(Character key:countMap.keySet()) {
			if(countMap.get(key)==1) {
				System.out.println(key);
				return;
			}
		}
	}

}
