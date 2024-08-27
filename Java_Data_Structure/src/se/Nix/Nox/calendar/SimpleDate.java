package se.liu.noaan869.calendar;

public class SimpleDate {

	public int year; 
	public Month month;
	public int day;
	
	
	public SimpleDate(int year, Month month, int day) {
		super(); 
		this.year = year; 
		this.month = month;
		this.day = day;
	}
	
	public int getYear() {
		return year;
	}
	public Month getMonth() {
		return month;
	}
	public int getDay() {
		return day;
	}
	
	@Override
	public String toString() {
		return Integer.toString(day) + "/" + Integer.toString(month.getMonthNumber(month.getName())) + " - " + Integer.toString(year);
	}
	
	
}
