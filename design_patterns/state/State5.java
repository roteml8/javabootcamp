package javabootcamp.design_patterns.state;

public class State5 extends State{

	public State5(GumDispenser dispenser) {
		super(dispenser);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onInsert5() {
		System.out.println("Balance: 10");
		this.dispenser.changeState(new State10(this.dispenser));
		
	}

	@Override
	public void onInsert10() {
		System.out.println("Balance: 15");
		this.dispenser.changeState(new State15(this.dispenser));
		
	}

	@Override
	public void onCollectGum() {
		System.out.println("Not enough money to collect gum!");
		System.out.println("Balance: 5");

	}
	
	
	

}
