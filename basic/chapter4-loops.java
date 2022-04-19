package javabootcamp.basic.loops;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		//check if number is prime
//		System.out.println("Enter a number");
//		int num = scanner.nextInt();
//		String result = "";
//		for (int i=2; i<num; i++)
//		{
//			if (num%i==0)
//			{
//				result = "NOT ";
//				break;
//			}
//		}
//		System.out.println("The number is "+result+"a prime");	
//		int digit = 0, number = 0;
//		System.out.println("Enter digits, -1 to terminate");
//		digit = scanner.nextInt();
//		while (digit >= 0)
//		{
//
//			number *= 10;
//			number += digit;
//			digit = scanner.nextInt();
//		}
//		System.out.println("The number is: "+number);
//		int product = 0, multi = 1;
//		int digit;
//		System.out.println("Enter digits");
//		do
//		{
//				digit = scanner.nextInt();
//				if (digit >= 0)
//				{
//					product = multi * digit;
//					multi = product;
//				}
//		}	
//		while (digit > 0);
//		System.out.println("Product is: "+product);
//		System.out.println("Enter number of parts");
//		int numOfParts = scanner.nextInt();
//		int ready=0, toFix = 0, rejects = 0;
//		for (int i=0; i<numOfParts; i++)
//		{
//			System.out.println("Enter detector print");
//			int print = scanner.nextInt();
//			switch (print)
//			{
//			case 0:
//				ready++;
//				break;
//			case 1:
//				toFix++;
//				break;
//			default:
//				rejects++;
//			}
//		}
//		System.out.println(ready+" "+toFix+" "+rejects);
		
		// 4.2
		int number=0, input, numOfDigits=0;
		System.out.println("Enter integer");
		input = scanner.nextInt();
		int temp = input;
		while (temp != 0) // count number of digits in input number
		{
			numOfDigits++;
			temp /= 10;
		}
		int index = numOfDigits-1, power = 1;
		while (index >= 0)
		{
			if (index%2 == 0)
			{
				number += power*(input%10);
				power *= 10;
			}
			input /= 10;
			index--;
		}
		System.out.println("New number is "+number);
		
		//4.4
		int id;
		System.out.println("Enter id number");
		id = scanner.nextInt();
		int checkDigit = id%10;
		int sum = 0, weighted;
		id /=10;
		for (int i=7; i>=0; i--)
		{
			int currentDigit = id%10;
			if (i%2 == 0)
				weighted = currentDigit;
			else
				weighted = currentDigit*2;
			if (weighted > 9)
			{
				sum+= (weighted/10);
				sum+= (weighted%10);
			}
			else
				sum += weighted;
			id /= 10;
		}
		double calcDigit;
		if (sum%10 == 0)
			calcDigit = 0;
		else
			calcDigit = 10 - (sum%10);
		if (calcDigit == checkDigit)
			System.out.println("Correct");
		else
			System.out.println("Incorrect");
		
		//4.6
		int input, newNum;
		System.out.println("Enter integer");
		input = scanner.nextInt();
		newNum = input;
		while (input != 0)
		{
			newNum *= 10;
			newNum += input%10;
			input /= 10;
			
		}
		System.out.println("New number is: "+newNum);
		
		//4.8
		int count = 0;
		for (int i=10; i<=99; i++)
		{
			for (int j=i+1; j<=99; j++)
			{
				int numerator = i/10, denom = j%10;
				double result = (double)numerator/denom;
				if (result == (double)i/j)
				{
					count++;
					System.out.println(i+"/"+j+"="+numerator+"/"+denom);
				}
			}
		}
		System.out.println("total "+count+" numbers");
		
		//4.10
		int number, size;
	    System.out.println("Enter an integer and a digit");
	    number = scanner.nextInt();
	    size = scanner.nextInt();
	    int currentPart, newNumber=0, power=1;
	    while (number != 0)
	    {
	    	currentPart = 0;
	    	int count = 0; // count number of digits in current part
	    	for (int i=0; i<size; i++)
	    	{
	    		if (number%10 != 0)
	    		{
		    		currentPart *= 10;
		    		currentPart += number%10;
		    		count++;
	    		}

		    	number /= 10;
	    	}
	    	currentPart *= power;
	    	newNumber += currentPart;
	    	for (int i=0; i<count; i++) // update power of 10
	    		power *= 10;
	    }
	    System.out.println("New number is "+newNumber);
	    
	    //4.12
	    System.out.println("enter integer");
	    int num = scanner.nextInt();
	    for (int i=0; i<num; i++)
	    {
	    	for (int j=0; j<i; j++)
	    		System.out.print(" ");
	    	for (int j=0; j<(num-i)*2; j++)
	    	{
	    		if (j%2==0)
		    		System.out.print("*");
	    		else
	    			System.out.print(" ");
	    	}
	    	System.out.println();
	    }
	    
	    //4.14
	    System.out.println("Enter integer");
	    int num = scanner.nextInt();
	    for (int i=0; i<num; i++)
	    {
	    		for (int m=0; m<num; m++)
	    		{
			    	for (int j=0; j<num; j++)
			    	{
			    		for (int k=0; k<num; k++)
			    			System.out.print("*");
			    		System.out.print(" ");
			    	}
			    	System.out.println();
	    		}
	
		    System.out.println("\n");
	    }
	    
	    //4.16


		scanner.close();
	}

}
