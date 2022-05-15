package javabootcamp.design_patterns.decorator;

public class CasualDressDecorator extends DressDecorator {

	public CasualDressDecorator(Dress dress) {
		super(dress);
	}
	
	@Override
	public void create() {
		super.create();
		System.out.println("Casualty Added...");		
	}

}
