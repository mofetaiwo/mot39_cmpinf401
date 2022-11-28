package edu.pitt.menumanagerv3;

public class Driver {

	public static void main(String[] args) {
		MenuManager menu = new MenuManager("data/dishes.txt");
		Menu myMenu = menu.randomMenu("Nugget");
		
		System.out.println(myMenu.description() + "\nTotal calories " + myMenu.totalCalories() + "\nTotal price " + myMenu.totalPrice());
	}

}
