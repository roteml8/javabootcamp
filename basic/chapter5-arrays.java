package javabootcamp.basic.arrays;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		int[][] arr = { {1}, {2,3}, {4,5,6} };
		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
				System.out.print(arr[i][j]);
			System.out.println();
		}
		for (int[] row: arr)
		{
			for (int number: row)
				System.out.print(number);
			System.out.println();
		}
		int[] arr = {1,2,3,4,5};
		int[] arrCopy = new int[arr.length];
		for (int i=0; i<arr.length; i++)
			arrCopy[i] = arr[i];
		for (int i=0; i<arrCopy.length; i++)
			arrCopy[i] *= arrCopy[i];
		for (int i=0; i<arr.length; i++)
			System.out.print(arr[i]+" ");
		System.out.println();
		for (int i=0; i<arrCopy.length; i++)
			System.out.print(arrCopy[i]+" ");
		
		Scanner scanner = new Scanner(System.in);
		//Chapter 5 - uneven questions
		// 5.1
		int[] arr1 = new int[5];
		int[] arr2 = new int[5];
		System.out.println("Enter numbers for 1st array");
		for (int i=0; i<arr1.length; i++)
			arr1[i] = scanner.nextInt();
		System.out.println("Enter numbers for 2nd array");
		for (int i=0; i<arr2.length; i++)
			arr2[i] = scanner.nextInt();
		boolean answer = true;
		for (int i=0; i<arr1.length;i++)
		{
			if (arr1[i] != arr2[arr1.length-i-1]) {
				answer=false;
				break;
			}
		}
		if (answer)
			System.out.println("Arrays are reversed");
		else
			System.out.println("Arrays are not reversed");

		
		//5.3
		int[] arr = new int[10];
		System.out.println("Enter first 2 numbers of the array");
		arr[0] = scanner.nextInt();
		arr[1] = scanner.nextInt();
		for (int i=2; i<arr.length; i++)
			arr[i] = arr[i-1] + arr[i-2];
		System.out.println("Array elements:");
		for (int i=0; i<arr.length; i++)
			System.out.print(arr[i]+" ");
		
		//5.5
		int size;
		System.out.println("Enter arrays size");
		size = scanner.nextInt();
		int[] arr1 = new int[size];
		int[] arr2 = new int[size];
		System.out.println("Enter numbers for 1st array");
		for (int i=0; i<arr1.length; i++)
			arr1[i] = scanner.nextInt();
		System.out.println("Enter numbers for 2nd array");
		for (int i=0; i<arr2.length; i++)
			arr2[i] = scanner.nextInt();
		boolean answer = true;
		for (int i=0; i<arr1.length-1; i++)
		{
			int j = (i+1) % size;
			if (arr1[i] != arr2[j]) {
				answer = false;
				break;
			}
		}
		System.out.println(answer);
		
		//5.7
		final int SIZE = 5;
		int[] arr1 = new int[SIZE];
		int[] arr2 = new int[SIZE];
		int[] common = new int[SIZE];
		System.out.println("Enter sorted numbers for 1st array");
		for (int i=0; i<SIZE; i++)
			arr1[i] = scanner.nextInt();
		System.out.println("Enter sorted numbers for 2nd array");
		for (int i=0; i<SIZE; i++)
			arr2[i] = scanner.nextInt();
		int count=0, arr1Index=0, arr2Index=0, commonIndex = 0;
		while (arr1Index <SIZE && arr2Index < SIZE )
		{
			if (arr1[arr1Index] < arr2[arr2Index])
				arr1Index++;
			else if (arr1[arr1Index] > arr2[arr2Index])
				arr2Index++;
			else {
				count++;
				common[commonIndex] = arr1[arr1Index];
				arr1Index++;
				arr2Index++;
				commonIndex++;
			}
		}
		System.out.println("common elements:");
		for (int i=0; i<count; i++)
			System.out.print(common[i]+" ");
		System.out.println("\ntotal "+count+" elements");
		
		// 5.9
		final int SIZE = 3;
		int[] arr1 = new int[SIZE];
		int[] arr2 = new int[SIZE];
		System.out.println("Enter numbers for 1st array");
		for (int i=0; i<SIZE; i++)
			arr1[i] = scanner.nextInt();
		System.out.println("Enter numbers for 2nd array");
		for (int i=0; i<SIZE; i++)
			arr2[i] = scanner.nextInt();
		boolean answer = true;
		for (int i=0; i<SIZE; i++)
		{
			int current1 = arr1[i], current2 = arr2[i];
			int sum1 = 0, sum2 = 0;
			while (current1 != 0)
			{
				sum1 += current1%10;
				current1 /= 10;
			}
			while (current2 != 0)
			{
				sum2 += current2%10;
				current2 /= 10;
			}
			if (sum1 != sum2)
			{
				answer = false;
				break;
			}
		}
		if (answer)
			System.out.println("Arrays match");
		else
			System.out.println("Arrays dont match");

	

		//5.11
		final int SIZE = 10;
		int[][] matrix = new int[SIZE][SIZE];
		int rows = 0, cols = 0;
		System.out.println("Enter number of rows");
		rows = scanner.nextInt();
		while (rows < 1 || rows > 10)
		{
			System.out.println("Value should be between 1-10, try again ->");
			rows = scanner.nextInt();
		}
		System.out.println("Enter number of cols");
		cols = scanner.nextInt();
		while (cols < 1 || cols > 10)
		{
			System.out.println("Value should be between 1-10, try again ->");
			cols = scanner.nextInt();
		}
		System.out.println("Enter "+rows*cols+" numbers");
		for (int i=0; i<rows; i++)
			for (int j=0; j<cols; j++)
				matrix[i][j] = scanner.nextInt();
		System.out.println("Matrix is:");
		int max = matrix[0][0];
		for (int i=0; i<rows; i++)
		{
			for (int j=0; j<cols; j++)
			{
				System.out.print(matrix[i][j]+" ");
				if (i==0 || j==0 || i==rows-1 || j==cols-1)
					if (matrix[i][j] > max)
						max = matrix[i][j];
			}
			System.out.println();
		}
		System.out.println("The max is "+max);

		
		//5.15
		System.out.println("Enter matrix size");
		int size  = scanner.nextInt();
		int[][] matrix = new int[size][size];
		boolean answer = true;
		System.out.println("Enter matrix elements");
		for (int i=0; i<size; i++)
			for (int j=0; j<size; j++)
				matrix[i][j] = scanner.nextInt();
		for (int i=0; i<size; i++)
			for (int j=0; j<size; j++)
			{
				if (matrix[i][j] != matrix[j][i])
				{
					answer = false;
					break;
				}
			}
		System.out.println(answer);
		
	}

}
