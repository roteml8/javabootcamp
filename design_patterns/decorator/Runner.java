package javabootcamp.design_patterns.decorator;

public class Runner {

	public static void main(String[] args) {

		BasicDress basicDress = new BasicDress("Purple", 'S');
		basicDress.create();
		System.out.println("--------------------------------");
		
		FancyDressDecorator fancyDress = new FancyDressDecorator(basicDress);
		fancyDress.create();
		System.out.println("--------------------------------");

		CasualDressDecorator casualDress = new CasualDressDecorator(basicDress);
		casualDress.create();
		System.out.println("--------------------------------");

		SportyDressDecorator sportyAndFancy = new SportyDressDecorator(fancyDress);
		sportyAndFancy.create();
		System.out.println("--------------------------------");

		CasualDressDecorator fancyAndCasual = new CasualDressDecorator(fancyDress);
		fancyAndCasual.create();
		System.out.println("--------------------------------");

		FancyDressDecorator sportyCasualFancy = new FancyDressDecorator(new CasualDressDecorator(new SportyDressDecorator(basicDress)));
		sportyCasualFancy.create();
	}

}
