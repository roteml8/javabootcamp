package javabootcamp.oop.vendingmachine;

/**
 * a class that represents an espresso drink
 * @author Rotem
 *
 */
public class Espresso extends CoffeeDrink{
	
	private static final int SHOTS = 1;
	private static final int PRICE = 12;
	private static final int VOLUME = 150;
	private static final int TEMPERATURE = 90;
	private static final int SUGAR_SPOONS = 4;

	/**
	 * construct an espresso from given parameters
	 * @param price the espresso price
	 * @param volume the espresso volume
	 * @param temperature the espresso temperature
	 * @param sugarSpoons the espresso number of sugar spoons
	 * @param numShots the espresso number of espresso shots
	 */
	public Espresso(int price, int volume, int temperature, int sugarSpoons, int numShots) {
		super(price, volume, temperature, sugarSpoons, numShots);
		
	}
	
	/**
	 * construct an espresso from default parameters
	 */
	public Espresso()
	{
		this(PRICE,VOLUME,TEMPERATURE,SUGAR_SPOONS, SHOTS);	
		}
	
	/**
	 * produce an espresso
	 */
	public void produce()
	{
		System.out.println("----------");
		System.out.println("Producing Espresso");
		System.out.println(this);
		super.produce();
	}
	

}
