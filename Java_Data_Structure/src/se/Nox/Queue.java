package se.liu.noaan869.Labb3;

import java.util.ArrayList;

import se.liu.noaan869.lab1.Person;

public class Queue extends ListManager {
	//not done fix.

	public Queue() {
		super(new ArrayList<Person>());

	}
	public void enqueue(Person e) {
		add(e);
	}

	public Person dequeue() {
		return remove(0);
	}
}
