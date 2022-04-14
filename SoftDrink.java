package javabootcamp.oop.vendingmachine;

/**
 * an abstract class that represents a soft cold drink
 * @author Rotem
 *
 */
public abstract class SoftDrink extends ColdDrink{
	
	protected boolean isSqueezed;

	/**
	 * construct a soft drink from given params
	 * @param price soft drink price
	 * @param volume soft drink volume
	 * @param temperature soft drink temperature
	 * @param mainIngredient soft drink main ingredient
	 * @param isSqueezed whether the soft drink is squeezed or not 
	 */
	public SoftDrink(int price, int volume, int temperature, String mainIngredient, boolean isSqueezed) {
		super(price, volume, temperature, mainIngredient);
		this.isSqueezed = isSqueezed;
	}
	
	/**
	 * returns a string that describes the soda drink
	 */
	public String toString()
	{
		String desc = super.toString();
		if (isSqueezed)
			desc += "Squeezed\n";
		else
			desc+= "Pasteurized\n";
		return desc;
	}


}
