package eecs1021.lab6;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CompanyTest {
	
	
	
	@Rule
	public Timeout globalTimeout = Timeout.seconds(1);
	
	 Company  company;
	
	/*
	 * This method is executed before each test method is executed.
	 */
	@Before
    public void setUp() {
		this.company = new Company();
    }
	
	private void addEmployees() {
		try {
			company.addEmployee("e1", new Employee("Heeyeon"	, 100, 1));
			company.addEmployee("e2", new Employee("Jiyoon"	, 500, 2)); 
			company.addEmployee("e3", new Employee("Jaebin"	, 700, 3));
			company.addEmployee("e4", new Employee("Suyeon"	, 700, 2));
			company.addEmployee("e5", new Employee("Yuna"	, 500, 1));
			company.addEmployee("e6", new Employee("Sunhye"	, 600, 3));
			company.addEmployee("e7", new Employee("Jihye"	, 700, 1));
		} catch (IllegalArgumentException e) {
			// exception not expected
			fail();
		}
	}
	
	private void addDepartments() {
		try {
			company.addDepartment(1, new Department("ACCOUNTING"	, "Toronto"));
			company.addDepartment(2, new Department("IT"			, "Seoul"));
			company.addDepartment(3, new Department("RESEARCH"	, "London"));
		} catch (IllegalArgumentException e) {
			// exception not expected
			fail();
		} 
	}
	
	
	
	@Test
	public void test_Constructor() { 
		
		assertEquals(company.getEmployees().size(), 0);
		assertEquals(company.getDepartments().size(), 0);
	}
	
	@Test
	public void test_addEmployee_abnormal() {
		addEmployees();
		
		try {
			company.addEmployee("e3", new Employee("Jiwon", 400, 2));
			fail();
		} catch (IllegalArgumentException e) {
			// exception expected
		}
	}
	
	
	@Test
	public void test_addEmployee_normal() {
		try {
			company.addEmployee("e1", new Employee("Heeyeon"	, 100, 1));
			company.addEmployee("e2", new Employee("Jiyoon"	, 500, 2));
			company.addEmployee("e3", new Employee("Jaebin"	, 700, 3));
			company.addEmployee("e4", new Employee("Suyeon"	, 700, 2));
			company.addEmployee("e5", new Employee("Yuna"	, 500, 1));
			company.addEmployee("e6", new Employee("Sunhye"	, 600, 3));
			company.addEmployee("e7", new Employee("Jihye"	, 700, 1));
		} catch (IllegalArgumentException e) {
			// exception not expected
			fail();
		} 
		assertEquals(7, company.employees.size());
		assertEquals(new Employee("Heeyeon"	, 100, 1), company.employees.get("e1"));
		assertEquals(new Employee("Jiyoon"	, 500, 2), company.employees.get("e2"));
		assertEquals(new Employee("Jaebin"	, 700, 3), company.employees.get("e3"));
		assertEquals(new Employee("Suyeon"	, 700, 2), company.employees.get("e4"));
		assertEquals(new Employee("Yuna"	, 500, 1), company.employees.get("e5"));
		assertEquals(new Employee("Sunhye"	, 600, 3), company.employees.get("e6"));
		assertEquals(new Employee("Jihye"	, 700, 1), company.employees.get("e7"));
	}
	
	@Test
	public void test_removeEmployee_abnormal() {
		addEmployees();
		
		try {
			company.removeEmployee("e8");
			fail();
		} catch (IllegalArgumentException e) {
			// exception expected 
		}
	}
	
	
	
	@Test
	public void test_removeEmployee_normal() {
		addEmployees();
		
		try {
			company.removeEmployee("e3");
		} catch (IllegalArgumentException e) {
			// exception not expected
			fail();
		}
		
		assertEquals(6, company.employees.size());
		assertEquals(new Employee("Heeyeon"	, 100, 1), company.employees.get("e1"));
		assertEquals(new Employee("Jiyoon"	, 500, 2), company.employees.get("e2"));
		assertTrue(company.employees.get("e3") == null);
		assertEquals(new Employee("Suyeon"	, 700, 2), company.employees.get("e4"));
		assertEquals(new Employee("Yuna"	, 500, 1), company.employees.get("e5"));
		assertEquals(new Employee("Sunhye"	, 600, 3), company.employees.get("e6"));
		assertEquals(new Employee("Jihye"	, 700, 1), company.employees.get("e7"));
		
		try {
			company.removeEmployee("e6");
		} catch (IllegalArgumentException e) {
			// exception not expected
			fail();
		}
		
		assertEquals(5, company.employees.size());
		assertEquals(new Employee("Heeyeon"	, 100, 1), company.employees.get("e1"));
		assertEquals(new Employee("Jiyoon"	, 500, 2), company.employees.get("e2"));
		assertTrue(company.employees.get("e3") == null);
		assertEquals(new Employee("Suyeon"	, 700, 2), company.employees.get("e4"));
		assertEquals(new Employee("Yuna"	, 500, 1), company.employees.get("e5"));
		assertTrue(company.employees.get("e6") == null);
		assertEquals(new Employee("Jihye"	, 700, 1), company.employees.get("e7"));
	}
	
	
	
	@Test
	public void test_addDepartment_abnormal() {
		addDepartments();
		
		try {
			company.addDepartment(2, new Department("PUBLIC RELATION", "Vancouver"));
			fail();
		} catch (IllegalArgumentException e) {
			// exception expected
		} 
	}
	
	@Test
	public void test_addDepartment_normal() {
		try {
			company.addDepartment(1, new Department("ACCOUNTING"	, "Toronto"));
			company.addDepartment(2, new Department("IT"			, "Seoul"));
			company.addDepartment(3, new Department("RESEARCH"	, "London"));
		} catch (IllegalArgumentException e) {
			// exception not expected
			fail();
		} 
		assertEquals(3, company.departments.size());
		assertEquals(new Department("ACCOUNTING", "Toronto"), company.departments.get(1));
		assertEquals(new Department("IT"		, "Seoul")	, company.departments.get(2));
		assertEquals(new Department("RESEARCH"	, "London")	, company.departments.get(3));
	}
	
	@Test
	public void test_removeDepartment_abnormal() {
		addDepartments();
		
		try {
			company.removeDepartment(4);
			fail();
		} catch (IllegalArgumentException e) {
			// exception expected
		} 
	}
	
	@Test
	public void test_removeDepartment_normal() {
		addDepartments();
		
		try {
			company.removeDepartment(2);
		} catch (IllegalArgumentException e) {
			// exception not expected
			fail();
		} 
		assertEquals(2, company.departments.size());
		assertEquals(new Department("ACCOUNTING", "Toronto"), company.departments.get(1));
		assertTrue(company.departments.get(2) == null);
		assertEquals(new Department("RESEARCH"	, "London")	, company.departments.get(3));
		
		try {
			company.removeDepartment(3);
		} catch (IllegalArgumentException e) {
			// exception not expected
			fail();
		} 
		assertEquals(1, company.departments.size());
		assertEquals(new Department("ACCOUNTING", "Toronto"), company.departments.get(1));
		assertTrue(company.departments.get(2) == null);
		assertTrue(company.departments.get(3) == null);
	}
	

	@Test
	public void test_getEmployeeName_abnormal() {
		addDepartments();
		addEmployees();
		
		try {
			String name = company.getEmployeeName("e8");
			fail();
		} catch (IllegalArgumentException e) {
			// exception expected
		} 
	}
	
	@Test
	public void test_getEmployeeName_normal() {
		addDepartments();
		addEmployees();
		
		try {
			assertEquals("Heeyeon"	, company.getEmployeeName("e1"));
			assertEquals("Jiyoon"	, company.getEmployeeName("e2"));
			assertEquals("Jaebin"	, company.getEmployeeName("e3"));
			assertEquals("Suyeon"	, company.getEmployeeName("e4"));
			assertEquals("Yuna"		, company.getEmployeeName("e5"));
			assertEquals("Sunhye"	, company.getEmployeeName("e6"));
			assertEquals("Jihye"	, company.getEmployeeName("e7"));
		} catch (IllegalArgumentException e) {
			// exception not expected
			fail();
		} 
	}
	
	@Test
	public void test_getEmployeeNames() {
		addDepartments();
		addEmployees();
		
		ArrayList<String> names;
		names = company.getEmployeeNames(1);
		assertEquals(3, names.size());
		assertTrue(names.contains("Heeyeon"));
		assertTrue(names.contains("Yuna"));
		assertTrue(names.contains("Jihye"));
		names = company.getEmployeeNames(2);
		assertEquals(2, names.size());
		assertTrue(names.contains("Jiyoon"));
		assertTrue(names.contains("Suyeon"));
		names = company.getEmployeeNames(3);
		assertEquals(2, names.size());
		assertTrue(names.contains("Jaebin"));
		assertTrue(names.contains("Sunhye"));
		// non-existing department id
		names = company.getEmployeeNames(4);
		assertEquals(0, names.size());
	}
	
	
	@Test
	public void test_getDepartment_abnormal() {
		addDepartments();
		addEmployees();
		
		try {
			Department name = company.getDepartmentInfo("e8");
			fail();
		} catch (IllegalArgumentException e) {
			// exception expected
		} 
	}
	
	@Test
	public void test_getDepartment_normal() {
		addDepartments();
		addEmployees();
		
		try {
			assertEquals(new Department("ACCOUNTING", "Toronto"), company.getDepartmentInfo("e1"));
			assertEquals(new Department("IT"		, "Seoul")	, company.getDepartmentInfo("e2"));
			assertEquals(new Department("RESEARCH"	, "London")	, company.getDepartmentInfo("e3"));
			assertEquals(new Department("IT"		, "Seoul")	, company.getDepartmentInfo("e4"));
			assertEquals(new Department("ACCOUNTING", "Toronto"), company.getDepartmentInfo("e5"));
			assertEquals(new Department("RESEARCH"	, "London")	, company.getDepartmentInfo("e6"));
			assertEquals(new Department("ACCOUNTING", "Toronto"), company.getDepartmentInfo("e7"));
			
		} catch (IllegalArgumentException e) {
			// exception not expected
			fail();
		} 
	}
	
	
	
	@Test
	public void test_getAverageSalary_abnormal() {
		addDepartments();
		addEmployees();
		
		try {
			double avgSalary = company.getAverageSalary(4);
			fail();
		} catch (IllegalArgumentException e) {
			// exception expected
		} 
	}
	
	@Test
	public void test_getAverageSalary_normal() {
		addDepartments();
		addEmployees();
		
		try {
			// precision of getAverageSalary is within a tolerance of +/- 0.1
			assertEquals((100 + 500 + 700) / 3.0, company.getAverageSalary(1), 0.1);
			assertEquals((500 + 700) / 2.0		, company.getAverageSalary(2), 0.1);
			assertEquals((700 + 600) / 2.0		, company.getAverageSalary(3), 0.1);
			
		} catch (IllegalArgumentException e) {
			// exception not expected
			fail();
		} 
	}
	
	@Test
	public void test_getDepartmentOfHighestAverageSalary_normal() {
		addDepartments();
		addEmployees();
		
		assertEquals(
			new Department("RESEARCH", "London"), 
			company.getDepartmentOfHighestAverageSalary());
	}

	
	
}
