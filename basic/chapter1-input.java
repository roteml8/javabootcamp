package javabootcamp.basic.user_input;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Question 1 - calculate circumference from a given radius
		System.out.println("Please enter a radius");
		float radius = scanner.nextFloat();
		float pi = 3.14f;
		float circ = 2 * pi * radius;
		System.out.printf("The circumference is: %.2f", circ);
		float area = pi * radius * radius;
		System.out.printf("The area is: %.2f", area);

//		// Question 2 - toast price
		final int BASIC_PRICE = 12;
		final int CHEAP_ADDITION = 2;
		final int EXPENSIVE_ADDITION = 3;
		System.out.println("Please enter number of cheap additions");
		int cheaps = scanner.nextInt();
		System.out.println("Please enter number of expensive additions");
		int expensives = scanner.nextInt();
		int total = BASIC_PRICE + cheaps*CHEAP_ADDITION+expensives*EXPENSIVE_ADDITION;
		System.out.println("Toast price is: "+total);
		
//		// Question 3 - furniture price
		final int KM_PRICE = 5;
		final int FLOOR_PRICE = 1;
		final float TIP = 0.1f;
		System.out.println("Please enter the furniture price");
		float furniture_price = scanner.nextFloat();
		System.out.println("Please enter the furniture weight");
		float furniture_weight = scanner.nextFloat();
		System.out.println("Please enter number of kilometeres for devlivery");
		int km_num = scanner.nextInt();
		System.out.println("Please enter number of floor for devlivery");
		int floor = scanner.nextInt();
		float total_price = furniture_price + KM_PRICE*km_num + FLOOR_PRICE*floor*furniture_weight + TIP*furniture_price;
		System.out.println("Total price is: "+total_price);
		
		// Exercise
		final int DIVISOR = 12;
		System.out.println("Enter an integer");
		int num = scanner.nextInt();
		String result = (num%DIVISOR==0) ? " " : " NOT ";
		System.out.println(num+ " is"+result+"dividable by 2 ,3 and 4");
		System.out.println("Goodbye");
		int numToCheck, min, max;
		System.out.println("Enter 3 numbers");
		numToCheck = scanner.nextInt();
		min = scanner.nextInt();
		max = scanner.nextInt();
		String result = "";
		// swap if range is reverse
		if (min > max)
		{
			int temp = min;
			min = max;
			max = temp;
		}
		if (numToCheck > max)
			result = " greater than ";
		else if (numToCheck < min)
			result = " smaller than ";
		else
			result = " in ";

		System.out.println(numToCheck+" is"+result+"the range "+min+" to "+max);

		scanner.close();
	}

}
