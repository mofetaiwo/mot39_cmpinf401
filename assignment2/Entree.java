package edu.pitt.menumanager;

/**
 * Class Entree
 * @author mofetaiwo
 * Created: 10/03/2022
 */
public class Entree {
	private String name;
	private String description;
	private int calories;
	
	//constructor
	
	public Entree (String name, String desc, int cal){
		this.name = name;
		this.description = desc;
		this.calories = cal;
		
	}
	
	//getters and setters
	
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
}