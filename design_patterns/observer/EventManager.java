package javabootcamp.design_patterns.observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventManager {
	
	Map<ReportType, List<EventListener>> listeners = new HashMap<>();

	public EventManager(ReportType... reportTypes) {
        for (ReportType type : reportTypes) {
            this.listeners.put(type, new ArrayList<>());
        }
    }

    public void subscribe(ReportType reportType, EventListener listener) {
        List<EventListener> users = listeners.get(reportType);
        users.add(listener);
    }

    public void unsubscribe(ReportType reportType, EventListener listener) {
        List<EventListener> users = listeners.get(reportType);
        users.remove(listener);
    }

    public void notify(Report report) {
        List<EventListener> users = listeners.get(report.type);
        for (EventListener listener : users) {
            listener.update(report);
        }
    }
}
