package se.liu.noaan869.shapes;

import java.awt.Color;
import java.awt.Graphics;

public class Rect extends AbstractShape {
	private int width,height;
	
	
	
	public Rect(int x, int y, int width, int height, Color color) {
		super(x,y,color);
		this.width = width;
		this.height = height;
	}
	
	@Override
	public String toString() {
		return "x: " + this.getX() + " y: " + this.getY() + " width: " + this.getWidth() + " height: " + this.getHeight();
	}
	
	@Override
	public void draw(Graphics g) {
		g.setColor(color);
	    g.drawRect(x, y, width, height);
	}

	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}

	@Override
	public int getRadius() {
		// TODO Auto-generated method stub
		return 0;
	}

}
