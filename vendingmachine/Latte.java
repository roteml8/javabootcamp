package javabootcamp.oop.vendingmachine;

/**
 * a class that represents a latte drink
 * @author Rotem
 *
 */
public class Latte extends CoffeeDrink{
	
	protected final static int SHOTS = 1;
	private static final int PRICE = 12;
	private static final int VOLUME = 150;
	private static final int TEMPERATURE = 90;
	private static final int SUGAR_SPOONS = 4;

	/**
	 * construct a latte from given parameters
	 * @param price latte price
	 * @param volume latte volume
	 * @param temperature latte temperature
	 * @param sugarSpoons latte number of sugar spoons
	 */
	public Latte(int price, int volume, int temperature, int sugarSpoons) {
		super(price, volume, temperature, sugarSpoons, SHOTS);
	}
	
	/**
	 * construct a latte from default parameters
	 */
	public Latte()
	{
		this(PRICE,VOLUME,TEMPERATURE,SUGAR_SPOONS);
	}
	
	/**
	 * producing a latte
	 */
	public void produce()
	{
		System.out.println("----------");
		System.out.println("Producing Latte");
		System.out.println(this);
		super.produce();
	}

}
