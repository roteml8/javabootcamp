package javabootcamp.oop.vendingmachine;

/**
 * an abstract class that represents a hot drink
 * @author Rotem
 *
 */
public abstract class HotDrink extends Drink {
	
	private final int SPOONS = 0;
	private final int TEMPERATURE = 60;
	protected int sugarSpoons;

	/**
	 * construct a hot drink from given parameters
	 * @param price hot drink price
	 * @param volume hot drink volume
	 * @param temperature hot drink temperature
	 * @param sugarSpoons hot drink number of sugar spoons
	 */
	public HotDrink(int price, int volume, int temperature,int sugarSpoons) {
		super(price,volume);
		setSugarSpoons(sugarSpoons);
		setTemperature(temperature);
	}
	
	/**
	 * returns a string that describes the hot drink
	 */
	public String toString()
	{
		String desc = super.toString();
		desc += "number of sugar spoons: "+sugarSpoons+"\n";
		return desc;
	}

	/**
	 * checks if the given number of sugar spoons is between 0-5
	 * if so, sets the number of sugar spoons to the given number
	 * if not, sets it to 0
	 * @param sugarSpoons the hot drink number of sugar spoons
	 */
	public void setSugarSpoons(int sugarSpoons) {
		if (sugarSpoons < 0 || sugarSpoons > 5)
			sugarSpoons = SPOONS;
		this.sugarSpoons = sugarSpoons;
	}
	

	/**
	 * checks if the given temperature is between 60-90
	 * if so, sets the temperature to the given number
	 * if not, sets it to 60
	 * @param temperautre the hot drink temperature
	 */
	private void setTemperature(int temperature)
	{
		if (temperature < 60 || temperature > 90)
			temperature = TEMPERATURE;
		this.temperature = temperature;
	}


}
