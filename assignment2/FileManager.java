package edu.pitt.menumanager;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
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
		    BufferedReader br = new BufferedReader(new FileReader("data/entrees.txt")); 
		    String line = br.readLine();
		    
		    while (line != null) {
		    	String[] entreeArray = line.split("@@");
		    	
		    	String name = entreeArray[0];
		    	String desc = entreeArray[1];
		    	int cal = Integer.parseInt(entreeArray[2]);
		    	
		    	Entree e = new Entree(name, desc, cal);
		    	
		    	entreeArrayList.add(e);
		    	
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
			BufferedReader br = new BufferedReader(new FileReader("data/sides.txt")); 
			String line = br.readLine();

			while (line != null) {
				String[] sideArray = line.split("@@");

				String name = sideArray[0];
				String desc = sideArray[1];
				int cal = Integer.parseInt(sideArray[2]);

				Side si = new Side(name, desc, cal);

				sideArrayList.add(si);
				
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
		    BufferedReader br = new BufferedReader(new FileReader("data/salads.txt")); 
		    String line = br.readLine();
		    
		    while (line != null) {
		    	String[] saladArray = line.split("@@");
		    	
		    	String name = saladArray[0];
		    	String desc = saladArray[1];
		    	int cal = Integer.parseInt(saladArray[2]);
		    	
		    	Salad sa = new Salad(name, desc, cal);
		    	
		    	saladArrayList.add(sa);
		    	
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
		    BufferedReader br = new BufferedReader(new FileReader("data/sides.txt")); 
		    String line = br.readLine();
		    
		    while (line != null) {
		    	String[] dessertArray = line.split("@@");
		    	
		    	String name = dessertArray[0];
		    	String desc = dessertArray[1];
		    	int cal = Integer.parseInt(dessertArray[2]);
		    	
		    	Dessert d = new Dessert(name, desc, cal);
		    	
		    	dessertArrayList.add(d);
		    	
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
}