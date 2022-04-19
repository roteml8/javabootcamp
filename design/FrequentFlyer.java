package javabootcamp.oop.design;

public class FrequentFlyer {
	
	private static long counter;
	
	protected final long ID;
	protected String firstName;
	protected String lastName;
	protected MileageCredit credit;

	
	static {
		counter = 0;
	}
	
	public FrequentFlyer(String firstName, String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.ID = counter++;
		this.credit = new MileageCredit(this);
		
	}
	
	public void addFlight(Flight flight)
	{
		credit.addCreditToFlyer(flight);
	}
	
	
}
