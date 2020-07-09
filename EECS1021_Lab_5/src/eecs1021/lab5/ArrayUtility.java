package eecs1021.lab5;

import java.util.*;

/**
 * In this lab you will practice writing methods, using classes from the Java
 * Standard Library, and working with Steing and arrays.
 * 
 * 
 * This ArrayUtility class will help you do things with arrays: 1D and 2D This
 * ArrayUtility class contains a random assortment of methods that should
 * improve your programming skills in using Java Control Structures (selection
 * structures, repetition structures, and nested Loops), 1D and 2D arrays.
 * 
 * <strong>Hint: You may use java.util.Arrays class.</strong>
 *
 */
public class ArrayUtility {
	// ALREADY IMPLEMENTED; DO NOT MODIFY
	private ArrayUtility() {
		// ALREADY IMPLEMENTED; DO NOT MODIFY
	}


	public static int numberOfEvens(int[] inputarray) {
		int count = 0;
		for (int i = 0; i < inputarray.length; i++) {
			if (inputarray[i] % 2 == 0) {
				count++;
			}
		}
		return count;
	}


	public static double avgAreaofRectangeles(Rectangle[] inputarray) {
		int sumArea = 0;

		for (int i = 0; i < inputarray.length; i++) {
			sumArea += inputarray[i].getArea();
		}

		double average = (double) sumArea / (double) inputarray.length;
		return average;
	}


	public static double average2D(int[][] inputarray) {
		int sum = 0, count = 0;
		for (int i = 0; i < inputarray.length; i++) {
			for (int j = 0; j < inputarray[i].length; j++) {
				sum += inputarray[i][j];
				count++;
			}
		}
		return (double) sum / (double) count;
	}

	public static int[] minmax2D(int[][] inputarray) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < inputarray.length; i++) {

			for (int j = 0; j < inputarray[i].length; j++) {
				max = Math.max(max, inputarray[i][j]);
				min = Math.min(min, inputarray[i][j]);
			}

		}

		int[] result = { min, max };

		return result;
	}


	public static double averageOfOdd(int[] inputarray) {
		int count = 0;
		double sum = 0.0;
		for (int i = 0; i < inputarray.length; i++) {
			if (inputarray[i] % 2 == 1) {
				count++;
				sum += (double) inputarray[i];
			}
		}
		return (count == 0 ? 0 : sum / (double) count);
	}

	/**
	 * Implement the method below that takes an array <code>int</code> as input
	 * argument and returns an array of <code>int</code> contains the unique
	 * elements after removing the duplicate elements from the input array. The
	 * order of elements in the returned array is not important, so the array
	 * contains [1, 2, 3] and [3, 2, 1] will be considered similar/same.
	 * 
	 * <p>
	 * <strong> You can assume that the input array is not null and contains at
	 * least 1 one element.</strong>
	 * </p>
	 * <p>
	 * For example:
	 * </p>
	 * 
	 * <pre>
	 * 	if inputarray = {3,4,4,1,2,3,5,6,7,8}  then return [1, 2, 3, 4, 5, 6, 7, 8]
	 * 	if inputarray = {4,2,8,8,9,9,7,8} then return [2, 4, 7, 8, 9]
	 * 	if inputarray = {9,2,8,8,9,9,8,8} then return [2, 8, 9]
	 * 	if inputarray = {1,1,0,1,8,8} then return [0, 1, 8]
	 * </pre>
	 * 
	 * @param inputarray input array of integer
	 * @return array of <code>int</code> contains the unique elements after removing
	 *         the duplicate elements from the input array
	 */

	public static int[] removeDuplicatesElement(int[] inputarray) {
		if (inputarray.length <= 1) {
			return inputarray;
		}

		Arrays.sort(inputarray);

		int unique = 0;

		unique += (inputarray[0] != inputarray[1] ? 1 : 0);

		for (int i = 1; i < inputarray.length; i++) {
			unique += (inputarray[i - 1] != inputarray[i] ? 1 : 0);
		}

		int[] result = new int[unique];

		int index = 1;
		
		if (inputarray[0] != inputarray[1]) {
			result[0] = inputarray[0];
		} else {
			index--;
		}
		
		for (int i = 1; i < inputarray.length; i++) {
			if (inputarray[i - 1] != inputarray[i]) {
				result[index++] = inputarray[i];
			}
		}

		return result;
	}

	
	public static boolean isConsecutive(int[] inputarray) {

		if (inputarray.length > 2) {
			int[] diff = new int[inputarray.length - 1];
			for (int i = 0; i < diff.length; i++) {
				diff[i] = inputarray[i + 1] - inputarray[i];
			}

			for (int j = 0; j < diff.length - 1; j++) {
				if (diff[j + 1] != diff[j]) {
					return false;
				}
			}
			return true;
		}

		return false;
	}

}