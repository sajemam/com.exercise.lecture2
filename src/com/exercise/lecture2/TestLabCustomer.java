package com.exercise.lecture2;

//this class is complemented with class  LabCustomer.java
public class TestLabCustomer {

	public static void main(String[] args) {
		// Instantiating an object of class LabCustomer and creating three customers objects
		LabCustomer cust1 = new LabCustomer("Juan Melendez", 123457789);
		LabCustomer cust2 = new LabCustomer("Mary Lee", 125997536);
		LabCustomer cust3 = new LabCustomer(124963574); // when instantiating with no "name", the default (John Doe) is printed 
		
		/**
		 * Once you've instantiated an object and have an object variable,
		 * you can use object variable to call an instance method. 
		 * 	e.g.:
		 * 	object variables: cust1, cust2, cust3
		 * 	call the method toString() using the object variable and dot [.] in order to perform the method call.
		 */
		// calling method toString() in class LabCustomer to print customer values
		System.out.println(cust1.toString());
		System.out.println(cust2.toString());
		System.out.println(cust3.toString());

	}

}
