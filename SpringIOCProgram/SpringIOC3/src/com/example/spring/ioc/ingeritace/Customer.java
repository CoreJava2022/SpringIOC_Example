package com.example.spring.ioc.ingeritace;

//class
public class Customer {

	// Class data members
	private String name;
	private String email;
	private String country;

	// Getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		// this keyword refers to current instance itself
		this.email = email;
	}

	// Method
	public String getCountry() {
		return country;
	}

	// Setter
	public void setCountry(String country) {
		this.country = country;
	}

	// Method
	// To show message
	@Override
	public String toString() {
		// Print corresponding customer attributes
		return " Name:" + name + "\n Email:" + email + "\n Country:" + country;
	}
}
