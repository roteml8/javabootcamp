package javabootcamp.oop.vendingmachine;

/**
 * a class that represents a hot chocolate drink
 * @author Rotem
 *
 */
public class HotChocolate extends HotDrink {
	
	protected boolean isMilkBased;
	
	private static final int PRICE = 10;
	private static final int VOLUME = 100;
	private static final int TEMPERATURE = 60;
	private static final int SUGAR_SPOONS = 3;
	
	/**
	 * construct a hot chocolate from given parameters
	 * @param price hot chocolate price
	 * @param volume hot chocolate volume
	 * @param temperature hot chocolate temperature
	 * @param sugarSpoons hot chocolate number of sugar spoons
	 * @param isMilkBased whether the hot chocolate is milk based or not 
	 */
	public HotChocolate(int price, int volume, int temperature, int sugarSpoons, boolean isMilkBased) {
		super(price, volume, temperature, sugarSpoons);
		this.isMilkBased = isMilkBased;
	}
	
	/**
	 * construct a hot chocolate from default parameters
	 */
	public HotChocolate()
	{
		this(PRICE,VOLUME,TEMPERATURE,SUGAR_SPOONS, true);
	}

	/**
	 * returns a string that describes the hot chocolate
	 */
	public String toString()
	{
		String desc = super.toString();
		if (isMilkBased)
			desc+="Milk based\n";
		else
			desc+="Water based\n";
		return desc;
	}
	
	@Override
	/**
	 * check if there is enough water/milk in the vending machine
	 * if so, update the milk/water containers
	 * else, print a message and exit
	 * 
	 */
	public void produce() {
		System.out.println("----------");
		System.out.println("Producing Hot Chocolate");
		System.out.println(this);
		if (isMilkBased)
		{
			if (volume > VendingMachine.milkQtt)
			{
				System.out.println("Not enough milk!");
				return;
			}
			VendingMachine.milkQtt -= volume;
		}
			
		else
		{
			if (volume > VendingMachine.waterQtt)
			{
				System.out.println("Not enough water!");
				return;
			}
			VendingMachine.waterQtt -= volume;
		}
			
	}

	/**
	 * set if the hot chocolate is milk based or not 
	 * according to the given boolean
	 * @param isMilkBased boolean representing if the hot chocolate is milk based or not
	 */
	public void setMilkBased(boolean isMilkBased) {
		this.isMilkBased = isMilkBased;
	}

	
	
}
