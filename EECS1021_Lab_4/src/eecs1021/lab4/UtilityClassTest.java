package eecs1021.lab4;

import static org.junit.Assert.*;

import org.junit.Test;


import org.junit.rules.Timeout;
import org.junit.runners.MethodSorters;



import org.junit.FixMethodOrder;
import org.junit.Rule;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UtilityClassTest {
	
	@Rule
	public Timeout globalTimeout = Timeout.seconds(1);
	
	
	@Test
	public void test_00_digitSum() {
		final int n = 2134;
		int sum = UtilityClass.digitSum(n);
		int expect = 10;
		String str = String.format("\nTest digitSum fail for %d. Returned ( %d ), but correct is ( %d )\n", n, sum,
				expect);
		assertTrue(str, expect == sum);
	}

	@Test
	public void test_01_digitSum() {
		final int n = 29107;
		int sum = UtilityClass.digitSum(n);
		int expect = 19;
		String str = String.format("\nTest digitSum fail for %d. Returned ( %d ), but correct is ( %d )\n", n, sum,
				expect);
		assertTrue(str, expect == sum);
	}

	@Test
	public void test_02_digitSum() {
		final int n = 5842;
		int sum = UtilityClass.digitSum(n);
		int expect = 19;
		String str = String.format("\nTest digitSum fail for %d. Returned ( %d ), but correct is ( %d )\n", n, sum,
				expect);
		assertTrue(str, expect == sum);
	}

	
	@Test
	public void test_00_sumEvendigits() {
		final int n= 2134;
		int  sum = UtilityClass.sumEvendigits(n);
		int  expect = 6 ;
		String str = String.format("\nTest sumEvendigits fail for %d. Returned ( %d ), but correct is ( %d )\n", n,sum, expect );
		assertTrue(str, expect==sum);
	}
	
	@Test
	public void test_01_sumEvendigits() {
		final int n= 1002;
		int  sum = UtilityClass.sumEvendigits(n);
		int  expect = 2 ;
		String str = String.format("\nTest sumEvendigits fail for %d. Returned ( %d ), but correct is ( %d )\n", n,sum, expect );
		assertTrue(str, expect==sum);
	}
	@Test
	public void test_02_sumEvendigits() {
		final int n= 5842;
		int  sum = UtilityClass.sumEvendigits(n);
		int  expect = 14 ;
		String str = String.format("\nTest sumEvendigits fail for %d. Returned ( %d ), but correct is ( %d )\n", n,sum, expect );
		assertTrue(str, expect==sum);
	}

	
	@Test
	public void test02_isCongruent() {
		
		
		
		assertEquals("isCongruent ( 81,199,5) is not implemented correclty", false,
				UtilityClass.isCongruent ( 81,199,5));
		assertEquals("isCongruent ( 24, 14, 6) is not implemented correclty", false,
				UtilityClass.isCongruent ( 24, 14, 6));
		assertEquals("isCongruent ( -8,2, 5) is not implemented correclty", true,
				UtilityClass.isCongruent ( -8,2, 5));
		assertEquals("isCongruent ( 38,23, 15) is not implemented correclty ", true,
				UtilityClass.isCongruent ( 38,23, 15));
		assertEquals("isCongruent ( 2,3, 10) is not implemented correclty ", false,
				UtilityClass.isCongruent ( 2,3, 10));
	}
	
	
	
	@Test
	public void test03_isPrime() {
		
		
		
		assertEquals("isPrime ( 81) is not implemented correclty", false,
				UtilityClass.isPrime ( 81));
		assertEquals("isPrime ( 24) is not implemented correclty", false,
				UtilityClass.isPrime ( 6));
		assertEquals("isPrime ( -8)  is not implemented correclty", false,
				UtilityClass.isPrime ( -8));
		assertEquals("isPrime (29) is not implemented correclty ", true,
				UtilityClass.isPrime ( 29));
		assertEquals("isPrime ( 13) is not implemented correclty ", true,
				UtilityClass.isPrime ( 13));
	}
	
	@Test
	public void test00_isPalindromeInt() {
		assertEquals("isPalindromeInt(101) says it's false when it's true.", true, UtilityClass.isPalindromeInt(101));
		assertEquals("isPalindromeInt(121) says it's false when it's true.", true, UtilityClass.isPalindromeInt(121));
		assertEquals("isPalindromeInt(147) says it's false when it's true.", false, UtilityClass.isPalindromeInt(147));
		assertEquals("isPalindromeInt(38233283) says it's false when it's true.", true, UtilityClass.isPalindromeInt(38233283));
		assertEquals("isPalindromeInt(32932) says it's false when it's true.", false, UtilityClass.isPalindromeInt(32932));
		assertEquals("isPalindromeInt(898) says it's false when it's true.", true, UtilityClass.isPalindromeInt(898));
		assertEquals("isPalindromeInt(1221) says it's false when it's true.", true, UtilityClass.isPalindromeInt(1221));
		
	}
	
	@Test
	public void test00_isPerfectSqaure(){
		assertEquals("not giving perfect square of 47", false, UtilityClass.isPerfectSquare(47));
		assertEquals("not giving perfect square of 49", true, UtilityClass.isPerfectSquare(49));
		
		assertEquals("not giving perfect square of 141", false, UtilityClass.isPerfectSquare(141));
		assertEquals("not giving perfect square of 144", true, UtilityClass.isPerfectSquare(144));
		
		assertEquals("not giving perfect square of 2", false, UtilityClass.isPerfectSquare(2));
		assertEquals("not giving perfect square of 9", true, UtilityClass.isPerfectSquare(9));
	}
	
	@Test
	public void test00_evenlyDivisible() {
		assertEquals("Wrong answer", true, UtilityClass.evenlyDivisible(5, 15));
		assertEquals("Wrong answer", false, UtilityClass.evenlyDivisible(8, 0));
		assertEquals("Wrong answer", false, UtilityClass.evenlyDivisible(0, 8));
		assertEquals("Wrong answer", true, UtilityClass.evenlyDivisible(3, 15));
		assertEquals("Wrong answer", true, UtilityClass.evenlyDivisible(4, 28));
		assertEquals("Wrong answer", false, UtilityClass.evenlyDivisible(9, 17));
		
	}
	
	@Test
	public void test00_getRandomNumber() {
		
	}
}
