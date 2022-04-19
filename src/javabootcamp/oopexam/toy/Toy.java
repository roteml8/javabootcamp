package javabootcamp.oopexam.toy;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import javabootcamp.oopexam.agegroup.AgeGroup;
import javabootcamp.oopexam.kid.Kid;

public abstract class Toy {
	
	private static long counter;
	
	protected long serialNum;
	protected String name;
	protected LocalDate purchaseDate;
	protected AgeGroup ageGroup;
	protected boolean isBroken;
	protected Kid kid;
	
	static {
		counter = 0;
	}

	public Toy(String name, LocalDate purchaseDate, AgeGroup ageGroup, Kid kid) {
		setName(name);
		setPurchaseDate(purchaseDate);
		setAgeGroup(ageGroup);
		setBroken();
		setSerialNum();
		setKid(kid);
	}

	


	public Toy(String name, LocalDate purchaseDate, Kid kid) {
		setName(name);
		setPurchaseDate(purchaseDate);
		setSerialNum();
		setKid(kid);
	}




	public Kid getKid() {
		return kid;
	}




	public void setKid(Kid kid) {
		this.kid = kid;
	}




	private void setSerialNum() {
		this.serialNum = counter++;
	}



	private void setName(String name) {
		this.name = name;
	}



	private void setPurchaseDate(LocalDate purchaseDate) {
		this.purchaseDate = purchaseDate;
	}



	private void setAgeGroup(AgeGroup ageGroup) {
		this.ageGroup = ageGroup;
	}



	private void setBroken() {
		LocalDate today = LocalDate.now();
		this.isBroken = false;
		if (ChronoUnit.YEARS.between(purchaseDate, today) >=1)
			isBroken = true;
	}
	
	
	public long getSerialNum() {
		return serialNum;
	}



	public String getName() {
		return name;
	}



	public LocalDate getPurchaseDate() {
		return purchaseDate;
	}



	public AgeGroup getAgeGroup() {
		return ageGroup;
	}



	public boolean isBroken() {
		return isBroken;
	}






	@Override
	public String toString() {
		return "Toy [serialNum=" + serialNum + ", name=" + name + ", purchaseDate=" + purchaseDate + ", ageGroup="
				+ ageGroup + ", isBroken=" + isBroken + ", kid=" + kid + "]";
	}




	public boolean play() // returns true if playing is successful
	{
		System.out.println("---------------");
		if (isBroken())
		{
			System.out.printf("Can't play with toy ID:%d because its broken.\n",serialNum);
			return false;
		}
		LocalDate today = LocalDate.now();
		int kidAgeInYears = (int) ChronoUnit.YEARS.between(kid.getBirthDate(), today);
		AgeGroup kidGroup;
		switch (kidAgeInYears)
		{
		case 0:
		case 1:
			kidGroup = AgeGroup.A;
			break;
		case 2:
		case 3:
		case 4:
			kidGroup = AgeGroup.B;
			break;
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
			kidGroup = AgeGroup.C;
			break;
		default:
			System.out.println("The kid is too old to play with the toy.");
			return false;
		}
		if (kidGroup != ageGroup)
		{
			System.out.println("Kid's age group does not fit the toy's age group - cant play!");
			return false;
		}
		return true;
	}
	


}
