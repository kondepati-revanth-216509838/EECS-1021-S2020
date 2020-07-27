package eecs1021.lab8;

import java.util.*;

/**
 * 
 * A class for simple chair. The Chair is a Furniture item that has some fields
 * (attributes). <strong>This class store the color, manufacturing cost and
 * shape of a chair </strong>.
 * 
 * 
 * <p>
 * <strong> NOTE: In this class, all string comparisons are carried out with
 * case insensitive </strong>
 * </p>
 *
 */

public class Chair {
	/**
	 * The total number of Chairs created ( or manufactured) using the Chair Class
	 * numChairs is a static variable that will be incremented each time a new Chair
	 * object is created and keeps track of the total number of Chair objects that
	 * have been created.
	 * 
	 * 
	 */

	// COMPLETE THIS
	protected static int numChairs = 0;
	/**
	 * The Id of chair object
	 * 
	 * All instances of a chair are given a unique int id. These are to be assigned
	 * by the chair constructor. The first instance of a chair that is created is
	 * assigned an id of 0 (zero); the next is assigned 1.
	 * 
	 */
	private int id;

	/**
	 * The Chair manufacturing cost . The manufacturing cost chair is positive value
	 * 
	 * This manufacturing cost does not represent the actual chair cost( or selling
	 * price). The actual chair cost will be determined based on the type of the
	 * chair and other additional factors
	 * 
	 * 
	 * 
	 */
	private double chairManufCost;

	/**
	 * The chair shape. The chair shape can be one of the following shapes
	 * {Rectangle or Square}
	 * <p>
	 * <strong>It should be noted that shapes string comparisons are carried out
	 * with case insensitive For example, these strings are equals "Rectangle",
	 * "RECtangle", "RECTANGLE",...</strong>
	 * </p>
	 */
	private String chairShape;

	/**
	 * The chair Color The chair color can be one of the following colors {black or
	 * white}
	 * <p>
	 * <strong>It should be noted that color string comparisons are carried out with
	 * case insensitive For example, these strings are equals "black", "Black",
	 * "BLACK",...</strong>
	 * </p>
	 * 
	 */
	private String chairColor;

	/**
	 * Initializes this chair with color of the chair to <strong>WHITE</strong> and
	 * chair shape to <strong>Rectangle</strong>. and initialize the chair initial
	 * manufacturing cost to zero dollar.
	 * 
	 * <p>
	 * <strong>Notes: The numChairs field variable is incremented each time a new
	 * chair object created </strong>
	 * </p>
	 */
	public Chair() {

		// COMPLETE THIS
		this.chairColor = "WHITE";
		this.chairShape = "RECTANGLE";
		this.chairManufCost = 0;
		this.id = new Integer(numChairs);
		numChairs++;

	}

	/**
	 * Initializes this chair to the specified fields
	 * 
	 * 
	 * @param chairManufCost the chair manufacturing cost
	 * @param chairShape     the chair shape
	 * @param chairColor     the chair color
	 * 
	 * 						@pre.
	 *                       <p>
	 *                       <strong> Precondition </strong>
	 *                       </p>
	 *                       <p>
	 *                       The chair color should be one of the following choices
	 *                       , <strong><code>{black or  white} </code></strong>,
	 *                       </p>
	 *                       <p>
	 *                       <strong>It should be noted that colors string
	 *                       comparisons are carried out with case insensitive For
	 *                       example, these strings are equals "black", "Black",
	 *                       "BLACK",...</strong>
	 *                       </p>
	 * 
	 *                       <p>
	 *                       The chair shape should be one of the following choices
	 *                       <strong><code>{Rectangle or Square} </code></strong>,
	 *                       </p>
	 *                       <p>
	 *                       <strong>It should be noted that shapes string
	 *                       comparisons are carried out with case insensitive For
	 *                       example, these strings are equals "Rectangle",
	 *                       "RECtangle", "RECTANGLE",...</strong>
	 *                       </p>
	 *                       <p>
	 *                       and, the chair manufacturing cost should be positive
	 *                       real number
	 *                       </p>
	 * 
	 * @throws IllegalArgumentException
	 *                                  <p>
	 *                                  if the manufacturing Cost of chair is
	 *                                  negative value
	 *                                  </p>
	 * 
	 * 
	 * @throws IllegalArgumentException
	 *                                  <p>
	 *                                  if the chair color is not one of possible
	 *                                  chair colors
	 *                                  </p>
	 *                                  .
	 * 
	 * @throws IllegalArgumentException
	 *                                  <p>
	 *                                  if the chair shape is not one of the
	 *                                  possible chair shapes
	 *                                  </p>
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	public Chair(double chairManufCost, String chairShape, String chairColor) {

		// COMPLETE THIS
		List<String> choice = new ArrayList<>();
		choice.add("WHITE");
		choice.add("BLACK");

		choice.add("RECTANGLE");
		choice.add("SQUARE");

		try {
			if (!choice.contains(chairColor.toUpperCase())) {
				throw new IllegalArgumentException();
			}

			if (!choice.contains(chairShape.toUpperCase())) {
				throw new IllegalArgumentException();
			}

			if (chairManufCost < 0.0) {
				throw new IllegalArgumentException();
			}

			this.chairColor = chairColor.toUpperCase();
			this.chairShape = chairShape.toUpperCase();
			this.chairManufCost = chairManufCost;
			this.id = new Integer(numChairs);
			numChairs++;
		} catch (IllegalArgumentException e) {
			throw new IllegalArgumentException();
		}

	}

	/**
	 * Return the number of chairs that have been created
	 * 
	 * @return numChairs The total number of Chair created so far
	 */
	public static int getNumberofChairCreated() {

		// COMPLETE THIS
		return numChairs;
	}

	/**
	 * This method decrement ( reduce ) the number of chairs that have been created
	 * by 1
	 * 
	 * 
	 */
	public static void decrementNumberofChairCreated() {

		// COMPLETE THIS
		numChairs--;
	}

	/**
	 * getId method
	 * 
	 * @return id The ID of created Chair object
	 */
	public final int getId() {
		// COMPLETE THIS
		return this.id;
	}

	/**
	 * This method set chair color
	 * 
	 * @param chairColor the chair color
	 * 
	 * 
	 */
	protected void setChairColor(String chairColor) {
		this.chairColor = chairColor;
	}

	/**
	 * This method set chair Shape
	 * 
	 * @param chairShape the chair shape
	 * 
	 * 
	 */
	protected void setChairShape(String chairShape) {
		this.chairShape = chairShape;
	}

	/**
	 * 
	 * @param chairManufCost the chair manufacturing cost
	 * 
	 * @throws IllegalArgumentException
	 *                                  <p>
	 *                                  if the manufacturing Cost of chair is
	 *                                  negative value
	 *                                  </p>
	 * 
	 * 
	 */
	protected void setChairManufCost(double chairManufCost) {
		try {
			if (chairManufCost < 0.0) {
				throw new IllegalArgumentException("Invalid cost");
			}
			this.chairManufCost = chairManufCost;
		} catch (IllegalArgumentException e) {
			throw e;
		}
	}

	/**
	 * Set the chair color and shape to the given values
	 * 
	 * @param chairColor the chair color
	 * @param chairShape the chair shape
	 * 
	 * 
	 * @throws IllegalArgumentException
	 *                                  <p>
	 *                                  if the chair shape is not one of possible
	 *                                  chair shapes
	 *                                  </p>
	 *                                  .
	 * @throws IllegalArgumentException
	 *                                  <p>
	 *                                  if the chair color is not one of possible
	 *                                  chair colors
	 *                                  </p>
	 *                                  .
	 */
	private void set(String chairColor, String chairShape) {

		List<String> choice = new ArrayList<>();
		choice.add("RECTANGLE");
		choice.add("SQUARE");
		choice.add("WHITE");
		choice.add("BLACK");

		try {

			if (!choice.contains(chairColor.toUpperCase())) {
				throw new IllegalArgumentException();
			}

			if (!choice.contains(chairShape.toUpperCase())) {
				throw new IllegalArgumentException();
			}

			this.setChairColor(chairColor);
			this.setChairShape(chairShape);
		} catch (IllegalArgumentException e) {
			throw e;
		}

	}

	/**
	 * Check if the chair shape is one of possible chair shapes
	 * 
	 * @param chairShape the chair shape
	 * 
	 * @throws IllegalArgumentException
	 *                                  <p>
	 *                                  if the chair shape is not one of possible
	 *                                  chair shapes
	 *                                  </p>
	 *                                  .
	 */

	private void checkChairShape(String chairShape) {
		List<String> s = new ArrayList<>();
		s.add("BLACK");
		s.add("WHITE");

		try {
			if (!s.contains(chairShape.toUpperCase())) {
				throw new IllegalArgumentException();
			}
		} catch (IllegalArgumentException e) {
			throw e;
		}
	}

	/**
	 * Check if the chair color is one of possible chair colors
	 * 
	 * @param chairColor the chair color
	 * 
	 * @throws IllegalArgumentException
	 *                                  <p>
	 *                                  if the chair color is not one of possible
	 *                                  chair colors
	 *                                  </p>
	 *                                  .
	 */

	private void checkChairColor(String chairColor) {
		List<String> c = new ArrayList<>();
		c.add("RECTANGLE");
		c.add("SQUAREE");

		try {
			if (!c.contains(chairColor.toUpperCase())) {
				throw new IllegalArgumentException();
			}
		} catch (IllegalArgumentException e) {
			throw e;
		}
	}

	/**
	 * Get the chair initial cost
	 * 
	 * @return the chair initial cost
	 */
	public final double getChairManufCost() {
		// ALREADY IMPLEMENTED; DO NOT MODIFY
		return this.chairManufCost;
	}

	/**
	 * Get the chair shape
	 * 
	 * @return the chair shape, the String converted to uppercase
	 */
	public final String getChairShape() {
		// ALREADY IMPLEMENTED; DO NOT MODIFY
		return this.chairShape.toUpperCase();
	}

	/**
	 * Get the chair color
	 * 
	 * @return the chair color, the String converted to uppercase
	 */
	public final String getChairColor() {
		// ALREADY IMPLEMENTED; DO NOT MODIFY
		return this.chairColor.toUpperCase();
	}

	/**
	 * Get the string representation of the chair. The string is chair Shape, chair
	 * shape, chair initial cost .
	 * 
	 * The return string contains only capital letters
	 * <p>
	 * For example:
	 * </p>
	 * 
	 * <pre>
	 * if Chair b  = new Chair(12.5, "Rectangle","whitE");
	 * the System.out.println(b); returns 
	 * RECTANGLE, WHITE, 12.5
	 * 
	 * </pre>
	 * 
	 * @return the string representation of the chair
	 */
	public String toString() {
		return this.chairShape + ", " + this.chairColor + ", " + this.chairManufCost;
	}

}
