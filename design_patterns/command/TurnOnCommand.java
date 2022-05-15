package javabootcamp.design_patterns.command;

import java.time.LocalTime;

public class TurnOnCommand extends Command {
		
	private final int MAX_MINUTES = 90;
	private int minutes;

	public TurnOnCommand(int minutes) {
		if (minutes > MAX_MINUTES)
			minutes = MAX_MINUTES;
		this.minutes = minutes;
	}

	@Override
	public boolean execute() {
		this.description = "Heater turned on for "+minutes+" minutes on "+LocalTime.now();
		System.out.println(description);
		return true;
	}
	

}
