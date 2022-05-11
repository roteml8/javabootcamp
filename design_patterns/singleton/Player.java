package javabootcamp.design_patterns.singleton;

public class Player {

	protected String name;
	protected int points;
	protected CardPack cards;
	protected int currentCard;
	
	public Player(String name)
	{
		this.name = name;
		this.points = 0;
		this.cards = CardPack.getInstance();
	}
	
	public int drawCard()
	{
		int card = cards.getNextCard();
		setCurrentCard(card);
		return card;
		
	}
	
	public int drawRandomCard()
	{
		int card = cards.getRandomCard();
		setCurrentCard(card);
		return card;
	}
	
	public void setCurrentCard(int card)
	{
		this.currentCard = card;
	}
	
	public void addPoint()
	{
		points += 1;
	}
}
