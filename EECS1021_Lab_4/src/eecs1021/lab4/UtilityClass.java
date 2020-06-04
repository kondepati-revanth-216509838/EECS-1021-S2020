package eecs1021.lab4;

import java.util.Random;

/**
 * A random assortment of methods reviewing topics that should improve your
 * programming skills in using Java Control Structures (selection structures,
 * repetition structures, and nested Loops), and java.util.Random
 * 
 *
 */

public class UtilityClass {
	private UtilityClass() {

	}

	/**
	 * Write a static method to determine if a number x is evenly divisible by a
	 * number y. if x divided by y has no remainder. Two numbers are evenly
	 * divisible if either is evenly divisible by the other. Thus, 15 and 3 are
	 * evenly divisible, and 4 and 16 are evenly divisible, whereas 16 and 3 are
	 * not, and 8 and 0 are not.
	 * 
	 * evenlyDivisible that accepts two integer parameters and returns true if the
	 * first parameter is evenly divisible by the second, or vice versa, and false
	 * otherwise. Return false if either parameter is zero.
	 * 
	 * @param a : int input value
	 * @param b : int input value
	 * @return true if the first parameter is evenly divisible by the second, or
	 *         vice versa, and false otherwise.
	 */
	public static boolean evenlyDivisible(int a, int b) {
		/**
		 * Test and make sure they can handle arithmetic exception
		 * 
		 */
		return (a != 0 && b != 0 ? a % b == 0 || b % a == 0 : false);
	}

	/**
	 * Write a static method to compute and return a random integer between x and y,
	 * inclusive, assuming x is less than or equal to y.
	 * <p>
	 * This method should not assign values to x or y nor print the random number.
	 * </p>
	 * <p>
	 * For example:
	 * </p>
	 * 
	 * <pre>
	 * if x= 0 and y =10 then return any integer belonging to {0,1,2,3,4,5,6,7,8,9,10}
	 * if x= 2 and y =7  then return any integer belonging to {2,3,4,5,6,7}
	 * </pre>
	 * 
	 * 
	 * @param x : int input the lower limit
	 * @param y : int input the upper limit
	 * 
	 * 			@pre.
	 *          <p>
	 *          <strong> Precondition </strong>
	 *          </p>
	 *          <p>
	 *          x is less than or equal to y
	 *          </p>
	 * 
	 * 
	 * @return a random integer between x and y, inclusive, assuming x is less than
	 *         or equal to y.
	 */

	public static int getRandomNumber(int x, int y) {
		Random rand = new Random();
		return rand.nextInt((y - x) + 1) + x;

	}

	/**
	 * Write a static method to generate string of random number the number of
	 * generated random number is defined by integer value given by n the generated
	 * random integers should be between x and y (inclusive). Assuming n is positive
	 * and x is less than or equal to y.
	 * <p>
	 * For example:
	 * </p>
	 * 
	 * <pre>
	 * if n=5, x= 5 and y =10 then some of possible returned strings (6)(8)(9)(10)(7) 
	 * or (8)(9)(6)(6)(7) , (9)(6)(9)(6)(9) .
	 * if n=2,  x= 2 and y =7  then some of possible returned strings (6)(7) 
	 * or (3)(4) , (5)(6),...
	 * </pre>
	 * 
	 * @pre.
	 * <p>
	 * <strong> Precondition </strong>
	 * </p>
	 * <p>
	 * n is positive and x is less than or equal to y
	 * </p>
	 * 
	 * @param n : number of random integers
	 * @param x : int input the lower limit
	 * @param y : int input the upper limit
	 * @return generate string of random number the number of generated random
	 *         number is defined by integer value given by n the generated random
	 *         integers should be between x and y (inclusive).
	 */

	public static String stringOfRandomInt(int n, int x, int y) {
		Random rand = new Random();

		String result = "";

		for (int i = 0; i < n; i++) {

			int rnd = rand.nextInt((y - x) + 1) + x;

			result += "(" + rnd + ")";
		}

		return result;
	}

	/**
	 * Write a static method to determine if the given integer is perfect square. If
	 * the input integer <code>n</code> is perfect square then return true.
	 * Otherwise, return false .
	 * <p>
	 * Note: The numbers 0, 1, 4, 9, 16, 25, ... are perfect squares.
	 * </p>
	 * 
	 * <p>
	 * For example:
	 * </p>
	 * 
	 * <pre>
	 * if n = 0 then 	return true
	 * if n= 10  then  return false
	 * if n= 63 then  return false
	 * if n= 64  then  return true
	 * </pre>
	 * 
	 * 
	 * 
	 * @param n :int input integer
	 * 
	 * 			@pre.
	 *          <p>
	 *          <strong> Precondition </strong>
	 *          </p>
	 *          <p>
	 *          You may assume that the integer n is No negative integer
	 *          </p>
	 * 
	 * @return if <code>n</code> is perfect square then return true. Otherwise,
	 *         return false
	 */

	public static boolean isPerfectSquare(int n) {
		return (Math.pow(n, 0.5) == (double) ((int) Math.pow(n, 0.5)));
	}

	/**
	 * Write a static method to determine if the given input <code>n</code> integer
	 * is palindrome integer. If the input integer <code>n</code> is Palindrome
	 * integer then return true. Otherwise, return false.
	 * 
	 * <p>
	 * For example:
	 * </p>
	 * 
	 * <pre>
	 * if n = 0 then 	return true
	 * if n= 10  then  return false
	 * if n= 3635363 then  return true
	 * if n= 121121  then  return true
	 * if n= 112545214 then return false
	 * </pre>
	 * 
	 * 
	 * @param n : int input value
	 * @return <code>n</code> is palindrome integer then return true. Otherwise,
	 *         return false
	 */
	public static boolean isPalindromeInt(int n) {
		int digits = 0;

		for (int temp = n; temp > 0; temp /= 10) {
			digits++;
		}

		int middlePlace = (int) Math.floor((double) digits / 2.0);
		int place = (digits % 2 == 0 ? middlePlace : middlePlace + 1);

		for (int i = 0; (digits % 2 == 0 ? i < place : i < place - 1); i++) {

			int left = (n / (int) Math.pow(10, digits - i - 1)) % 10;
			int right = (n % (int) Math.pow(10, i + 1)) / (int) Math.pow(10, i);

			if (left != right) {
				return false;
			}

		}

		return true;

	}

	/**
	 * 
	 * Write a static method below that takes <code>int</code> number as input
	 * argument and returns the sum of the digits of that number.
	 * <p>
	 * For example:
	 * </p>
	 * 
	 * <pre>
	 * if number = 2134 then return 2+1+3+4=10
	 * if number = 29107 then return 2+9+1+0+7=19
	 * if number = 5842  then return 19
	 * if number = 1002  then return 3
	 * </pre>
	 * 
	 * You will need a loop, and <strong>your loop must not execute more iterations
	 * than necessary, and you cannot use break or continue</strong>. <strong>Make
	 * sure the method compiles without errors and returns the correct result when
	 * invoked.</strong>
	 * 
	 * @param number : int input value
	 * @return the sum of the digits of any given integer value
	 */

	public static int digitSum(int number) {
		int digits = 0;
		int sum = 0;
		
		int temp = number;

		while (temp != 0) {
			temp /= 10;
			digits++;
		}

		for (int i = 0; i < digits; i++) {
			int digit = (number % (int) Math.pow(10, i + 1)) / (int) Math.pow(10, i);
			sum += digit;
		}

		return sum;
	}

	/**
	 * 
	 * 
	 * Write a static method below that takes <code>int</code> number as input
	 * argument and returns the sum of the even digits of that number.
	 * <p>
	 * For example:
	 * </p>
	 * 
	 * <pre>
	 * if number = 5842 then return 8+4+2=14
	 * if number = 1002 then return 0+0+2=2
	 * if number = 19357  then return 0
	 * if number = 2864  then return 20
	 * </pre>
	 * 
	 * You will need a loop, and <strong>your loop must not execute more iterations
	 * than necessary, and you cannot use break or continue</strong>. <strong>Make
	 * sure the method compiles without errors and returns the correct result when
	 * invoked.</strong>
	 * 
	 * @param number : int input value
	 * @return the sum of the even digits of any given integer.
	 */

	public static int sumEvendigits(int number) {
		int digits = 0;
		int sumEven = 0;
		int temp = number;

		while (temp != 0) {
			temp /= 10;
			digits++;
		}

		for (int i = 0; i < digits; i++) {
			int digit = (number % (int) Math.pow(10, i + 1)) / (int) Math.pow(10, i);
			if (digit % 2 == 0) {
				sumEven += digit;
			}
		}

		return sumEven;
	}

	/**
	 * <p>
	 * <strong> Modular Arithmetic</strong>
	 * </p>
	 * <p>
	 * <strong> Definition: </strong><em> If {@code a} and {@code b} are integers
	 * and {@code m} is a positive integer, then {@code a} is <b>congruent</b> to
	 * {@code b} modulo {@code m} if <b> {@code m} divides {@code a-b} </b>. </em>
	 * </p>
	 * <p>
	 * In the other words, two integers are congruent mod {@code m} if and only if
	 * they have the <b> same remainder when divided by {@code m} </b> .
	 * </p>
	 * <p>
	 * This method take three integers {@code a} and {@code b} and {@code m}, then
	 * it return true if {@code a} is <b>congruent</b> to {@code b} modulo {@code m}
	 * </p>
	 * 
	 * <pre>
	 *  Example:
	 *  
	 *  isCongruent ( 81,199,5) returns false 
	 *  isCongruent ( -8,8, 5) returns false
	 *  isCongruent ( 24, 14, 6) returns false
	 *  isCongruent ( 10, 26, 8) returns true 
	 *  isCongruent ( 17, 5, 6) returns true 
	 *  isCongruent ( -1,1, 2) returns true 
	 *  isCongruent ( -8,2, 5) returns true 
	 *  isCongruent ( 38,23, 15) returns true
	 * </pre>
	 * 
	 * 
	 * @param a integer not equal to zero
	 * @param b integer not equal to zero
	 * @param m integer not equal to zero
	 * @return true if {@code a} is <b>congruent</b> to {@code b} modulo
	 *         {@code m} @pre. {@code m > 0} , {@code a != 0} , {@code b != 0}
	 */

	public static boolean isCongruent(int a, int b, int m) {
		return (a != 0 && b != 0 && m > 0 ? (a - b) % m == 0 : false);
	}

	/**
	 * <p>
	 * <strong> Primes</strong>
	 * </p>
	 * <p>
	 * A <em> positive integer </em> {@code n > 1} is called <strong> prime</strong>
	 * if the only positive factors of {@code n} are {@code  1} and {@code  n} . A
	 * positive integer that is greater than one and is not prime is called <strong>
	 * composite</strong>.
	 * </p>
	 * <p>
	 * An integer {@code  n} is <strong> composite </strong> if and only if there
	 * exists an integer {@code a} such that <strong> <em> {@code a} divides
	 * {@code n} </em></strong> and {@code 1 < a < n}.
	 * </p>
	 * 
	 * <p>
	 * <strong> Hint: 1 is neither prime nor composite. It forms its own special
	 * category as a "unit".</strong>
	 * </p>
	 * 
	 * <p>
	 * This method checks the positive integer if it is prime or not.
	 * </p>
	 * 
	 * <pre>
	 *  Example:
	 *  
	 *  isPrime ( -5) returns false 
	 *  isPrime ( 6) returns false
	 *  isPrime ( 25) returns false
	 *  isPrime ( 2) returns true 
	 *  isPrime ( 3) returns true 
	 *  isPrime ( 13) returns true 
	 *  isPrime ( 17) returns true 
	 *  isPrime ( 29) returns true
	 * </pre>
	 * 
	 * @param n positive integer
	 * @return true if number {@code n} is prime, else false @pre. {@code n > 0}
	 */
	public static boolean isPrime(int n) {
		return (n > 1 ? checkPrime(n) : false);
	}

	private static boolean checkPrime(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

}
