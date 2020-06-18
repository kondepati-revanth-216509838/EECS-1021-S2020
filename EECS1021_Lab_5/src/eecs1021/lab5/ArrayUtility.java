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

	/**
	 * 
	 * 
	 * Implement the method below which takes an array of <code>int</code> numbers
	 * as input argument and returns the number of even numbers in the array
	 * argument. <strong>Your code should use a for loop.</strong>
	 * <p>
	 * For example:
	 * </p>
	 * 
	 * <pre>
	 * if array1 = {9, 10, 3, 4, 3} then 	return 2
	 * if array1 = { 1, 6, 1}  then  return 1
	 * if array1 = { 4, 24, 46, 0} then  return 4
	 * if array1 = { 15, 9, 45, 57}  then  return 0
	 * </pre>
	 * 
	 * 
	 * @param inputarray : int input array
	 * @return returns the number of even numbers in the array argument.
	 */

	public static int numberOfEvens(int[] inputarray) {
		int count = 0;
		for (int i = 0; i < inputarray.length; i++) {
			if (inputarray[i] % 2 == 0) {
				count++;
			}
		}
		return count;
	}

	/**
	 * Given class <strong><code>Rectangle</code></strong> defined in same package
	 * <code>eecs1021.lab5</code>
	 * 
	 * <p>
	 * Implement the method below which takes an array of <code>Rectangle</code>
	 * objects as input argument and returns the average area of these rectangle
	 * objects.
	 * </p>
	 * <p>
	 * <strong> You can assume that the input array is not null and contains at
	 * least 1 one rectangle object.</strong>
	 * </p>
	 * 
	 * @param inputarray Array of Rectangle object
	 * @return the average area of these rectangle objects.
	 */

	public static double avgAreaofRectangeles(Rectangle[] inputarray) {
		int sumArea = 0;

		for (int i = 0; i < inputarray.length; i++) {
			sumArea += inputarray[i].getArea();
		}

		double average = (double) sumArea / (double) inputarray.length;
		return average;
	}

	/**
	 * 
	 * Implement the method below which takes a 2D array of <code>int</code> numbers
	 * as input argument and returns the average of its elements.
	 * <p>
	 * <strong> You can assume that the input array is not null and contains at
	 * least 1 one element.</strong>
	 * </p>
	 * <p>
	 * For example:
	 * </p>
	 * 
	 * <pre>
	 * 	if inputarray = {{9, 2, 3, 4}, {1, 2, 3, 45}, {1, 222, 333, -4}} then return 51.75
	 * 	if inputarray = {{1, 4}, {12, 42}} then return 14.75
	 * 	if inputarray = {{20}, {4, 2, 12}} then return 9.5
	 * 	if inputarray = {{81, 28, 4}, {2, 33, -42}, {1, -22,-4}} then return 9.0
	 * </pre>
	 * 
	 * @param inputarray 2D input array of integers
	 * @return the average of its elements.
	 */

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

	/**
	 * Implement the method below which takes a 2D array of <code>int</code> numbers
	 * as input argument then finds out its maximum and minimum values, and return
	 * sorted array contains the minimum and maximum values, respectively.
	 * <p>
	 * <strong> You can assume that the input array is not null and contains at
	 * least two elements.</strong>
	 * </p>
	 * <p>
	 * For example:
	 * </p>
	 * 
	 * <pre>
	 * 	if inputarray = {{9, 2, 3, 4}, {1, 2, 3, 45}, {1, 222, 333, -4}} then return [-4, 333]
	 * 	if inputarray = {{1, 4}, {12, 42}} then return [1, 42]
	 * 	if inputarray = {{20}, {4, 2, 12}} then return [2, 20]
	 * 	if inputarray = {{81, 28, 4}, {2, 33, -42}, {1, -22,-4}} then return [-42, 81]
	 * </pre>
	 * 
	 * @param inputarray 2D input array of integers
	 * @return sorted array contains the minimum and maximum values, respectively.
	 */

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

	/**
	 * 
	 * This averageOfOdd method received an array of integers, then calculate the
	 * average of the odd elements of this array.
	 * <p>
	 * <strong> You can assume that the array is not empty and contains at least 1
	 * one element.</strong>
	 * </p>
	 * <p>
	 * For example:
	 * </p>
	 * 
	 * <pre>
	 *		if inputarray = {3, 6}   then 	return 3.0
	 *		if inputarray = { 1, 1, 1}   then 	return 1.0
	 *		if inputarray = { 2, 4, 6, 3}  then  	return 3.0
	 *		if inputarray = { 11, 25, 12, 50}  then  	return 18.0
	 * </pre>
	 * 
	 * 
	 * @param inputarray the input array of integers
	 * @return the average of the ODD elements of the input array of integers, the
	 *         average of type double
	 */
	public static double averageOfOdd(int[] inputarray) {
		int count = 0;
		double sum = 0.0;
		for (int i = 0; i < inputarray.length; i++) {
			if (inputarray[i] % 2 == 1) {
				count++;
				sum += (double) inputarray[i];
			}
		}
		if (count == 0) {
			return 0;
		}
		return sum / (double) count;
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
		// edit
		
		//If there's only one number, return it right away
		if (inputarray.length == 1) {
			return inputarray;
		}
		
		printarray("Initial: ", inputarray);
		
		//Sort by ascending order
		for (int i = 0; i < inputarray.length - 1; i++) {
			for (int j = i; j < inputarray.length - 1; j++) {
				if (inputarray[j] > inputarray[j + 1]) {
					int temp = inputarray[j + 1];
					inputarray[j + 1] = inputarray[j];
					inputarray[j] = temp;
				}
			}
		}
		printarray("Sorted: ", inputarray);
		//Check how many unique numbers are there
		int truesize = 0;
		for (int i = 0; i < inputarray.length; i++) {
			if (i < inputarray.length - 1) {
				if (inputarray[i] != inputarray[i + 1]) {
					truesize++;
				}
			}
			
			if (i == inputarray.length - 1) {
				if (inputarray[i - 1] != inputarray[i]) {
					truesize++;
				}
			}
		}
		
		//Collect them
		int[] result = new int[truesize];
		int index = 0;
		for (int i = 0; i < inputarray.length; i++) {
			if (i < inputarray.length - 1 && inputarray[i] != inputarray[i + 1]) {
				result[index] = inputarray[i];
				index++;
			}
			
			if (i == inputarray.length - 1 && inputarray[i - 1] != inputarray[i]) {
				result[index] = inputarray[i];
				index++;
			}
		}
		
		printarray("Filtered: ", result);
		System.out.println();
	
		return result;
		//sorting reference link: https://stackabuse.com/sorting-algorithms-in-java/#insertionsort
	}
	
	
	static void printarray(String heading, int[] array) {
		System.out.println(heading);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	/**
	 * 
	 * Implement the method below that takes an array of <code>int</code> numbers as
	 * input argument and returns true if all elements belonging to this input array
	 * are in a sequence of increasing consecutive integers and returns false
	 * otherwise. Consecutive integers are integers that come one after the other,
	 * as in 5, 6, 7, 8, 9, etc.
	 * <p>
	 * <strong> You can assume that the input array is not empty and contains at
	 * least 1 one element.</strong>
	 * </p>
	 * <p>
	 * For example:
	 * </p>
	 * 
	 * <pre>
	 * if inputarray = {6, 7, 8, 9} then return true
	 * if inputarray = { 6, 7, 8, 9, 2, 9} then return false
	 * if inputarray = { 1, 1, 1, 1}  then return false
	 * if inputarray = { 2, 3, 4, 5} then return true
	 * </pre>
	 * 
	 * 
	 * 
	 * @param inputarray input array of integer
	 * @return true if all elements belonging to this input array are in a sequence
	 *         of increasing consecutive integers and returns false otherwise.
	 */

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
