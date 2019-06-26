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

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				fieldStatus = this.mineSweeperField.getMine(i, j);
				switch (fieldStatus) {
					case MineSweeperField.CHECKED_FIELD:
						// TODO: get number of mines around this field
						System.out.print("0");
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

}
