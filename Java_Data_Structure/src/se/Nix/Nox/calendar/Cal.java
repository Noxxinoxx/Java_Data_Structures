package se.liu.noaan869.calendar;

import java.util.ArrayList;
import java.util.List;

public class Cal {

	private List<Appointment> appointments;
	
	
	public Cal() {
		super();
		this.appointments = new ArrayList<>();
	}


	public void show() {
		for(int i = 0; i < appointments.size(); i++) {
			System.out.println(appointments.get(i));
		}
	}
	
	
	public void book(int year, String month, int day ,int startHour, int startMinute, int endHour, int endMinute, String subject) {
		Month m = new Month("January", 10, 1); 
		if(
			year > 1970 && 
			(0 <= startHour && startHour <= 23) && (0 <= startMinute && startMinute <= 59) && 
			(0 <= endHour && endHour <= 23) && (0 <= startMinute && startMinute <= 59) &&
			m.getMonthDays(month) != -1 && m.getMonthDays(month) >= day) {
			
			
			Month m2 = new Month(month, day, m.getMonthDays(month)); 
			SimpleDate s = new SimpleDate(year, m2, day);
			TimePoint tS = new TimePoint(startHour, startMinute);
			TimePoint tE = new TimePoint(endHour, endMinute);
			
			TimeSpan timespan = new TimeSpan(tS, tE); 
			Appointment a = new Appointment(subject,s,timespan);
			
			appointments.add(a);
			
		}else {
			throw new IllegalArgumentException("n�got object �r fel!");
		}
		
		
		
	}
	
	
	
}
