package edu.pitt.lab7;

import java.util.Scanner;
import java.util.Random;

/**
 * Class ArrayMethods
 * @author mofetaiwo
 * Created: 10/23/2022
 */
public class ArrayMethods {
	public static double max(double[] data) {
		double max = data[0];
		
		for(int i = 0; i < data.length; i++) {
			if (data[i] > max) {
				max = data[i];
			}
		}
		return max;
	}

    public static double min(double[] data) {
    	double min = data[0];
		
		for(int i = 0; i < data.length; i++) {
			if (data[i] < min) {
				min = data[i];
			}
		}
		return min;
	}
    
    public static double sum(double[] data) {
		double sum = 0;
		
		for(int i = 0; i < data.length; i++) {
			sum += data[i];
		}
		return sum;
	}
    
    public static double ave(double[] data) {
		return sum(data) / data.length;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rand  = new Random();
		
		System.out.println("How many items will be entered? ");
		int num = input.nextInt();
		
		double[] numArray = new double[num];
		
		for(int i = 0; i < num; i++) {
			numArray[i] = rand.nextDouble();
		}
		
		System.out.println("The max value in the array is " + max(numArray));
		System.out.println("The min value in the array is " + min(numArray));
		System.out.println("The sum of values in the array is " + sum(numArray));
		System.out.println("The average of values in the array is " + ave(numArray));
		
		input.close();
	}
}