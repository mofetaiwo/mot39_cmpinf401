package edu.pitt.lab5;

import java.util.Random;
import java.util.Scanner;

public class Dice {
	
	public static void rollDice(int rolls, Random rand){
		int twos = 0;
		int threes = 0;
		int fours = 0;
		int fives = 0;
		int sixes = 0;
		int sevens = 0;
		int eights = 0;
		int nines = 0;
		int tens = 0;
		int elevens = 0;
		int twelves = 0;
		int valueDie1;
		int valueDie2;
		
		for (int i = 1; i <= rolls; i++){
			valueDie1 = rand.nextInt(6) + 1;
			valueDie2 = rand.nextInt(6)+ 1;
			
			if (valueDie1 + valueDie2 == 2) {
				twos += 1;
			}
			else if (valueDie1 + valueDie2 == 3) {
				threes += 1;
			}
			else if (valueDie1 + valueDie2 == 4) {
				fours += 1;
			}
			else if (valueDie1 + valueDie2 == 5) {
				fives += 1;
			}
			else if (valueDie1 + valueDie2 == 6) {
				sixes += 1;
			}
			else if (valueDie1 + valueDie2 == 7) {
				sevens += 1;
			}
			else if (valueDie1 + valueDie2 == 8) {
				eights += 1;
			}
			else if (valueDie1 + valueDie2 == 9) {
				nines += 1;
			}
			else if (valueDie1 + valueDie2 == 10) {
				tens += 1;
			}
			else if (valueDie1 + valueDie2 == 11) {
				elevens += 1;
			}
			else if (valueDie1 + valueDie2 == 12) {
				twelves += 1;
			}
		}
		System.out.println("2 occured " + twos + " times and its fraction is " + twos+ "/" + rolls);
		System.out.println("3 occured " + threes + " times and its fraction is " + threes + "/" + rolls);
		System.out.println("4 occured " + fours + " times and its fraction is " + fours + "/" + rolls);
		System.out.println("5 occured " + fives + " times and its fraction is " + fives + "/" + rolls);
		System.out.println("6 occured " + sixes + " times and its fraction is " + sixes + "/" + rolls);
		System.out.println("7 occured " + sevens + " times and its fraction is " + sevens + "/" + rolls);
		System.out.println("8 occured " + eights + " times and its fraction is " + eights + "/" + rolls);
		System.out.println("9 occured " + nines + " times and its fraction is " + nines + "/" + rolls);
		System.out.println("10 occured " + tens + " times and its fraction is " + tens + "/" + rolls);
		System.out.println("11 occured " + elevens + " times and its fraction is " + elevens + "/" + rolls);
		System.out.println("12 occured " + twelves + " times and its fraction is " + twelves + "/" + rolls);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String again = "y";
		
		while(again.equals("y")) {
			System.out.print("How many times do you want to roll the dice? ");
			int roll = sc.nextInt();
			
			rollDice(roll , new Random());
			
			System.out.print("Enter y if you would like to continue: ");
			again = sc.next();
		}
		sc.close();
	}
}
