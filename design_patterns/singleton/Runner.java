package javabootcamp.design_patterns.singleton;

public class Runner {

	public static void main(String[] args) {
		Player p1 = new Player("Rotem");
		Player p2 = new Player("Yaron");
		Player p3 = new Player("Matan");
		Game game = new Game(p1, p2, p3);
		game.play();

	}

}
