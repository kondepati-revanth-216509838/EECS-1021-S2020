package eecs1021.lab6;

/**
 * Department Class use to create department object 
 * 
 *
 */

public class Department {
	
	private String name;
	private String location;
	
	/** 
	 * Custom Constructor use to create department object by 
	 * setting name and location of the department object 
	 * @param name the name to set
	 * @param location the location to set
	 */
	public Department(String name, String location) {
		this.name = name;
		this.location = location;
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
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}
	
	/**
	 * Two Department  objects are equal if their name and location are equal.
	 * 
	 * @return Whether this Department object equals 'obj', return true if two departments are 
	 * equal and return false otherwise.
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		return 
					this.getName().equals(other.getName())
				&&	this.getLocation().equals(other.getLocation());
	}
	

}
