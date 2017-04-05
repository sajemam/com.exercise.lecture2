package com.exercise.lecture2;

/**
 * Create a class call "MyMath" that has the following class methods:
 * static boolean isEven(int x) --> returns true is number is even
 * static long absolute(long x) --> returns the absolute value of x
 * static double hypotenuse (double x, double y) --> returns sqrt(x^2 + y^2)
 * static double max (double a, double b) --> returns max of a or b
 * static double min (double a, double b ) --> returns min of a or b
 * 
 * @author Samuel
 *
 */
public class MyMath {
	
	/**
	 * An even number is an integer which is "evenly divisible" by two. 
	 * This means that if the integer is divided by 2, it yields no remainder. 
	 * Zero is an even number because zero divided by two equals zero, which despite not being a natural number, is an integer. 
	 * Even numbers can be either positive or negative.
	 * 
	 * @param x
	 * @return
	 */
	static boolean isEven(int x){
		if (x % 2 == 0) 
			return true;
		else
			return false;
	}
	
	/**
	 * In mathematics, the absolute value or modulus of a real number is the number without the sign. 
	 * The absolute value of 2 is 2, the absolute value of -2 is also 2.
	 * 
	 * @param x
	 * @return
	 */
	static long absolute(long x) {
		if (x >= 0)
			return x;
		else
			return (-1*x); 
	}
	
	/**
	 * The hypotenuse is the side opposite the 90 degrees angle in a right triangle. It is always the longest side.
	 * 
	 * @param x
	 * @param y
	 * @return
	 */
	static double hypotenuse (double x, double y) {
		return Math.sqrt((x * x) + (y * y));
	}
	
	/**
	 * Maximum of two values
	 * @param a
	 * @param b
	 * @return
	 */
	static double max (double a, double b) {
		if (a >= b)
			return a;
		else
			return b;		
	}
	
	/**
	 * Minimum of two values
	 * @param a
	 * @param b
	 * @return
	 */
	static double min (double a, double b ) {
		if (a < b)
			return a;
		else
			return b;
	}	

}
