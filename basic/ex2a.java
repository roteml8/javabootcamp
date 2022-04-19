package javabootcamp.basic.ex2a;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//1
		System.out.println("Enter your age");
		int age = scanner.nextInt();
		boolean minor = age < 18 ? false : true;
		if (minor)
			System.out.println("You are ù minor");
		else
			System.out.println("You are an adult");
		
		//2
		String result = "";
		if (age < 18)
			result = "a minor";
		else if (age <= 65)
			result = "an adult";
		else
			result = "a pensioner";
		System.out.println("You are "+result);
		
		//3
		System.out.println("Enter a number");
		int num = scanner.nextInt();
		if (num/10 == num%10)
			System.out.println("Digits are equal");
		else
			System.out.println("Digits are not equal");
		
		//4
		System.out.println("Enter a number");
		int num = scanner.nextInt();
		if (num/100 == (num/10)%10 && num%10 == num%10)
			System.out.println("Digits are equal");
		else
			System.out.println("Digits are not equal");
		
		//5
		System.out.println("Enter a number");
		int num = scanner.nextInt();
		int left = num/10, right = num%10;
		if (left == right-1)
			System.out.println("Digits are sequential");
		else
			System.out.println("Digits arent sequential");
		
		//7 
		float capacity, current;
		final float THRESHOLD = 0.15f;
		System.out.println("Enter gas capacity of tank");
		capacity = scanner.nextFloat();
		System.out.println("Enter current amount of fuel");
		current = scanner.nextFloat();
		if (current <= THRESHOLD*capacity)
			System.out.println("You should refill");
		else
			System.out.println("You dont need to refill");
		
		//9
		System.out.println("Enter a number represnting a date");
		int date = scanner.nextInt();
		int year = date%10000, month = (date/10000)%100, day = (date/10000)/100;
		System.out.printf("The year is %d, the month is %d, and the day is %d", year, month, day);
		scanner.close();
		
	}

}
