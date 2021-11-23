package io.goutham.arrays;

import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;

public class LRUCache {
	
	private Deque<Integer> doubkyQueue;
	private HashSet<Integer> hashSet;
	private int CACHE_SIZE;
	
	LRUCache(int size){
		doubkyQueue = new LinkedList<Integer>();
		hashSet = new HashSet<Integer>();
		this.CACHE_SIZE=size;
	}
	
	
	public void refer(int page) {
		
		if(!hashSet.contains(page)) {
			if(hashSet.size()==this.CACHE_SIZE) {
				int lastPage = doubkyQueue.removeLast();
				hashSet.remove(lastPage);
			}
		}else {
			 doubkyQueue.remove(page);
			hashSet.remove(page);
		}
		
		doubkyQueue.add(page);
		hashSet.add(page);
		
	}
	

	public static void main(String[] args) {
		LRUCache cache = new LRUCache(4);
        cache.refer(1);
        cache.refer(2);
        cache.refer(3);
        cache.refer(1);
        cache.refer(4);
        cache.refer(5);
        cache.refer(2);
        cache.refer(2);
        cache.refer(1);
        cache.display();

	}


	private void display() {
		for(Integer i :hashSet) {
			System.out.println(i);
		}
		
	}
	
	
	

}
