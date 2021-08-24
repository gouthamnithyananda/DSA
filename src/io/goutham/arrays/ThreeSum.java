package io.goutham.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ThreeSum {

	private static Scanner in;

	public static void main(String[] args) {

		in = new Scanner(System.in);

		System.out.println("Enter your number elements: ");
		int n_Elements = in.nextInt();
		int[] array = new int[n_Elements];
		System.out.println("Enter your elements now: ");

		for (int i = 0; i < n_Elements; i++) {
			array[i] = in.nextInt();
		}
		System.out.println("Enetered Elements :");
		System.out.println(Arrays.toString(array));
		List<List<Integer>> result = new ThreeSum().threeSumCal(array);
		System.out.println("Final Result : ");
		System.out.println(result);

	}

	public List<List<Integer>> threeSumCal(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();
		Arrays.sort(nums);
		for (int i = 0; i <= nums.length - 2; i++) {
			if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {//check and skip for duplicates
				int left = i + 1;//left pointer is i+1
				int right = nums.length - 1;//Right pointer is last element
				int currentSum = nums[i] + nums[left] + nums[right];
				while (left < right) {
					currentSum = nums[i] + nums[left] + nums[right];
					if (currentSum == 0) {
						result.add(Arrays.asList(new Integer[] { nums[i], nums[left], nums[right] }));
						while (left < right && (nums[left] == nums[left + 1]))
							left += 1;
						while (left < right && (nums[right] == nums[right - 1]))
							right -= 1;
						;
						left += 1;
						right -= 1;
					} else if (currentSum > 0) {
						right -= 1;

					} else {
						left += 1;
					}
				}
			}
		}
		return result;
	}

}
