package io.goutham.arrays;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

	public static void main(String[] args) {
		 Boolean result=containsDuplicate(new int[] {7,1,5,3,6,1,4});
			
		 System.out.println(result);

	}

	static public boolean containsDuplicate(int[] nums) {
        Set<Integer> hs = new HashSet<Integer>();
        for(int i:nums) {
        	if(!hs.contains(i)) {
        		hs.add(i);
        	}else {
        		return true;
        	}
        }
        return false;
    }
}
