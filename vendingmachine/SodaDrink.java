package javabootcamp.oop.vendingmachine;

/**
 * an abstract class that represents a soda cold drink
 * @author Rotem
 *
 */
public abstract class SodaDrink extends ColdDrink {
	
	protected boolean isInBottle;

	/**
	 * construct a soda drink from given params
	 * @param price soda drink price
	 * @param volume soda drink volume
	 * @param temperature soda drink temperature
	 * @param mainIngredient soda drink main ingredient
	 * @param isInBottle whehter the soda drink is in bottle or not 
	 */
	public SodaDrink(int price, int volume, int temperature, String mainIngredient, boolean isInBottle) {
		super(price, volume, temperature, mainIngredient);
		this.isInBottle = isInBottle;
	}
	
	/**
	 * retruns a string that describes the soda drink
	 */
	public String toString()
	{
		String desc = super.toString();
		if (isInBottle)
			desc += "In bottle\n";
		else
			desc+= "In can\n";
		return desc;
	}
	
	

}
