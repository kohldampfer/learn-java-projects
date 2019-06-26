package com.learnjavaprojects.minesweeper;

import java.util.*;

public class MineSweeperField {

	// size of minesweeper field
	private int size;

	// minesweeper field where one can put mines on it
	private int [] [] field;

	public static final int WITH_MINE = 1;

	public static final int NO_MINE = 0;

	// Constructor
	public MineSweeperField(int size) {
		if (size <= 0) {
			throw new IllegalArgumentException("Size of minesweeper field cannot be 0 or less than 0.");
		} else {
			this.size = size;
		}

		this.field = new int [this.size] [this.size];

		// initialize all places on field to zero
		for (int i = 0; i < this.size; i++) {
			for (int j = 0; j < this.size; j++) {
				this.field[i][j] = MineSweeperField.NO_MINE;
			}
		}
	}

	// this function sets a mine on a place in the field
	public void setMine(int x, int y) {
		if (x < 0) {
			throw new IllegalArgumentException("Cannot put a mine on a field where x is smaller than 0.");
		}

		if (x >= this.size) {
			throw new IllegalArgumentException("Cannot put a mine on a field where x is bigger than the field size.");
		}

		if (y < 0) {
			throw new IllegalArgumentException("Cannot put a mine on a field where y is smaller than 0.");
		}

		if (y >= this.size) {
			throw new IllegalArgumentException("Cannot put a mine on a field where y is bigger than the field size.");
		}

		this.field[x][y] = MineSweeperField.WITH_MINE;
	}

	public void setMines(int number) {
		if (number < 0) {
			throw new IllegalArgumentException("Cannot put less than zero mines onto a field.");
		}

		// in our case it does not matter if on a field is already a mine
		for (int i = 0; i < number; i++) {
			int x = (int)(Math.random() * this.size);
			int y = (int)(Math.random() * this.size);

			this.setMine(x, y);
		}

	}

	public int getMine(int x, int y) {
		if (x < 0) {
			throw new IllegalArgumentException("Cannot retrieve mine of a field where x is smaller than 0.");
		}

		if (x >= this.size) {
			throw new IllegalArgumentException("Cannot retrieve mine of a field where x is greater than field size.");
		}

		if (y < 0) {
			throw new IllegalArgumentException("Cannot retrieve mine of a field where y is smaller than 0.");
		}

		if (y >= this.size) {
			throw new IllegalArgumentException("Cannot retrieve mine of a field where y is greater than field size.");
		}

		return this.field[x][y];
	}

	// returns the size of the minesweeper field
	public int getSize() {
		return this.size;
	}
}
