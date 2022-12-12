package edu.pitt.menumanagergui;

import java.util.ArrayList;
import java.util.Random;

/**
 * Class MenuRandomize
 * @author mofetaiwo
 * Created 10/25/2022
 */
public class MenuRandomize {
	private ArrayList<Entree> entrees;
	private ArrayList<Side> sides;
	private ArrayList<Salad> salads;
	private ArrayList<Dessert> desserts;
	
	/**
	 * @param entreeFile
	 * @param sideFile
	 * @param saladFile
	 * @param dessertFile
	 */
	public MenuRandomize (String entreeFile, String sideFile, String saladFile, String dessertFile){
		this.entrees = FileManager.readEntrees(entreeFile);
		this.sides = FileManager.readSides(sideFile);
		this.salads = FileManager.readSalads(saladFile);
		this.desserts = FileManager.readDesserts(dessertFile);
	}
	
	/**
	 * Method randomMenu
	 * @return m
	 */
	public Menu randomMenu() {
		Random rand = new Random();
		
		int eIndex = rand.nextInt(entrees.size());		 
		Entree e = entrees.get(eIndex);
		
		int siIndex = rand.nextInt(sides.size());	
		Side si = sides.get(siIndex);
		
		int saIndex = rand.nextInt(salads.size());	
		Salad sa = salads.get(saIndex);
		
		int dIndex = rand.nextInt(desserts.size());	
		Dessert d = desserts.get(dIndex);
		
		Menu m = new Menu("menu1", e, si, sa, d);
		
		return m;
	}
}
