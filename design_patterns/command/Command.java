package javabootcamp.design_patterns.command;

public abstract class Command {
	
	protected String description;
	
	abstract boolean execute();

	public String getDescription() {

		return description;
	}
	
}
