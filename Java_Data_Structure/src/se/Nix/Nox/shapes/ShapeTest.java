package se.liu.noaan869.shapes;

import java.awt.Color;
import java.util.ArrayList;

public class ShapeTest {

	public static void main(String[] args) {
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		shapes.add(new Circle(10,14,10, Color.black));
		shapes.add(new Rect(1,7,10,8, Color.black));
		shapes.add(new Circle(3,33,10, Color.black));
		shapes.add(new Circle(45,22,10, Color.black));
		shapes.add(new Circle(12,16,10, Color.black));
		shapes.add(new Text(10, 10, 2, Color.black, "hej"));
		
		for (Shape shape : shapes) {
		    shape.draw(null);
		    
		}
		
		
		
	}
	
	
}
