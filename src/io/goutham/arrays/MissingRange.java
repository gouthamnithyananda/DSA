package io.goutham.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MissingRange {

	private static Scanner in;

	public static void main(String[] args) {

		in = new Scanner(System.in);

		System.out.println("Enter your lower Bound Columns: ");
		int lowerBound = in.nextInt();

		System.out.println("Enter your higher Bound Columns: ");
		int higherBound = in.nextInt();

		System.out.println("Enter size of the Array: ");
		int n_Elements = in.nextInt();
		int[] array = new int[n_Elements];
		System.out.println("Enter your elements now: ");

		for (int i = 0; i < n_Elements; i++) {
			array[i] = in.nextInt();
		}
		System.out.println("Enetered Elements :");
		System.out.println(Arrays.toString(array));

		List<String> result = new MissingRange().missingRangeSolution(array, lowerBound, higherBound);
		System.out.println(result);
	}

	public List<String> missingRangeSolution(int[] nums, int lowerBound, int higherBound) {
		List<String> res = new ArrayList<String>();
		int next = lowerBound;

		int diff = 0;
		for (int i = 0; i < nums.length; i++) {
			diff = nums[i] - next;
			if (diff <= 1) {
				next = nums[i];
				continue;
			} else if (diff == 2) {
				res.add(String.valueOf(next + 1));
				next = nums[i];
				continue;
			} else {
				res.add(String.format("%d->%d", next + 1, nums[i] - 1));
				next = nums[i];
			}
		}
		if (next < higherBound) {
			res.add(String.format("%d->%d", next + 1, higherBound));
		}
		return res;
	}

}
