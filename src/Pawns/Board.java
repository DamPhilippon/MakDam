package Pawns;

import java.util.ArrayList;

import Resources.IString;

public class Board {
	
	Player whitePlayer;
	Player blackPlayer;
	ArrayList<Pawn> whitePawns;
	ArrayList<Pawn> blackPawns;
	
	Case myCases[][];
	
	boolean vsIA = true;
	String levelIA = null;
	
	public Board(Player one, Player two, String level)
	{
		whitePlayer = one;
		blackPlayer = two;
		if(level.equals(IString.level_vs))
		{
			vsIA = false;
		}
		else
		{
			levelIA = level;
		}
	}
	
	public Player getWhitePlayer()
	{
		return whitePlayer;
	}
	public Player getBlackPlayer()
	{
		return blackPlayer;
	}
	public void setWhitePlayer()
	{
		
	}
	
}
