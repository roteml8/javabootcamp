package javabootcamp.design_patterns.mvc;

public class StudentController {
	
	private final int NUM_GRADES = 3;
	private final int EXCELLENT_GRADE = 90;
	
	private StudentModel model;
	private StudentView view;
	
	public StudentController(StudentModel model, StudentView view) {
		this.model = model;
		this.view = view;
	}
	
	public void startApp() {
		String firstName = view.getName("first");
		String lastName = view.getName("last");
		int id = view.getId();
		int[] grades = view.getGrades(NUM_GRADES);
		model.setFirstName(firstName);
		model.setLastName(lastName);
		model.setId(id);
		model.setGrades(grades);
		double avg = model.calculateAverage();
		String status = avg >= EXCELLENT_GRADE ? "Excellent" : "Great";
		view.showStatus(status);

	}
	

}
