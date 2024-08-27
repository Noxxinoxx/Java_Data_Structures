package se.liu.noaan869.lab1;

import java.time.LocalDate;
import java.time.Year;

public class Person {
	
	private String name;
	private LocalDate birthDay;
	
	
	public Person(String name, LocalDate birthDay) {
		super(); 
		this.name = name; 
		this.birthDay = birthDay;
	}
	
	public int getAge() {
		
		int yourYear = birthDay.getYear();
		
		int currentYear = Year.now().getValue();
		
		return currentYear - yourYear;
	}
	
	@Override
	public String toString() {
		return name + " " + getAge();
	}
	
	public static void main(String[] args) {
		//Yes is got a Person object as the return if I printed the person obj.
		LocalDate birth = LocalDate.of(2002, 7, 5);
		Person person = new Person("Noa", birth);
		System.out.println(person.toString());
		
	}
}
