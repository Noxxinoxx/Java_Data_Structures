package se.liu.noaan869.calendar;

import java.util.ArrayList;
import java.util.Random;

public class Test {

	public static void main(String[] args) {
		//test for calender;
		
		
		ArrayList<String> arr = new ArrayList<String>();
		
		arr.add("January");
		arr.add("February");
		arr.add("March");
		arr.add("April");
		arr.add("May");
		arr.add("June");
		arr.add("July");
		arr.add("August"); 
		arr.add("September");
		arr.add("October");
		arr.add("November");
		arr.add("December");
		
		Cal A = new Cal();
		Random r = new Random();
		
		
		for(int i = 0; i < 10; i++) {
			int month = r.nextInt(12);
			
			A.book(2010,  arr.get(month), r.nextInt(30), r.nextInt(24), r.nextInt(59), r.nextInt(24), r.nextInt(59), "test testsson");
			
			A.show();
			
		}
		
		
			
			
		
	}
	
	
	
	
	
	
	
}
