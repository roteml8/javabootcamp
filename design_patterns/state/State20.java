package javabootcamp.design_patterns.state;

public class State20 extends State {

	public State20(GumDispenser dispenser) {
		super(dispenser);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onInsert5() {
		System.out.println("Balance: 25");
		this.dispenser.changeState(new ReadyState(this.dispenser));

		
	}

	@Override
	public void onInsert10() {
		System.out.println("You should enter 5!");
		
	}

	@Override
	public void onCollectGum() {
		System.out.println("Not enough money to collect gum!");
		System.out.println("Balance: 20");

		
	}

}
