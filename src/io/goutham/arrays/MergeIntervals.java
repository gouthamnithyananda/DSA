package io.goutham.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MergeIntervals {

	public static void main(String[] args) {
		List<List<Integer>> lst = new ArrayList<List<Integer>>();
		lst.add(new ArrayList<Integer>(Arrays.asList(12,15)));
		lst.add(new ArrayList<Integer>(Arrays.asList(1,3)));
		lst.add(new ArrayList<Integer>(Arrays.asList(2,6)));
		lst.add(new ArrayList<Integer>(Arrays.asList(8,10)));
		lst.add(new ArrayList<Integer>(Arrays.asList(9,11)));
		
		System.out.println(merge(lst));

	}
	
	static public List<List<Integer>> merge (List<List<Integer>> in) {
		LinkedList<List<Integer>> rs = new LinkedList<List<Integer>> ();
		
		Collections.sort(in,(a,b)->Integer.compare(a.get(0), b.get(0)));
		
		for(List<Integer> lst : in) {
			if(rs.isEmpty()|| rs.getLast().get(1)<lst.get(0)) {
				rs.add(lst);
			}else {
				rs.getLast().set(1, lst.get(1));
			}
		}
		List<List<Integer>> lst = new ArrayList<List<Integer>>();
		for(List<Integer> tmp:rs) {
			System.out.println(tmp);
			lst.add(tmp);
		}
		return lst;
		
	}

}
