package javabootcamp.oop.vendingmachine;

/**
 * an abstract class that represents a cold drink
 * @author Rotem
 *
 */
public abstract class ColdDrink extends Drink {
	
	protected String mainIngredient;
	private static final int TEMPERATURE = 2;

	/**
	 * construct a cold drink from given parameters
	 * @param price the cold drink price
	 * @param volume the cold drink volume
	 * @param temperature the cold drink temperature
	 * @param mainIngredient the cold drink main ingredient
	 */
	public ColdDrink(int price, int volume, int temperature, String mainIngredient) {

		super(price, volume);
		setTemperature(temperature);
		setMainIngredient(mainIngredient);
	}
	
	/**
	 * returns a string that describes the cold drink
	 */
	public String toString()
	{
		String desc = super.toString();
		desc += "Main ingredient: "+mainIngredient+"\n";
		return desc;
	}

	/**
	 * set drink's main ingredient to the given ingredient
	 * @param mainIngredient the cold drink main ingredient 
	 */
	private void setMainIngredient(String mainIngredient) {
		this.mainIngredient = mainIngredient;
	}
	
	/**
	 * check if given temp is in range 2-5
	 * if so, set the temp to the given temp
	 * else, set it to 2 
	 * @param temperature the cold drink temperature
	 */
	private void setTemperature(int temperature)
	{
		if (temperature < 2 || temperature > 5)
			temperature = TEMPERATURE;
		this.temperature = temperature;
	}
	
	/**
	 * check if there is enough water in the vending machine
	 * if so, update the water container
	 * else, print a message and exit
	 * 
	 */
	public void produce()
	{
		if (volume > VendingMachine.waterQtt)
		{
			System.out.println("Not enough water!");
			return;
		}
		VendingMachine.waterQtt -= volume;
	}


}
