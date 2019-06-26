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

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print(this.mineSweeperField.getMine(i, j) + "|");
			}
			System.out.println();
		}
	}

}
