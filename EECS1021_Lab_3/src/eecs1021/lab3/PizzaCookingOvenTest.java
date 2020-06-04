package eecs1021.lab3;

import static org.junit.Assert.*;

import org.junit.Test;
import java.lang.reflect.Field;

import org.junit.rules.Timeout;
import org.junit.runners.MethodSorters;



import org.junit.FixMethodOrder;
import org.junit.Rule;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PizzaCookingOvenTest {

	
	@Rule
	public Timeout globalTimeout = Timeout.seconds(1);
	
	private String getpizzaType(PizzaCookingOven p) {
		String v="";
		try {
			Field name = PizzaCookingOven.class.getDeclaredField("pizzaType");
			name.setAccessible(true);
			v = (String)name.get(p);
			
		} catch (Exception x) {
			fail("exception occurred trying to get this.getpizzaType");
			System.out.println(x);
		}
		return v;
	}
	
	private String getpizzaSize(PizzaCookingOven p) {
		String v="";
		try {
			Field name = PizzaCookingOven.class.getDeclaredField("pizzaSize");
			name.setAccessible(true);
			v = (String)name.get(p);
			
		} catch (Exception x) {
			fail("exception occurred trying to get this.getpizzaSize");
			System.out.println(x);
		}
		return v;
	}
	
	
	
	@Test
	public void test_0_PizzaCookingOven() {
		PizzaCookingOven p = new PizzaCookingOven();
		String apizzaType = this.getpizzaType(p);
		String apizzaSize = this.getpizzaSize(p);
		String epizzaType = "DOUBLECHEESE";
		String epizzaSize = "S";
		
		String errorpizzaType = String.format(
				"\n Test no-arg constructor  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
				apizzaType, epizzaType);
		assertTrue(errorpizzaType, epizzaType.equals(apizzaType));
		
		String errorpizzaSize = String.format(
				"\n Test no-arg constructor  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
				apizzaSize, epizzaSize);
		
		assertTrue(errorpizzaSize, epizzaSize.equals(apizzaSize));	
		
	}

	@Test
	public void test_1_PizzaCookingOvenStringString() {
		PizzaCookingOven p = new PizzaCookingOven("DOUBLECHEESE","M");
		String apizzaType = this.getpizzaType(p);
		String apizzaSize = this.getpizzaSize(p);
		String epizzaType = "DOUBLECHEESE";
		String epizzaSize = "M";
		
		String errorpizzaType = String.format(
				"\n Test arg constructor  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
				apizzaType, epizzaType);
		assertTrue(errorpizzaType, epizzaType.equals(apizzaType));
		
		String errorpizzaSize = String.format(
				"\n Test arg constructor  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
				apizzaSize, epizzaSize);
		
		assertTrue(errorpizzaSize, epizzaSize.equals(apizzaSize));	
	}

	@Test
	public void test_2_PizzaCookingOvenPizzaCookingOven() {
		PizzaCookingOven c = new PizzaCookingOven("DOUBLECHEESE","L");
		PizzaCookingOven p = new  PizzaCookingOven(c);
		String apizzaType = this.getpizzaType(p);
		String apizzaSize = this.getpizzaSize(p);
		String epizzaType = "DOUBLECHEESE";
		String epizzaSize = "L";
		String errorpizzaType = String.format(
				"\n Test copy constructor  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
				apizzaType, epizzaType);
		assertTrue(errorpizzaType, epizzaType.equals(apizzaType));
		
		String errorpizzaSize = String.format(
				"\n Test copy constructor  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
				apizzaSize, epizzaSize);
		
		assertTrue(errorpizzaSize, epizzaSize.equals(apizzaSize));	
		
		
		
		
		
	}

	@Test
	public void test_3_SetPizzaType() {
		PizzaCookingOven p = new PizzaCookingOven("DOUBLECHEESE","M");
		p.setPizzaType("PEPPERONI");
		String apizzaType = this.getpizzaType(p);
		String apizzaSize = this.getpizzaSize(p);
		String epizzaType = "PEPPERONI";
		String epizzaSize = "M";
		String errorpizzaType = String.format(
				"\n Test SetPizzaType  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
				apizzaType, epizzaType);
		assertTrue(errorpizzaType, epizzaType.equals(apizzaType));
		
		String errorpizzaSize = String.format(
				"\n Test  SetPizzaType  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
				apizzaSize, epizzaSize);
		
		assertTrue(errorpizzaSize, epizzaSize.equals(apizzaSize));	
		
	}

	@Test
	public void test_4_SetPizzaSize() {
		PizzaCookingOven p = new PizzaCookingOven("DOUBLECHEESE","M");
		p.setPizzaSize("L");
		String apizzaType = this.getpizzaType(p);
		String apizzaSize = this.getpizzaSize(p);
		String epizzaType = "DOUBLECHEESE";
		String epizzaSize = "L";
		String errorpizzaType = String.format(
				"\n Test SetPizzaType  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
				apizzaType, epizzaType);
		assertTrue(errorpizzaType, epizzaType.equals(apizzaType));
		
		String errorpizzaSize = String.format(
				"\n Test  SetPizzaType  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
				apizzaSize, epizzaSize);
		
		assertTrue(errorpizzaSize, epizzaSize.equals(apizzaSize));	
	}

	@Test
	public void test_5_GetPizzaType() {
		PizzaCookingOven p = new PizzaCookingOven("DOUBLECHEESE","M");
		
		String apizzaType = p.getPizzaType();
		String apizzaSize = this.getpizzaSize(p);
		String epizzaType = "DOUBLECHEESE";
		String epizzaSize = "M";
		String errorpizzaType = String.format(
				"\n Test SetPizzaType  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
				apizzaType, epizzaType);
		assertTrue(errorpizzaType, epizzaType.equals(apizzaType));
		
		String errorpizzaSize = String.format(
				"\n Test  SetPizzaType  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
				apizzaSize, epizzaSize);
		
		assertTrue(errorpizzaSize, epizzaSize.equals(apizzaSize));	
	}

	@Test
	public void test_6_GetPizzaSize() {
		PizzaCookingOven p = new PizzaCookingOven("DOUBLECHEESE","L");
		
		String apizzaType = this.getpizzaType(p);
		String apizzaSize = p.getPizzaSize();
		String epizzaType = "DOUBLECHEESE";
		String epizzaSize = "L";
		String errorpizzaType = String.format(
				"\n Test SetPizzaType  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
				apizzaType, epizzaType);
		assertTrue(errorpizzaType, epizzaType.equals(apizzaType));
		
		String errorpizzaSize = String.format(
				"\n Test  SetPizzaType  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
				apizzaSize, epizzaSize);
		
		assertTrue(errorpizzaSize, epizzaSize.equals(apizzaSize));
	}

	@Test
	public void test_7_PizzaCookTime() {
		PizzaCookingOven A = new PizzaCookingOven("DOUBLECHEESE","S");
		String errorA = String.format(
				"\n Test PizzaCookTime failed  Returned value ( %d ) " + " but correct value is ( %d ). \n",
				A.pizzaCookTime(), 12);
		assertEquals(errorA, 12, A.pizzaCookTime());
		A = new PizzaCookingOven("DOUBLECHEESE","M");
		errorA = String.format(
				"\n Test PizzaCookTime failed  Returned value ( %d ) " + " but correct value is ( %d ). \n",
				A.pizzaCookTime(), 13);
		assertEquals(errorA, 13, A.pizzaCookTime());
		A = new PizzaCookingOven("DOUBLECHEESE","L");
		errorA = String.format(
				"\n Test PizzaCookTime failed  Returned value ( %d ) " + " but correct value is ( %d ). \n",
				A.pizzaCookTime(), 18);
		assertEquals(errorA, 18, A.pizzaCookTime());
		
	}

	@Test
	public void test_8_ToString() {
		PizzaCookingOven A = new PizzaCookingOven("DOUBLECHEESE","S");
		String actual = A.toString();
		String expected = "Pizza Cooking Order for (DOUBLECHEESE, S) and cooking time is 12 minutes";
		String error = String.format(
				"\n Test toString failed  Returned value ( %s ) " + " but correct value is ( %s ). \n",
				A.toString(), expected);
		
		assertTrue(error, expected.equals(actual));
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void test_90_exceptionsize() {
		new PizzaCookingOven("DOUBLECHEESE","V");
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void test_91_exceptiontype() {
		new PizzaCookingOven("DOUBLECHEESSE","S");
		
	}
}
