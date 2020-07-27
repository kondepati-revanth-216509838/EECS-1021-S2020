package eecs1021.lab8;

import java.util.*;

/**
 * 
 * <p>
 * The Conference Chair class
 * </p>
 * 
 * <p>
 * The chair color for <strong> <code>Conference Chair</code></strong> should be
 * one of the following choices
 * <strong><code> {black,  white,pink, green, brown, or blue}</code></strong>.
 * </p>
 * <p>
 * The default value for color is <strong> <code>black</code></strong>
 * </p>
 * <p>
 * The Conference chair shape has two shapes which is <strong>
 * <code>{Rectangle, Square, or Oval}</code></strong>
 * </p>
 * <p>
 * The default value for shape is <strong> <code>Square</code></strong>
 * </p>
 * <p>
 * <strong> Any Conference chair has initial manufacturing cost equal to
 * positive real number, with default value equal to 15.0$ </strong>
 * </p>
 *
 *
 *
 *
 * <p>
 * <strong> NOTE: In this class, all string comparisons are carried out with
 * case insensitive </strong>
 * </p>
 */

public class ConferenceChair extends Chair {

	/**
	 * The Conference chair category can be one of the following choices
	 * <strong><code>Basic</code> , <code>Normal</code> or
	 * <code>Delux</code></strong>
	 * <p>
	 * The default value is <strong> <code>Basic</code></strong>
	 * </p>
	 * 
	 * 
	 */
	private String chairCategory;

	/**
	 * this field store the number of wheels for this Conference chair. The number
	 * of wheel can be any even integer value between 4 and 8. i.e., can be one of
	 * the following choices 4, 6, or 8.
	 * <p>
	 * <strong>The default value is 4</strong>
	 * </p>
	 */
	private int numberofWheels;

	/**
	 * the default constructor
	 * 
	 */
	public ConferenceChair() {

		// COMPLETE THIS
		
		

	}

	/**
	 * Custom constructor to initialize fields of this Conference chair
	 * 
	 * 
	 * @param chairManufCost : the manufacturing cost of this Conference chair
	 * @param chairShape     : the shape of this Conference chair
	 * @param chairColor     : the color of this Conference chair
	 * @param chairCategory  : The category of this Conference chair
	 * @param numberofWheels : the number of wheels for this Conference chair
	 * 
	 * 
	 * @throws IllegalArgumentException
	 *                                  <p>
	 *                                  if the manufacturing Cost of this Conference
	 *                                  chair is negative
	 *                                  </p>
	 *                                  or
	 *                                  <p>
	 *                                  if the manufacturing Cost of this Conference
	 *                                  chair is not equal to 15.0$
	 *                                  </p>
	 *                                  or
	 *                                  <p>
	 *                                  if the number of wheel of this Conference
	 *                                  chair is not an even integer value between 4
	 *                                  and 8.
	 * 
	 * @throws IllegalArgumentException
	 *                                  <p>
	 *                                  if the chair color is not one of possible
	 *                                  Conference chair colors
	 *                                  </p>
	 *                                  .
	 * 
	 * @throws IllegalArgumentException
	 *                                  <p>
	 *                                  if the chair shape is not one of the
	 *                                  possible Conference chair shapes
	 *                                  </p>
	 * 
	 * @throws IllegalArgumentException
	 * 
	 *                                  <p>
	 *                                  if the chair category is not one of the
	 *                                  following choices <strong><code>Basic</code>
	 *                                  , <code>Normal</code> or
	 *                                  <code>Delux</code></strong>
	 *                                  </p>
	 *                                  .
	 * 
	 * 
	 */
	public ConferenceChair(double chairManufCost, String chairShape, String chairColor, String chairCategory,
			int numberofWheels) {

		// COMPLETE THIS
		
	}

	/**
	 * Check if the chair shape is one of possible Conference chair shapes
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

		

	}

	/**
	 * Check if the chair color is one of possible Conference chair colors
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

		
	}

	/**
	 * 
	 * check the number of wheel of this Conference chair, the number of wheel of
	 * this Conference chair can be any even integer value between 4 and 8. i.e.,
	 * can be one of the following choices 4, 6, or 8.
	 * 
	 * 
	 * @param numberofWheels the number of wheel of this Conference chair
	 *
	 * 
	 * 						@pre.
	 *                       <p>
	 *                       <strong> Precondition </strong>
	 *                       </p>
	 *                       <p>
	 *                       the number of wheel of this Conference chair should be
	 *                       any odd integer value between 4 and 8. i.e., can be one
	 *                       of the following choices 4, 6, or 8.
	 * 
	 * @throws IllegalArgumentException
	 * 
	 *                                  <p>
	 *                                  if the number of wheel of this Conference
	 *                                  chair is not an even integer value between 4
	 *                                  and 8.
	 * 
	 */

	private void checkChairNumberofWheels(int numberofWheels) {

		// COMPLETE THIS

		

	}

	/**
	 * 
	 * 
	 * check the Conference chair category, the Conference chair category can be one
	 * of the following choices <strong><code>Basic</code> , <code>Normal</code> or
	 * <code>Delux</code></strong>
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
	 *                      or <code>Delux</code></strong>
	 *                      </p>
	 * 
	 * 
	 * @throws IllegalArgumentException
	 * 
	 *                               <p>
	 *                               if the chair category is not one of the
	 *                               following choices <strong><code>Basic</code> ,
	 *                               <code>Normal</code> or
	 *                               <code>Delux</code></strong>
	 *                               </p>
	 *                               .
	 * 
	 */

	private void checkChairCategory(String chairCategory) {

		// COMPLETE THIS

		

	}

	/**
	 * 
	 * 
	 * 
	 * This method compute the Conference chair price for this Conference chair
	 * object. The Conference chair price depends on the Conference chair
	 * chairCategory field value and the color chair
	 * 
	 * <p>
	 * The <strong><em> Conference chair price cost</em></strong> can be computed
	 * using the following rules:
	 * </p>
	 * 
	 * <p>
	 * If the category of chair is <strong>Basic </strong>then the price is
	 * (manufacturing cost+ <strong>55$</strong>).
	 * </p>
	 * <p>
	 * If the category of chair is <strong>Normal </strong>then the price is
	 * (manufacturing cost+ <strong>75$</strong>).
	 * </p>
	 * <p>
	 * If the category of chair is <strong>Delux </strong>then the price is
	 * (manufacturing cost+ <strong>90$</strong>).
	 * </p>
	 * 
	 * Also,
	 * <p>
	 * If the color of chair is <strong>"white" </strong>then add
	 * <strong>0$</strong>) to the chair price.
	 * </p>
	 * <p>
	 * If the color of chair is <strong>black </strong>then add <strong>5$</strong>)
	 * to the chair price.
	 * </p>
	 * <p>
	 * If the color of chair is <strong>blue </strong>then add <strong>10$</strong>)
	 * to the chair price.
	 * </p>
	 * <p>
	 * If the color of chair is <strong>brown </strong>then add
	 * <strong>20$</strong>) to the chair price.
	 * </p>
	 * <p>
	 * If the color of chair is <strong>green </strong>then add
	 * <strong>25$</strong>) to the chair price.
	 * </p>
	 * <p>
	 * If the color of chair is <strong>pink </strong>then add <strong>35$</strong>)
	 * to the chair price.
	 * </p>
	 * 
	 * 
	 * @return The Conference chair price for this Conference chair object
	 */

	public double getChairPrice() {

		// COMPLETE THIS

		
	}

	/**
	 * 
	 * 
	 * 
	 * This method compute the delivery cost for this Conference chair object given
	 * the city of delivery as input argument
	 * 
	 * <p>
	 * The Conference chair can be sent out for delivery to three different cities.
	 * The cities are <strong>Edmonton, Winnipeg</strong> and
	 * <strong>Halifax</strong>.
	 * </p>
	 * <p>
	 * The cost of delivery can be computed using these rules:
	 * </p>
	 * 
	 * <p>
	 * If the delivery city is <strong> Edmonton </strong> then the delivery cost is
	 * equal to <strong><code> (the Conference chair price )+ (55$)</code>
	 * </strong>.
	 * </p>
	 * 
	 * <p>
	 * If the delivery city is <strong> Winnipeg </strong>then the delivery cost is
	 * equal to <strong><code> (the Conference chair price )+ (65$)</code>
	 * </strong>.
	 * </p>
	 * 
	 * <p>
	 * If the delivery city is <strong> Halifax </strong> then the delivery cost is
	 * equal to <strong><code> (the Conference chair price )+ (85$)</code>
	 * </strong>.
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
	 *         cities <strong> Edmonton, Winnipeg</strong> and
	 *         <strong>Halifax</strong>.
	 *         </p>
	 * 
	 * @throws IllegalArgumentException
	 *                                  <p>
	 *                                  If the given delivery city (input city) was
	 *                                  not one of the following cities <strong>
	 *                                  Edmonton, Winnipeg</strong> and
	 *                                  <strong>Halifax</strong>.
	 *                                  </p>
	 */

	public double getDeliveryCost(String nameofCity) {

		// COMPLETE THIS

		

	}

	/**
	 * Get the Conference chair category The returned string contains all capital
	 * letter
	 * 
	 * @return the Conference chair category
	 */
	public String getChairCategory() {
		// COMPLETE THIS
	
	}

	/**
	 * get the number of wheels of this Conference chair
	 * 
	 * @return the number of wheels of this Conference chair
	 */
	public int getNumberofWheels() {
		// COMPLETE THIS
		
	}

	/**
	 * Get the string representation of the Conference chair. The string is (chair
	 * Shape, chair shape, chair initial cost , chair category, number of wheels).
	 * 
	 * The return string contains only capital letters
	 * 
	 * <p>
	 * For example:
	 * </p>
	 * 
	 * <pre>
	 * if ConferenceChair k = new ConferenceChair(15.0, "Oval", "blue","Delux",4);
	 * the System.out.println(k); returns 
	 * (OVAL, BLUE, 15.0, DELUX, 4)
	 * 
	 * </pre>
	 * 
	 * @return the string representation of the Conference chair
	 */

	@Override
	public String toString() {
		// COMPLETE THIS
		
	}

}
