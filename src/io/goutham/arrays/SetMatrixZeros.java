package io.goutham.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SetMatrixZeros {
	
	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);

		System.out.println("Enter your number Columns: ");
		int columns= in.nextInt();
		
		System.out.println("Enter your number Rows: ");
		int rows= in.nextInt();
		
		int[][] matrix = new int[columns][rows];
		
		for(int i=0;i<columns;i++) {
			System.out.println("Enter values for "+i+" Column");
			for(int j=0;j<rows;j++) {
				matrix[i][j]= in.nextInt();
			}
			System.out.println("Values for "+i+" Column enetered");
		}
		System.out.println("Enter Matrix is: ");
		System.out.println(Arrays.deepToString(matrix));
		int[][] results = new SetMatrixZeros().setZeroes(matrix);
		System.out.println("Final Output Matrix is: ");
		System.out.println(Arrays.deepToString(results));

	}

	
		public int[][] setZeroes(int[][] matrix) {

			int c = matrix.length;//number of columns
			int r = matrix[0].length;//number of rows
			List<List<Integer>> zeroLst = new ArrayList<>();//an List to maintain the zero location
			for (int i = 0; i < c; i++) {
				for (int j = 0; j < r; j++) {
					if (matrix[i][j] == 0) {
						zeroLst.add(Arrays.asList(new Integer[] { i, j }));
					}
				}
			}

			for (int i = 0; i < zeroLst.size(); i++) {
				for (int p = 0; p < r; p++) {
					matrix[zeroLst.get(i).get(0)][p] = 0;//mark the column values to zero
				}
				for (int k = 0; k < c; k++) {
					matrix[k][zeroLst.get(i).get(1)] = 0;//mark the row values to zero
				}
			}
			return matrix;
		}
	}


