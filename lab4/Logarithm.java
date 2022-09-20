package edu.pitt.lab4;

import javax.swing.JOptionPane;

public class Logarithm {

	public static void main(String[] args) {
		int x = 0;
		int b = 0;
		int log = 0;
		
		while(x <= 0 || b <= 1) {
			x = Integer.parseInt(JOptionPane.showInputDialog("Enter an x value greater than 0"));
			b = Integer .parseInt(JOptionPane.showInputDialog("Enter a base value greater than 1"));		
		}
		
		while (x >= b) {
			x = x/b;
			log += 1;
		}
		
		JOptionPane.showMessageDialog(null, "The log is " + log);
	}
}