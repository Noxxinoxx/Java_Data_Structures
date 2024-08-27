package se.liu.noaan869.Labb3;

import java.time.LocalDate;

import se.liu.noaan869.lab1.Person;

public class Test {
	
	
	public static void main(String[] args) {
		Stack s = new Stack();
		s.push(new Person("Noa", LocalDate.of(1, 3, 2)));
		s.push(new Person("f", LocalDate.of(10, 2, 3)));
		s.push(new Person("a", LocalDate.of(16, 1, 6)));
		s.push(new Person("g", LocalDate.of(19, 9, 2)));
		s.push(new Person("h", LocalDate.of(26, 6, 3)));
		
		
		while(s.isEmpty() != true) {
		
			System.out.println(s.pop());
			
		}
		
		Queue g = new Queue();
		g.enqueue(new Person("Noa", LocalDate.of(1, 3, 2)));
		g.enqueue(new Person("f", LocalDate.of(10, 2, 3)));
		g.enqueue(new Person("a", LocalDate.of(16, 1, 6)));
		g.enqueue(new Person("g", LocalDate.of(19, 9, 2)));
		g.enqueue(new Person("h", LocalDate.of(26, 6, 3)));
		
		
		while(g.isEmpty() != true) {
		
			System.out.println(g.dequeue());
			
		}
		
		
		
		
	}
	
	
}
