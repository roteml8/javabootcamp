package javabootcamp.design_patterns.decorator;

public class BasicDress implements Dress {
	
	protected String color;
	protected char size;
	
	
	public BasicDress(String color, char size) {
		this.color = color;
		this.size = size;
	}


	@Override
	public void create() {
		System.out.println("BasicDress features: Color= "+color+", Size="+size);
		
	}

}
