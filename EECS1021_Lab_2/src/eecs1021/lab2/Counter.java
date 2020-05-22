package eecs1021.lab2;

/**
 * A simple counter. A counter keeps track of an integer value that can be
 * changed in steps of 1 (the counter can be incremented or decremented). A
 * counter provides a method to get and set the value of the counter value .
 * 
 * 
 *
 */
public class Counter {

	/*
	 * To be able to complete this Class, you need to read the API of this class
	 * Hint: Use the CounterTest class to help you test you work
	 * 
	 */

	private int value;

	Counter() {
		value = 0;
	}

	Counter(int value) {
		this.value = value;
	}

	public void decr() {
		this.value -= 1;
	}

	public void decrbyValue(int value) {
		this.value -= value;
	}

	public int getValue() {
		int temp = this.value; // Tactic from EECS 2030 (protect the main variable by giving the copy)
		return temp;
	}

	public void incr() {
		this.value += 1;
	}

	public void incrbyValue(int value) {
		this.value += value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String toString() {
		return "(Counter is " + this.value + ")";
	}

}
