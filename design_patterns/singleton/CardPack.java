package javabootcamp.design_patterns.singleton;

import java.util.ArrayList;

public class CardPack {
	
	private static CardPack instance;
	protected final int MIN_CARD = 1;
	protected final int MAX_CARD = 54;
	protected final int NUM_CARDS = 60;
	protected ArrayList<Integer> cards;
 	
	private CardPack()
	{
		cards = new ArrayList<>();
		for (int i=0; i<NUM_CARDS; i++)
		{
			int card = (int) (Math.random() * (MAX_CARD+1) + MIN_CARD);
			cards.add(card);
		}
	}
	
	public static CardPack getInstance()
	{
		if (instance == null)
			instance = new CardPack();
		return instance;
	}
	
	public int getNextCard()
	{
		int current = cards.get(0);
		cards.remove(0);
		return current;
	}
	
	public int getRandomCard()
	{
		int random = (int) (Math.random() * (MAX_CARD+1) + MIN_CARD);
		return random;
	}
	
	public boolean hasNextCard()
	{
		return !cards.isEmpty();
	}
}
