package io.goutham.arrays;

public class IncreasingTriplet {

	public static void main(String[] args) {
		int[] array = new int[] { 2, 4, -2, -3 };
		System.out.println(new IncreasingTriplet().increasingTripletSolution(array));
	}

	public boolean increasingTripletSolution(int[] nums) {

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
