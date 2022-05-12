package javabootcamp.design_patterns.builder;

public class PastryBuilder implements Builder {
	
	private int mozzarella;
	private int feta;
	private int mushrooms;
	private int pineapple;
	
	
	@Override
	public void setMozzarella(int mozzarella) {
		this.mozzarella = mozzarella;
		
	}
	@Override
	public void setFeta(int feta) {
		this.feta = feta;
		
	}
	@Override
	public void setMushrooms(int mushrooms) {
		this.mushrooms = mushrooms;
		
	}
	@Override
	public void setPineapple(int pineapple) {
		this.pineapple = pineapple;
		
	}
	
	public Pastry getResult()
	{
		return new Pastry(mozzarella, feta, mushrooms, pineapple);
	}
	
	

}
