package javabootcamp.design_patterns.singleton;

import java.util.ArrayList;
import java.util.Collections;

public class Game {
	
	protected CardPack cards;
	protected ArrayList<Player> players;
	
	public Game(Player...players)
	{
		this.players = new ArrayList<>();
		for (var p : players)
			this.players.add(p);
		cards = CardPack.getInstance();
	}
	
	public void play()
	{
		while (cards.hasNextCard())
		{
			System.out.println();
			ArrayList<Integer> currentCards = new ArrayList<>();
			for (Player player: players)
			{
				player.drawCard();
				currentCards.add(player.currentCard);
				System.out.println(player.name+" has: "+player.currentCard);
			}
			int maxCard = Collections.max(currentCards);
			for (Player player: players) {
				if (player.currentCard == maxCard)
				{
					System.out.println("Current winner is: "+player.name);
					player.addPoint();
				}
			}
		}
		System.out.println();
		printWinner();
	}
	
	public void printWinner()
	{
		ArrayList<Player> winners = new ArrayList<>();
		ArrayList<Integer> finalPoints = new ArrayList<>();
	 	for (Player player: players)
		{
	 		finalPoints.add(player.points);
	 		System.out.println(player.name+" has total of "+player.points+" points");
		}
	 	int maxTotal = Collections.max(finalPoints);
	 	for (Player player: players)
		{
	 		if (player.points == maxTotal)
	 			winners.add(player);
		}
	 	if (winners.size() == 1)
	 		System.out.println("\nThe winner is: "+winners.get(0).name);
	 	else
	 		tieBreaker(winners);
	}		
	

	public void tieBreaker(ArrayList<Player> players)
	{
		boolean hasWinner = false;
		int countMax = 0;
		Player winner = null;
		System.out.println("\nTie breaker battle:");
		while (!hasWinner)
		{
			ArrayList<Integer> currentCards = new ArrayList<>();
			for (Player p: players)
			{
				p.drawRandomCard();
				currentCards.add(p.currentCard);
				System.out.println(p.name+" has: "+p.currentCard);
			}
			int maxCard = Collections.max(currentCards);		
			for (Player player: players) {
				if (player.currentCard == maxCard)
				{
					winner = player;
					countMax++;
				}
			}
			if (countMax == 1)
				hasWinner = true;
		}
		System.out.println("\nThe winner is: "+winner.name);
	  }

	}
