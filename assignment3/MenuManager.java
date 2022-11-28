package edu.pitt.menumanagerv3;

import java.util.ArrayList;
import java.util.Random;

/**
 * Class MenuManager
 * @author mofetaiwo
 * Created 11/14/2022
 */
public class MenuManager {
	private ArrayList<Entree> entrees;
	private ArrayList<Side> sides;
	private ArrayList<Salad> salads;
	private ArrayList<Dessert> desserts;
	
	public MenuManager(String dishesFile) {
		this.entrees = splitEntreeArrayList(FileManager.readItems(dishesFile));
		this.sides = splitSideArrayList(FileManager.readItems(dishesFile));
		this.salads = splitSaladArrayList(FileManager.readItems(dishesFile));
		this.desserts = splitDessertArrayList(FileManager.readItems(dishesFile));
	}
	
	/**
	 * Method splitEntreeArrayList
	 * @param menuItemArrayList
	 * @return arrayList of only entrees
	 */
	public static ArrayList<Entree> splitEntreeArrayList(ArrayList<MenuItem> menuItemArrayList) {
		ArrayList<Entree> entreeArrayList = new ArrayList<Entree>();
		
		for (int i = 0; i < menuItemArrayList.size(); i++) {
			
			 if (menuItemArrayList.get(i) instanceof Entree) {
				 entreeArrayList.add((Entree) menuItemArrayList.get(i));
			 }
		 }
		return entreeArrayList;
	}
	
	/**
	 * Method splitSideArrayList
	 * @param menuItemArrayList
	 * @return arrayList of only sides
	 */
	public static ArrayList<Side> splitSideArrayList(ArrayList<MenuItem> menuItemArrayList) {
		ArrayList<Side> sideArrayList = new ArrayList<Side>();
		
		for (int i = 0; i < menuItemArrayList.size(); i++) {
			
			 if (menuItemArrayList.get(i) instanceof Side) {
				 sideArrayList.add((Side) menuItemArrayList.get(i));
			 }
		 }
		return sideArrayList;
	}
	
	/**
	 * Method splitSaladArrayList
	 * @param menuItemArrayList
	 * @return arrayList of only salads
	 */
	public static ArrayList<Salad> splitSaladArrayList(ArrayList<MenuItem> menuItemArrayList) {
		ArrayList<Salad> saladArrayList = new ArrayList<Salad>();
		
		for (int i = 0; i < menuItemArrayList.size(); i++) {
			
			 if (menuItemArrayList.get(i) instanceof Side) {
				 saladArrayList.add((Salad) menuItemArrayList.get(i));
			 }
		 }
		return saladArrayList;
	}
	
	/**
	 * Method splitDessertArrayList
	 * @param menuItemArrayList
	 * @return arrayList of only desserts
	 */
	public static ArrayList<Dessert> splitDessertArrayList(ArrayList<MenuItem> menuItemArrayList) {
		ArrayList<Dessert> dessertArrayList = new ArrayList<Dessert>();
		
		for (int i = 0; i < menuItemArrayList.size(); i++) {
			
			 if (menuItemArrayList.get(i) instanceof Side) {
				 dessertArrayList.add((Dessert) menuItemArrayList.get(i));
			 }
		 }
		return dessertArrayList;
	}
	
	/**
	 * Method randomMenu
	 * @param name
	 * @return menu of a random entree, side, salad, dessert
	 */
	public Menu randomMenu(String name) {
		Random rand = new Random();
		
		int eIndex = rand.nextInt(entrees.size());		 
		Entree e = entrees.get(eIndex);
		
		int siIndex = rand.nextInt(sides.size());	
		Side si = sides.get(siIndex);
		
		int saIndex = rand.nextInt(salads.size());	
		Salad sa = salads.get(saIndex);
		
		int dIndex = rand.nextInt(desserts.size());	
		Dessert d = desserts.get(dIndex);
		
		Menu m = new Menu(name, e, si, sa, d);
		
		return m;
	}
	
	/**
	 * Method minCaloriesMenu
	 * @param name
	 * @return lowest calorie menu
	 */
	public Menu minCaloriesMenu(String name) {
		int entreeMin = entrees.get(0).getCalories();
		int sideMin = sides.get(0).getCalories();
		int saladMin = salads.get(0).getCalories();
		int dessertMin = desserts.get(0).getCalories();
		
		for(int i = 0; i <= entrees.size(); i++) {
			if (entrees.get(i).getCalories() < entreeMin) {
				entreeMin = entrees.get(i).getCalories();
			}
		}
		
		for(int i = 0; i <= sides.size(); i++) {
			if (sides.get(i).getCalories() < sideMin) {
				sideMin = sides.get(i).getCalories();	
			}
		}
		
		for(int i = 0; i <= salads.size(); i++) {
			if (salads.get(i).getCalories() < saladMin) {
				saladMin = salads.get(i).getCalories();
			}
		}
		
		for(int i = 0; i <= desserts.size(); i++) {
			if (desserts.get(i).getCalories() < dessertMin) {
				dessertMin = desserts.get(i).getCalories();
			}
		}
		
		Entree e = entrees.get(entreeMin);
		Side si = sides.get(sideMin);
		Salad sa = salads.get(saladMin);
		Dessert d = desserts.get(dessertMin);
		
		Menu m = new Menu(name, e, si, sa, d);
		
		return m;
	}
	
	/**
	 * Method maxCaloriesMenu
	 * @param name
	 * @return highest calories menu
	 */
	public Menu maxCaloriesMenu(String name) {
		int entreeMax = entrees.get(0).getCalories();
		int sideMax = sides.get(0).getCalories();
		int saladMax = salads.get(0).getCalories();
		int dessertMax = desserts.get(0).getCalories();
		
		for(int i = 0; i <= entrees.size(); i++) {
			if (entrees.get(i).getCalories() > entreeMax) {
				entreeMax = entrees.get(i).getCalories();
			}
		}
		
		for(int i = 0; i <= sides.size(); i++) {
			if (sides.get(i).getCalories() > sideMax) {
				sideMax = sides.get(i).getCalories();	
			}
		}
		
		for(int i = 0; i <= salads.size(); i++) {
			if (salads.get(i).getCalories() > saladMax) {
				saladMax = salads.get(i).getCalories();
			}
		}
		
		for(int i = 0; i <= desserts.size(); i++) {
			if (desserts.get(i).getCalories() > dessertMax) {
				dessertMax = desserts.get(i).getCalories();
			}
		}
		
		Entree e = entrees.get(entreeMax);
		Side si = sides.get(sideMax);
		Salad sa = salads.get(saladMax);
		Dessert d = desserts.get(dessertMax);
		
		Menu m = new Menu(name, e, si, sa, d);
		
		return m;
	}
	
	//getters and setters

	/**
	 * @return the entrees
	 */
	public ArrayList<Entree> getEntrees() {
		return entrees;
	}

	/**
	 * @param entrees the entrees to set
	 */
	public void setEntrees(ArrayList<Entree> entrees) {
		this.entrees = entrees;
	}

	/**
	 * @return the sides
	 */
	public ArrayList<Side> getSides() {
		return sides;
	}

	/**
	 * @param sides the sides to set
	 */
	public void setSides(ArrayList<Side> sides) {
		this.sides = sides;
	}

	/**
	 * @return the salads
	 */
	public ArrayList<Salad> getSalads() {
		return salads;
	}

	/**
	 * @param salads the salads to set
	 */
	public void setSalads(ArrayList<Salad> salads) {
		this.salads = salads;
	}

	/**
	 * @return the desserts
	 */
	public ArrayList<Dessert> getDesserts() {
		return desserts;
	}

	/**
	 * @param desserts the desserts to set
	 */
	public void setDesserts(ArrayList<Dessert> desserts) {
		this.desserts = desserts;
	}
}
