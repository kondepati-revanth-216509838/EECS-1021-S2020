package eecs1021.lab3;

/**
 * Pizza cooking Oven
 * 
 * Define a class named <i>PizzaCookingOven</i>. User of this Oven can determine
 * three parameters: pizza type and pizza size
 * 
 * <p>
 * Declare a private string field that holds the pizza type to indicate whether
 * the pizza type is <strong><code>DOUBLECHEESE</code> , <code>VEGGIE</code> or
 * <code>PEPPERONI</code></strong>.
 * </p>
 * <p>
 * Declare a private string field that hold the pizza size to indicate whether
 * the pizza size is <strong><code>S</code>, <code>M</code>, <code>L</code> ,
 * <code>XL</code> or <code>XXL</code></strong>.
 * 
 * 
 * After the user determine the pizza type and size, the Pizza cooking Oven
 * calculated the cook time (in minutes) as following:
 * <p>
 * {@code  cook_time = 2 + pizza * type + pizza size * 2.5}
 * </p>
 * It should be noted that the Pizza cooking Oven returns the cooking time the
 * largest integer value that is less than or equal to a cook_time.
 * 
 * Furthermore, the Pizza cooking Oven has the following internal parameters For
 * pizza type and size:
 * <p>
 * pizza type
 * </p>
 * <code>DOUBLECHEESE</code>: 5 minutes, <code>VEGGIE</code>: 7 minutes,
 * <code>PEPPERONI</code>: 9 minutes.
 * <p>
 * pizza size
 * </p>
 * <p>
 * <code>S</code>: 2 minutes, <code>M</code>: 2.45 minutes, <code>L</code>: 4.5
 * minutes, <code>XL</code>: 6 minutes, <code>XXL</code>: 8.5 minutes.
 * </p>
 * 
 * 
 * 
 *
 *
 */
public class PizzaCookingOven {

	/**
	 * The Pizza type can be one of the following choices
	 * <strong><code>DOUBLECHEESE</code> , <code>VEGGIE</code> or
	 * <code>PEPPERONI</code></strong>
	 * <p>
	 * The default value is <strong> <code>DOUBLECHEESE</code></strong>
	 * </p>
	 */
	private String pizzaType;

	/**
	 * The pizza size can be one of the following choices <strong><code>S</code>,
	 * <code>M</code>, <code>L</code> , <code>XL</code> or
	 * <code>XXL</code></strong>.
	 * <p>
	 * The default value is <strong><code>S</code> </strong>
	 * </p>
	 */
	private String pizzaSize;

	/**
	 * Default constructor create PizzaCookingOven Order by setting the attributes
	 * to default values
	 * 
	 */
	public PizzaCookingOven() {
		this.pizzaSize = "S";
		this.pizzaType = "DOUBLECHEESE";
	}

	/**
	 * Constructor create a new PizzaCookingOven by assigned pizzaType and pizzaSize
	 * attributes.
	 * 
	 * @param pizzaType Is one of the pizza type choices
	 * @param pizzaSize Is one of the pizza size choices
	 * 
	 * @throws IllegalArgumentException
	 *                                  <p>
	 *                                  if the pizza type is not one of the
	 *                                  following choices
	 *                                  <strong><code>DOUBLECHEESE</code> ,
	 *                                  <code>VEGGIE</code> or
	 *                                  <code>PEPPERONI</code></strong>. or if the
	 *                                  pizza size is not one of the following
	 *                                  choices <strong><code>S</code>,
	 *                                  <code>M</code>,<code>L</code> ,
	 *                                  <code>XL</code> or
	 *                                  <code>XXL</code></strong>.
	 *                                  </p>
	 */
	public PizzaCookingOven(String pizzaType, String pizzaSize) {
		setPizzaType(pizzaType);
		setPizzaSize(pizzaSize);
	}

	/**
	 * Copy constructor Set the pizzaType and pizzaSize of this PizzaCookingOven by
	 * copying another PizzaCookingOven attributes
	 * 
	 * @param otherOrder another PizzaOrder
	 */
	public PizzaCookingOven(PizzaCookingOven otherOrder) {
		this.pizzaSize = otherOrder.getPizzaSize();
		this.pizzaType = otherOrder.getPizzaType();
	}

	/**
	 * Sets the pizzaType and pizzaSize of this PizzaCookingOven object to <strong>
	 * <code>newPizzaType</code> and <code>newPizzaSize</code></strong>,
	 * respectively.
	 * 
	 * @param newPizzaType Is one of the pizza type choices
	 * @param newPizzaSize Is one of the pizza size choices
	 * 
	 * @throws IllegalArgumentException
	 *                                  <p>
	 *                                  if the pizza type is not one of the
	 *                                  following choices
	 *                                  <strong><code>DOUBLECHEESE</code> ,
	 *                                  <code>VEGGIE</code> or
	 *                                  <code>PEPPERONI</code></strong>. or if the
	 *                                  pizza size is not one of the following
	 *                                  choices <strong><code>S</code>,
	 *                                  <code>M</code>, <code>L</code> ,
	 *                                  <code>XL</code> or
	 *                                  <code>XXL</code></strong>.
	 *                                  </p>
	 */

	private void set(String newPizzaType, String newPizzaSize) {
		setPizzaType(newPizzaType);
		setPizzaSize(newPizzaSize);
	}

	/**
	 * Sets the pizza type of this PizzaCookingOven object to <strong>
	 * <code>newPizzaType</code> </strong>.
	 * 
	 * @param newPizzaType Is one of the pizza type choices
	 * 
	 *
	 * @throws IllegalArgumentException
	 *                                  <p>
	 *                                  if the pizza type is not one of the
	 *                                  following choices
	 *                                  <strong><code>DOUBLECHEESE</code> ,
	 *                                  <code>VEGGIE</code> or
	 *                                  <code>PEPPERONI</code></strong>.
	 */

	public void setPizzaType(String newPizzaType) {
		try {
			if (!(newPizzaType.equals("DOUBLECHEESE") || newPizzaType.equals("VEGGIE") || newPizzaType.equals("PEPPERONI"))) {
				throw new IllegalArgumentException();
			} else this.pizzaType = newPizzaType;
		} catch(Exception e) {
			throw new IllegalArgumentException();
		}
	}

	/**
	 * Sets the pizza size of this PizzaCookingOven object to <strong>
	 * <code>newPizzaSize</code></strong>.
	 * 
	 * @param newPizzaSize Is one of the pizza size choices
	 * 
	 * @throws IllegalArgumentException
	 *                                  <p>
	 *                                  if the pizza size is not one of the
	 *                                  following choices <strong><code>S</code>,
	 *                                  <code>M</code>, <code>L</code> ,
	 *                                  <code>XL</code> or
	 *                                  <code>XXL</code></strong>.
	 *                                  </p>
	 */

	public void setPizzaSize(String newPizzaSize) {
		try {
			if (newPizzaSize.equals("S") || newPizzaSize.equals("M") || newPizzaSize.equals("L") || newPizzaSize.equals("XL") || newPizzaSize.equals("XXL")) {
				this.pizzaSize = newPizzaSize;
			} else {
				throw new IllegalArgumentException();
			}
		} catch (Exception e) {
			throw new IllegalArgumentException();
		}
	}

	/**
	 * Get the pizzaType value for this PizzaCookingOven
	 * 
	 * @return the pizzaType value for this PizzaCookingOven
	 */
	public String getPizzaType() {
		String temp = this.pizzaType;
		return temp;
	}

	/**
	 * Get the pizzaSize value for this PizzaCookingOven
	 * 
	 * @return the pizzaSize value for this PizzaCookingOven
	 */
	public String getPizzaSize() {
		String temp = this.pizzaSize;
		return temp;
	}

	/**
	 * This method calculate the Pizza cooking time.
	 * 
	 * After the user determine the pizza type and size, the Pizza cooking Oven
	 * calculated the cook time (in minutes) as following:
	 * <p>
	 * {@code  cook_time = 2 + pizza * type + pizza size * 2.5}
	 * </p>
	 * It should be noted that the Pizza cooking Oven returns the cooking time in
	 * minutes rounded to the largest integer value that is less than or equal to a
	 * cook_time.
	 * 
	 * Furthermore, the Pizza cooking Oven has the following internal parameters For
	 * pizza type and size:
	 * <p>
	 * pizza type
	 * </p>
	 * <code>DOUBLECHEESE</code>: 5 minutes, <code>VEGGIE</code>: 7 minutes,
	 * <code>PEPPERONI</code>: 9 minutes.
	 * <p>
	 * pizza size
	 * </p>
	 * <p>
	 * <code>S</code>: 2 minutes, <code>M</code>: 2.45 minutes, <code>L</code>: 4.5
	 * minutes, <code>XL</code>: 6 minutes, <code>XXL</code>: 8.5 minutes.
	 * </p>
	 * 
	 * @return The pizza cooking time in minutes rounded to the largest integer
	 *         value that is less than or equal to the cook_time.
	 */

	public int pizzaCookTime() {
		int intPizzaType = 0;

		if (getPizzaType() == "DOUBLECHEESE") {
			intPizzaType = 5;
		}

		if (getPizzaType() == "VEGGIE") {
			intPizzaType = 7;
		}

		if (getPizzaType() == "PEPPERONI") {
			intPizzaType = 9;
		}

		double dblPizzaSize = 0.0;
		
		
		if (getPizzaSize() == "S") {
			dblPizzaSize = 2;
		}

		if (getPizzaSize() == "M") {
			dblPizzaSize = 2.45;
		}

		if (getPizzaSize() == "L") {
			dblPizzaSize = 4.5;
		}

		if (getPizzaSize() == "XL") {
			dblPizzaSize = 6;
		}

		if (getPizzaSize() == "XXL") {
			dblPizzaSize = 8.5;
		}

		double cook_time = 2 + intPizzaType + dblPizzaSize * 2.5;
		return (int) Math.round(cook_time);

	}

	/**
	 * 
	 * String representation of PizzaCookingOven object if
	 * {@code o = new PizzaOder("DOUBLECHEESE","S")} then {@code d.toString()}
	 * returns the string
	 * <p>
	 * {@code Pizza Cooking Order for (DOUBLECHEESE, S) and cooking time is 19 minutes }.
	 * </p>
	 * 
	 * 
	 * @return String representation of PizzaCookingOven object
	 */

	@Override
	public String toString() {

		return "Pizza Cooking Order for (" + getPizzaType() + ", " + getPizzaSize() + ") and cooking time is "
				+ pizzaCookTime() + " minutes";
	}

}
