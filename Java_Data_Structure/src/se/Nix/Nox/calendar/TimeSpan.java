package se.liu.noaan869.calendar;

public class TimeSpan {

	private TimePoint start; 
	private TimePoint end;
	
	
	public TimeSpan(TimePoint start, TimePoint end) {
		super();
		this.start = start;
		this.end = end;
	}
	
	
	public TimePoint getStart() {
		return start;
	}
	
	public TimePoint getEnd() {
		return end;
	}
	
	
	

	@Override
	public String toString() {
		return start.toString() + " - " + end.toString();
	}
}
