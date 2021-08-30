package io.goutham.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class IncreasingTriplet {
	
	private static Scanner in;

	public static void main(String[] args) {
		

		in = new Scanner(System.in);

		System.out.println("Enter The length of Array: ");
		int arrLenght= in.nextInt();
		System.out.println("Array Length : " +arrLenght);
		int[] array = new int[arrLenght];
		System.out.println("Enter your elements now: ");

		for (int i = 0; i < arrLenght; i++) {
			array[i] = in.nextInt();
		}
		System.out.println("Enetered Elements :");
		System.out.println(Arrays.toString(array));
		
		
		System.out.println(new IncreasingTriplet().increasingTripletSolution(array));
	}

	public boolean increasingTripletSolution(int[] nums) {
		if(nums.length<3) return false;//base case

		int firstMin = Integer.MAX_VALUE;
		int secondMin = Integer.MAX_VALUE;

		for (int num : nums) {
			if (num <= firstMin) {
				firstMin = num; // This will always have first minimum
				continue;
			} else if (num <= secondMin) {
				secondMin = num;// This will always have second minimum
				continue;
			} else {
				return true; // Execution will come when a number is greater than First and second minimum
								// hence return true
			}
		}

		return false;

	}

}
