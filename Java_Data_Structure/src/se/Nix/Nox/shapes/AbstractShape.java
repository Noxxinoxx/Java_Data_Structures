package se.liu.noaan869.shapes;

import java.awt.Color;
import java.util.Objects;

public abstract class AbstractShape implements Shape{
	

	protected int x;
	protected int y;
	protected Color color;

	

	public AbstractShape(int x, int y, Color color) {
		super();
		this.x = x;
		this.y = y;
		this.color = color;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public Color getColor() {
		return color;
	}

	@Override
	public int hashCode() {
		return Objects.hash(color, x, y);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AbstractShape other = (AbstractShape) obj;
		return Objects.equals(color, other.color) && x == other.x && y == other.y;
	}
	
	
}
