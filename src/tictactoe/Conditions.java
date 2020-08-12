package tictactoe;

import java.util.ArrayList;

public class Conditions
{
	private static String winner;
	private static boolean isWinner;
	
	static ArrayList<ArrayList> PlayerLose = new ArrayList<ArrayList>();
	static ArrayList<ArrayList> CPULose = new ArrayList<ArrayList>();
	static ArrayList<Integer> PlayerPositionsLose = new ArrayList<Integer>();
	static ArrayList<Integer> CPUPositionsLose = new ArrayList<Integer>();
	
	
	public static void checkWin()
	{
			if(TicTacToe.getPlayers().contains(1))
			{
				if(TicTacToe.getPlayers().contains(2))
				{
					if(TicTacToe.getPlayers().contains(3))
					{
						winner = "player";
						isWinner =true;
					}
				}
				if(TicTacToe.getPlayers().contains(4))
				{
					if(TicTacToe.getPlayers().contains(7))
					{
						winner = "player";
						isWinner =true;
					}
				}
				if(TicTacToe.getPlayers().contains(5))
				{
					if(TicTacToe.getPlayers().contains(9))
					{
						winner = "player";
						isWinner =true;
					}
				}
			}
			if(TicTacToe.getPlayers().contains(2))
			{
				if(TicTacToe.getPlayers().contains(5))
				{
					if(TicTacToe.getPlayers().contains(8))
					{
						winner = "player";
						isWinner =true;
					}
				}
			}
			if(TicTacToe.getPlayers().contains(3))
			{
				if(TicTacToe.getPlayers().contains(6))
				{
					if(TicTacToe.getPlayers().contains(9))
					{
						winner = "player";
						isWinner =true;
					}
				}
				if(TicTacToe.getPlayers().contains(5))
				{
					if(TicTacToe.getPlayers().contains(3))
					{
						winner = "player";
						isWinner =true;
					}
				}
			}
		if(TicTacToe.getPlayers().contains(4))
		{
			if(TicTacToe.getPlayers().contains(5))
			{
				if(TicTacToe.getPlayers().contains(6))
				{
					winner = "player";
					isWinner =true;
				}
			}
		}
		if(TicTacToe.getPlayers().contains(7))
		{
			if(TicTacToe.getPlayers().contains(8))
			{
				if(TicTacToe.getPlayers().contains(9))
				{
					winner = "player";
					isWinner =true;
				}
			}
		}
		
		//CPU
		if(TicTacToe.getCPUs().contains(1))
		{
			if(TicTacToe.getCPUs().contains(2))
			{
				if(TicTacToe.getCPUs().contains(3))
				{
					winner = "CPU";
					isWinner =true;
				}
			}
			if(TicTacToe.getCPUs().contains(4))
			{
				if(TicTacToe.getCPUs().contains(7))
				{
					winner = "CPU";
					isWinner =true;
				}
			}
			if(TicTacToe.getCPUs().contains(5))
			{
				if(TicTacToe.getCPUs().contains(9))
				{
					winner = "CPU";
					isWinner =true;
				}
			}
		}
		if(TicTacToe.getCPUs().contains(2))
		{
			if(TicTacToe.getCPUs().contains(5))
			{
				if(TicTacToe.getCPUs().contains(8))
				{
					winner = "CPU";
					isWinner =true;
				}
			}
		}
		if(TicTacToe.getCPUs().contains(3))
		{
			if(TicTacToe.getCPUs().contains(6))
			{
				if(TicTacToe.getCPUs().contains(9))
				{
					winner = "CPU";
					isWinner =true;
				}
			}
			if(TicTacToe.getCPUs().contains(5))
			{
				if(TicTacToe.getCPUs().contains(3))
				{
					winner = "CPU";
					isWinner =true;
				}
			}
		}
		
	if(TicTacToe.getCPUs().contains(4))
	{
		if(TicTacToe.getCPUs().contains(5))
		{
			if(TicTacToe.getCPUs().contains(6))
			{
				winner = "CPU";
				isWinner =true;
			}
		}
	}
	if(TicTacToe.getCPUs().contains(7))
	{
		if(TicTacToe.getCPUs().contains(8))
		{
			if(TicTacToe.getCPUs().contains(9))
			{
				winner = "CPU";
				isWinner =true;
			}
		}
	}
	}
	
	public static boolean getIsWinner()
	{
		return isWinner;
	}
	
	public static String getWinner()
	{
		return winner;
	}
	
	public static boolean checkLose()
	{
		boolean temp = false;
		for (int i = 0; i<PlayerLose.size();i++)
		{
			if(TicTacToe.getPlayers().equals(PlayerLose.get(i)))
			{
				if(TicTacToe.getCPUs().equals(CPULose.get(i)))
				{
					temp = true;
				}
			}
		}
		return temp;
	}
	
	public static void loss()
	{
		PlayerPositionsLose.addAll(TicTacToe.getPlayers());
		CPUPositionsLose.addAll(TicTacToe.getCPUs());
		PlayerLose.add(PlayerPositionsLose);
		CPULose.add(CPUPositionsLose);
		
	}
}
