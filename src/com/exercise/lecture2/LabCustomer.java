package com.exercise.lecture2;

/**
 * 1) Create a Customer class that has the following attributes:
 * name, SSN.
 * 2) This class shoud have two methods: getName() and getSSN().
 * 3) If the class is instantiated with only a SSN, then give the default name of "John Doe". (HINT: Use two constructors)
 * 4) Also, add a method toString(), that returns a string representation of the customer object (name and SSN concatenated).
 * 		Make sure to set this method public.
 * 5) Create a class to test your program (e.g. a class that include the main() method). In your test program, instantiate
 * 		three customers and print out the value using toString() method.
 * 
 * @author Samuel M.
 *
 */

//this class is complemented with class  TestLabCustomer.java
public class LabCustomer {
	private String name;
	private int socialSecurityNum;
	
	// constructors
	public LabCustomer(String name, int socialSecurityNum) {
		this.name = name;
		this.socialSecurityNum = socialSecurityNum;
	}
	
	/** The keyword 'this' can be used to call a constructor from a constructor,
	 * when writing several constructor for a class, there are times when
	 * you'd like to call one constructor from another to avoid duplicate code.
	 */
	// Account with This() on a second constructor
	public LabCustomer(int socialSecurityNum) {
		this("John Doe", socialSecurityNum); // default name is printed if only the SSN is provided
	}
	
	// getters and setters
	String getName() {
		return name;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	int getSSN() {
		return socialSecurityNum;
	}
	
	void setSSN(int socialSecurityNum) {
		this.socialSecurityNum = socialSecurityNum;
	}

	
	// instance method
	public String toString() { //overriding the toString() method 
		return ("Customer name: " + getName() + ", SSN#: " + getSSN() ); // concatenating the name and SSN
		
	}
}
