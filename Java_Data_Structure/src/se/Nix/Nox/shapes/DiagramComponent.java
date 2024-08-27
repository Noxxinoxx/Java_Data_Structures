package se.liu.noaan869.shapes;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class DiagramComponent extends JComponent {   
	
	private ArrayList<Shape> shapes;
	
	
	public DiagramComponent() {
		this.shapes = new ArrayList<Shape>();
	}
	
	public void addShape(Shape s) {
		shapes.add(s);
	}
	
    @Override 
    protected void paintComponent(final Graphics g) {
    	super.paintComponent(g);
    	for(Shape e: shapes) {
    		e.draw(g);
    	}

    }
}