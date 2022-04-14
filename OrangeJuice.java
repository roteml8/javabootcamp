package javabootcamp.oop.vendingmachine;

/**
 * a class that represents an orange juice soft drink
 * @author Rotem
 *
 */
public class OrangeJuice extends SoftDrink {

	protected static final String INGREDIENT = "Oranges";
	private static final int PRICE = 12;
	private static final int VOLUME = 150;
	private static final int TEMPERATURE = 4;

	/**
	 * construct an orange juice from given params
	 * @param price orange juice price
	 * @param volume orange juice volume
	 * @param temperature orange juice temperature
	 * @param isSqueezed whether the orange juice is squeezed or not 
	 */
	public OrangeJuice(int price, int volume, int temperature, boolean isSqueezed) {
		super(price, volume, temperature, INGREDIENT, isSqueezed);
	}

	/**
	 * construct an orange juice from default params
	 */
	public OrangeJuice()
	{
		this(PRICE,VOLUME,TEMPERATURE,true);
	}
	/**
	 * produce an orange juice
	 */
	public void produce()
	{
		System.out.println("----------");
		System.out.println("Producing Orange Juice");
		System.out.println(this);
		super.produce();
	}
}
