package javabootcamp.oop.design;

import java.time.LocalDateTime;

public class Flight {
	
	protected static final int MAX_FREQ_FLYERS = 200;
	
	protected final long flightNumber;
	protected LocalDateTime departureTime;
	protected float duration; // in hours
	protected int delay; //in minutes
	protected FrequentFlyer[] freqFlyers;
	protected int freqFlyersRegistered;
	protected int baseMiles;
	protected int bonusMiles;
	
	public Flight(long flightNumber, LocalDateTime departureTime, float duration,int baseMiles,int bonusMiles)
	{
		this.flightNumber = flightNumber;
		this.departureTime = departureTime;
		this.duration = duration;
		this.delay = 0;
		this.freqFlyers = new FrequentFlyer[MAX_FREQ_FLYERS];
		this.freqFlyersRegistered = 0;
		this.baseMiles = baseMiles;
		this.bonusMiles = bonusMiles;
	}
	
	public void setDelay(int minutes)
	{
		this.delay = minutes;
	}
	
	public LocalDateTime getArrivalTime()
	{
		return departureTime.plusHours((long)duration).plusMinutes(delay);
	}
	
	public void addFrequentFlyer(FrequentFlyer flyer)
	{
		if (freqFlyersRegistered < MAX_FREQ_FLYERS)
		{
			freqFlyers[freqFlyersRegistered++] = flyer;
		}
	}
	
	

}
