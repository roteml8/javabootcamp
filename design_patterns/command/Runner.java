package javabootcamp.design_patterns.command;

public class Runner {

	public static void main(String[] args) {
		HeaterApp app = new HeaterApp();
		app.TurnOn(30);
		app.TurnOff();
		app.TurnOn(123);
		app.TurnOn(23);
		app.TurnOff();
		app.TurnOff();
		app.TurnOn(222);
		app.TurnOff();
		app.TurnOn(13);
		System.out.println("----- HISTORY -----");
		app.showHistory();

	}

}
