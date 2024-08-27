package se.liu.noaan869.shapes;

import java.awt.Color;
import java.util.ArrayList;

public class CircleTest {

	public static void main(String[] args) {
		ArrayList<Circle> c = new ArrayList<Circle>();
		c.add(new Circle(10, 10, 1, Color.BLUE));
		c.add(new Circle(9, 67, 10, Color.GREEN));
		c.add(new Circle(2, 6, 100, Color.BLACK));
		c.add(new Circle(4, 0, 2, Color.PINK));
		c.add(new Circle(5, 20, 9, Color.CYAN));
		
		
		for(AbstractShape e: c) {
			
			System.out.println("x: " + e.getX() + " y: " + e.getY());
		}
		
		
		
	}
	
	
}
