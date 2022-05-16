package javabootcamp.design_patterns.observer;

public class Report {

	protected ReportType type;
	protected String report;
	
	public Report(ReportType type, String report) {
		this.type = type;
		this.report = report;
	}
	
	
}
