package javabootcamp.design_patterns.observer;

public class SMSNotificationListener implements EventListener {

	private String number;
	
	
	public SMSNotificationListener(String number) {
		this.number = number;
	}


	@Override
	public void update(Report report) {
		System.out.println(report.type+" news report sent SMS to number: "+number+" Report: "+report.report);
		
	}

}
