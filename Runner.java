package javabootcamp.collections.score_board;

import java.util.ArrayList;

public class Runner {

	public static void main(String[] args) {
		
		Gamer[] gamers = new Gamer[4];
 		gamers[0] = new Gamer("Rotem","Israel",1000,100);
		gamers[1] = new Gamer("Ohad","Brzail",1500,50);
		gamers[2] = new Gamer("Matan","Italy",2800,120);
		gamers[3] = new Gamer("Yaron", "Mexico",1700,90);
		ScoreTable scoreTable = new ScoreTable();
		scoreTable.addGamers(gamers);
		scoreTable.updateTop();
		System.out.println("Top 3 gamers:");
		scoreTable.printTop();
		ArrayList<Gamer> byName = scoreTable.getSortedByName();
		ArrayList<Gamer> byCountry = scoreTable.getSortedByCountry();
		ArrayList<Gamer> byRank = scoreTable.getSortedByRank();
		System.out.println("Sorted by name:");
		System.out.println(byName);
		System.out.println("Sorted by country:");
		System.out.println(byCountry);
		System.out.println("Sorted by rank:");
		System.out.println(byRank);


	}

}
