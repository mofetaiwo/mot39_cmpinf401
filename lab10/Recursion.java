package edu.pitt.lab10;

public class Recursion {
	
	public static int sumOfDigits(int x) {
		if (x < 0) {
			return sumOfDigits(-x);
		}
		else if(x < 10) {
			return x;
		}
		else {
			return x % 10 + sumOfDigits(x / 10);
		}
	}
	
	public static void printArrayElements(int[] a, int index) {
		if (index > -1) {
			printArrayElements(a, index - 1);
			System.out.println(a[index]);
		}
	}
	
	public static void printCombos(int[] a, String out, int startIndex, int k) {
		if (k > a.length || k == 0) {
			System.out.println(out);
		}
		for (int i = startIndex; i < a.length; i++) {
			printCombos(a, out + " " + a[i], i + 1, k - 1);
			
			while (i < a.length -1 && a[i] == a[i + 1]) {
				i++;
			}
		}
	}

	public static void main(String[] args) {
		//System.out.print(sumOfDigits(24));
		
		//int[] a = {14, 15, 16, 17, 18};
		//printArrayElements(a, a.length - 1);
		
		int[] a = {2, 3, 7, 8, 9};
		printCombos(a, "", 0, 3);
	}

}
