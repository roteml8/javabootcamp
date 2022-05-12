package javabootcamp.design_patterns.builder;

public class Director {

	private final int HP_MOZZARELLA = 100;
	private final int HP_FETA = 40;
	private final int HP_MUSHROOMS = 20;
	private final int HP_PINEAPPLE = 25;
	
	private final int DPP_MOZZARELLA = 10;
	private final int DPP_FETA = 100;
	private final int DPP_MUSHROOMS = 20;
	private final int DPP_PINEAPPLE = 15;
	
	
	public void constructHawaiianPizza(Builder builder)
	{
		builder.setMozzarella(HP_MOZZARELLA);
		builder.setFeta(HP_FETA);
		builder.setMushrooms(HP_MUSHROOMS);
		builder.setPineapple(HP_PINEAPPLE);
	}
	
	public void constructDominicanPuffPastry(Builder builder)
	{
		builder.setMozzarella(DPP_MOZZARELLA);
		builder.setFeta(DPP_FETA);
		builder.setMushrooms(DPP_MUSHROOMS);
		builder.setPineapple(DPP_PINEAPPLE);
	}
	
	public void constructHawaiinPizzaRecipe(Builder builder)
	{
		builder.setMozzarella(HP_MOZZARELLA);
		builder.setFeta(HP_FETA);
		builder.setMushrooms(HP_MUSHROOMS);
		builder.setPineapple(HP_PINEAPPLE);
	}
	
	public void constructDominicanPuffPastryRecipe(Builder builder)
	{
		builder.setMozzarella(HP_MOZZARELLA);
		builder.setFeta(HP_FETA);
		builder.setMushrooms(HP_MUSHROOMS);
		builder.setPineapple(HP_PINEAPPLE);
	}
}
