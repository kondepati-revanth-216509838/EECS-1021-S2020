package eecs1021.lab6;

/**
 * Employee Class use to create Employee object 
 * 
 *
 */
public class Employee {
	
	
	
	private String name;
	private double salary;
	private Integer departmentId;
	
	/** 
	 * Custom  Constructor use to create employee object byy 
	 * setting name ,  salary and department 
	 * @param name the name to set  
	 * @param salary to salary to set
	 * @param departmentId to departmentId to set
	 */
	public Employee(String name, double salary, Integer departmentId) {
		this.name = name; 
		this.salary = salary;
		this.departmentId = departmentId;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}
	
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	/**
	 * @return the departmentId
	 */
	public Integer getDepartmentId() {
		return departmentId;
	}
	
	/**
	 * @param departmentId the departmentId to set
	 */
	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}	
	
	
	/**
	 * Two Employee objects are equal if their name, salary, and
	 * department id are equal.
	 * 
	 * @return Whether this Employee object equals 'obj', return true if equal and 
	 * return false otherwise  
	 * 			
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return 
					this.getName().equals(other.getName())
				&&	this.getSalary() == other.getSalary()
				&& 	this.getDepartmentId().equals(other.getDepartmentId());
	}

}
