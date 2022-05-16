package javabootcamp.design_patterns.mvc;

import java.util.Scanner;

public class StudentView {
	
	static Scanner sc = new Scanner(System.in);
	
	public int[] getGrades(int numGrades)
	{
		int[] grades = new int[numGrades];
		for (int i=0; i<numGrades;i++)
		{
			System.out.println("Enter grade");
			grades[i] = sc.nextInt();
		}
		sc.close();
		return grades;
	}
	
	public String getName(String type)
	{
		System.out.println("Enter "+type+" name");
		String name = sc.next();
		return name;
	}
	
	public int getId()
	{
		System.out.println("Enter id");
		int id = sc.nextInt();
		return id;
	}

	public void showStatus(String status) {
		System.out.println(status+" student");
		
	}

}
