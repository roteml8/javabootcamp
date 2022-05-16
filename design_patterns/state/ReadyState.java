package javabootcamp.design_patterns.state;

public class ReadyState extends State {

	public ReadyState(GumDispenser dispenser) {
		super(dispenser);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onInsert5() {
		System.out.println("You should collect the gum!");
		System.out.println("Balance: 25");

	}

	@Override
	public void onInsert10() {
		System.out.println("You should collect the gum!");
		System.out.println("Balance: 25");

		
	}

	@Override
	public void onCollectGum() {
		System.out.println("You have collected the gum!");
		System.out.println("Balance: 0");
		this.dispenser.changeState(new InitialState(this.dispenser));
		
	}

}
