package javabootcamp.collections.score_board;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ScoreTable {
	
	private final int NUM_TOP = 3;
	protected ArrayList<Gamer> allGamers;
	protected Gamer[] top;
	
	public ScoreTable()
	{
		this.allGamers = new ArrayList<>();
		this.top = new Gamer[NUM_TOP];
	}
	
	public void addGamer(Gamer gamer)
	{
		allGamers.add(gamer);
	}
	
	public void addGamers(Gamer[] gamers)
	{
		for (int i=0; i<gamers.length; i++)
			allGamers.add(gamers[i]);
	}
	
	public void updateTop()
	{
		Collections.sort(allGamers, Collections.reverseOrder());
//		for (int i=0; i<top3.size(); i++)
//			top3.remove(i);
		for (int i=0; i<NUM_TOP && i<allGamers.size(); i++)
		{
			top[i] = allGamers.get(i);
		}
			
	}
	
	public void printTop()
	{
		for (int i=0; i<NUM_TOP; i++)
		{
			System.out.println(top[i]);
		}
	}
	
	public ArrayList<Gamer> getSortedByName()
	{
		Comparator<Gamer> GamerNameComparator = new Comparator<Gamer> () {
			
			@Override
			public int compare(Gamer g1, Gamer g2)
			{
				return g1.name.compareTo(g2.name);
			}
			
		};
		ArrayList<Gamer> sorted = new ArrayList<>(allGamers);
		Collections.sort(sorted, GamerNameComparator);
		return sorted;
	}
	
	public ArrayList<Gamer> getSortedByCountry()
	{
		Comparator<Gamer> GamerCountryComparator = new Comparator<Gamer> () {
			
			@Override
			public int compare(Gamer g1, Gamer g2)
			{
				return g1.country.compareTo(g2.country);
			}
			
		};
		ArrayList<Gamer> sorted = new ArrayList<>(allGamers);
		Collections.sort(sorted, GamerCountryComparator);
		return sorted;
	}
	
	public ArrayList<Gamer> getSortedByRank()
	{
		Comparator<Gamer> GamerRankComparator = new Comparator<Gamer> () {
			
			@Override
			public int compare(Gamer g1, Gamer g2)
			{
				return g1.rank-g2.rank;
			}
			
		};
		ArrayList<Gamer> sorted = new ArrayList<>(allGamers);
		Collections.sort(sorted, GamerRankComparator);
		return sorted;
	}

}
