package javabootcamp.oop.vendingmachine;

/**
 * a class that represents a sprite drink
 * @author Rotem
 *
 */
public class Sprite extends SodaDrink {

	protected static final String INGREDIENT = "Lime";
	private static final int PRICE = 12;
	private static final int VOLUME = 150;
	private static final int TEMPERATURE = 4;
	
	/**
	 * construct a sprite from given params
	 * @param price sprite price
	 * @param volume sprite volume
	 * @param temperature sprite temperature 
	 * @param isInBottle whether the sprite is in a bottle or not
	 */
	public Sprite(int price, int volume, int temperature,boolean isInBottle) {
		super(price, volume, temperature, INGREDIENT, isInBottle);
	}
	
	/**
	 * construct a sprite from default params
	 */
	public Sprite()
	{
		this(PRICE,VOLUME,TEMPERATURE,true);
	}
	
	/**
	 * produce a sprite
	 */
	public void produce()
	{
		System.out.println("----------");
		System.out.println("Producing Sprite");
		System.out.println(this);
		super.produce();
	}

}
