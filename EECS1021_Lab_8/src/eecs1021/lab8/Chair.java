package eecs1021.lab8;

import java.util.*;

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
		this.chairManufCost = 0.0;

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
		try {
			if (chairManufCost < 0.0) {
				throw new IllegalArgumentException("Invalid manufacturing cost.");
			}

			boolean checkShape = chairShape.toUpperCase().equals("SQUARE")
					|| chairShape.toUpperCase().equals("RECTANGLE");
			if (checkShape) {
				throw new IllegalArgumentException("Invalid chair shape.");
			}

			boolean checkColor = chairColor.toUpperCase().equals("BLACK") || chairShape.toUpperCase().equals("WHITE");
			if (checkColor) {
				throw new IllegalArgumentException("Invalid chair color.");
			}

			this.chairColor = chairColor;
			this.chairManufCost = chairManufCost;
			this.chairShape = chairShape;
			this.id = 0;

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

		// COMPLETE THIS
		ArrayList<String> colorChoice = new ArrayList<>();
		colorChoice.add("WHITE");
		colorChoice.add("BLACK");

		try {
			if (colorChoice.contains(chairColor.toUpperCase())) {
				this.chairColor = chairColor;
			} else {
				throw new IllegalArgumentException();
			}
		} catch (IllegalArgumentException e) {
			throw new IllegalArgumentException();
		}
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

		// COMPLETE THIS
		List<String> shapeChoice = new ArrayList<>();
		shapeChoice.add("RECTANGLE");
		shapeChoice.add("SQUARE");
		try {
			if (shapeChoice.contains(chairShape.toUpperCase())) {
				this.chairShape = chairShape;
			} else {
				throw new IllegalArgumentException();
			}
		} catch (IllegalArgumentException e) {
			throw new IllegalArgumentException();
		}
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

		// COMPLETE THIS

		try {
			if (chairManufCost < 0.0) {
				throw new IllegalArgumentException();
			} else {
				this.chairManufCost = chairManufCost;
			}
		} catch (Exception e) {
			throw new IllegalArgumentException();
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

		// COMPLETE THIS

		try {

		} catch (Exception e) {
			throw new IllegalArgumentException();
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
		// COMPLETE THIS
		try {

		} catch (Exception e) {

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

		// COMPLETE THIS
		try {

		} catch (Exception e) {

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
		// COMPLETE THIS
		return chairShape.toUpperCase() + ", " + chairColor.toUpperCase() + ", " + chairManufCost;
	}

}
