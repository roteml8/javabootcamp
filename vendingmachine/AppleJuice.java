package javabootcamp.oop.vendingmachine;

/**
 * a class that represents apple juice drink
 * @author Rotem
 *
 */
public class AppleJuice extends SoftDrink {

	protected static final String INGREDIENT = "Apples";
	private static final int PRICE = 12;
	private static final int VOLUME = 150;
	private static final int TEMPERATURE = 4;
	
	/**
	 * construct apple juice from given parameters
	 * @param price the apple juice price
	 * @param volume the apple juice volume
	 * @param temperature the apple juice temperature
	 * @param isSqueezed whether the apple juice is squeezed or not
	 */
	public AppleJuice(int price, int volume, int temperature,boolean isSqueezed) {
		super(price, volume, temperature, INGREDIENT, isSqueezed);
		
	}
	
	/**
	 * construct apple juice from default parameters
	 */
	public AppleJuice()
	{
		this(PRICE,VOLUME,TEMPERATURE,true);
	}
	
	/**
	 * produce an apple juice
	 */
	public void produce()
	{
		System.out.println("----------");
		System.out.println("Producing Apple Juice");
		System.out.println(this);
		super.produce();
	}
	

}
