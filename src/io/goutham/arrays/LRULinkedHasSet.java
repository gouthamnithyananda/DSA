package io.goutham.arrays;

import java.util.LinkedHashSet;

public class LRULinkedHasSet {
	
	
	
	private LinkedHashSet<Integer> hs;
	private int CACHE_SIZE;
	
	LRULinkedHasSet(int size){
		this.CACHE_SIZE=size;
		hs = new  LinkedHashSet<Integer>();
	}

	
	private void refer(int page) {
		
		if(hs.contains(page)) {
			hs.remove(page);
		}else if(hs.size()==CACHE_SIZE) {
			int firstKey = hs.iterator().next();
			hs.remove(firstKey);
		}
		hs.add(page);
	}
	
	private void display() {
		for(Integer i :hs) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		LRULinkedHasSet ca = new LRULinkedHasSet(4);
	        ca.refer(1);
	        ca.refer(2);
	        ca.refer(3);
	        ca.refer(1);
	        ca.refer(4);
	        ca.refer(5);
	        ca.display();

	}

}
