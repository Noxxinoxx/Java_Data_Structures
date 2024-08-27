package se.liu.noaan869.calendar;

public class TimePoint {

	
	public int hour; 
	public int minute;
	
	public TimePoint(int hour, int minute) {
		super();
		this.hour = hour; 
		this.minute = minute;
	}
	
	public int getHour() {
		return hour;
	}
	public int getMinute() {
		return minute;
	}
	@Override
	public String toString() {
		return Integer.toString(hour) + ":" + Integer.toString(minute);
	}
	
}
