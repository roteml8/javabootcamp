package javabootcamp.design_patterns.state;

public class Runner {

	public static void main(String[] args) {
		GumDispenser gumDispenser = new GumDispenser();
		GumDispenserManager manager = new GumDispenserManager(gumDispenser);
		manager.simulate();

	}

}
