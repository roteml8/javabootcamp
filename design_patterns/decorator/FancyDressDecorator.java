package javabootcamp.design_patterns.decorator;

public class FancyDressDecorator extends DressDecorator {
		
	public FancyDressDecorator(Dress dress) {
		super(dress);
	}

	@Override
	public void create() {
		super.create();
		System.out.println("Fanciness Added...");		
	}
	
	

}
