package se.liu.noaan869.Labb3;

import java.util.Iterator;
import java.util.List;

import se.liu.noaan869.lab1.Person;

public class ListManager {

	protected List<Person> elements;

	public ListManager(List<Person> elements) {
		this.elements = elements;
	}

	public int size() {
		return elements.size();
	}

	public boolean isEmpty() {
		return elements.isEmpty();
	}

	public boolean contains(Object o) {
		return elements.contains(o);
	}

	public void clear() {
		elements.clear();
	}

	public Iterator<Person> iterator() {
		return elements.iterator();
	}

	public boolean add(Person e) {
		return elements.add(e);
	}

	public Person remove(int o) {
		return elements.remove(o);
	}




}