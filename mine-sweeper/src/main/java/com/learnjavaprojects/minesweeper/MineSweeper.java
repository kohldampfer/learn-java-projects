package com.learnjavaprojects.minesweeper;

public class MineSweeper {

	// size of minesweeper field
	private int size;

	private int [] [] field;

	// Constructor
	public MineSweeper(int size) {
		if (size <= 0) {
			throw new IllegalArgumentException("Size of minesweeper field cannot be 0 or less than 0.");
		} else {
			this.size = size;
		}

		field = new int [this.size] [this.size];
	}

	// returns the size of the minesweeper field
	public int getSize() {
		return this.size;
	}
}
