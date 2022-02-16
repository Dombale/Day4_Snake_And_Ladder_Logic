package com.blz;

public class SnakeAndLadderSimulator {

	public static void main(String[] args) {
		System.out.println("  Welcome...!!"); // Print Welcome Message
		int position = 0; // Initialize variable for start position of player with 0.
		System.out.println(" Starting position of Snake and Ladder is : " + position);

		int diceRoll = (int) Math.floor((Math.random() * 6) + 1);// Generate random Dice number between 1-6 using math
																	// function.
		System.out.println(" Dice Roll = " + diceRoll);

		int checkOption = (int) (Math.random() * 3); // Generate Random number check possible conditions

		switch (checkOption) { // Use switch case to check conditions.

		case 2:
			// position=0;
			System.out.println("No one play the game");// No play, player stays in same position.
			break;
		case 1:
			position = position + diceRoll; // if ladder, player moves ahead with received Diceroll number in game.
			System.out.println("Ladder");
			break;
		case 0: {
			position = position - diceRoll; // if Snake, player moves behind with received Diceroll number in game.
			System.out.println("Snake");
			if (position < 0) // if player position<0, consider it should be = 0.
				position = 0;
			break;
		}

		}
		System.out.println("The position is: " + position);
	}

}
