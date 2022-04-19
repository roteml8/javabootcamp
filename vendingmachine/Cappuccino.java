package javabootcamp.oop.vendingmachine;

/**
 * a class that represents a cappuccino drink
 * @author Rotem
 *
 */
public class Cappuccino extends CoffeeDrink {
	
	protected static int SHOTS = 2;
	private static final int PRICE = 12;
	private static final int VOLUME = 150;
	private static final int TEMPERATURE = 80;
	private static final int SUGAR_SPOONS = 1;

	/**
	 * construct a cappuccino from given parameters
	 * @param price the cappuccino price
	 * @param volume the cappuccino volume
	 * @param temperature the cappuccino temperature
	 * @param sugarSpoons number of sugar spoons in the cappuccino
	 */
	public Cappuccino(int price, int volume, int temperature, int sugarSpoons) {
		super(price, volume, temperature, sugarSpoons, SHOTS);
	}
	
	/**
	 * construct a cappuccino from default parameters
	 */
	public Cappuccino()
	{
		this(PRICE,VOLUME,TEMPERATURE,SUGAR_SPOONS);
	}

	/**
	 * produce a cappuccino
	 */
	public void produce()
	{
		System.out.println("----------");
		System.out.println("Producing Cappuccino");
		System.out.println(this);
		super.produce();
	}
}
