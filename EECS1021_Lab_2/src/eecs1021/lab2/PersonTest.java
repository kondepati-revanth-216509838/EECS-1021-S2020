package eecs1021.lab2;

import static org.junit.Assert.*;

import org.junit.Test;
import java.lang.reflect.Field;

import org.junit.rules.Timeout;
import org.junit.runners.MethodSorters;
import org.junit.FixMethodOrder;
import org.junit.Rule;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PersonTest {
	@Rule
	public Timeout globalTimeout = Timeout.seconds(1);
	
	
	private String getPersonName(Person p) {
		String v="";
		try {
			Field name = Person.class.getDeclaredField("name");
			name.setAccessible(true);
			v = (String)name.get(p);
			
		} catch (Exception x) {
			fail("exception occurred trying to get this.getPersonName");
			System.out.println(x);
		}
		return v;
	}
	private String getPersonAddress(Person p) {
		String v="";
		try {
			Field name = Person.class.getDeclaredField("address");
			name.setAccessible(true);
			v = (String)name.get(p);
			
		} catch (Exception x) {
			fail("exception occurred trying to get this.getPersonAddress");
			System.out.println(x);
		}
		return v;
	}
	
	private String getPersonPhone(Person p) {
		String v="";
		try {
			Field name = Person.class.getDeclaredField("phone");
			name.setAccessible(true);
			v = (String)name.get(p);
			
		} catch (Exception x) {
			fail("exception occurred trying to get this.getPersonPhone");
			System.out.println(x);
		}
		return v;
	}
	
	private String getPersonEmail(Person p) {
		String v="";
		try {
			Field name = Person.class.getDeclaredField("email");
			name.setAccessible(true);
			v = (String)name.get(p);
			
		} catch (Exception x) {
			fail("exception occurred trying to get this.getPersonEmail");
			System.out.println(x);
		}
		return v;
	}
	
	
	@Test
	public void test_0_Person() {
		Person p= new Person();
		String aname= this.getPersonName(p); String aaddress =  this.getPersonAddress(p);
		String aphone= this.getPersonPhone(p);
		String aemail = this.getPersonEmail(p);
		String ename = "Unknown"; String eaddress = "Unknown";
		String ephone = "Unknown";String eemail = "Unknown";
		
		String errorname = String.format(
				"\n Test no-arg constructor  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
				aname, ename);
		assertTrue(errorname, ename.equals(aname));
		
		String erroraddress = String.format(
				"\n Test no-arg constructor  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
				aaddress, eaddress);
		assertTrue(erroraddress, eaddress.equals(aaddress));
		
		String errorphone = String.format(
				"\n Test no-arg constructor  failed  Returned Phone ( %s ) " + " but correct Phone is ( %s ). \n",
				aphone, ephone);
		assertTrue(errorphone, ephone.equals(aphone));
		
		String erroremail = String.format(
				"\n Test no-arg constructor  failed  Returned email ( %s ) " + " but correct email is ( %s ). \n",
				aemail, eemail);
		assertTrue(erroremail, eemail.equals(aemail));
		
	}

	@Test
	public void test_1_PersonStringStringStringString() {
		Person p= new Person("Person A", "1234, Toronto", "102345", "1@test.com");
		String aname= this.getPersonName(p); String aaddress =  this.getPersonAddress(p);
		String aphone= this.getPersonPhone(p);
		String aemail = this.getPersonEmail(p);
		String ename = "Person A"; String eaddress = "1234, Toronto";
		String ephone = "102345";String eemail = "1@test.com";
		
		String errorname = String.format(
				"\n Test arg constructor  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
				aname, ename);
		assertTrue(errorname, ename.equals(aname));
		
		String erroraddress = String.format(
				"\n Test arg constructor  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
				aaddress, eaddress);
		assertTrue(erroraddress, eaddress.equals(aaddress));
		
		String errorphone = String.format(
				"\n Test arg constructor  failed  Returned Phone ( %s ) " + " but correct Phone is ( %s ). \n",
				aphone, ephone);
		assertTrue(errorphone, ephone.equals(aphone));
		
		String erroremail = String.format(
				"\n Test arg constructor  failed  Returned email ( %s ) " + " but correct email is ( %s ). \n",
				aemail, eemail);
		assertTrue(erroremail, eemail.equals(aemail));
	}

	@Test
	public void test_2_PersonPerson() {
		Person p= new Person("Person B", "01234, Toronto", "00102345", "123@test.com");
		Person o = new Person(p);
		
		String aname= this.getPersonName(o); String aaddress =  this.getPersonAddress(o);
		String aphone= this.getPersonPhone(o);
		String aemail = this.getPersonEmail(o);
		String ename = "Person B"; String eaddress = "01234, Toronto";
		String ephone = "00102345";String eemail = "123@test.com";
		
		String errorname = String.format(
				"\n Test copy constructor  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
				aname, ename);
		assertTrue(errorname, ename.equals(aname));
		
		String erroraddress = String.format(
				"\n Test copy constructor  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
				aaddress, eaddress);
		assertTrue(erroraddress, eaddress.equals(aaddress));
		
		String errorphone = String.format(
				"\n Test copy constructor  failed  Returned Phone ( %s ) " + " but correct Phone is ( %s ). \n",
				aphone, ephone);
		assertTrue(errorphone, ephone.equals(aphone));
		
		String erroremail = String.format(
				"\n Test copy constructor  failed  Returned email ( %s ) " + " but correct email is ( %s ). \n",
				aemail, eemail);
		assertTrue(erroremail, eemail.equals(aemail));
	}

	@Test
	public void test_3_GetMethods() {
		Person p= new Person("Person A", "1234, Toronto", "102345", "1@test.com");
		String aname= p.getName(); String aaddress = p.getAddress();
		String aphone= p.getPhone();
		String aemail = p.getEmail();
		String ename = "Person A"; String eaddress = "1234, Toronto";
		String ephone = "102345";String eemail = "1@test.com";
		
		String errorname = String.format(
				"\n Test getName  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
				aname, ename);
		assertTrue(errorname, ename.equals(aname));
		
		String erroraddress = String.format(
				"\n Test getAddress   failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
				aaddress, eaddress);
		assertTrue(erroraddress, eaddress.equals(aaddress));
		
		String errorphone = String.format(
				"\n Test getPhone   failed  Returned Phone ( %s ) " + " but correct Phone is ( %s ). \n",
				aphone, ephone);
		assertTrue(errorphone, ephone.equals(aphone));
		
		String erroremail = String.format(
				"\n Test getEmail   failed  Returned email ( %s ) " + " but correct email is ( %s ). \n",
				aemail, eemail);
		assertTrue(erroremail, eemail.equals(aemail));
	}

	
	@Test
	public void test_4_SetMethods() {
		Person p= new Person("Person A", "1234, Toronto", "102345", "1@test.com");
		p.setName("Person C"); p.setAddress("5458, New York");
		p.setPhone("985632");
		p.setEmail("589@york.com");
		
		String aname= this.getPersonName(p); String aaddress =  this.getPersonAddress(p);
		String aphone= this.getPersonPhone(p);
		String aemail = this.getPersonEmail(p);
		
		String ename = "Person C"; String eaddress = "5458, New York";
		String ephone = "985632";String eemail = "589@york.com";
		
		String errorname = String.format(
				"\n Test setName  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
				aname, ename);
		assertTrue(errorname, ename.equals(aname));
		
		String erroraddress = String.format(
				"\n Test setAddress   failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
				aaddress, eaddress);
		assertTrue(erroraddress, eaddress.equals(aaddress));
		
		String errorphone = String.format(
				"\n Test setPhone   failed  Returned Phone ( %s ) " + " but correct Phone is ( %s ). \n",
				aphone, ephone);
		assertTrue(errorphone, ephone.equals(aphone));
		
		String erroremail = String.format(
				"\n Test setEmail   failed  Returned email ( %s ) " + " but correct email is ( %s ). \n",
				aemail, eemail);
		assertTrue(erroremail, eemail.equals(aemail));
	}

	

	@Test
	public void test_5_ToString() {
		Person p= new Person("Person A", "1234, Toronto", "102345", "1@test.com");
		String actual = p.toString();
		String expected = "Name: " + this.getPersonName(p) +
				"\nAddress: " + this.getPersonAddress(p) + 
				"\nPhone number: " + this.getPersonPhone(p) + "\nEmail address: " + this.getPersonEmail(p);
		String error = String.format(
				"\n Test toString  failed  Returned email ( %s ) " + " but correct email is ( %s ). \n",
				actual, expected);
		assertTrue(error, expected.equals(actual));
	}

}
