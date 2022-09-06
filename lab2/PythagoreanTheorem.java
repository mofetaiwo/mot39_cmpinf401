package edu.pitt.lab2;

import javax.swing.*;

public class PythagoreanTheorem 
{

	public static void main(String[] args) 
	{
		String userInput = JOptionPane.showInputDialog(null, "Enter the first value:");
		double a = Double.parseDouble(userInput);
		
		userInput = JOptionPane.showInputDialog(null, "Enter the second value:");
		double b = Double.parseDouble(userInput);
		
		double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b,2));
		c = (int)Math.round(c * 100)/100.0;
		
		JOptionPane.showMessageDialog(null, "The hypotenuse is " + c);
	}

}