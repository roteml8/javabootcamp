package javabootcamp.design_patterns.decorator;

public class SportyDressDecorator extends DressDecorator {

	public SportyDressDecorator(Dress dress) {
		super(dress);
	}
	
	@Override
	public void create() {
		super.create();
		System.out.println("Sportiness Added...");		
	}

}
