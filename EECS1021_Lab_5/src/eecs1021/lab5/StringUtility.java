package eecs1021.lab5;

import java.util.Arrays;

/* Methods to program:
 *  removeDuplicatesChar -- Easy to work on (logic)
 *  removeConsecutiveDuplicates -- algorithm trouble
 *  compressString -- create an algorithm :)
 * */


/**
 * In this lab you will practice writing methods, using classes from the Java
 * Standard Library, and working with arrays and Strings.
 * 
 * 
 * This StringUtility class will help you do things with string object. This
 * StringUtility class contains a random assortment of methods that should
 * improve your programming skills in using Java Control Structures (selection
 * structures, repetition structures, and nested Loops), String.
 * 
 * <strong>Hint: You may use java.util.Arrays class.</strong>
 *
 */
public class StringUtility {
	// ALREADY IMPLEMENTED; DO NOT MODIFY
	private StringUtility() {
		// ALREADY IMPLEMENTED; DO NOT MODIFY
	}

	/**
	 * 
	 * Implement the method below that takes a String <code>str</code> as input
	 * argument and returns number of digits in the given input String. Digits is
	 * any integer between <code>0</code> and <code>9</code>.
	 * <p>
	 * <strong> You can assume that the input String is not null and has length
	 * equal of 1 (at least 1 one character).</strong>
	 * </p>
	 * <p>
	 * For example:
	 * </p>
	 * 
	 * <pre>
	 *  if str = "mystring123"  then return 3
	 *  if str = "123mystring123" then return 6
	 *  if str = "123my25str047ing123" then return 11
	 * </pre>
	 * 
	 * You will need a loop, and <strong>your loop must not execute more iterations
	 * than necessary, and you cannot use break or continue</strong>.
	 * 
	 * 
	 * 
	 * @param str : input string
	 * @return number of digits in the given input String
	 */

	public static int digitCountinString(String str) {
		int digit = 0;
		for (int i = 0; i < str.length(); i++) {
			char check = str.charAt(i);
			digit +=(check >= 48 && check <= 57 ? 1 : 0);
		}
		return digit;
	}

	/**
	 * * Implement the method below that takes a String <code>str</code> as input
	 * argument and returns string after removing all duplicates characters from the
	 * input string.
	 * <p>
	 * The order of characters in the returned string is not <strong>
	 * important</strong>, so the strings "ECSLAB" and "CELABS" are same.
	 * </p>
	 * <p>
	 * <strong> You can assume that the input String is not null and contains at
	 * least 2 two characters.</strong>
	 * </p>
	 * <p>
	 * For example:
	 * </p>
	 * 
	 * <pre>
	 * if str = "EECCCCCSSSLLLLLAB"  then return "ABCELS"
	 * if str = "0001110001001" then return "01"
	 * if str = "cvvvvaaabcca" then return "abcv"
	 * if str = "LabTtttEeeeSsssT" then return "ELSTabest"
	 * </pre>
	 * 
	 * @param str : input string
	 * @return string after removing all consecutive duplicates characters from the
	 *         input string
	 */

	public static String removeDuplicatesChar(String str) {
		// Edit
		char[] blocks = new char[str.length()];

		for (int i = 0; i < str.length(); i++) {
			blocks[i] = (char)str.charAt(i);
		
		}
		System.out.println("Input array: " + Arrays.toString(blocks));
		Arrays.sort(blocks);
		System.out.println("Sorted array: " + Arrays.toString(blocks));
		
		int unique = 0;
		
		for (int i = 0; i < blocks.length - 1; i++) {
			if (blocks[i] != blocks[i + 1]) {
				unique++;
			}
		}
		
		char[] result = new char[unique];
		int index = 0;
		for (int i = 0; i < blocks.length - 1; i++) {
			if (blocks[i] != blocks[i + 1]) {
				result[index] = blocks[i];
				index++;
			}
		}
		
		String answer = "";
		
		for (int i = 0; i < result.length; i++) {
			answer += result[i];
		}
		
		return answer;

	}

	/**
	 * Implement the method below that takes a String <code>str</code> as input
	 * argument and returns sum of digits in the given input String. Digits is any
	 * integer between <code>0</code> and <code>9</code>.
	 * <p>
	 * <strong> You can assume that the input String is not null and contains at
	 * least 1 one character.</strong>
	 * </p>
	 * 
	 * <p>
	 * For example:
	 * </p>
	 * 
	 * <pre>
	 * 	if str = "123abcd45"  then return 15
	 * 	if str = "abcd1234" then return 10
	 * 	if str = "159825ABC" then return 30
	 * 	if str = "10125ABC" then return 9
	 * </pre>
	 * 
	 * @param str : input string
	 * @return returns sum of digits in the given input String
	 */

	public static int sumofDigitinString(String str) {
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			char check = str.charAt(i);
			sum += (check >= 48 && check <= 57 ? check - 48 : 0);
		}

		return sum;
	}

	/**
	 * Implement the method below that takes a binary String <code>str</code> as
	 * input argument and returns the length of maximum consecutive 0�s in a given
	 * input binary string.
	 * <p>
	 * <strong> You can assume that the input String is not null and contains at
	 * least 1 one character.</strong>
	 * </p>
	 * <p>
	 * For example:
	 * </p>
	 * 
	 * <pre>
	 * 	if str = "11101110001"  then return 3
	 * 	if str = "10000001001" then return 6
	 * 	if str = "0000100111" then return 4
	 * 	if str = "01001010100111" then return 2
	 * </pre>
	 * 
	 * @param str : input binary string
	 * @return returns the length of maximum consecutive 0�s in a given input binary
	 *         string.
	 */
	public static int lengthofMaxConsecutiveZeros(String str) {
		int count = 0;
		int result = 0;

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == '0') {
				count++;
			} else if (str.charAt(i) == '1') {
				result = Math.max(result, count);
				count = 0;
			}
		}

		return result;
	}

	/**
	 * Implement the method below that takes a String <code>str</code> as input
	 * argument and returns string after removing all consecutive duplicates
	 * characters from the input string. The order of characters in the returned
	 * string is <strong> important</strong>, so the strings "ECSLAB" and "CELABS"
	 * are different.
	 * <p>
	 * <strong> You can assume that the input String is not null and contains at
	 * least 2 two characters.</strong>
	 * </p>
	 * <p>
	 * For example:
	 * </p>
	 * 
	 * <pre>
	 * 	if str = "EECCCCCSSSLLLLLAB"  then return "ECSLAB"
	 * 	if str = "0001110001001" then return "010101"
	 * 	if str = "cvvvvaaabcca" then return "cvabca"
	 * 	if str = "LabTtttEeeeSsssT" then return "LabTtEeSsT"
	 * </pre>
	 * 
	 * @param str : input String
	 * @return string after removing all consecutive duplicates characters from the
	 *         input string.
	 */
	public static String removeConsecutiveDuplicates(String str) {
		// Edit
		if (str.length() <= 1) {
			return str;
		}
		String result = "";
		
		if (str.charAt(0) != str.charAt(1)) {
			String character = str.substring(0,1);
			result = result.concat(character);
		}
		
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) != str.charAt(i - 1)) {
				String character = str.substring(i, i + 1);
				result = result.concat(character);
			}
		}
		System.out.println("Result : " + result);
		return result;
	}

	/**
	 * 
	 * Implement the method below that takes a String <code>str</code> as input
	 * argument and returns number of whitespaces in the given input String.
	 * whitespaces can be spaces or tabs.
	 * <p>
	 * <strong> You can assume that the input String is not null and contains at
	 * least 1 one character.</strong>
	 * </p>
	 * <p>
	 * For example:
	 * </p>
	 * 
	 * <pre>
	 *   if str = "I am EECS1022 Student" then return 3
	 *   if str = "I am EECS 1022 Student" then return 4
	 *   if str = " I am E E C S 1 0 2 2 Student" then return 11
	 * </pre>
	 * 
	 * You will need a loop, and <strong>your loop must not execute more iterations
	 * than necessary, and you cannot use break or continue</strong>. <strong>Make
	 * sure the method compiles without errors and returns the correct result when
	 * invoked.</strong>
	 * 
	 * 
	 * @param str input string
	 * @return number of whitespaces in the given input String.
	 */

	public static int whitespaceCountinString(String str) {
		int space = 0;
		for (int i = 0; i < str.length(); i++) {
			char check = str.charAt(i);
			space += (check == 32 ? 1 : 0);
		}
		return space;

	}

	/**
	 * <p>
	 * Write a compressString method that compression long String {@code str} that
	 * contain many adjacent equal characters (but no digits).
	 * <p>
	 * For example:
	 * </p>
	 * 
	 * <pre>
	 *  
	 *  compressString("")  return "" , empty string 
	 *  compressString("bbbcfreb$b") return  "b3c1f1r1e1b1$1b1"
	 *  compressString("bbbrrraaaaaazzzz") return  "b3r3a6z4"
	 * 
	 * </pre>
	 * 
	 * 
	 * @param inputStr : string to be compressed, {@code str} is not null @pre.
	 *                 Precondition: s does not contain a digit in '0'.. '9'.
	 * @return the compressed version of long string as explained above
	 * 
	 * 
	 * 
	 *
	 */

	public static String compressString(String inputStr) {
		//Edit
		String result = "";
		for (int i = 0; i < inputStr.length() - 1; i++) {
			if(inputStr.charAt(i) == inputStr.charAt(i + 1)) {
				String piece = "";
				for (int j = i; inputStr.charAt(i) != inputStr.charAt(j); j++) {
					piece = inputStr.substring(i, j);
				}
				result += piece + piece.length();
				System.out.print(piece + " ");
			}
		}
		System.out.println();
		return result;
	}

}
