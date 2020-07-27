package eecs1021.lab8;

import java.util.*;

/**
 * 
 * <p>
 * The Computer Chair class
 * </p>
 * 
 * <p>
 * The chair color for <strong> <code>Computer Chair</code></strong> should be
 * one of the following choices <strong>
 * <code>{black,  white, orange, brown,  red or gray}</code></strong>.
 * </p>
 * <p>
 * The default value for color is <strong> <code>black</code></strong>
 * </p>
 * <p>
 * The computer chair shape has only two shapes which is <strong>
 * <code>{Rectangle, Square, Round}</code></strong>
 * </p>
 * <p>
 * The default value for shape is <strong> <code>Square</code></strong>
 * </p>
 * <p>
 * <strong> Any computer chair has initial manufacturing cost equal to positive
 * real number, with default value equal to 0.0$ </strong>
 * </p>
 *
 *
 * <p>
 * <strong> NOTE: In this class, all string comparisons are carried out with
 * case insensitive </strong>
 * </p>
 */

public class ComputerChair extends Chair {

	/**
	 * The computer chair category can be one of the following choices
	 * <strong><code>Basic</code> , <code>Normal</code> or
	 * <code>Super</code></strong>
	 * <p>
	 * The default value is <strong> <code>Basic</code></strong>
	 * </p>
	 * 
	 * 
	 */
	private String chairCategory;

	/**
	 * this field store the number of wheels for this computer chair. The number of
	 * wheel can be any odd integer value between 3 and 7. i.e., can be one of the
	 * following choices 3, 5, or 7.
	 * <p>
	 * <strong>The default value is 5</strong>
	 * </p>
	 */
	private int numberofWheels;

	/**
	 * the default constructor
	 * 
	 */
	public ComputerChair() {
		numberofWheels = 5;
		chairCategory = "Basic";
		this.setChairColor("Black");
		this.setChairManufCost(0.0);
		this.setChairShape("Square");
	}

	/**
	 * Custom constructor to initialize fields of this computer chair
	 * 
	 * 
	 * @param chairManufCost : the manufacturing cost of this manufacturing
	 * @param chairShape     : the shape of this computer chair
	 * @param chairColor     : the color of this computer chair
	 * @param chairCategory  : The category of this computer chair
	 * @param numberofWheels : the number of wheels for this computer chair
	 * 
	 * 
	 * @throws IllegalArgumentException
	 *                                  <p>
	 *                                  if the manufacturing Cost of this computer
	 *                                  chair is negative
	 *                                  </p>
	 *                                  or
	 *                                  <p>
	 *                                  if the number of wheel of this computer
	 *                                  chair is not an odd integer value between 3
	 *                                  and 7.
	 *                                  </p>
	 * 
	 * @throws IllegalArgumentException
	 *                                  <p>
	 *                                  if the chair color is not one of possible
	 *                                  computer chair colors
	 *                                  </p>
	 *                                  .
	 * 
	 * @throws IllegalArgumentException
	 *                                  <p>
	 *                                  if the chair shape is not one of the
	 *                                  possible computer chair shapes
	 *                                  </p>
	 * 
	 * @throws IllegalArgumentException
	 * 
	 *                                  <p>
	 *                                  if the chair category is not one of the
	 *                                  following choices <strong><code>Basic</code>
	 *                                  , <code>Normal</code> or
	 *                                  <code>Super</code></strong>
	 *                                  </p>
	 *                                  .
	 * 
	 * 
	 */
	public ComputerChair(double chairManufCost, String chairShape, String chairColor, String chairCategory,
			int numberofWheels) {

		// COMPLETE THIS
		this.numberofWheels = numberofWheels;
		this.chairCategory = chairCategory;
		this.setChairColor(chairColor);
		this.setChairManufCost(chairManufCost);
		this.setChairShape(chairShape);

	}

	/**
	 * Check if the chair shape is one of possible Computer chair shapes
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
		
		boolean checkShape = ()

	}

	/**
	 * Check if the chair color is one of possible Computer chair colors
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
		String[] checkerBox = { "Black", "White", "Orange", "Red", "Brown", "Gray" };
		// COMPLETE THIS
		try {
			boolean checkColor = false;
			for (int i = 0; i < checkerBox.length || checkColor; i++) {
				checkColor = (checkerBox[i].equals(chairColor) || checkColor ? true : false);
			}
			if (checkColor == false) {
				throw new IllegalArgumentException("Invalid color choice");
			}
		} catch (IllegalArgumentException e) {
			throw new IllegalArgumentException("Invalid color choice");
		}
	}

	/**
	 * 
	 * 
	 * 
	 * This method compute the computer chair price for this computer chair object.
	 * The computer chair price depends on the computer chair chairCategory field
	 * value and the color chair
	 * 
	 * <p>
	 * The <strong><em> computer chair price cost</em></strong> can be computed
	 * using the following rules:
	 * </p>
	 * 
	 * <p>
	 * If the category of chair is <strong>Basic </strong>then the price is
	 * (manufacturing cost+ <strong>85$</strong>).
	 * </p>
	 * <p>
	 * If the category of chair is <strong>Normal </strong>then the price is
	 * (manufacturing cost+ <strong>95$</strong>).
	 * </p>
	 * <p>
	 * If the category of chair is <strong>Super </strong>then the price is
	 * (manufacturing cost+ <strong>100$</strong>).
	 * </p>
	 * 
	 * Also,
	 * <p>
	 * If the color of chair is <strong>"white" </strong>then add
	 * <strong>0$</strong>) to the chair price.
	 * </p>
	 * <p>
	 * If the color of chair is <strong>black </strong>then add
	 * <strong>15$</strong>) to the chair price.
	 * </p>
	 * <p>
	 * If the color of chair is <strong>orange or red </strong>then add
	 * <strong>25$</strong>) to the chair price.
	 * </p>
	 * <p>
	 * If the color of chair is <strong>brown or gray </strong>then add
	 * <strong>30$</strong>) to the chair price.
	 * </p>
	 * 
	 * 
	 * @return The computer chair price for this computer chair object
	 */

	public double getChairPrice() {

		// COMPLETE THIS
		HashMap<String, Integer> category = new HashMap<>();
		HashMap<String, Integer> colors = new HashMap<>();
		
		category.put("Basic", 85); category.put("Normal", 95); category.put("Super", 100);
		
		colors.put("white", 0); colors.put("black", 15); colors.put("red", 25); colors.put("orange", colors.get("red")); colors.put("brown", 30); colors.put("gray", colors.get("brown"));
	
		return this.getChairManufCost() + category.get(this.chairCategory) + colors.get(this.getChairColor());
	}

	/**
	 * 
	 * 
	 * 
	 * This method compute the delivery cost for this computer chair object given
	 * the city of delivery as input argument
	 * 
	 * <p>
	 * The computer chair can be sent out for delivery to three different cities.
	 * The cities are <strong>Toronto, Ottawa</strong> and
	 * <strong>Montreal</strong>.
	 * </p>
	 * <p>
	 * The cost of delivery can be computed using these rules:
	 * </p>
	 * 
	 * <p>
	 * If the delivery city is <strong> Toronto </strong> then the delivery cost is
	 * equal to <strong><code> (the computer chair price )+ (35$)</code> </strong>.
	 * </p>
	 * 
	 * <p>
	 * If the delivery city is <strong> Ottawa </strong>then the delivery cost is
	 * equal to <strong><code> (the computer chair price )+ (45$)</code> </strong>.
	 * </p>
	 * 
	 * <p>
	 * If the delivery city is <strong> Montreal </strong> then the delivery cost is
	 * equal to <strong><code> (the computer chair price )+ (65$)</code> </strong>.
	 * </p>
	 * 
	 * 
	 * @param nameofCity name of delivery city
	 * 
	 * @return The delivery cost for the given delivery city
	 * 
	 * 		@pre.
	 *         <p>
	 *         <strong> Precondition </strong>
	 *         </p>
	 *         <p>
	 *         The given delivery city (input city) should be one of the following
	 *         cities <strong> Toronto, Ottawa</strong> and
	 *         <strong>Montreal</strong>.
	 *         </p>
	 * 
	 * @throws IllegalArgumentException
	 *                                  <p>
	 *                                  If the given delivery city (input city) was
	 *                                  not one of the following cities <strong>
	 *                                  Toronto, Ottawa</strong> and <strong>
	 *                                  Montreal</strong>.
	 *                                  </p>
	 */

	public double getDeliveryCost(String nameofCity) {

		// COMPLETE THIS
		HashMap<String, Integer> deliveryCost = new HashMap<>();
		deliveryCost.put("Montreal", 65);
		deliveryCost.put("Toronto", 35);
		deliveryCost.put("Ottawa", 45);

		boolean checkCityName = deliveryCost.containsKey(nameofCity);
		if (!checkCityName) {
			throw new IllegalArgumentException("Invalid city.");
		}

		return this.getChairPrice() + deliveryCost.get(nameofCity);
	}

	/**
	 * 
	 * 
	 * check the number of wheel of this computer chair, the number of wheel of this
	 * computer chair can be any odd integer value between 3 and 7. i.e., can be one
	 * of the following choices 3, 5, or 7.
	 * 
	 * 
	 * @param numberofWheels the number of wheel of this computer chair
	 *
	 * 
	 * 						@pre.
	 *                       <p>
	 *                       <strong> Precondition </strong>
	 *                       </p>
	 *                       <p>
	 *                       the number of wheel of this computer chair should be
	 *                       any odd integer value between 3 and 7. i.e., can be one
	 *                       of the following choices 3, 5, or 7.
	 * 
	 * @throws IllegalArgumentException
	 * 
	 *                                  <p>
	 *                                  if the number of wheel of this computer
	 *                                  chair is not an odd integer value between 3
	 *                                  and 7.
	 * 
	 */

	private void checkChairNumberofWheels(int numberofWheels) {

		// COMPLETE THIS
		boolean checkWheels = (false || (numberofWheels >= 3 && numberofWheels <= 7));
		for (int i = 2; i < 5 || checkWheels; i++) {
			checkWheels = ((numberofWheels == (2 * i) - 1) || checkWheels ? true : false);
		}

		if (checkWheels == false) {
			throw new IllegalArgumentException("Invalid number of wheels.");
		}
	}

	/**
	 * 
	 * 
	 * check the computer chair category, the computer chair category can be one of
	 * the following choices <strong><code>Basic</code> , <code>Normal</code> or
	 * <code>Super</code></strong>
	 *
	 * @param chairCategory Is one of the chair category choices
	 *
	 * 
	 * 						@pre.
	 *                      <p>
	 *                      <strong> Precondition </strong>
	 *                      </p>
	 *                      <p>
	 *                      The chair category should be one of the following
	 *                      choices <strong><code>Basic</code> , <code>Normal</code>
	 *                      or <code>Super</code></strong>
	 *                      </p>
	 * 
	 * 
	 * @throws IllegalArgumentException
	 * 
	 *                                  <p>
	 *                                  if the chair category is not one of the
	 *                                  following choices <strong><code>Basic</code>
	 *                                  , <code>Normal</code> or
	 *                                  <code>Super</code></strong>
	 *                                  </p>
	 *                                  .
	 * 
	 */

	private void checkChairCategory(String chairCategory) {

		// COMPLETE THIS
		List<String> categories = new ArrayList<>();
		categories.add("Basic"); categories.add("Normal"); categories.add("Super");
		boolean checkCats = categories.contains(chairCategory);
		
		if (!checkCats) {
			throw new IllegalArgumentException("Invalid category");
		}

	}

	/**
	 * Get the computer chair category The returned string contains all capital
	 * letter
	 * 
	 * @return the computer chair category
	 */
	public String getChairCategory() {
		// COMPLETE THIS
		return this.chairCategory;
	}

	/**
	 * get the number of wheels of this computer chair
	 * 
	 * @return the number of wheels of this computer chair
	 */
	public int getNumberofWheels() {
		// COMPLETE THIS
		return this.numberofWheels;
	}

	/**
	 * Get the string representation of the computer chair. The string is (chair
	 * Shape, chair shape, chair initial cost , chair category, number of wheels).
	 * 
	 * The return string contains only capital letters
	 * 
	 * <p>
	 * For example:
	 * </p>
	 * 
	 * <pre>
	 * if ComputerChair c = new ComputerChair();
	 * the System.out.println(c); returns 
	 * (SQUARE, BLACK, 0.0, BASIC, 5)
	 * 
	 * </pre>
	 * 
	 * 
	 * @return the string representation of the computer chair
	 */

	@Override
	public String toString() {
		// COMPLETE THIS
		return "(" + this.getChairShape().toUpperCase() + ", " + this.getChairColor().toUpperCase() + ", "
				+ this.getChairManufCost() + ", " + this.getChairCategory().toUpperCase() + ", " + this.numberofWheels
				+ ")";
	}

}
