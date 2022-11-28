package edu.pitt.menumanagerv3;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Class FileManager
 * @author mofetaiwo
 * Created 10/25/2022
 */
public class FileManager {
	
	/**
	 * Method readEntrees
	 * @param fileName
	 * @return entreeArrayList
	 */
	public static ArrayList<Entree> readEntrees(String fileName) {
		ArrayList<Entree> entreeArrayList = new ArrayList<Entree>();
		
		try {
		    BufferedReader br = new BufferedReader(new FileReader(fileName)); 
		    String line = br.readLine();
		    
		    while (line != null) {
		    	String[] entreeArray = line.split("@@");
		    	
		    	String name = entreeArray[0];
		    	String desc = entreeArray[1];
		    	int cal = Integer.parseInt(entreeArray[2]);
		    	double price = Double.parseDouble(entreeArray[3]);
		    	
		    	Entree entree = new Entree(name, desc, cal, price);
		    	
		    	entreeArrayList.add(entree);
		    	
		    	line = br.readLine();
		    }
		    System.out.print(entreeArrayList);
		    
		    br.close();
		} 
		catch (IOException e) {
		    System.out.println(e.getMessage());
		}
		return entreeArrayList;
	}
	
	/**
	 * Method readSides
	 * @param fileName
	 * @return sideArrayList
	 */
	public static ArrayList<Side> readSides(String fileName) {
		ArrayList<Side> sideArrayList = new ArrayList<Side>();

		try {
			BufferedReader br = new BufferedReader(new FileReader(fileName)); 
			String line = br.readLine();

			while (line != null) {
				String[] sideArray = line.split("@@");

				String name = sideArray[0];
				String desc = sideArray[1];
				int cal = Integer.parseInt(sideArray[2]);
				double price = Double.parseDouble(sideArray[3]);

				Side side = new Side(name, desc, cal, price);

				sideArrayList.add(side);
				
				line = br.readLine();
			}
			System.out.print(sideArrayList);

			br.close();
		} 
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
		return sideArrayList;
	}
	
	/**
	 * Method readSalads
	 * @param fileName
	 * @return saladArrayList
	 */
	public static ArrayList<Salad> readSalads(String fileName) {
		ArrayList<Salad> saladArrayList = new ArrayList<Salad>();
		
		try {
		    BufferedReader br = new BufferedReader(new FileReader(fileName)); 
		    String line = br.readLine();
		    
		    while (line != null) {
		    	String[] saladArray = line.split("@@");
		    	
		    	String name = saladArray[0];
		    	String desc = saladArray[1];
		    	int cal = Integer.parseInt(saladArray[2]);
		    	double price = Double.parseDouble(saladArray[3]);
		    	
		    	Salad salad = new Salad(name, desc, cal, price);
		    	
		    	saladArrayList.add(salad);
		    	
		    	line = br.readLine();
		    }
		    System.out.print(saladArrayList);
		    
		    br.close();
		} 
		catch (IOException e) {
		    System.out.println(e.getMessage());
		}
		return saladArrayList;
	}
	
	/**
	 * Method readDesserts
	 * @param fileName
	 * @return dessertArrayList
	 */
	public static ArrayList<Dessert> readDesserts(String fileName) {
		ArrayList<Dessert> dessertArrayList = new ArrayList<Dessert>();
		
		try {
		    BufferedReader br = new BufferedReader(new FileReader(fileName)); 
		    String line = br.readLine();
		    
		    while (line != null) {
		    	String[] dessertArray = line.split("@@");
		    	
		    	String name = dessertArray[0];
		    	String desc = dessertArray[1];
		    	int cal = Integer.parseInt(dessertArray[2]);
		    	double price = Double.parseDouble(dessertArray[3]);
		    	
		    	Dessert dessert = new Dessert(name, desc, cal, price);
		    	
		    	dessertArrayList.add(dessert);
		    	
		    	line = br.readLine();
		    }
		    System.out.print(dessertArrayList);
		    
		    br.close();
		} 
		catch (IOException e) {
		    System.out.println(e.getMessage());
		}
		return dessertArrayList;
	}
	
	/**
	 * Method readItems
	 * @param filename
	 * @return menuItemArrayList
	 */
	public static ArrayList<MenuItem> readItems(String fileName){
		ArrayList<MenuItem> menuItemArrayList = new ArrayList<MenuItem>();
		
		try {
		    BufferedReader br = new BufferedReader(new FileReader(fileName)); 
		    String line = br.readLine();
		    
		    while (line != null) {
		    	String[] menuItemArray = line.split("@@");
		    	
		    	String name = menuItemArray[0];
		    	String typeOfDish = menuItemArray[1];
		    	String desc = menuItemArray[2];
		    	int cal = Integer.parseInt(menuItemArray[3]);
		    	double price = Double.parseDouble(menuItemArray[4]);
		    	
		    	if (typeOfDish == "entree") {	
		    		Entree entree = new Entree(name, desc, cal, price);
		    		menuItemArrayList.add(entree);
		    	}
		    	
		    	if (typeOfDish == "side") {
		    		Side side = new Side(name, desc, cal, price);
		    		menuItemArrayList.add(side);
		    	}
		    	
		    	if (typeOfDish == "salad") {
		    		Salad salad = new Salad(name, desc, cal, price);
		    		menuItemArrayList.add(salad);
		    	}
		    	
		    	if (typeOfDish == "dessert") {
		    		Dessert dessert = new Dessert(name, desc, cal, price);
		    		menuItemArrayList.add(dessert);
		    	}
				
		    	line = br.readLine();
		    }
		    System.out.print(menuItemArrayList);
		    
		    br.close();
		} 
		catch (IOException e) {
		    System.out.println(e.getMessage());
		}
		return menuItemArrayList;
	}
	
	/**
	 * Method writeMenus
	 * @param fileName
	 * @param menus
	 */
	public static void writeMenus(String fileName, ArrayList<Menu> menus){
		try {
		    BufferedWriter bw = new BufferedWriter(new FileWriter(fileName)); 
		    
		    for (int i = 0; i < menus.size(); i++) {
		    	bw.write(menus.get(i).getName());
		    	bw.newLine();
		    	bw.newLine();
		    	
		    	bw.write("entree");
		    	bw.newLine();
		    	bw.write(menus.get(i).getEntree().getName());
		    	bw.write(": ");
		    	bw.write(menus.get(i).getEntree().getDescription());
		    	bw.write(" ");
		    	bw.write(menus.get(i).getEntree().getCalories());
		    	bw.write(" ");
		    	
		    	Double entreePrice = menus.get(i).getEntree().getPrice();
		    	bw.write(entreePrice.toString());
		    	
		    	bw.newLine();
			    bw.newLine();
			    
			    bw.write("side");
		    	bw.newLine();
		    	bw.write(menus.get(i).getSide().getName());
		    	bw.write(": ");
		    	bw.write(menus.get(i).getSide().getDescription());
		    	bw.write(" ");
		    	bw.write(menus.get(i).getSide().getCalories());
		    	bw.write(" ");
		    	
		    	Double sidePrice = menus.get(i).getSide().getPrice();
		    	bw.write(sidePrice.toString());
		    	
		    	bw.newLine();
			    bw.newLine();
			    
			    bw.write("salad");
		    	bw.newLine();
		    	bw.write(menus.get(i).getSalad().getName());
		    	bw.write(": ");
		    	bw.write(menus.get(i).getSalad().getDescription());
		    	bw.write(" ");
		    	bw.write(menus.get(i).getSalad().getCalories());
		    	bw.write(" ");
		    	
		    	Double saladPrice = menus.get(i).getSalad().getPrice();
		    	bw.write(saladPrice.toString());
		    	
		    	bw.newLine();
			    bw.newLine();
			    
			    bw.write("dessert");
		    	bw.newLine();
		    	bw.write(menus.get(i).getDessert().getName());
		    	bw.write(": ");
		    	bw.write(menus.get(i).getDessert().getDescription());
		    	bw.write(" ");
		    	bw.write(menus.get(i).getDessert().getCalories());
		    	bw.write(" ");
		    	
		    	Double dessertPrice = menus.get(i).getDessert().getPrice();
		    	bw.write(dessertPrice.toString());
		    	
		    	bw.newLine();
			    bw.newLine();
			    
			    bw.write("total calories: ");
			    bw.write(menus.get(i).totalCalories());
			    bw.write("total price");
			    
			    Double totalPrice = menus.get(i).totalPrice();
		    	bw.write(totalPrice.toString());
		    }
		    bw.close();
		} 
		catch (IOException e) {
		    System.out.println(e.getMessage());
		}
	}
}