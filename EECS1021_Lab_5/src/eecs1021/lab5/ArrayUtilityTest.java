package eecs1021.lab5;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runners.MethodSorters;

import org.junit.FixMethodOrder;
import org.junit.Rule;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ArrayUtilityTest {

	@Rule
	public Timeout globalTimeout = Timeout.seconds(1);

	@Test
	public void test_00_NumberOfEvens() {
		final int[] myList = { 9, 10, 3, 4, 3 };
		int n = ArrayUtility.numberOfEvens(myList);
		int expect = 2;
		String str = String.format("\nTest numberOfEvens fail for %s. Returned ( %d ), but correct is ( %d )\n",
				Arrays.toString(myList), n, expect);
		assertTrue(str, expect == n);
	}

	@Test
	public void test_01_NumberOfEvens() {
		final int[] myList = { 1, 6, 1 };
		int n = ArrayUtility.numberOfEvens(myList);
		int expect = 1;
		String str = String.format("\nTest numberOfEvens fail for %s. Returned ( %d ), but correct is ( %d )\n",
				Arrays.toString(myList), n, expect);
		assertTrue(str, expect == n);
	}

	@Test
	public void test_02_NumberOfEvens() {
		final int[] myList = { 4, 24, 46, 0 };
		int n = ArrayUtility.numberOfEvens(myList);
		int expect = 4;
		String str = String.format("\nTest numberOfEvens fail for %s. Returned ( %d ), but correct is ( %d )\n",
				Arrays.toString(myList), n, expect);
		assertTrue(str, expect == n);
	}

	@Test
	public void test_00_avgAreaofRectangeles() {
		Rectangle[] a = { new Rectangle(2, 3), new Rectangle(2, 3), new Rectangle(2, 3), new Rectangle(2, 3),
				new Rectangle(2, 3) };
		double avg = ArrayUtility.avgAreaofRectangeles(a);
		double exp = 6.0;
		String error = String.format(
				"\n Test avgAreaofRectangeles failed. Returned ( %.2f ) " + " but correct is ( %.2f ). \n", avg, exp);
		final double THRESHOLD = .01;
		assertTrue(error, Math.abs(exp - avg) < THRESHOLD);

	}

	@Test
	public void test_01_avgAreaofRectangeles() {
		Rectangle[] a = { new Rectangle(3, 3), new Rectangle(3, 3), new Rectangle(2, 3), new Rectangle(2, 3),
				new Rectangle(2, 3) };
		double avg = ArrayUtility.avgAreaofRectangeles(a);
		double exp = 7.2;
		String error = String.format(
				"\n Test avgAreaofRectangeles failed. Returned ( %.2f ) " + " but correct is ( %.2f ). \n", avg, exp);
		final double THRESHOLD = .01;
		assertTrue(error, Math.abs(exp - avg) < THRESHOLD);

	}

	@Test
	public void test_00_minmax2D() {

		final int[][] A = { { 12, 4, 6 }, { 5, 2, 1 } };
		int[] exp = { 1, 12 };
		int[] result = ArrayUtility.minmax2D(A);

		String error = String.format("\n Test minmax2D failed,  Returned ( %s ) " + " but correct is ( %s ). \n",
				Arrays.toString(result), Arrays.toString(exp));

		assertTrue(error, Arrays.equals(exp, result));

	}

	@Test
	public void test_00_average2D() {
		int[][] inputarray = { { 9, 2, 3, 4 }, { 1, 2, 3, 45 }, { 1, 222, 333, -4 } };
		double avg = ArrayUtility.average2D(inputarray);
		double exp = 51.75;
		String error = String.format("\n Test average2D failed. Returned ( %.2f ) " + " but correct is ( %.2f ). \n",
				avg, exp);
		final double THRESHOLD = .01;
		assertTrue(error, Math.abs(exp - avg) < THRESHOLD);

	}

	@Test
	public void test_01_average2D() {
		int[][] inputarray = { { 9, 2, 3, 4 }, { 1, 2, 3, 45 }, { 1, 222, 333, -4 } };
		double avg = ArrayUtility.average2D(inputarray);
		double exp = 51.75;
		String error = String.format("\n Test average2D failed. Returned ( %.2f ) " + " but correct is ( %.2f ). \n",
				avg, exp);
		final double THRESHOLD = .01;
		assertTrue(error, Math.abs(exp - avg) < THRESHOLD);

	}

	@Test
	public void test_00_averageOfOdd() {

		final int[] A = { 12, 4, 6 };
		double exp = 0.0;
		double avg = ArrayUtility.averageOfOdd(A);

		String error = String.format(
				"\n Test averageOfOdd failed for %s. Returned ( %.2f ) " + " but correct is ( %.2f ). \n",
				Arrays.toString(A), avg, exp);

		final double THRESHOLD = .01;
		assertTrue(error, Math.abs(exp - avg) < THRESHOLD);

	}

	@Test
	public void test_01_averageOfOdd() {

		final int[] A = { 3, 6 };
		double exp = 3.0;

		double avg = ArrayUtility.averageOfOdd(A);

		String error = String.format(
				"\n Test averageOfOdd failed for %s. Returned ( %.2f ) " + " but correct is ( %.2f ). \n",
				Arrays.toString(A), avg, exp);
		final double THRESHOLD = .01;
		assertTrue(error, Math.abs(exp - avg) < THRESHOLD);

	}

	@Test
	public void test_00_isConsecutive() {
		final int[] myList = { 3, 6 };
		boolean n = ArrayUtility.isConsecutive(myList);
		boolean expect = false;
		String str = String.format("\nTest isConsecutive fail for %s. Returned ( %s ), but correct is ( %s )\n",
				Arrays.toString(myList), n, expect);
		assertTrue(str, expect == n);
	}

	@Test
	public void test_01_isConsecutive() {
		final int[] myList = { 6, 7, 8, 9 };
		boolean n = ArrayUtility.isConsecutive(myList);
		boolean expect = true;
		String str = String.format("\nTest isConsecutive fail for %s. Returned ( %s ), but correct is ( %s )\n",
				Arrays.toString(myList), n, expect);
		assertTrue(str, expect == n);
	}

	@Test
	public void test__00removeDuplicates() {
		final int[] test = { 3, 4, 5, 6, 7, 8, 9, 8, 7 };
		final int[] expect = { 3, 4, 5, 6, 7, 8, 9 };
		int[] result = ArrayUtility.removeDuplicatesElement(test);
		String str = String.format("\n Test removeDuplicateElements fail for %s. Returned (%s), but correct is (%s)",
				Arrays.toString(test), result, expect);
		assertTrue(str, arrayMatch(result, expect));
	}

	boolean arrayMatch(int[] check, int[] expect) {
		if (check.length != expect.length) {
			return false;
		}

		for (int i = 0; i < check.length; i++) {
			if (check[i] != expect[i]) {
				return false;
			}
		}

		return true;
	}

	@Test
	public void test__01removeDuplicates() {
		final int[] test = { 9, 2, 8, 8, 9, 9, 8, 8 };
		final int[] expect = { 2, 8, 9 };
		int[] result = ArrayUtility.removeDuplicatesElement(test);
		String str = String.format("\n Test removeDuplicateElements fail for %s. Returned (%s), but correct is (%s)",
				Arrays.toString(test), result, expect);
		assertTrue(str, arrayMatch(result, expect));
	}

	@Test
	public void test__02removeDuplicates() {
		final int[] test = { 4, 2, 8, 8, 9, 9, 7, 8 };
		final int[] expect = { 2, 4, 7, 8, 9 };
		int[] result = ArrayUtility.removeDuplicatesElement(test);
		String str = String.format("\n Test removeDuplicateElements fail for %s. Returned (%s), but correct is (%s)",
				Arrays.toString(test), result, expect);
		assertTrue(str, arrayMatch(result, expect));
	}

	@Test
	public void test_03removeduplicates() {
		final int[] test = { 1, 1, 2, 3, 4, 5, 6, 8, 9, 10, 10 };
		final int[] expect = { 1, 2, 3, 4, 5, 6, 8, 9, 10 };
		int[] result = ArrayUtility.removeDuplicatesElement(test);
		String str = String.format("\n Test removeDuplicateElements fail for %s. Returned (%s), but correct is (%s)",
				Arrays.toString(test), result, expect);
		assertTrue(str, arrayMatch(result, expect));
	}

}
