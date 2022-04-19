package javabootcamp.oopexam.electrictoy;

import java.time.LocalDate;

import javabootcamp.oopexam.agegroup.AgeGroup;
import javabootcamp.oopexam.kid.Kid;
import javabootcamp.oopexam.toy.Toy;

public class ElectricToy extends Toy {
	
	private static final int DEFAULT_BATTERIES = 1;
	private static final int DEFAULT_SOUND = 0;

	protected int numOfBatteries;
	protected int soundLevel;
	
	
	public ElectricToy(String name, LocalDate purchaseDate, AgeGroup ageGroup, int numOfBatteries, int soundLevel, Kid kid) {
		super(name, purchaseDate, ageGroup, kid);
		setNumOfBatteries(numOfBatteries);
		setSoundLevel(soundLevel);
	}
	
	public int getNumOfBatteries() {
		return numOfBatteries;
	}
	private void setNumOfBatteries(int numOfBatteries) {
		if (numOfBatteries < 0)
			numOfBatteries = DEFAULT_BATTERIES;
		this.numOfBatteries = numOfBatteries;
	}
	public int getSoundLevel() {
		return soundLevel;
	}
	private void setSoundLevel(int soundLevel) {
		if (soundLevel < 0 || soundLevel > 3)
			soundLevel = DEFAULT_SOUND;
		this.soundLevel = soundLevel;
	}

	


	@Override
	public String toString() {
		return "ElectricToy [numOfBatteries=" + numOfBatteries + ", soundLevel=" + soundLevel + ", toString()="
				+ super.toString() + "]";
	}

	@Override
	public boolean play() {
		if (super.play())
		{
			System.out.println("Playing with Electric Toy: "+this);
			if (soundLevel > 0)
				soundLevel --;
			System.out.println("Electric toy sound level is: "+soundLevel);
			return true;
		}
		return false;
		
	}
	
	
}
