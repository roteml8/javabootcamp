package javabootcamp.design_patterns.command;

import java.time.LocalTime;

public class TurnOffCommand extends Command {

	@Override
	public boolean execute() {
		this.description = "Heater turned off on "+LocalTime.now();
		System.out.println(description);
		return true;
	}
	
}
