package com.exercise.lecture2;

import javax.swing.JOptionPane; // importing the javax.swing class in order to use dialog box in my code

/**
 * static boolean isEven(int x) --> returns true is number is even
 * static long absolute(long x) --> returns the absolute value of x
 * static double hypotenuse (double x, double y) --> returns sqrt(x^2 + y^2)
 * static double max (double a, double b) --> returns max of a or b
 * static double min (double a, double b ) --> returns min of a or b
 * 
 * Write an application that allows the user to select between the above methods and
 * returns the response to the user.
 * 
 * @author Samuel
 *
 */
public class MathClassTest {

	public static void main(String[] args) {
		
		/* used to test the functions on MyMath.java class, here is how all of this begin
		 * then I change it to make this tester use javax.swing class in order to display using 
		 * dialog boxes.
		 * 
		 // is Even
		System.out.println(MyMath.isEven(-100));
		
		// Absolute value of an integer
		System.out.println(MyMath.absolute(-10));
		
		// Hypotenuse of two values
		System.out.println(MyMath.hypotenuse(3, 4));
		
		// Max of two values
		System.out.println(MyMath.max(3, -4));
		
		// Min of two values
		System.out.println(MyMath.min(3, -4));
		
		*/
		
		boolean repeat;
		do {
			//String name = JOptionPane.showInputDialog(null, "Enter your name", "Enter name", JOptionPane.PLAIN_MESSAGE);
			String option = JOptionPane.showInputDialog(null,"Choose 'a' or 'A' to determine if a number is EVEN or not. \n" // options
					+ "Choose 'b' or 'B' to determine the ABSOLUTE value of a number. \n" // the (+) sign concatenate the all of the followings Strings as one
					+ "Choose 'c' or 'C' to determine the HYPOTENUSE of two values. \n"
					+ "Choose 'd' or 'D' to determine the MAXIMUM of two values. \n"
					+ "Choose 'e' or 'E' to determine the MINIMUM of two values. \n"
					+ "Choose 'q' or 'Q' to quit this simple application. \n\n"	
					, "My Math class, by S. Mayol", JOptionPane.QUESTION_MESSAGE); // title bar of the dialog box
			repeat = true;
			
			if (option.equals("Q") || option.equals("q")) {
				JOptionPane.showMessageDialog(null, "Thank you for participating...", "by Samuel Mayol", JOptionPane.INFORMATION_MESSAGE);
				repeat = false;
				System.exit(0);
			} else {
				if (option.equals("A")||option.equals("a")){
					try { // to prevent that the value inserted is an integer and not a letter
						String val = JOptionPane.showInputDialog("Enter a number to deternine if the number is even");
						JOptionPane.showMessageDialog(null, "Is the number " + val + " even? " + MyMath.isEven(Integer.valueOf(val)),
								"Even", JOptionPane.INFORMATION_MESSAGE); // add a title message on a dialog box
						repeat = true;
					} catch(Exception e){
						JOptionPane.showMessageDialog(null, "The input " + option + " is not valid integer, please try again", "WARNING!!!", 
								JOptionPane.WARNING_MESSAGE);
					}
				}
				else if (option.equals("B")||option.equals("b")){
					try { 
						String val = JOptionPane.showInputDialog("Enter a number to calculate absolute value of that number");
						JOptionPane.showMessageDialog(null, "The absolute value of " + val + " is: " + MyMath.absolute(Long.valueOf(val)), 
								"Absolute", JOptionPane.INFORMATION_MESSAGE);
						repeat = true;
					} catch(Exception e){
						JOptionPane.showMessageDialog(null, "The input " + option + " is not valid integer, please try again", "WARNING!!!", 
								JOptionPane.WARNING_MESSAGE);
					}
				}
				else if (option.equals("C")||option.equals("c")){
					try {
						String val = JOptionPane.showInputDialog("Enter the first side to calculate the hypotenuse");
						String val2 = JOptionPane.showInputDialog("Enter the second side to calculate the hypotenuse");
						JOptionPane.showMessageDialog(null, "The hypotenuse of " + val + " and " + val2 + " is: " + MyMath.hypotenuse(Double.valueOf(val), Double.valueOf(val2)),
								"Hypotenuse", JOptionPane.INFORMATION_MESSAGE);
						repeat = true;
					} catch(Exception e){
						JOptionPane.showMessageDialog(null, "The any of the inputs " + option + " are not valid integer, please try again", "WARNING!!!", 
								JOptionPane.WARNING_MESSAGE);
					}
				}
				else if (option.equals("D")||option.equals("d")){
					try {
						String val = JOptionPane.showInputDialog("Enter the first number to calculate the max value");
						String val2 = JOptionPane.showInputDialog("Enter the second number to calculate the max value");
						JOptionPane.showMessageDialog(null, "The max of " + val + " and " + val2 + " is: " + MyMath.max(Double.valueOf(val), Double.valueOf(val2)),
								"Maximum", JOptionPane.INFORMATION_MESSAGE);
						repeat = true;
					} catch(Exception e){
						JOptionPane.showMessageDialog(null, "The any of the inputs " + option + " are not valid integer, please try again", "WARNING!!!", 
								JOptionPane.WARNING_MESSAGE);
					}
				}
				else if (option.equals("E")||option.equals("e")){
					try {
						String val = JOptionPane.showInputDialog("Enter the first number to calculate the min value");
						String val2 = JOptionPane.showInputDialog("Enter the second number to calculate the min value");
						JOptionPane.showMessageDialog(null, "The min of " + val + " and " + val2 + " is: " + MyMath.min(Double.valueOf(val), Double.valueOf(val2)),
								"Minimum", JOptionPane.INFORMATION_MESSAGE);
						repeat = true;
					} catch(Exception e){
						JOptionPane.showMessageDialog(null, "The any of the inputs " + option + " are not valid integer, please try again", "WARNING!!!", 
								JOptionPane.WARNING_MESSAGE);
					}
				}
				else
					JOptionPane.showMessageDialog(null, "The input " + option + " is not valid, please try again", "A, B, C, D, E, or Q", 
						JOptionPane.WARNING_MESSAGE);
			}
		} while(repeat);
	}

}
