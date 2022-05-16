package javabootcamp.design_patterns.state;

public class GumDispenser {
		
	private State state;
	
	
	public GumDispenser()
	{
		this.state = new InitialState(this);
	}
	

    public void changeState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }   

}
