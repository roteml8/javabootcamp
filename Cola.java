package javabootcamp.oop.vendingmachine;

/**
 * a class that represents a cola drink
 * @author Rotem
 *
 */
public class Cola extends SodaDrink {
	
	protected final static String INGREDIENT = "Cola";
	private static final int PRICE = 12;
	private static final int VOLUME = 150;
	private static final int TEMPERATURE = 4;

	/**
	 * construct a cola from given parameters
	 * @param price cola price
	 * @param volume cola volume
	 * @param temperature cola temperature
	 * @param isInBottle whether the cola is in a bottle or not 
	 */
	public Cola(int price, int volume, int temperature, boolean isInBottle) {
		super(price, volume, temperature, INGREDIENT, isInBottle);
	}

	/**
	 * construct a cola from default parameters
	 */
	public Cola()
	{
		this(PRICE,VOLUME,TEMPERATURE,true);
	}
	/**
	 * produce a cola drink
	 */
	public void produce()
	{
		System.out.println("----------");
		System.out.println("Producing Cola");
		System.out.println(this);
		super.produce();
	}
}
