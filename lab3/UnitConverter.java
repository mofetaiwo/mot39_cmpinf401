package edu.pitt.lab3;

import javax.swing.JOptionPane;

public class UnitConverter {

	public static void main(String[] args) {
		String userInput = JOptionPane.showInputDialog(null, "Enter a distance or weight amount:");
		
		String val = "";
		if (userInput.substring(userInput.length()- 2) == " m") {
			val = userInput.substring(0, userInput.length()-2);
		}
		else {
			val = userInput.substring(0, userInput.length()-3);
		}
		
		double num = Double.parseDouble(val);
				
		String unit = "";
		for (int i = 0; i < userInput .length(); i++) {
			char a = userInput.charAt(i);
			
			if (a >= 'a' && a <= 'z') {
				unit = unit + a;
			}
		}
		
		if (unit.equalsIgnoreCase("cm")) {
			num /= 2.54;
			unit = "in";
		}
		
		else if(unit.equalsIgnoreCase("in")) {
			num *= 2.54;
			unit = "cm";
		}
		
		else if(unit.equalsIgnoreCase("yd")) {
			num /= 1.094;
			unit = "m";
		}
		
		else if(unit.equalsIgnoreCase("m")) {
			num *= 1.094;
			unit = "yd";
		}
		
		else if(unit.equalsIgnoreCase("gm")) {
			num /= 28.35;
			unit = "oz";
		}
		
		else if(unit.equalsIgnoreCase("oz")) {
			num *= 28.35;
			unit = "gm";
		}
		
		else if(unit.equalsIgnoreCase("lb")) {
			num /= 2.205;
			unit = "kg";
		}
		
		else if(unit.equalsIgnoreCase("kg")) {
			num *= 2.205;
			unit = "lb";
		}
		
		System.out.print(userInput + " = " + num + " " + unit);
	}
}