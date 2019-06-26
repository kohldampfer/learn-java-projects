package com.learnjavaprojects.minesweeper;

/**
 * Hello world!
 *
 */
public class App {

	public static void main( String[] args ) {

		MineSweeperField field = new MineSweeperField(10);
		field.setMines(10);

		MineSweeperWriterConsole mswriter = new MineSweeperWriterConsole(field);

		mswriter.writeField();

	}

}
