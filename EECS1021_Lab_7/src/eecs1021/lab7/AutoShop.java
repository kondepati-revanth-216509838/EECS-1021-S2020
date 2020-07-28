package eecs1021.lab7;
import java.util.*;

/**
 * A class representing a <strong> auto shop </strong> that has an <strong>
 * owner</strong> . A auto shop <strong> <em> owns a collection (or possibly
 * collections) of vehicles, but does not own the vehicles themselves</em>
 * </strong>. In other words, <strong> <em>the auto shop and its collection of
 * vehicles form a composition</em> </strong>.
 * 
 * <p>
 * Only the owner of the auto shop is able to sell vehicles from the auto shop.
 * <strong> <em> The auto shop does NOT own its owner</em> </strong>. In other
 * words, <strong> <em>the auto shop and its owner form an aggregation</em>
 * </strong>.
 * </p>
 * 
 * <p>Note: The auto shop keep the count for each vehicle.
 * So, If new vehicle arrived to the auto shop 
 * and auto shop contain another vehicle similar to the arrived one 
 * then auto shop increment the count by 1 
 * </p>
 * 
 * 
 */
public class AutoShop {
	
	// ALREADY IMPLEMENTED; DO NOT MODIFY
	/**
	 * The TreeMap hold all vehicles belonging to this Auto shop
	 * 
	 */
	private TreeMap<Vehicle, Integer> vehicles;
	// ALREADY IMPLEMENTED; DO NOT MODIFY
	/**
	 * The owner of Auto shop
	 */
	private ShopOwner owner;

	
	/**
	 * Initializes this auto shop so that it has the specified owner and no
	 * vehicles.
	 * 
	 * @param owner the owner of this auto shop
	 */
	public AutoShop(ShopOwner owner) {
		this.owner = owner;
		
	}

	/**
	 * Initializes this auto shop by copying another auto shop. This auto shop will
	 * have the same owner and the same number and type of vehicles as the other
	 * auto shop.
	 * 
	 * @param other the auto shop to copy
	 */
	public AutoShop(AutoShop other) {
		this.owner = other.getOwner();
		this.vehicles = other.vehicles;
	
	}

	/**
	 * Returns the owner of this auto shop.
	 * 
	 * <p>
	 * This method is present only for testing purposes. Returning the owner of this
	 * auto shop allows any user to sell vehicles from the auto shop (because any
	 * user can get the owner of this auto shop)!
	 * 
	 * @return the owner of this auto shop
	 */
	public ShopOwner getOwner() {
		// ALREADY IMPLEMENTED; DO NOT MODIFY
		return this.owner;
	}

	/**
	 * Allows the current owner of this auto shop to give this auto shop to a new
	 * owner.
	 * 
	 * @param currentOwner the current owner of this auto shop
	 * @param newOwner     the new owner of this auto shop
	 * @throws IllegalArgumentException if currentOwner is not the current owner of
	 *                                  this auto shop
	 */
	public void changeOwner(ShopOwner currentOwner, ShopOwner newOwner) {
		try {
			if (this.owner.equals(currentOwner)) {
				this.owner = newOwner;
			} else {
				throw new IllegalArgumentException("The given current owner is not the actual current owner.");
			}
		} catch (IllegalArgumentException e) {
			throw e;
		}
	}

	/**
	 * Adds the specified vehicles to this auto shop.
	 * you have to keep the count of equals vehicles  
	 * 
	 * @param vehicles a list of vehicles to add to this auto shop
	 */
	public void add(List<Vehicle> vehicles) {
		for (Vehicle nigga: vehicles) {
			Vehicle key = nigga;
			int value = this.vehicles.get(nigga) + 1;
			this.vehicles.put(key, value);
		}
	}

	/**
	 * Returns true if this auto shop contains the specified vehicle, and false
	 * otherwise.
	 * 
	 * @param vehicle a vehicle
	 * @return true if this auto shop contains the specified vehicle, and false
	 *         otherwise
	 */
	public boolean contains(Vehicle vehicle) {

		// COMPLETE THIS
		
	}

	/**
	 * Allows the owner of this auto shop to sell a single vehicle equal to the
	 * specified vehicle from this auto shop.
	 * 
	 * <p>
	 * If the specified user is not equal to the owner of this auto shop, then the
	 * vehicle is not sold from this auto shop, and null is returned.
	 * 
	 * @param user    the person trying to sell the vehicle
	 * @param vehicle a vehicle
	 * @return a vehicle equal to the specified vehicle from this auto shop, or null
	 *         if user is not the owner of this auto shop 
	 *  @pre. the auto shop
	 *         contains a vehicle equal to the specified vehicle
	 */
	public Vehicle sellingsingleVehicle(ShopOwner user, Vehicle vehicle) {

		// COMPLETE THIS
		if (this.vehicles.containsKey(vehicle)) {
			if (!this.owner.equals(user)) {
				return null;
			} else {
				vehicles.remove(vehicle);
				return vehicle;
			}
		} else return null;
		
	}

	

	/**
	 * Returns a deep copy of the vehicles in this auto shop. The returned list has
	 * its vehicles in sorted order (from smallest price value to largest price
	 * value).
	 * <p>
	 * Remember that <strong> <em>the auto shop and its collection of vehicles form
	 * a composition.</em> </strong>
	 * </p>
	 * 
	 * 
	 * @return a deep copy of the vehicles in this auto shop 
	 */
	public List<Vehicle> deepCopy() {

		// COMPLETE THIS
		List<Vehicle> deep = new ArrayList<>();
		for (int i = 0; i < vehicles.size(); i++) {
			Vehicle temp = new Vehicle(vehicles.);
			deep.add(temp);
		}
		return deep;
	}
		



	/**
	 * Returns a Shallow copy of the vehicles in this auto shop. The returned list
	 * has its vehicles in sorted order (from smallest price value to largest price
	 * value).
	 * <p>
	 * Remember that <strong> <em>the auto shop and its collection of vehicles form
	 * a composition.</em> </strong>
	 * </p>
	 * 
	 * @return a show copy of the vehicles in this auto shop 
	 */

	public List<Vehicle> shallowCopy() {
		// COMPLETE THIS
		
		
	}

	

}
