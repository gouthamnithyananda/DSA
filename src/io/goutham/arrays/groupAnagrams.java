package io.goutham.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class groupAnagrams {

	private static Scanner in;

	public static void main(String[] args) {

		in = new Scanner(System.in);

		System.out.println("Enter your number elements: ");
		int n_Elements = in.nextInt();
		String[] array = new String[n_Elements];
		System.out.println("Enter your elements now: ");

		for (int i = 0; i < n_Elements; i++) {
			array[i] = in.next();
		}
		System.out.println("Enetered Elements :");
		System.out.println(Arrays.toString(array));
		List<List<String>> result = new groupAnagrams().groupAnagramsSol(array);
		System.out.println("Final Result : ");
		System.out.println(result);

	}

	public List<List<String>> groupAnagramsSol(String[] strs) {
		List<List<String>> result = new ArrayList<>();

		HashMap<String, List<String>> map = new HashMap<>();
		for (String s : strs) { //loop all elements
			char charArray[] = s.toCharArray(); //convert to char array
			Arrays.sort(charArray); //sort it ,logic is sorting all string based on chars will help us in identifying the groupAnagrams
			String sorted = new String(charArray);
			if (!map.containsKey(sorted)) {
				map.put(sorted, new LinkedList<String>());
			}
			map.get(sorted).add(s);
		}
		for (Map.Entry<String, List<String>> entry : map.entrySet()) {
			List<String> lst = entry.getValue();
			Collections.sort(lst);
			result.add(lst);
		}
		Collections.sort(result, new Comparator<List<String>>() {
         //// sorting the lists of list based on size of innner list
			@Override
			public int compare(List<String> o1, List<String> o2) {
				return Integer.valueOf(o1.size()).compareTo(o2.size());
			}
		});
		return result;
	}
}
