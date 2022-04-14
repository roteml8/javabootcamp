package javabootcamp.oop.vendingmachine;

/**
 * an abstract class that represents a drink
 * @author Rotem
 *
 */
public abstract class Drink implements Producible {
	
	private final int VOLUME = 50; 
	protected int price;
	protected int volume;
	protected int temperature;
	
	/**
	 * construct a drink from given price and volume
	 * @param price the drink price
	 * @param volume the drink volume
	 */
	public Drink(int price, int volume)
	{
		setPrice(price);
		setVolume(volume);

	}
	
	/**
	 * returns a string that describes the drink
	 */
	public String toString()
	{
		return String.format("volume: %dcc , temperature: %d, price: %d\n", volume, temperature, price);
	}


	/**
	 * sets the drink's price to the given price
	 * @param the drink price
	 */
	private void setPrice(int price) {
		this.price = price;
	}


	/**
	 * checks if the given volume is between 50-200
	 * if so, sets the volume to the given volume
	 * if not, sets the volume to 50
	 * @param volume the drink volume
	 */
	private void setVolume(int volume) {
		if (volume < 50 || volume > 200)
			volume = VOLUME;
		this.volume = volume;
	}

}
