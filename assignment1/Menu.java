package edu.pitt.menumanager;

/**
 * Class Menu
 * @author mofetaiwo
 * Created: 10/03/2022
 */
public class Menu {
	private String name;
	private Entree entree;
	private Salad salad;
	private Side side;
	private Dessert dessert;

	//constructors
	
	public Menu (String name){
		this.name = name;
		entree = null;
		side = null;
		salad = null;
		dessert = null;
	}

	public Menu (String name, Entree entree, Side side){	
		this.name = name;
		this.entree = entree;
		this.side = side;
		salad = null;
		dessert = null;
	}

	public Menu (String name, Entree entree, Side side, Salad salad, Dessert dessert){	
		this.name = name;
		this.entree = entree;
		this.side = side;
		this.dessert = dessert;
		this.salad = salad;
	}
	
	//methods
	
	/*
	 * sums the calories of all parts of the menu
	 * (entree, side, salad, dessert)
	 */
	
	public int totalCalories() {
		int totalCal = 0;
		
		if (entree != null)
		{
			totalCal += entree.getCalories();
		}
		if (side != null)
		{
			totalCal += side.getCalories();
		}
		if (salad != null)
		{
			totalCal += salad.getCalories();
		}
		if (dessert != null)
		{
			totalCal += dessert.getCalories();
		}
		return totalCal;
 
	}


	/*
	 * if statements check if value is null
	 * concatenates the descriptions of the parts of the menu in order
	 * (entree > side > salad > dessert)
	 */
	public String description() {
		String entreeDesc = "";
		String sideDesc = "";
		String saladDesc = "";
		String dessertDesc = "";
		
		if (entree == null) {
			entreeDesc += "N/A";
		}
		else {
			entreeDesc += entree.getDescription();
		}
		
		if (side == null) {
			sideDesc += "N/A";	
		}	
		else {
			sideDesc += side.getDescription();
		}
		
		if (salad == null) {
			saladDesc += "N/A";
		}
		else {
			saladDesc += salad.getDescription();
		}
		
		if (dessert == null) {
			dessertDesc += "N/A";
		}
		else {
			dessertDesc += dessert.getDescription();
		}
		
		return "Entree: " + entreeDesc + "\nSide: " + sideDesc + "\nSalad: " + saladDesc + "\nDessert: " + dessertDesc;
	
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
	 * @return the entree
	 */
	public Entree getEntree() {
		return entree;
	}

	/**
	 * @param set entree to the entree
	 */
	public void setEntree(Entree entree) {
		this.entree = entree;
	}

	/**
	 * @return the salad
	 */
	public Salad getSalad() {
		return salad;
	}

	/**
	 * @param set salad to the salad
	 */
	public void setSalad(Salad salad) {
		this.salad = salad;
	}

	/**
	 * @return the side
	 */
	public Side getSide() {
		return side;
	}

	/**
	 * @param set side to the side
	 */
	public void setSide(Side side) {
		this.side = side;
	}

	/**
	 * @return the dessert
	 */
	public Dessert getDessert() {
		return dessert;
	}

	/**
	 * @param set dessert to the dessert
	 */
	public void setDessert(Dessert dessert) {
		this.dessert = dessert;
	}
}