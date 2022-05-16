package javabootcamp.design_patterns.observer;

public class EmailNotificationListener implements EventListener {
	
	private String email;

	public EmailNotificationListener(String email) {
		this.email = email;
	}

	@Override
	public void update(Report report) {
		System.out.println(report.type+" news report sent to email: "+email+" Report: "+report.report);
		
	}
	
	

}
