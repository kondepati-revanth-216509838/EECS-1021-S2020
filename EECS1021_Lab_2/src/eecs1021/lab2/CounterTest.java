package eecs1021.lab2;

import static org.junit.Assert.*;

import org.junit.Test;
import java.lang.reflect.Field;

import org.junit.rules.Timeout;
import org.junit.runners.MethodSorters;
import org.junit.FixMethodOrder;
import org.junit.Rule;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CounterTest {

	@Rule
	public Timeout globalTimeout = Timeout.seconds(1);
	
	private int getCounterValue(Counter c) {
		int v=-1;
		try {
			Field name = Counter.class.getDeclaredField("value");
			name.setAccessible(true);
			v = (int)name.get(c);
			
		} catch (Exception x) {
			fail("exception occurred trying to get this.getCounterValue");
			System.out.println(x);
		}
		return v;
	}
	
	
	@Test
	public void test_0_Counter() {
		Counter c = new Counter();
		int actual = this.getCounterValue(c);
		int expexted = 0;
		String error = String.format(
				"\n Test no-arg constructor failed  Returned value ( %d ) " + " but correct value is ( %d ). \n",
				actual, expexted);
		assertEquals(error, expexted, actual);
		
	}

	@Test
	public void test_1_CounterInt() {
		Counter c = new Counter(5);
		int actual = this.getCounterValue(c);
		int expexted = 5;
		String error = String.format(
				"\n Test arg constructor failed  Returned value ( %d ) " + " but correct value is ( %d ). \n",
				actual, expexted);
		assertEquals(error, expexted, actual);
	}

	@Test
	public void test_2_GetValue() {
		Counter c = new Counter(7);
		
		int actual = c.getValue();
		int expexted = 7;
		String error = String.format(
				"\n Test getValue failed  Returned value ( %d ) " + " but correct value is ( %d ). \n",
				actual, expexted);
		assertEquals(error, expexted, actual);
	}

	@Test
	public void test_4_SetValue() {
		Counter c = new Counter(7);
		c.setValue(9);
		int actual = this.getCounterValue(c);
		int expexted = 9;
		String error = String.format(
				"\n Test getValue failed  Returned value ( %d ) " + " but correct value is ( %d ). \n",
				actual, expexted);
		assertEquals(error, expexted, actual);
	}

	@Test
	public void test_5_Incr() {
		Counter c = new Counter(7);
		c.incr();
		int actual = this.getCounterValue(c);
		int expexted = 8;
		String error = String.format(
				"\n Test getValue failed  Returned value ( %d ) " + " but correct value is ( %d ). \n",
				actual, expexted);
		assertEquals(error, expexted, actual);
	}

	@Test
	public void test_6_IncrbyValue() {
		Counter c = new Counter(9);
		c.incrbyValue(3);
		int actual = this.getCounterValue(c);
		int expexted = 12;
		String error = String.format(
				"\n Test getValue failed  Returned value ( %d ) " + " but correct value is ( %d ). \n",
				actual, expexted);
		assertEquals(error, expexted, actual);
	}

	@Test
	public void test_7_Decr() {
		Counter c = new Counter(6);
		c.decr();
		int actual = this.getCounterValue(c);
		int expexted = 5;
		String error = String.format(
				"\n Test getValue failed  Returned value ( %d ) " + " but correct value is ( %d ). \n",
				actual, expexted);
		assertEquals(error, expexted, actual);
	}

	@Test
	public void test_8_DecrbyValue() {
		Counter c = new Counter(6);
		c.decrbyValue(5);
		int actual = this.getCounterValue(c);
		int expexted = 1;
		String error = String.format(
				"\n Test getValue failed  Returned value ( %d ) " + " but correct value is ( %d ). \n",
				actual, expexted);
		assertEquals(error, expexted, actual);
	}

	@Test
	public void test_9_ToString() {
		Counter c = new Counter(75);
		String actual = c.toString();
		String expexted = "(Counter is 75)";
		String error = String.format(
				"\n Test toString failed  Returned string ( %s ) " + " but correct string is ( %s ). \n",
				actual, expexted);
		assertTrue(error, expexted.equals(actual));
	}

}
