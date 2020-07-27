package eecs1021.lab6;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Company Class collect and store information about employee and department 
 * The Company class used Java Collections (ArrayList and HashMap) 
 *
 */


public class Company {
	
	/*
	 * Each entry in a 'departments' map contains
	 * a unique department id and its associated information object.
	 */
	 HashMap<Integer, Department> departments;
	
	
	
	
	/*
	 * Each entry in a 'employees' map contains
	 * a unique employee id and its associated information object.
	 */
	 HashMap<String, Employee> employees;
	
	
	/**
	 * no-arg Constructor to initialize an empty company
	 *  
	 */
	public Company() {
		
	}

	
	
	
	/**
	 * Get the departments inside this company 
	 * 
	 * @return a reference to the  Map of all the departments exist inside this company 
	 */
	
	public HashMap<Integer, Department> getDepartments() {
		return departments;
	}





	/**
	 * Get the all employees working inside this company  
	 * @return   a reference to the Map of all the employees working for this company
	 */
	public HashMap<String, Employee> getEmployees() {
		return employees;
	}






	/**
	 * This method add a new employee to the company.
	 * This method does not allow duplicate employee and 
	 * throws an exception if the employee is already exist in the Company employee
	 * 
	 * @param employeeID : id of the new employee
	 * @param info :information object of the new employee
	 * @throws IllegalArgumentException if 'employeeID' is an existing employee id
	 */
	public void addEmployee(String employeeID, Employee info)  {
		try {
			if (employees.get(employeeID) == null) {
				throw new IllegalArgumentException("This employee is in the database.");
			} else {
				employees.put(employeeID, info);
			}
		} catch (Exception e) {
			
		}
	}
	
	
	/**
	 * Remove an existing employee entry from company and
	 * throws an exception if the employee is not  exist in the Company employee 
	 * @param employeeID :id of any given employee
	 * @throws IllegalArgumentException if 'employeeID' is not an existing employee id
	 */
	public void removeEmployee(String employeeID)  {
		try {
			if (employees.get(employeeID) == null) {
				throw new IllegalArgumentException();
			} else {
				employees.remove(employeeID);
			}
		} catch (Exception e){
			throw new IllegalArgumentException();
		}
	}
	
	
	/**
	 * Add a new department entry to the company
	 * This method does not allow duplicate department in the company and
	 * throws an exception if the department is already exist in the Company department 
	 * @param departmentID :id of the new department
	 * @param info information object of the new department
	 * @throws IllegalArgumentException if 'departmentID' is an existing department id
	 */
	public void addDepartment(Integer departmentID, Department info)  {
		try {
			if (departments.get(departmentID) == null) {
				throw new IllegalArgumentException();
			} else {
				departments.put(departmentID, info);
			}
		} catch (Exception e) {
			throw new IllegalArgumentException();
		}
	}
	
	
	/**
	 * Remove an existing department entry from the company and 
	 * throws an exception if the department is not  exist among the Company departments 
	 * @param departmentID :  id of any given  department
	 * @throws IllegalArgumentException if 'departmentID' is not an existing department id
	 */
	public void removeDepartment(Integer departmentID)  {
		try {
			if (departments.get(departmentID) == null) {
				throw new IllegalArgumentException();
			} else {
				departments.remove(departmentID);
			}
		} catch (Exception e) {
			throw new IllegalArgumentException();
		}
	}
	
	
	
	/**
	 * 
	 * This method implement employee movement between the company departments.
	 * So, it changes the department of employee with id 'employeeID' 
	 * to a new department ID given by input parameter  'newDepartmentID'.
	 * 
	 * You can assume that 'newDepartmentID' denotes a department ID  different from
	 * the current department ID of the employee denoted by 'employeeID'.
	 * 
	 * 
	 * @param employeeID : id of a given employee that we need to change his department
	 * @param newDepartmentID:  id of a new  department 
	 * @throws IllegalArgumentException if either employeeID is a non-existing employee id in this company 
	 * or newDepartmentID is a non-existing department id in this company.
	 */
	public void changeEmployeeDepartment(String employeeID, Integer newDepartmentID)  {
		try {
			if (employees.get(employeeID) != null) {
				employees.get(employeeID).setDepartmentId(newDepartmentID);
			} else {
				throw new IllegalArgumentException();
			}
		} catch (Exception e) {
			throw new IllegalArgumentException();
		}
	}
	
	
	/**
	 * This method return the name of the employee inside this company. 
	 * 
	 * Retrieve the name of employee with id 'employeeID'.
	 * 
	 * 
	 * @param employeeID id of some employee
	 * @return name of the employee with id 'employeeID'.
	 * @throws IllegalArgumentException if 'employeeID' is not an existing employee id in this company
	 */
	public String getEmployeeName(String employeeID)  {
		return employees.get(employeeID).getName();
	}
	
	
	
	/**
	 * This method collect the names of employee in any given department and return an 
	 * <code>ArrayList </code>object contains these names.
	 * <p>
	 * Retrieve the names of all employees of the department with id 'departmentID'.
	 * If 'departmentID' a non-existing department id in this company, then return an empty list.
	 * </p>
	 * @param departmentID : id of a given  department
	 * @return <code>ArrayList </code> object   of names of employees whose 
	 * employed (linked )  by a department has id 'departmentID'
	 */
	public ArrayList<String> getEmployeeNames(Integer departmentID) {
		ArrayList<String> names = new ArrayList<>();
		for (int i = 0; i < employees.size(); i++) {
			if (employees.get(i).getDepartmentId() == departmentID) {
				names.add(employees.get(i).getName());
			}
		}
		
		return names;
	}
	
	
	/**
	 * This method return the department information where a given employee working.
	 * The employee id is given by input parameter 'employeeID'.
	 *   
	 * Retrieve an employee's department's information object.
	 *   
	 * @param employeeID  : id of any given  employee
	 * @return The information object of the employee's  department
	 * @throws IllegalArgumentException if 'employeeID' is not an existing employee id in this company
	 */
	public Department getDepartmentInfo(String employeeID)  {
		int index = employees.get(employeeID).getDepartmentId();
		return departments.get(index);
	}
	
	
	
	/**
	 * This method check the salary of employee in any given department 
	 * and compute the average salary of all employee belonging to this department.
	 * <p>
	 * Retrieve the average salary of all employees in department with id 'departmentID'.
	 * </p>
	 * @param departmentID :  id of any  given  department 
	 * @return  average salary of all employees in department with id 'departmentID'
	 * @throws IllegalArgumentException  if departmentID is not an existing department id in this company
	 */
	public double getAverageSalary(Integer departmentID)  {
		if (departments.containsKey(departmentID)) throw new IllegalArgumentException();
		double total = 0;
		int count = 0;
		for (int i = 0; i < employees.size(); i++) {
			if (employees.get(i).getDepartmentId() == departmentID) {
				total += employees.get(i).getSalary();
				count ++;
			}
		}
		return (total / (double) count);
	}


	/**
	 * This method determine the department with highest average salary of its employees.
	 * 
	 * <p>
	 * For each department belonging to this company department, 
	 *  this method compute the average salary of employees. 
	 *  Then return the department that has the highest average salary among the company departments
	 * </p>
	 * 
	 * <p> 
	 * In summary, retrieve the information object of the department 
	 * with the highest average salary among its employees.
	 * <p>
	 * @return the information object of the department with the highest average salary among its employees
	 * 
	 * Hint: Use 'getAverageSalary(Integer departmentID)' as a helper method.
	 */
	public Department getDepartmentOfHighestAverageSalary() {	
		ArrayList<Integer> avgSalaries = new ArrayList<>();
		double total = Double.MIN_VALUE;
		int max = 0;
		for (int i = 0; i < departments.size(); i++) {
			if (total < getAverageSalary(i)) {
				max = i;
			}
			total = Math.max(getAverageSalary(i), total);
		}
		return departments.get(max);
		
		
	}
	
	

}
