package javabootcamp.design_patterns.command;

import java.util.ArrayList;

public class CommandHistory {
	
    private ArrayList<Command> history = new ArrayList<>();

    public void add(Command c) {
        history.add(c);
    }

    public ArrayList<Command> getHistory()
    {
    	return history;
    }

    public boolean isEmpty() { return history.isEmpty(); }

}
