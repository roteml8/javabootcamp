package javabootcamp.design_patterns.state;

public abstract class State {
	
	GumDispenser dispenser;

	public State(GumDispenser dispenser) {
		this.dispenser = dispenser;
	}
	
	
	public abstract void onInsert5();
	
	public abstract void onInsert10();
	
	public abstract void onCollectGum();
	
	

}
