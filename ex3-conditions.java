package javabootcamp.basic.conditions;

import java.util.Scanner;

public class Runner {
	
	public static void main(String[]args)
	{
		 //Exercise
		Scanner scanner = new Scanner(System.in);
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
//
		System.out.println(numToCheck+" is"+result+"the range "+min+" to "+max);

//		
		// 3.3
		int guestType, extra, longDrive, total;
		System.out.println("Enter 1 if bride/groom are close friends, 2 if they are family, 3 otherwise");
		guestType = scanner.nextInt();
		System.out.println("Enter 1 if you know them more than 3 years, 0 otherwise");
		extra = scanner.nextInt();
		System.out.println("Enter 1 if drive is more than 1 hour, 0 otherwise");
		longDrive = scanner.nextInt();
		switch (guestType) {
		case 1: // close friends
			total = 500;
			break;
		case 2: // family
			total = 1000;
			break;
		default: //otherwise
			total = 250;
		}
		if (extra == 1 && guestType != 2) // know them for more than 3 years and not family
			total += 50;
		if (longDrive == 1 && guestType != 2)
			total -= 50;
		System.out.println("Total amount recommendation: "+total);
		
		// 3.7
		int grade, avg, numOfExes;
		double finalGrade;
		System.out.println("Enter exam grade");
		grade = scanner.nextInt();
		System.out.println("Enter average of home assignments");
		avg = scanner.nextInt();
		System.out.println("Enter number of assignments");
		numOfExes = scanner.nextInt();
		switch (numOfExes) {
		case 0:
		case 1:
		case 2:
		case 3: 
		case 4:
				finalGrade = 0;
				break;
		case 5:
		case 6:
			if (grade <= 54)
				finalGrade = grade;
			else
				finalGrade = 0.2*grade + 0.8*grade;
			break;
		default:
			double weighted;
			if (grade <= 54) {
				if (avg >= 80)
					weighted = 0.25*avg + 0.75*grade;
				else
					weighted = 0.2*avg + 0.8*grade;
			}
			else 
				weighted = 0.3*avg + 0.7*grade;
			if (weighted > grade)
				finalGrade = weighted;
			else
				finalGrade = grade;
			}
		System.out.println("Final grade is: "+finalGrade);
		scanner.close();
	}

}
