package javabootcamp.design_patterns.adapter;

public class BirdToToyDuckAdapter extends PlasticToyDuck {
	
	private Bird bird;

	public BirdToToyDuckAdapter(Bird bird) {
		this.bird = bird;
	}
	
	public void squeak()
	{
		bird.makeSound();
	}
	

}
