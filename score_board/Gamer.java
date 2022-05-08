package javabootcamp.collections.score_board;

public class Gamer implements Comparable<Gamer> {

	protected String name;
	protected String country;
	protected int score;
	protected int rank;
	
	

	public Gamer(String name, String country, int score, int rank) {
		this.name = name;
		this.country = country;
		this.score = score;
		this.rank = rank;
	}



	@Override
	public int compareTo(Gamer o) {
		return this.score - o.score;
	}



	@Override
	public String toString() {
		return "Gamer [name=" + name + ", country=" + country + ", score=" + score + ", rank=" + rank + "]";
	}

	
}
