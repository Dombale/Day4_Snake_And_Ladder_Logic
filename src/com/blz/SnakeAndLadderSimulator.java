package com.blz;

public class SnakeAndLadderSimulator {

	public static void main(String[] args) {
		System.out.println("  Welcome...!!"); // Print Welcome Message
		int i = 2;
		int position1 = 0; // Initialize variable for start position of player with 0.
		int position2 = 0; // Initialize variable for start position of player with 0.
		System.out.println(" Starting position of player is : " + position1 + position2);

		while (position1 < 100 && position2 < 100) {
			int diceRoll = (int) Math.floor((Math.random() * 6) + 1);// Generate random Dice number between 1-6 using
																		// math function.
			System.out.println(" Dice Roll = " + diceRoll);
			int checkOption = (int) (Math.random() * 3); // Generate Random number check possible conditions
			{
				if (i % 2 == 0)
					switch (checkOption) { // Use switch case to check conditions.

					case 2:
						// position=0;
						System.out.println("No one play the game");// No play, player stays in same position.
						break;
					case 1:
						position1 = position1 + diceRoll; // if ladder, player moves ahead with received Diceroll number
															// in
															// game.
						System.out.println("Ladder");
						break;
					case 0: {
						position1 = position1 - diceRoll; // if Snake, player moves behind with received Diceroll number
															// in
															// game.
						System.out.println("Snake");
						if (position1 < 0) // if player position<0, consider it should be = 0.
							position1 = 0;
						break;
					}

					}
				// if position beyond 100, then it remains stay on same position
				if (position1 > 100)
					position1 = position1 - diceRoll;
				if (position1 == 100) {
					System.out.println("Player1 wins");
					System.out.println("Position= " + position1);
					break;
				} else

				{

					switch (checkOption) { // Use switch case to check conditions.

					case 2:
						// position=0;
						System.out.println("No one play the game");// No play, player stays in same position.
						break;
					case 1:
						position2 = position2 + diceRoll; // if ladder, player moves ahead with received Diceroll number
															// in
															// game.
						System.out.println("Ladder");
						break;
					case 0: {
						position2 = position2 - diceRoll; // if Snake, player moves behind with received Diceroll number
															// ingame.
						System.out.println("Snake");
						if (position2 < 0) // if player position<0, consider it should be = 0.
							position2 = 0;
						break;
					}

					}
					// if position beyond 100, then it remains stay on same position
					if (position2 > 100)
						position2 = position1 - diceRoll;
					if (position2 == 100) {
						System.out.println("Player2 wins");
						System.out.println("Position= " + position2);
						break;
					}
				}
				i++;

			}

		}
	}
}