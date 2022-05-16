package javabootcamp.design_patterns.state;

public class State15 extends State {

	public State15(GumDispenser dispenser) {
		super(dispenser);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onInsert5() {
		System.out.println("Balance: 20");
		this.dispenser.changeState(new State20(this.dispenser));

		
	}

	@Override
	public void onInsert10() {
		this.dispenser.changeState(new ReadyState(this.dispenser));
		System.out.println("Balance: 25");

		
	}

	@Override
	public void onCollectGum() {
		System.out.println("Not enough money to collect gum!");		
		System.out.println("Balance: 15");

	}

}
