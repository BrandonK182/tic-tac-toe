package tictactoe;

public class Board
{
	public String[][] getBoard()
	{
	String[][] gameBoard = {{"1", "|", "2", "|", "3"},
			{"-", "+", "-", "-", "+" , "-"},
			{"4", "|", "5", "|", "6"},
			{"-", "+", "-", "-", "+" , "-"},
			{"7", "|", "8", "|", "9"}};
		return gameBoard;
	}
}
