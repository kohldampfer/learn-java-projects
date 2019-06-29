package com.learnjavaprojects.minesweeper;

public class MineSweeperWriterConsole implements IMineSweeperWriter {

	protected MineSweeperField mineSweeperField;

	public MineSweeperWriterConsole(MineSweeperField field) {
		if (field == null) {
			throw new IllegalArgumentException("A writer cannot use a MineSweeperField which is null.");
		}

		this.mineSweeperField = field;
	}

	public void setMineSweeperField(MineSweeperField field) {
		if (field == null) {
			throw new IllegalArgumentException("A writer cannot use a MineSweeperField which is null.");
		}

		this.mineSweeperField = field;
	}

	public MineSweeperField getMineSweeperField() {
		return this.mineSweeperField;
	}


	public void writeField() {
		int size = this.mineSweeperField.getSize();
		int fieldStatus = -1;

		for (int j = 0; j < size; j++) {
			System.out.print("|");
			for (int i = 0; i < size; i++) {
				fieldStatus = this.mineSweeperField.getMine(i, j);
				switch (fieldStatus) {
					case MineSweeperField.CHECKED_FIELD:
						int mineNumber = this.getNumberAroundField(i, j, size);
						System.out.print(mineNumber);
						break;
					case MineSweeperField.ASSUME_MINE:
						System.out.print("!");
						break;
					default:
						System.out.print("X");
						break;
				}
				System.out.print("|");
			}
			System.out.println();
		}
	}

	public void printRealField() {
		int size = this.mineSweeperField.getSize();
		int fieldStatus = -1;

		for (int j = 0; j < size; j++) {
			System.out.print("|");
			for (int i = 0; i < size; i++) {
				fieldStatus = this.mineSweeperField.getMine(i, j);
				switch (fieldStatus) {
					case MineSweeperField.WITH_MINE:
						System.out.print("!");
						break;
					default:
						int mineNumber = this.getNumberAroundField(i, j, size);

						if (mineNumber == 0) {
							System.out.print(" ");
						} else {
							System.out.print(mineNumber);
						}
						break;
				}
				System.out.print("|");
			}
			System.out.println();
		}
	}

	protected int getNumberAroundField(int x, int y, int fieldSize) {
		int number = 0;

		for (int i = -1; i <= 1; i++) {
			for (int j = -1; j <= 1; j++) {
				if ((x + i >= 0) && (x + i < fieldSize) && (y + j >= 0) && (y + j < fieldSize)) {
					int tempFieldStatus = this.mineSweeperField.getMine(x + i, y + j);
					if (tempFieldStatus == MineSweeperField.WITH_MINE) {
						number += 1;
					}
				}
			}
		}

		return number;
	}

}
