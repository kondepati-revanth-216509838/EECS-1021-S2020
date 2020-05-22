package eecs1021.lab1;

/**
 * Complete the implementation of the following static methods
 * 
 *
 */
public class Lab1Class {
	private Lab1Class() {
		// empty to prevent object creation
	}

	/**
	 * Implement the method below which receives two integers and returns their
	 * product minus their sum; i.e. xy - (x+y).
	 * <p>
	 * For example:
	 * </p>
	 * 
	 * <pre>
	 * if x=2 and y=3  then return 1
	 * if x=1 and y=2  then  return -1
	 * if x=2 and y=4 then  return 2
	 * if x=5 and y=2  then  return 3
	 * </pre>
	 * 
	 * Make sure the method compiles without errors and returns the correct result
	 * when invoked.
	 * 
	 * @param x : int input value
	 * @param y : int input value
	 * @return return the product minus the sum of the input values
	 */
	public static int mulDiff(int x, int y) {
		return (x * y) - (x + y);
	}

	/**
	 * Implement the method below which receives two integers x and y and returns
	 * the sum of their squares, i.e. x<sup>2</sup> + y<sup>2</sup>.
	 * 
	 *
	 * <p>
	 * For example:
	 * </p>
	 * 
	 * <pre>
	 * if x=2 and y=3  then return 13
	 * if x=1 and y=2  then  return 5
	 * if x=2 and y=4 then  return 20
	 * if x=5 and y=2  then  return 29
	 * </pre>
	 * 
	 * Make sure the method compiles without errors and returns the correct result
	 * when invoked.
	 * 
	 * 
	 * @param x : int input value
	 * @param y : int input value
	 * @return the sum of squares of the input values
	 */

	public static int sumSquares(int x, int y) {
		return (x * x) + (y * y);
	}

	/**
	 * Implement the method below which receives a positive integer <code>n</code>
	 * and returns the string "The square root of X is Y", where X is to be replaced
	 * with the value of <code>n</code> and Y is to be replaced with the square root
	 * of <code>n</code> rounded to two decimals. For example, if <code>n=5</code>
	 * then the return should be: "The square root of 5 is 2.24"
	 * 
	 * <p>
	 * For example:
	 * </p>
	 * 
	 * <pre>
	 * if n=3  then  return "The square root of 3 is 1.73"
	 * if n=7  then  return "The square root of 7 is 2.65"
	 * if n=35 then  return "The square root of 35 is 5.92"
	 * </pre>
	 * 
	 * Make sure the method compiles without errors and returns the correct result
	 * when invoked.
	 * 
	 * @param n : int input value
	 * @return String "The square root of X is Y", where X is to be replaced with
	 *         the value of <code>n</code> and Y is to be replaced with the square
	 *         root of <code>n</code> rounded to two decimals.
	 */
	public static String compute(int n) {
		final int TWO_DIGIT_SHIFT = 100;
		
		double rootInitial = Math.pow(n, 0.5); //Compute the square root of n
		
		double rootFinal = (int)(rootInitial * TWO_DIGIT_SHIFT); //Shift Two Digits to the left and erase the rest of the decimals
		
		rootFinal = ((double)rootFinal) / TWO_DIGIT_SHIFT; //Then shift two digits to the right and the final answer

		return "The square root of " + n + " is " + rootFinal;
	}

	/**
	 * Implement the following method, which receives a weight in pounds and a
	 * height in feet and inches for any given person, and returns the person's body
	 * mass index (BMI) rounded to 2 decimal place.
	 * 
	 * Note: the height of a person is represented in both feet and inches input
	 * parameters. So, if person has height is 10 feet and 15 inches then feet input
	 * parameter will be 10 and inches input parameter will be 15.
	 * 
	 * You must convert the weight in pounds into kilograms by using the following
	 * conversion rate: <strong>1 pound is equal to 0.453592 kilograms.</strong> You
	 * must convert the height in feet and inches into metres by using the following
	 * conversion rates: <strong>1 foot is equal to 0.3048 metre, and 1 inch is
	 * equal to 0.0254 metre.</strong> Given a weight in kilograms <i>w</i> and a
	 * height in metres <i>h</i>, the BMI is <i>w</i> / <i>h</i><sup>2</sup>.
	 * 
	 * <p>
	 * For example:
	 * </p>
	 * 
	 * <pre>
	 * if pounds=75, feet=15  and inches=45  then  return 1.04
	 * if pounds=80, feet=13  and inches=45  then  return 1.39
	 * if pounds=135, feet=7  and inches=45 then  return  5.7
	 * </pre>
	 * 
	 * @param pounds : int input value for weight in pounds
	 * @param feet   : int input value for height in feet, should be used with
	 *               inches input
	 * @param        inches: int input value for height in inches
	 * @return the person's body mass index (BMI) rounded to 2 decimal place.
	 */

	public static double getBMI(int pounds, int feet, int inches) {
		// Conversion constants
		final double KG_TO_POUNDS = 0.453592;
		final double FEET_TO_METRES = 0.3048;
		final double INCHES_TO_METRES = 0.0254;

		final int TWO_DIGIT_SHIFT = 100;

		double kg = pounds * KG_TO_POUNDS;
		double metres = (feet * FEET_TO_METRES) + (inches * INCHES_TO_METRES);

		double bmi = (double) ((int) ((kg / (metres * metres)) * TWO_DIGIT_SHIFT)) / TWO_DIGIT_SHIFT;

		return bmi;

	}

	/**
	 * Returns the maximum number of complete revolutions equivalent to a number of
	 * degrees not greater than the given number of degrees (there are 360 degrees
	 * in one revolution). For example:
	 * 
	 * <pre>
	 * numRevolutions(0)    returns 0
	 * numRevolutions(1)    returns 0
	 * numRevolutions(360)  returns 1
	 * numRevolutions(719)  returns 1
	 * numRevolutions(720)  returns 2
	 * numRevolutions(800)  returns 2
	 * </pre>
	 * 
	 * @param degrees a number of degrees not less than zero
	 * @return the maximum number of complete revolutions not greater than the given
	 *         number of degrees
	 */
	public static long numRevolutions(long degrees) {

		return degrees / 360;

	}

	/**
	 * Returns the number of degrees on a circle that is equivalent to the given
	 * number of degrees. The returned value is always between 0 and 359 degrees,
	 * inclusive. For example:
	 * 
	 * <pre>
	 * fixAngle(0)    returns 0
	 * fixAngle(1)    returns 1
	 * fixAngle(359)  returns 359
	 * fixAngle(360)  returns 0
	 * fixAngle(700)  returns 340
	 * fixAngle(720)  returns 0
	 * fixAngle(725)  returns 5
	 * </pre>
	 * 
	 * @param degrees a number of degrees not less than zero
	 * @return the number of degrees on a circle that is equivalent to the given
	 *         number of degrees
	 */
	public static int fixAngle(long degrees) {

		return (int) degrees % 360;

	}

	/**
	 * Returns the mathematical average of 3 values.
	 * 
	 * @param a : int input value
	 * @param b : int input value
	 * @param c : int input value
	 * @return the average of a, b, and c
	 */
	public static double avg(int a, int b, int c) {
		double sum = a + b + c;

		double avg = (sum / 3);

		return avg;

	}

	/**
	 * Returns true if {@code x} is even and false otherwise.
	 * 
	 * @param x : int input value
	 * @return true if x is even and false otherwise
	 */
	public static boolean isEven(int x) {
		// add your code here
		return x % 2 == 0;
	}

}
