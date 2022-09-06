package edu.pitt.lab2;

import javax.swing.*;

public class CircleAreaAndPerimeter 
{

	public static void main(String[] args) 
	{
		String userInput = JOptionPane.showInputDialog(null, "Enter the radius of a circle:");
		double r = Double.parseDouble(userInput);
		
		double p = 2 * Math.PI * r;
		double a = Math.PI * Math.pow(r, 2);
		
		p = (int)Math.round(p * 100)/100.0;
		a = (int)Math.round(a * 100)/100.0;
		
		JOptionPane.showMessageDialog(null, "The circle with radius " + r + 
				" has an area of " + a + " and a perimeter of " + p);
	}

}