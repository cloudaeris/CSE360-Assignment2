//Name: Perot Nguyen
//CSE 360 M-3:10
//Assignment: 1 
// This is not a file header
package cse360assign2;

public class Calculator {
/**
 * Calculator class
 * <p>
 * @author Perot Nguyen, CSE360 M-3:10, Class ID: 508, Assignment 1
 * @version "%U%, %G%"
 */
	private int total;
	
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	public int getTotal () {
		return total;
	}
	
	public void add (int value) {
		total = total + value;
	}
	
	public void subtract (int value) {
		total = total - value;
	}
	
	public void multiply (int value) {
		total = total * value;
	}
	
	public void divide (int value) {
		if(!(value==0))
		{
			total = total / value;
		}
		else
		{
			total = 0;
		}
	}
	
	public String getHistory () {
		return "";
	}
}