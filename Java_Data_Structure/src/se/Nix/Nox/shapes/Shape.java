package se.liu.noaan869.shapes;

import java.awt.Color;
import java.awt.Graphics;

public interface Shape {
	
	public void draw(Graphics g);
	
	public int getRadius();

	public int getX();

	public int getY();

	public Color getColor();

}
