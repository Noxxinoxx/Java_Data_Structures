package se.liu.noaan869.shapes;
import java.awt.Color;
import java.awt.Graphics;
public class Circle extends AbstractShape {

	@Override
	public void draw(Graphics g) {
		  g.setColor(color);
		  g.drawOval(x, y, radius, radius);
		  
	}

	private int radius;
	public Circle(int x, int y, int radius, Color color) {
		
		super(x,y,color);
		if (radius < 0) {
	        throw new IllegalArgumentException("Negativ radie!");
		}
		this.radius = radius; 
		
	}

	public int getRadius() {
		return radius;
	}

	
	
	
	
	
	
	
	
}
