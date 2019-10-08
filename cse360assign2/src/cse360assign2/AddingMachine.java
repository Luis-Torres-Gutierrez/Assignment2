package cse360assign2;

/**
 * @author Luis Torres
 * ltorresg
 * Assignment 2
 *
 * The AddingMachine class contains methods to add and subtract a value from the total value,<br>
 * a method to print the transaction history, and a method to clear the total and history. 
 */

public class AddingMachine {
	
	private int total;
	private String history;
	
	/**
	 * Creates a new instance of the AddingMachine class. 
	 */
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
		history = "0";
	}
	
	/**
	 * Returns the current total value.
	 * 
	 * @return integer representation of the total value
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * Adds a value to the total and adds transaction to history.
	 * 
	 * @param value integer value to be added to the total.
	 */
	public void add (int value) {
		history += " + " + value;
		total += value;
	}
	
	/**
	 * Subtracts a value from the total and adds transaction to history.
	 * 
	 * @param value integer value to be subtracted from the total.
	 */
	public void subtract (int value) {
		history += " - " + value;
		total -= value;
	}
	
	/**
	 * Returns a string of the transaction history.
	 * 
	 * @return string representation of the summary of the transactions performed.
	 */
	public String toString () {
		return history;
	}

	/**
	 * Clears the total value and history.
	 */
	public void clear() {
		total = 0;
		history = "0";
	}
}


