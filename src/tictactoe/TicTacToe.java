package tictactoe;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random; 

public class TicTacToe
{
	private static String player = "O";
	private static String CPU = "X";
	
	boolean win = false;
	boolean samePlace = false;
	
	Scanner scan = new Scanner(System.in);
	Random rand = new Random();
	
	Board playArea = new Board();
	String[][] board = playArea.getBoard();
	
	static ArrayList<Integer> playerPosition = new ArrayList<Integer>();
	static ArrayList<Integer> CPUPosition = new ArrayList<Integer>();
	
	public void play()
	{
		while(win == false)
		{
			for(int i =0; i<5; i++)
			{
				for(int j = 0; j<5; j++)
				{
					System.out.print(board[i][j]);
				}
				System.out.println();
			}
		
			//player's turn
			System.out.println("Player Turn");
			int number = scan.nextInt();
			do
			{
				samePlace = false;
				for(int i=0; i<playerPosition.size();i++)
				{
					for( int j = 0; j<CPUPosition.size();j++)
					{
						if(number == playerPosition.get(i) || number == CPUPosition.get(j))
						{
							System.out.println("space is taken");
							samePlace = true;
						}
					}
				}
			}while(samePlace==true);
			switch(number)
			{
			case 1:
				board[0][0] = player;
				break;
			case 2:
				board[0][2] = player;
				break;
			case 3:
				board[0][4] = player;
				break;
			case 4:
				board[2][0] = player;
				break;
			case 5:
				board[2][2] = player;
				break;
			case 6:
				board[2][4] = player;
				break;
			case 7:
				board[4][0] = player;
				break;
			case 8:
				board[4][2] = player;
				break;
			case 9:
				board[4][4] = player;
				break;
			default:
				System.out.println("invalid move. skipping turn.");
				break;
			}
			playerPosition.add(number);
			Conditions.checkWin();
			if(Conditions.getIsWinner())
			{
				System.out.println(Conditions.getWinner() + " Wins");
				for(int i =0; i<5; i++)
				{
					for(int j = 0; j<5; j++)
					{
						System.out.print(board[i][j]);
					}
					System.out.println();
				}
				playerPosition.clear();
				CPUPosition.clear();
				win = true;
			}
			else
			{
			//CPU turn
			System.out.println("Computer Turn");
			int q =0;
			do
				{
				samePlace = false;
				number = rand.nextInt(9) + 1;
				System.out.println(number);
				for(int i=0; i<playerPosition.size();i++)
				{
					for( int j = 0; j<CPUPosition.size();j++)
					{
						if(number == playerPosition.get(i) || number == CPUPosition.get(j))
						{
							System.out.println("space is taken");
							samePlace = true;
							q++;
						}
					}
				}
				if(Conditions.checkLose())
				{
					samePlace = false;
					q++;
				}
				if(q >= 50)
				{
					System.out.println("computer surrenders");
					number =0;
					samePlace = false;
					board = playArea.getBoard();
				}
				}while(samePlace==true);
			switch(number)
			{
			case 1:
				board[0][0] = CPU;
				break;
			case 2:
				board[0][2] = CPU;
				break;
			case 3:
				board[0][4] = CPU;
				break;
			case 4:
				board[2][0] = CPU;
				break;
			case 5:
				board[2][2] = CPU;
				break;
			case 6:
				board[2][4] = CPU;
				break;
			case 7:
				board[4][0] = CPU;
				break;
			case 8:
				board[4][2] = CPU;
				break;
			case 9:
				board[4][4] = CPU;
				break;
			}
			CPUPosition.add(number);
			Conditions.checkWin();
			if(Conditions.getIsWinner())
			{
				System.out.println(Conditions.getWinner() + " Wins");
				for(int i =0; i<5; i++)
				{
					for(int j = 0; j<5; j++)
					{
						System.out.print(board[i][j]);
					}
					System.out.println();
				}
				playerPosition.clear();
				CPUPosition.clear();
				win = true;
			}
			}
		}
	}
	
	public static ArrayList<Integer> getPlayers()
	{
		return playerPosition;
	}
	
	public static ArrayList<Integer> getCPUs()
	{
		return CPUPosition;
	}
}