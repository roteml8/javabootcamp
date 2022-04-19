package javabootcamp.oopexam.doll;

import java.time.LocalDate;

import javabootcamp.oopexam.agegroup.AgeGroup;
import javabootcamp.oopexam.kid.Kid;
import javabootcamp.oopexam.toy.Toy;

public class Doll extends Toy {
	
	private static final int DEFAULT_DIRTINESS = 1;
	protected boolean isSoft;
	protected int dirtiness;
	
	public Doll(String name, LocalDate purchaseDate, AgeGroup ageGroup, boolean isSoft, int dirtiness, Kid kid) {
		super(name, purchaseDate, kid);
		setAgeGroup(ageGroup);
		setSoft(isSoft);
		setDirtiness(dirtiness);
	}
	
	public boolean isSoft() {
		return isSoft;
	}
	private void setSoft(boolean isSoft) {
		this.isSoft = isSoft;
	}
	public int getDirtiness() {
		return dirtiness;
	}
	private void setDirtiness(int dirtiness) {
		if (dirtiness < 1 || dirtiness > 10)
			dirtiness = DEFAULT_DIRTINESS;
		this.dirtiness = dirtiness;
	}

	@Override
	public boolean play() {
		if (super.play())
		{
			System.out.println("Playing with Doll: "+this);
			if (dirtiness < 10)
				dirtiness++;
			System.out.println("Doll dirtiness level is: "+dirtiness);
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Doll [isSoft=" + isSoft + ", dirtiness=" + dirtiness + ", toString()=" + super.toString() + "]";
	}
	
	
	public void setAgeGroup(AgeGroup ageGroup) // dolls are for groups A & B only
	{
		if (ageGroup == AgeGroup.C)
			ageGroup = AgeGroup.A;
		super.ageGroup = ageGroup;
	}
	

}
