package javabootcamp.design_patterns.state;

public class State10 extends State{

	public State10(GumDispenser dispenser) {
		super(dispenser);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onInsert5() {
		this.dispenser.changeState(new State15(this.dispenser));
		System.out.println("Balance: 15");
		
	}

	@Override
	public void onInsert10() {
		this.dispenser.changeState(new State20(this.dispenser));
		System.out.println("Balance: 20");

		
	}

	@Override
	public void onCollectGum() {
		System.out.println("Not enough money to collect gum!");
		System.out.println("Balance: 10");

		
	}

}
