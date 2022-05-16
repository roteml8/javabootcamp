package javabootcamp.design_patterns.state;

public class InitialState extends State{

	public InitialState(GumDispenser dispenser) {
		super(dispenser);
	}

	@Override
	public void onInsert5() {
		System.out.println("Balance: 5");
		this.dispenser.changeState(new State5(this.dispenser));
		
	}

	@Override
	public void onInsert10() {
		System.out.println("Balance: 10");
		this.dispenser.changeState(new State10(this.dispenser));
		
	}

	@Override
	public void onCollectGum() {
		System.out.println("Not enough money to collect gum!");
		System.out.println("Balance: 0");
		
	}
	
	

}
