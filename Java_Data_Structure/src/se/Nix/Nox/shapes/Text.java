package se.liu.noaan869.shapes;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class Text extends AbstractShape {
	

	private int size;
	private String text;
	
	
	public Text(int x, int y, int size, Color color, String text) {
		super(x,y,color); 
		this.size = size; 
		this.text = text;
	}
	
	@Override
	public String toString() {
		return "x: " + this.getX() + " y: " + this.getY() + " size: " + this.getSize() + " text: " + this.getText(); 
	}
	

	public int getSize() {
		return size;
	}

	public String getText() {
		return text;
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(color);
	    g.setFont(new Font("serif", Font.PLAIN, size));
	    g.drawString(text, x, y);
	}

	@Override
	public int getRadius() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
}
