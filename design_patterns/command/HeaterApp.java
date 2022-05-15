package javabootcamp.design_patterns.command;

import java.util.ArrayList;
import java.util.List;

public class HeaterApp {
	
	private final int NUM_COMMANDS = 5;
	
	 private CommandHistory history = new CommandHistory();

	public void TurnOn(int i) {
		Command c = new TurnOnCommand(i);
		c.execute();
		history.add(c);
	}

	public void TurnOff() {
		Command c = new TurnOffCommand();
		c.execute();
		history.add(c);
		
	}

	public void showHistory() {
		ArrayList<Command> allHistory = history.getHistory();
		int historySize = allHistory.size();
		int commandsToShow = historySize < NUM_COMMANDS ? historySize : NUM_COMMANDS;
		List<Command> recentHistory = allHistory.subList(historySize-commandsToShow, historySize);
		recentHistory.forEach(c->System.out.println(c.getDescription()));
	}

	
}
