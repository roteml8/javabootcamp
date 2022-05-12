package javabootcamp.design_patterns.builder;

public class Pastry {
	
	protected int mozarellaCheeseAmount;
	protected int fetaCheeseAmount;
	protected int mushroomsAmount;
	protected int pineappleAmount;
	
	public Pastry(int mozarellaCheeseAmount, int fetaCheeseAmount, int mushroomsAmount, int pineappleAmount) {
		this.mozarellaCheeseAmount = mozarellaCheeseAmount;
		this.fetaCheeseAmount = fetaCheeseAmount;
		this.mushroomsAmount = mushroomsAmount;
		this.pineappleAmount = pineappleAmount;
	}

	@Override
	public String toString() {
		return "Pastry [mozarellaCheeseAmount=" + mozarellaCheeseAmount + ", fetaCheeseAmount=" + fetaCheeseAmount
				+ ", mushroomsAmount=" + mushroomsAmount + ", pineappleAmount=" + pineappleAmount + "]";
	}
	
	

}
