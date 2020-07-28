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
		this.numberofWheels = 5;
		this.chairCategory = "BASIC";
		this.setChairColor("BLACK");
		this.setChairShape("SQUARE");
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
		List<Integer> wheels = new ArrayList<>();
		wheels.add(3);
		wheels.add(5);
		wheels.add(7);

		List<String> info = new ArrayList<>();
		info.add("BASIC");
		info.add("NORMAL");
		info.add("SUPER");

		info.add("BLACK");
		info.add("WHITE");
		info.add("ORANGE");
		info.add("BROWN");
		info.add("RED");
		info.add("GRAY");

		info.add("RECTANGLE");
		info.add("SQUARE");
		info.add("ROUND");

		try {
			if (chairManufCost < 0.0) {
				throw new IllegalArgumentException("Invalid cost.");
			}

			if (!info.contains(chairColor.toUpperCase())) {
				throw new IllegalArgumentException("Invalid color choice");
			}

			if (!info.contains(chairCategory.toUpperCase())) {
				throw new IllegalArgumentException("Invalid category");
			}

			if (!info.contains(chairShape.toUpperCase())) {
				throw new IllegalArgumentException("Invalid shape");
			}

			if (!wheels.contains(numberofWheels)) {
				throw new IllegalArgumentException("Invalid number of wheels");
			}

			this.setChairManufCost(chairManufCost);
			this.chairCategory = chairCategory.toUpperCase();
			this.numberofWheels = numberofWheels;
			this.setChairColor(chairColor.toUpperCase());
			this.setChairShape(chairShape.toUpperCase());

		} catch (IllegalArgumentException e) {
			throw e;
		}

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
		List<String> shapes = new ArrayList<>();
		shapes.add("RECTANGLE");
		shapes.add("SQUARE");
		shapes.add("ROUND");

		try {
			if (!shapes.contains(chairShape.toUpperCase())) {
				throw new IllegalArgumentException("Invalid shape choice");
			}
		} catch (IllegalArgumentException e) {
			throw e;
		}
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
		List<String> color = new ArrayList<>();
		color.add("BLACK");
		color.add("WHITE");
		color.add("ORANGE");
		color.add("BROWN");
		color.add("RED");
		color.add("GRAY");

		try {
			if (!color.contains(chairColor.toUpperCase())) {
				throw new IllegalArgumentException("Invalid color choice");
			}

			this.setChairColor(chairColor);
		} catch (IllegalArgumentException e) {
			throw e;
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
		HashMap<String, Integer> price = new HashMap<>();

		price.put("BASIC", 85);
		price.put("NORMAL", 95);
		price.put("SUPER", 100);

		price.put("WHITE", 0);
		price.put("BLACK", 15);
		price.put("ORANGE", 25);
		price.put("RED", 25);
		price.put("BROWN", 30);
		price.put("GRAY", 30);

		return this.getChairManufCost() + price.get(getChairCategory().toUpperCase())
				+ price.get(getChairColor().toUpperCase());

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
		HashMap<String, Integer> city = new HashMap<>();
		city.put("TORONTO", 35);
		city.put("MONTREAL", 65);
		city.put("OTTAWA", 45);

		try {
			if (!city.containsKey(nameofCity.toUpperCase())) {
				throw new IllegalArgumentException("Invalid city");
			}
			return city.get(nameofCity.toUpperCase()) + this.getChairPrice();
		} catch (IllegalArgumentException e) {
			throw e;
		}

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
		List<Integer> wheels = new ArrayList<>();
		wheels.add(3);
		wheels.add(5);
		wheels.add(7);

		try {
			if (!wheels.contains(numberofWheels)) {
				throw new IllegalArgumentException("Invalid number of wheels");
			}
		} catch (IllegalArgumentException e) {
			throw e;
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
		List<String> category = new ArrayList<>();
		category.add("BASIC");
		category.add("NORMAL");
		category.add("SUPER");

		try {
			if (!category.contains(chairCategory)) {
				throw new IllegalArgumentException("Invalid category");
			}
		} catch (IllegalArgumentException e) {
			throw e;
		}
	}

	/**
	 * Get the computer chair category The returned string contains all capital
	 * letter
	 * 
	 * @return the computer chair category
	 */
	public String getChairCategory() {
		return new String(this.chairCategory);
	}

	/**
	 * get the number of wheels of this computer chair
	 * 
	 * @return the number of wheels of this computer chair
	 */
	public int getNumberofWheels() {
		return new Integer(this.numberofWheels);
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
		return "(" + this.getChairShape().toUpperCase() + ", " + this.getChairColor().toUpperCase() + ", "
				+ this.getChairManufCost() + ", " + this.getChairCategory().toUpperCase() + ", " + this.numberofWheels
				+ ")";
	}

}
