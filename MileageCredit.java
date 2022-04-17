package bootcamp.oop.design;

public class MileageCredit {
	
	private static long counter = 0;
	private static final int MAX_FLIGHTS = 100;
	
	protected final long ID;
	protected Flight[] flights;
	protected int numOfFlights;
	protected FrequentFlyer freqFlyer;
	protected int miles;
	
	public MileageCredit(FrequentFlyer freqFlyer)
	{
		this.ID = counter++;
		this.miles = 0;
		this.freqFlyer = freqFlyer;
		this.flights = new Flight[MAX_FLIGHTS];
		this.numOfFlights = 0;
		
	}
	
	public void addCreditToFlyer(Flight flight)
	{
		this.miles += flight.baseMiles + flight.bonusMiles;
		if (numOfFlights < MAX_FLIGHTS)
		{
			flights[numOfFlights++] = flight;
		}
	}

}
