package javabootcamp.basic.methods;

import java.util.Random;
import java.util.Scanner;

public class Runner {
	
	public static void printName()
	{
		System.out.println("Rotem");
	}
	
	public static double getAverageFrom3Grades()
	{
		Scanner scanner = new Scanner(System.in);
		int grade1, grade2, grade3;
		double sum = 0.0;
		System.out.println("Enter 1st grade");
		grade1 = scanner.nextInt();
		System.out.println("Enter 2nd grade");
		grade2 = scanner.nextInt();
		System.out.println("Enter 3rd grade");
		grade3 = scanner.nextInt();
		sum = grade1+grade2+grade3;
		return sum/3;
		
	}
	
	public static void printAverageFrom3Grades(int grade1, int grade2, int grade3)
	{

		int sum = grade1+grade2+grade3;
		System.out.println("Average grade is: "+sum/3.0);
		
	}
	
	public static int getMaxOfThree(int num1, int num2, int num3)
	{
		int max = num1;
		if (max < num2)
			max = num2;
		if (max < num3)
			max = num3;
		return max;
	}
	
	public static int incrementDigitsByOne(int num)
	{
		int newNum = 0, power = 1;
		while (num != 0)
		{
			int digit = (num%10)+1;
			if (digit == 10)
				digit = 0;
			newNum += digit*power;
			num /= 10;
			power *= 10;
		}
		return newNum;
	}
	
	public static int smallestDigitsOfTwoNumbers(int num1, int num2)
	{
		int newNum = 0, power = 1;
		int digit1, digit2, min, count1=0, count2=0;
		while (num1 != 0 && num2 !=0)
		{
			count1++;
			count2++;
			digit1 = num1%10;
			digit2 = num2%10;
			min = digit1;
			if (digit2 < min)
				min = digit2;
			newNum += min*power;
			num1/=10;
			num2/=10;
			power*=10;

		}
		if ((num1==0 && num2!=0) || (num2==0 && num1!=0))
			return -1;
		return newNum;
	}
	
	public static boolean isPerfect(int num)
	{
		int sum=1;
		for (int i=2; i*i<=num; i++)
		{
			if (num%i == 0)
			{
				sum+= i;
				sum+= num/i;
			}
		}
		if (sum==num && num!=1)
			return true;
		return false;
	}
	
	public static int getSumOfDigits(int num)
	{
		int sum = 0;
		while (num!=0)
		{
			sum+= num%10;
			num/=10;
		}
		return sum;
	}
	
	public static int getNumberOfElementsWithSum10(int[] array, int length)
	{
		int count=0;
		for (int i=0; i<length; i++)
			if (getSumOfDigits(array[i])==10)
				count++;
		return count;
	}
	
	public static void drawDiamondFrame(int num, char c)
	{
		for (int i=0; i<num; i++)
		{
			for (int j=0; j<num-i; j++)
				System.out.print(c);
			for (int j=num-i; j<num+i; j++)
				System.out.print(" ");
			for (int j=num+i; j<num*2; j++)
				System.out.print(c);
			System.out.println();
		}
		for (int i=num-2; i>=0; i--)
		{
			for (int j=0; j<num-i; j++)
				System.out.print(c);
			for (int j=num-i; j<num+i; j++)
				System.out.print(" ");
			for (int j=num+i; j<num*2; j++)
				System.out.print(c);
			System.out.println();
		}
	}
	
	public static boolean areSumsOfMatchingRowsAndColsEqual(int[][] matrix)
	{
		int rowSum, colSum;
		for (int i=0; i<matrix.length; i++)
		{
			rowSum = 0;
			colSum = 0;
			for (int j=0; j<matrix.length; j++)
			{
				rowSum += matrix[i][j];
				colSum += matrix[j][i];
				
			}
			if (rowSum != colSum)
				return false;
		}
		return true;
	}
	
	public static boolean isMirrorMatrix(int[][]matrix, int rows, int cols)
	{
		for (int i=0; i<cols/2; i++)
		{
			for (int j=0; j<rows; j++)
			{
				if (matrix[j][i] != matrix[j][cols-1-i])
					return false;
			}
		}
		return true;
	}
	
	public static int[] sumOfNumbersByArrays(int[] num1, int[] num2)
	{
		int max_digits = num1.length; // the larger number of digits of the two numbers
		if (num2.length > max_digits)
			max_digits = num2.length;
		int[] sum = new int[max_digits]; // the new number has at least max_digits digits
		int carry=0, currentSum;
		int num1Index=num1.length-1, num2Index=num2.length-1, sumIndex=max_digits-1;
		while (sumIndex>=0)
		{
			currentSum=0;
			if (num1Index>=0)
				currentSum+= num1[num1Index]%10;
			if (num2Index>=0)
				currentSum+= num2[num2Index]%10;
			currentSum += carry;
			sum[sumIndex] = currentSum%10;
			if (currentSum > 9)
				carry = 1;
			else
				carry = 0;
			num1Index--;
			num2Index--;
			sumIndex--;
		}
		if (carry==1) // this means the sum has one more digit to add
		{
			int[] newSum = new int[max_digits+1]; // new bigger array
			for (int i=max_digits; i>0; i--) // copy from older array and shift right by 1
				newSum[i] = sum[i-1];
			newSum[0] = 1; // first digit is 1
			return newSum;
		}
		return sum;
	}
	
	public static int getSizeOfTopLeftMatrix(int[][]matrix)
	{
		int size = 0;
		boolean flag = true;
		for (int i=0; i<matrix.length && flag; i++)
		{

			for (int j=0; j<=i; j++)
			{
				if (matrix[i][j]!=0 || matrix[j][i] != 0)
				{
					flag=false;
					break;
				}
			}
			if (flag)
				size = i+1;
		}
		return size;
	}
	
	public static void printCharArray(char[] a)
	{
		for (int i=0; i<a.length; i++)
			System.out.print(a[i]+"|");
		System.out.println();
	}
	public static void printMurblePuzzle(char[] array,int size)
	{
		array[2*size] = 'X';
		array[2*size-1] = ' ';
		printCharArray(array);
		for (int i=2*size-1-2; i>=1; i-=2)
		{
				array[i] = ' ';
				array[i+2] = 'X';
				printCharArray(array);
		}
		array[1] = '0';
		array[2] = ' ';		
		printCharArray(array);
		for (int i=size; i<=size*2-2; i+=2)
		{
				array[i] = ' ';
				array[i-2] = '0';
				printCharArray(array);
		}
		//array[size+1]
		for (int i=size+1; i<=size*2-2; i+=2)
		{
				array[i] = ' ';
				array[i-2] = '0';
				printCharArray(array);
		}
				
	}
	
	public static int max(int num1, int num2, int num3)
	{
		int max = num1;
		if (max < num2)
			max = num2;
		if (max < num3)
			max = num3;
		return max;
	}
	
	public static int max(int num1, int num2)
	{
		if (num1>=num2)
			return num1;
		return num2;
	}
	
	public static int[] createArrOfRandomInRange(int length)
	{
		int[] arr = new int[length];
		for (int i=0; i<length; i++)
			arr[i] = (int) ((Math.random() * 201) -100);
		return arr;
	}
	
	public static void printArray(int[] arr)
	{
		for (int i=0; i<arr.length; i++)
			System.out.print(arr[i]+" ");
	}
	
	public static int[] sumArrayysPerIndex(int[] longer, int[] shorter)
	{
		int[] sum = new int[longer.length];
		int i=0;
		for (; i<shorter.length; i++)
			sum[i] = longer[i]+shorter[i];
		for (; i<longer.length;i++)
			sum[i] = longer[i];
		return sum;
	}
	
	public static void changeLongerArrToSum(int[] arr1, int[] arr2)
	{
		int[] result;
		// note: we can define longer and shorter array and drop the if-else
		if (arr1.length >= arr2.length)
		{
			result = sumArrayysPerIndex(arr1, arr2);
			for (int i=0; i<arr1.length; i++)
				arr1[i] = result[i];
		}
		else
		{
			result = sumArrayysPerIndex(arr2, arr1);
			for (int i=0; i<arr2.length; i++)
				arr2[i] = result[i];

		}
	}
	
	public static int[] concatArrays(int[] arr1, int[] arr2)
	{
		int[] concatArray = new int[arr1.length+arr2.length];
		for (int i = 0; i < arr1.length; i++) 
			concatArray[i] = arr1[i];
		for (int i = 0; i < arr2.length; i++) 
			concatArray[arr1.length+i] = arr2[i];
		return concatArray;
		
	}
	public static void main(String[] args) {
		int[] arr1 = {3,2,1};
		int[] arr2 = {1,2,2,1};
//		changeLongerArrToSum(a1,a2);
		int[] arr3 = concatArrays(arr1,arr2);
		printArray(arr3);
//		System.out.println(incrementDigitsByOne(12345));
//		System.out.println(incrementDigitsByOne(99));
//		System.out.println(incrementDigitsByOne(939));
//		System.out.println(smallestDigitsOfTwoNumbers(123,5678));
//		System.out.println(smallestDigitsOfTwoNumbers(194,456));
//		for (int i=1; i<=10000; i++)
//			if (isPerfect(i))
//				System.out.println(i);
//		drawDiamondFrame(3,'#');
//		int[][] matrix = {{2,1,5},{6,7,3},{0,8,0}};
//		System.out.println(areSumsOfMatchingRowsAndColsEqual(matrix));
//		int[][] matrix1 = {{2,1,5,1,2},{6,7,3,7,6},{0,8,0,8,0}};
//		int[][] matrix2 = {{2,1,5,5,1,2},{6,7,3,3,7,6},{0,8,0,0,8,0}};
//		System.out.println(isMirrorMatrix(matrix1,3,5));
//		System.out.println(isMirrorMatrix(matrix2,3,6));
//		int[] num1 = {9,9,9,9};
//		int[] num2 = {9,7};
//		int[] sum = sumOfNumbersByArrays(num1,num2);
//		for (int i=0; i<sum.length; i++)
//			System.out.print(sum[i]);
//		int[][] matrix1 = {{0,1,0,0,0},{0,0,0,0,0},{0,0,1,0,0},{0,0,0,0,0},{0,0,0,0,0}};
//		System.out.println(getSizeOfTopLeftMatrix(matrix1));
//		int[][] matrix2 = {{0,0,0,0,0},{0,0,4,0,0},{0,0,0,0,0},{0,0,0,1,0},{0,0,0,0,0}};
//		System.out.println(getSizeOfTopLeftMatrix(matrix2));
//		char[] arr = {'0','X','0','X','0','X','0','X',' '};
//		printMurblePuzzle(arr,4);
		
		
//		System.out.println(10*Math.sin(Math.PI/4));
//		System.out.println(Math.toRadians(120));
//		System.out.println(Math.exp(2.5));
		
//		int[] a = createArrOfRandomInRange(10);
//		printArray(a);
	

	}

}
