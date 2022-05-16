package javabootcamp.design_patterns.observer;

public class Runner {

	public static void main(String[] args) {
		
		ReportSystem system = new ReportSystem();
		String num1 = "432432438", num2 = "123234234";
		String email1 = "admin@example.com";
		
		system.events.subscribe(ReportType.SPORTS, new SMSNotificationListener(num1));
		system.events.subscribe(ReportType.WEATHER, new SMSNotificationListener(num1));
		system.events.subscribe(ReportType.SPORTS, new EmailNotificationListener(email1));
		system.events.subscribe(ReportType.WEATHER, new EmailNotificationListener(email1));
		system.events.subscribe(ReportType.GENERAL, new SMSNotificationListener(num2));
		system.events.subscribe(ReportType.GENERAL, new EmailNotificationListener(num2));

		system.events.notify(new Report(ReportType.SPORTS, "Wariors Won!!"));
		system.events.notify(new Report(ReportType.GENERAL, "Peace finally arrived to the middle east"));
		system.events.notify(new Report(ReportType.WEATHER, "Volcano errapted in Hawaii"));


	}

}
