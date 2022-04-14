package javabootcamp.oop.vendingmachine;

import java.util.Scanner;

/**
 * a class that represents a vending machine
 * simulates producing drinks to the consumer
 * @author Rotem
 *
 */
public class VendingMachine {
	
	public static int milkQtt;
	public static int waterQtt;
	
	static {
	  milkQtt = 1000;
	  waterQtt = 2000;
	}
	
	/**
	 * main method
	 * presents the user the menu
	 * receives user choice for drink and calls the createDrink methos
	 * produces the created drink
	 * @param args
	 */
	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  while(milkQtt >=50  && waterQtt >=50) {
		  System.out.printf("\nMilk Quantity: %dcc, Water Quantity: %dcc\n",milkQtt, waterQtt);
	    showMenu();
	    int opt = Integer.parseInt(sc.next());
	    if(opt == 0)
	      break;
	    Producible drink = createDrink(opt);
	    drink.produce();
	    
	  }
	  sc.close();
	}
	
	/**
	 * create a drink according to the given option
	 * @param opt
	 * @return
	 */
	private static Producible createDrink(int opt) {
	  switch(opt){
	  case 0: 
		  break;
	  case 1:
		  return new HotChocolate();
	  case 2:
		  return new Espresso();
	  case 3:
		  return new Cappuccino();
	  case 4: 
		  return new Latte();
	  case 5:
		  return new Cola();
	  case 6:
		  return new Sprite();
	  case 7:
		  return new OrangeJuice();
	  case 8:
		  return new AppleJuice();
	  }
	  return null;
	}
	
	/**
	 * display vending machine menu to the user
	 */
	public static void showMenu() {
	  System.out.println("\nPlease select a drink or enter 0 to exit:");
	  System.out.println("1. Hot Chocolate\n" + "2. Hot Espresso\n" + "3. Hot Cappuccino\n" + "4. Hot Latte\n"
	+ "5. Cola\n" + "6. Sprite\n" + "7. Orange Juice\n" + "8. Apple Juice");
	}

}