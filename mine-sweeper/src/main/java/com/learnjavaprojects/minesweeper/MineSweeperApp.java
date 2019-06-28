package com.learnjavaprojects.minesweeper;

import java.util.*;
import java.lang.*;

/**
 * Hello world!
 *
 */
public class MineSweeperApp {

	public static void main( String[] args ) {

		boolean quit = false;

		int fieldSize = 10;

		MineSweeperField field = new MineSweeperField(10);
		field.setMines(fieldSize);

		MineSweeperWriterConsole mswriter = new MineSweeperWriterConsole(field);

		Scanner scanInput = new Scanner(System.in);
		while (quit != true) {
			System.out.println("What do you want to do? Press h for help");

			String input = scanInput.nextLine();

			if (input.equals("h")) {
				MineSweeperApp.printMenu();
			} else if (input.equals("q")) {
				System.out.println("You wanted to exit program. See you next time :)");
				quit = true;
			} else if (input.equals("p")) {
				mswriter.writeField();
			} else if (input.equals("e")) {
				int xValue = MineSweeperApp.enterValue("X", fieldSize);
				int yValue = MineSweeperApp.enterValue("Y", fieldSize);

				try {
					field.checkField(xValue, yValue);
					mswriter.writeField();
				} catch (StepOnMineException e) {
					System.out.println(e.getMessage());
					mswriter.printRealField();
					quit = true;
				}
			}
		}

		System.exit(0);

	}

	public static void printMenu() {
		System.out.println(" === Help ===");
		System.out.println(" q - Quit program.");
		System.out.println(" p - Print current mine sweeper field.");
		System.out.println(" e - Enter e to check a field.");
		System.out.println(" a - Enter a when you assume a mine on a field.");
		System.out.println(" h - Print this menu.");
		System.out.println(" ============");
	}

	public static int enterValue(String valueName, int fieldSize) {
		Scanner scanInput = new Scanner(System.in);
		System.out.println("Enter value for " + valueName + ": ");

		boolean gotAnswer = false;
		int result = 0;

		// try to convert
		while (gotAnswer != true) {
			try {
				String input = scanInput.nextLine();
				result = Integer.parseInt(input);
				gotAnswer = true;
			} catch (NumberFormatException e) {
				System.out.println("Could not read your answer. Please try again:");
			}
		}

		return result;
	}

}
