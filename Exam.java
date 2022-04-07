package javabootcamp.basic.exam;

// Rotem Levi
public class Runner {

	public static void main(String[] args) {
		
		// Question 1
		
//		JDK is a kit of tools for developing and testing programs written in Java.
//		JRE is a program to create and run Java applications. 
//		JVM is a virtual machine that enables a computer to run Java programs.
//		JDK contains the JRE, and the JRE contains the JVM.
		
		// Question 2
		
//		Java program execution follows 5 major steps
//
//		1. Edit - the programmer writes the code files (.java files)
//		2. Compile - all .java files are converted by the compiler into bytecode (.class files) which is the language understood by the JVM. Any compile time errors are raised at this step.
//		3. Load - the program is loaded into memory. This is done by the class loader which takes the .class files containing the bytecode and stores it in the memory.
//		4. Verify - the bytecode verifier checks if the bytecode loaded are valid and do not breach java security restrictions.
//		5. Execute - the JVM interprets the program one bytecode at a time and runs the program.
	

		
		System.out.println("123321 is palindrome? "+isPalindrome(123321));
		System.out.println("123421 is palindrome? "+isPalindrome(123421));
		System.out.println("12321 is palindrome? "+isPalindrome(12321));
		System.out.println("11231 is palindrome? "+isPalindrome(11231));
		int[] arr1 = {7,8,-4}, arr2 = {-5,7,3,2};
		int[] newArr = constructArrByElementsSumFromLowToHighWithTotalSumAndDifference(arr1, arr2);
		System.out.println();
		System.out.println("Array 1:");
		printArray(arr1);
		System.out.println("Array 2:");
		printArray(arr2);
		System.out.println("Constructed array:");
		printArray(newArr);
		System.out.println();
		int[] arr3 = {1,2,3,4};
		int[] arr4 = {5,0,-3,2,4};
		int[] newArr2 = constructArrByElementsSumFromLowToHighWithTotalSumAndDifference(arr3, arr4);
		System.out.println("Array 1:");
		printArray(arr3);
		System.out.println("Array 2:");
		printArray(arr4);
		System.out.println("Constructed array:");
		printArray(newArr2);



	}
	
	// Question 3
	
	// input: a nonnegative integer
	// output: true if the given number is a palindrome, false otherwise 
	public static boolean isPalindrome(int number)
	{
		// we first check if the number is 0 because the fucntion fits integers >= 1
		if (number == 0) 
			return true;
		
		int numOfDigits = 0;
		// creating a temporary variable to store number so we don't lose its value when computing number of digits
		int temp = number; 
		
		// count number of digits in given number
		while (temp != 0)
		{
			numOfDigits++;
			temp/=10;
		}
		
		int digit1, digit2; // couple of digits to compare
		
		// powers of 10 to divide the number from both ends 
		int smallTenPower=1, bigTenPower = (int) Math.pow(10, numOfDigits-1); 
		
		// we compare digits from both ends of the number until we pass the middle
		// if the number's length is odd then the middle digit is irrelevant
		while (bigTenPower > smallTenPower)
		{
			digit1 = (number/smallTenPower)%10; // current right digit
			digit2 = (number/bigTenPower)%10; // current left digit
			if (digit1 != digit2) // mismatch
				return false;
			smallTenPower *=10;
			bigTenPower /= 10;
		}
		
		return true; // all couples match
		
	}
	
	// Question 4
	
	// input: two integer arrays
	// output: a new array with the array that has the smaller sum of elements first and followed by the other array,
	// and last 2 elements of the total sum of the two arrays and absolute value of their difference
	public static int[] constructArrByElementsSumFromLowToHighWithTotalSumAndDifference(int[] arr1, int[] arr2)
	{
		int[] newArray = new int[arr1.length + arr2.length + 2]; 
		int sumArr1=0, sumArr2=0;
		
		// default values for smaller sum array and the other array
		int[] smallerSumArr = arr1, otherArr = arr2; 
		
		// compute sum of both arrays
		for (int i = 0; i < arr1.length; i++) 
			sumArr1+=arr1[i];
		
		for (int i = 0; i < arr2.length; i++) 
			sumArr2+=arr2[i];
		
		if (sumArr2 < sumArr1) // update if needed
		{
			smallerSumArr = arr2;
			otherArr = arr1;
		}
		
		// fill the new array with smaller sum array, then with the other array
		for (int i = 0; i < smallerSumArr.length; i++)
			newArray[i] = smallerSumArr[i];
		for (int i = 0; i < otherArr.length; i++)
			newArray[smallerSumArr.length+i] = otherArr[i];
		
		newArray[newArray.length-2] = sumArr1+sumArr2; // sum of sums
		newArray[newArray.length-1] = Math.abs(sumArr1-sumArr2); // difference of sums
		
		return newArray;
		
	}
	
	// print array of integers
	public static void printArray(int[] arr)
	{
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
	}
	
	

}
 
