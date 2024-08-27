package se.liu.noaan869.calendar;

public class Appointment {

	private String subject; 
	private SimpleDate date; 
	private TimeSpan timeSpan;
	
	
	public String getSubject() {
		return subject;
	}
	public SimpleDate getDate() {
		return date;
	}
	public TimeSpan getTimeSpan() {
		return timeSpan;
	}
	
	
	public Appointment(String subject, SimpleDate date, TimeSpan timeSpan) {
		super(); 
		this.subject = subject; 
		this.date = date; 
		this.timeSpan = timeSpan;
	}
	
	
	@Override
	public String toString() {
		return date.toString() + " - " + timeSpan.toString();
	}
	
	
	
	
}
