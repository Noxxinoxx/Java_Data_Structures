package se.liu.noaan869.Labb3;

import java.util.ArrayList;

import se.liu.noaan869.lab1.Person;

public class Stack extends ListManager {
	
	public Stack() {
		super(new ArrayList<Person>());
	}

	public void push(Person e) {
		add(e);
	}
	
	public Person pop() {
		return remove(elements.size() - 1);
	}
	
	
}
