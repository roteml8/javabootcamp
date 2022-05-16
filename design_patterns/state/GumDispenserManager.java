package javabootcamp.design_patterns.state;

import java.util.Scanner;

public class GumDispenserManager {
	
	private GumDispenser gumDispenser;

	public GumDispenserManager(GumDispenser gumDispenser) {
		super();
		this.gumDispenser = gumDispenser;
	}
	
	public void simulate()
    {
   		System.out.println("Welcome to the Gum dispenser Simulator");
    	Scanner sc = new Scanner(System.in);
    	boolean running = true;
    	while (running)
    	{
    		int choice;
    		System.out.println("Please enter:");
    		System.out.println("1 - if you're inserting a 5 cents coin");
    		System.out.println("2 - if you're inserting a 10 cents coin");
    		System.out.println("3 - To collect the gum...");
    		System.out.println("Any other number to exit the simulation.");
    		choice = sc.nextInt();
    		switch (choice)
    		{
    			case 1:
    				gumDispenser.getState().onInsert5();
    				break;
    			case 2:
    				gumDispenser.getState().onInsert10();
    				break;
    			case 3:
    				gumDispenser.getState().onCollectGum();
    				break;
    			default:
    				System.out.println("Goodbye!");
    				running = false;	
    		}
    		
    	}
    	sc.close();
    }

}
