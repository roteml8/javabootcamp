package javabootcamp.design_patterns.adapter;

public class Runner {

	public static void main(String[] args) {
		
		Sparrow sparrow = new Sparrow();
		sparrow.fly();
		sparrow.makeSound();
		PlasticToyDuck ptd = new PlasticToyDuck();
		ptd.squeak();
		
		BirdToToyDuckAdapter adapter = new BirdToToyDuckAdapter(sparrow);
		adapter.squeak();
		

	}

}
