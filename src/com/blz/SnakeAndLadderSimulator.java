package com.blz;

public class SnakeAndLadderSimulator {

	public static void main(String[] args) {
		System.out.println("  Welcome...!!"); // Print Welcome Message
		int startPosition = 0; // Inialize variable for strt position with 0.
		System.out.println(" Starting position of Snake and Ladder is : " + startPosition);

		int randomNum = (int) Math.floor((Math.random() * 6) + 1);// Geanerate random Dice number between 1-6 using math
																	// function.
		System.out.println(" Dice Roll = " + randomNum);
	}

}
