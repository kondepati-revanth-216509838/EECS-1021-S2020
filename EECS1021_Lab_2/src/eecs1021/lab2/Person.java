package eecs1021.lab2;

/**
 * 
 * A simple class Person. person object store name, address, phone and email of
 * any given person
 *
 */
public class Person {

	/*
	 * To be able to complete this Class, you need to read the API of this class
	 * Hint: Use the PersonTest class to help you test you work
	 * 
	 */

	String address, email, name, phone;

	Person() {
		this.address = "Unknown";
		this.email = "Unknown";
		this.name = "Unknown";
		this.phone = "Unknown";
	}

	Person(Person other) {
		this.address = other.address;
		this.email = other.email;
		this.name = other.name;
		this.phone = other.phone;
	}

	Person(String name, String address, String phone, String email) {
		this.address = address;
		this.phone = phone;
		this.email = email;
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public String getEmail() {
		return email;
	}

	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String toString() {
		return "Name: " + this.getName() + "\nAddress: " + this.getAddress() + "\nPhone number: " + this.getPhone()
				+ "\nEmail address: " + this.getEmail();
	}

}
