package javabootcamp.design_patterns.mvc;

public class StudentModel {
	
	private String firstName;
	private String lastName;
	private int id;
	private int[] grades;
	
	public void setGrades(int[] grades)
	{
		this.grades = grades;
	}

	public double calculateAverage() {
		int sum = 0;
		for (int i=0; i<grades.length; i++)
			sum+= grades[i];
		return sum/grades.length;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	

}
