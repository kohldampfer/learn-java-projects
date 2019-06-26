package com.learnjavaprojects.minesweeper;

public interface IMineSweeperWriter {

	// function for writing the field to an output
	public void writeField();

	// function for setting the MineSweeperField for an object
	public void setMineSweeperField(MineSweeperField field);

	// function for getting the current MineSweeperField used in an object
	public MineSweeperField getMineSweeperField();

}
