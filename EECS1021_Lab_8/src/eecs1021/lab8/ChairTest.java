package eecs1021.lab8;

import static org.junit.Assert.*;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.*;


import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runners.MethodSorters;


import org.junit.FixMethodOrder;
import org.junit.Rule;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)



public class ChairTest {

	@Rule
	public Timeout globalTimeout = Timeout.seconds(1);
	
	@Test
	public void test01_staticFields() {
		try {
			List<Field> fields = Arrays.asList(Chair.class.getDeclaredFields());

			int nStatic = 0;
			for (Field f : fields) {
				int mod = f.getModifiers();
				if (Modifier.isStatic(mod)) {
					nStatic++;
				}
			}
			assertTrue("there should be one static fields", nStatic == 1);
		} catch (Exception x) {
			fail("exception occurred trying to get the fields of this class");
		}
	}
	
	private int getChairID(Chair c) {
		int v=-1;
		try {
			Field name = Chair.class.getDeclaredField("id");
			name.setAccessible(true);
			v = (int)name.get(c);
			
		} catch (Exception x) {
			fail("exception occurred trying to get this.getChairID, NO id");
			System.out.println(x);
		}
		return v;
	}
	
	private int getChairnumChairs(Chair c) {
		int v=-1;
		try {
			Field name = Chair.class.getDeclaredField("numChairs");
			name.setAccessible(true);
			v = (int)name.get(c);
			
		} catch (Exception x) {
			fail("exception occurred trying to get this.getChairID, NO id");
			System.out.println(x);
		}
		return v;
	}
	private double getChairchairManufCost(Chair c) {
		double v=-1;
		try {
			Field name = Chair.class.getDeclaredField("chairManufCost");
			name.setAccessible(true);
			v = (double)name.get(c);
			
		} catch (Exception x) {
			fail("exception occurred trying to get this.getChairID, NO id");
			System.out.println(x);
		}
		return v;
	}
	
	private String getChairchairShape(Chair p) {
		String v="";
		try {
			Field name = Chair.class.getDeclaredField("chairShape");
			name.setAccessible(true);
			v = (String)name.get(p);
			
		} catch (Exception x) {
			fail("exception occurred trying to get this.getPersonName");
			System.out.println(x);
		}
		return v.toUpperCase();
	}
	
	private String getChairchairColor(Chair p) {
		String v="";
		try {
			Field name = Chair.class.getDeclaredField("chairColor");
			name.setAccessible(true);
			v = (String)name.get(p);
			
		} catch (Exception x) {
			fail("exception occurred trying to get this.getPersonName");
			System.out.println(x);
		}
		return v.toUpperCase();
	}
	
	
	@Test
	public void test01_noArgCtor() {
		Chair ch = new Chair();
		assertEquals("no arg ctor did not set this.chairColor correctly", "white".toUpperCase(),
						this.getChairchairColor(ch));
		assertEquals("no arg ctor did not set this.chairShape correctly", "Rectangle".toUpperCase(),
				this.getChairchairShape(ch));
		
		assertEquals("no arg ctor did not set this.getChairInitialCost correctly",Double.doubleToLongBits(0.0), 
				Double.doubleToLongBits(ch.getChairManufCost()));
	}

	@Test
	public void test02a_ctor() {
		Chair ch = new Chair(1.2,"square", "black" );
		assertEquals("no arg ctor did not set this.chairColor correctly", "black".toUpperCase(),
						this.getChairchairColor(ch));
		assertEquals("no arg ctor did not set this.chairShape correctly", "square".toUpperCase(),
				this.getChairchairShape(ch));
		
		assertEquals("no arg ctor did not set this.getChairInitialCost correctly",Double.doubleToLongBits(1.2), 
				Double.doubleToLongBits(ch.getChairManufCost()));
	}
	
	@Test
	public void test02b_ctor() {
		
		
		
		Chair ch = new Chair(120,"RECtangle", "black" );
		assertEquals("no arg ctor did not set this.chairColor correctly", "black".toUpperCase(),
				this.getChairchairColor(ch));
		assertEquals("no arg ctor did not set this.chairShape correctly", "Rectangle".toUpperCase(),
				this.getChairchairShape(ch));

		assertEquals("no arg ctor did not set this.chairInitialcost correctly",Double.doubleToLongBits(120), 
				Double.doubleToLongBits(ch.getChairManufCost()));
	}
	@Test(expected = IllegalArgumentException.class)
	public void test03a_ctor() {
		Chair ch = new Chair(120,"Cylinder", "black" );
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void test03b_ctor() {
		Chair ch = new Chair(120,"", "bbblack" );
		
	}
	
	@Test
	public void test05a_toString() {
		Chair ch = new Chair(120,"Rectangle", "black" );
		assertEquals("toString did not return the correct string", "RECTANGLE, BLACK, 120.0".toUpperCase(),
						ch.toString());
	}
	
	@Test
	public void test06_01_staticnumber() {
		Chair[] ch = { new Chair(120,"Rectangle", "black" ), new Chair(), new Chair()};
		Chair c = new Chair(120,"Rectangle", "black" );
		int actual = this.getChairnumChairs(c);
		int expected = 8;
		String error = String.format(
						"\n Test number of created Chairs failed  Returned name ( %d ) " + " but correct name is ( %d ). \n",
						actual, expected);
		assertEquals(error, expected,actual);
	}
	@Test
	public void test06_02_getID() {
		Chair c = new Chair(120,"Rectangle", "black" );
		int actual = c.getId();
		int expected = 8;
		String error = String.format(
						"\n Test ID of Chairs failed  Returned name ( %d ) " + " but correct name is ( %d ). \n",
						actual, expected);
		assertEquals(error, expected,actual);
	}
	@Test
	public void test7_01_getChairManufCost() {
		Chair c = new Chair(125,"Rectangle", "black" );
		double  actual = c.getChairManufCost();
		double expected = 125.0;
		String error = String.format(
						"\n Test ID of Chairs failed  Returned name ( %.3f ) " + " but correct name is ( %.3f ). \n",
						actual, expected);
		assertEquals(error,Double.doubleToLongBits(expected), 
				Double.doubleToLongBits(actual));
	}
	
	@Test
	public void test7_02_getChairShape() {
		Chair c = new Chair(125,"Rectangle", "black" );
		String  actual = c.getChairShape();
		String expected = "Rectangle".toUpperCase();
		String error = String.format(
						"\n Test ID of Chairs failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
						actual, expected);
		assertEquals(error,expected, actual);
	}

	@Test
	public void test7_03_getChairColor() {
		Chair c = new Chair(125,"Rectangle", "white" );
		String  actual = c.getChairColor();
		String expected = "white".toUpperCase();
		String error = String.format(
						"\n Test ID of Chairs failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
						actual, expected);
		assertEquals(error,expected, actual);
	}
}
