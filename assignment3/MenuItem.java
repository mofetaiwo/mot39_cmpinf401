package edu.pitt.menumanagerv3;

/**
 * Class MenuItem
 * @author mofetaiwo
 * Created: 11/14/2022
 */
public class MenuItem {
	private String name;
	private String description;
	private int calories;
	private double price;
	
	public MenuItem(String name, String desc, int cal, double price) {
		this.name = name;
		this.description = desc;
		this.calories = cal;
		this.price = price;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param set name to the name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param set description to the description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the calories
	 */
	public int getCalories() {
		return calories;
	}

	/**
	 * @param set calories to the calories
	 */
	public void setCalories(int calories) {
		this.calories = calories;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return name;
	}
}
