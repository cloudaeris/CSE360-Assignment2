//Name: Perot Nguyen
//CSE 360 M-3:10
//Assignment: 1 
// This is not a file header
package cse360assign2;

public class Calculator {
/**
 * Calculator class manipulates an integer variable which was initialized to 0. 
 * User can decide to add, subtract, multiply, or divide an integer value onto 
 * the integer variable that was initialized. Each action is recorded into a 
 * getHistory function which when called, will print a string of the actions 
 * dealt to the variable.
 * <p>
 * This assignment is also suppose to help the programmer use applications such 
 * as GitHub or BitBucket as a way to push and pull code from a repository off 
 * a local file, cloud server, or the Internet. Grading will be based off of 
 * the coding sent as a .java file on Blackboard as well as the repository which
 * will be linked with the access information in the comments 
 * for the assignment submittal. 
 * <p>
 * Any assistance required with the 
 * process using GitHub should be directed to this tutorial by Dr. Brian Fraser: 
 * https://www.youtube.com/watch?v=HuhJ22oHyfc
 * 
 * @author Perot Nguyen, CSE360 M-3:10, Class ID: 508, Assignment 1
 * @version %U%, %G%
 */
	private int total; 				// Variable being manipulated by the user
	private String history = ""; 	// String variable for getHistory
	
	/**
	 * Base Constructor: initializes total set to 0. Included for clarity.
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * getTotal Method returns the value located in private variable 'total'.
	 * total's value may be manipulated from user interactions.
	 *
	 * @return total - Integer variable that will return its last value before
	 * getTotal was ran 
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * add Method does addition onto the 'total' variable 
	 * with its integer parameter 'value'. 
	 * 
	 * @param value - Integer variable that will be added to the total value
	 */
	public void add (int value) {
		total = total + value;
		history += "+ " + value + " ";
	}
	
	/**
	 * subtract Method does subtraction onto the 'total' variable 
	 * with its integer parameter 'value'. 
	 * 
	 * @param value - Integer variable that will be subtracted to 
	 * the total value
	 */
	public void subtract (int value) {
		total = total - value;
		history += "- " + value + " ";
	}
	
	/**
	 * multiply Method does multiplication onto the 'total' variable 
	 * with its integer parameter 'value'. 
	 * 
	 * @param value - Integer variable that will be multiplied onto
	 * the total value
	 */
	public void multiply (int value) {
		total = total * value;
		history += "* " + value + " ";
	}
	
	/**
	 * divide Method does division onto the 'total' variable 
	 * with its integer parameter 'value'. 
	 * 
	 * @param value - Integer variable that will divide the total value
	 */
	public void divide (int value) {
		if(!(value==0))
		{
			total = total / value;
		}
		else
		{
			total = 0;
		}
		history += "/ " + value + " ";
	}
	
	/**
	 * getHistory Method returns all actions done to the integer  
	 * variable 'total' by using the string variable 'history' which was 
	 * modified after each action. A string value is returned from this method
	 * with the various actions recorded.
	 * @return "\n0" + history - a base string which goes to a new line and
	 * stores the value '0', and the string variable 'history' which had
	 * recorded all actions done to the total value by the user's choices.
	 */
	public String getHistory () {
		return "\n0 " + history;
	}
}