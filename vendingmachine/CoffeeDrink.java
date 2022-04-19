package javabootcamp.oop.vendingmachine;

/**
 * an abstract class that represents a coffee drink
 * @author Rotem
 *
 */
public abstract class CoffeeDrink extends HotDrink {
	
	private final int SHOTS = 1;
	protected int numShots;
	
	/**
	 * construct a coffee drink from given params
	 * @param price coffee drink price
	 * @param volume coffee drink volume
	 * @param temperature coffee drink temperature
	 * @param sugarSpoons coffee drink number of sugar spoons
	 * @param numShots coffee drink number of espresso shots
	 */
	public CoffeeDrink(int price, int volume, int temperature, int sugarSpoons, int numShots) {
		super(price, volume, temperature, sugarSpoons);
		setNumShots(numShots);
	}

	/**
	 * returns a string that describes the coffee drink
	 */
	public String toString()
	{
		String desc = super.toString();
		desc += "Number of espresso shots: "+numShots+"\n";
		return desc;
	}


	/**
	 * check if there is enough water/milk in the vending machine
	 * if so, update the milk/water containers
	 * else, print a message and exit
	 * 
	 */
	public void produce()
	{
		int waterQtt = 50*numShots;
		int milkQtt = volume - waterQtt;
		if (waterQtt > VendingMachine.waterQtt || milkQtt > VendingMachine.milkQtt)
		{
			System.out.println("Not enough milk or water!");
			return;
		}
			
		VendingMachine.waterQtt -= waterQtt;
		VendingMachine.milkQtt -= milkQtt;
	}

	/**
	 * check if given number of shots is in range 1-3
	 * if so, sets the number of shots to given number
	 * else, sets it to 1
	 * @param numShots number of espresso shots
	 */
	private void setNumShots(int numShots) {
		if (numShots < 1 || numShots > 3)
			numShots = SHOTS;
		this.numShots = numShots;
	}
	
	

}
