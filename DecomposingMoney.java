package edu.pitt.lab2;

import javax.swing.*;

public class DecomposingMoney 
{

	public static void main(String[] args) 
	{
		String userInput = JOptionPane.showInputDialog(null, "Enter a value from 1 to 9999:");
		int m = Integer.parseInt(userInput);
		
		int bucks = m % 10;
		int sawbucks = (m % 100)/10;
		int benjamins = (m % 1000)/100;
		int grands = m/1000;
		
		JOptionPane.showMessageDialog(null, "There are " + bucks + " bucks, " + sawbucks +
				" sawbucks, " + benjamins + " benjamins, and " + grands + " grands in " + m);
	}

}