package eecs1021.lab5;
//ALREADY IMPLEMENTED; DO NOT MODIFY
public class Rectangle {
	private int width = 0;
	private int height = 0;

	public Rectangle(int w, int h) {
		this.width = w;
		this.height = h;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public int getArea() {
		return this.width * this.height;
	}

	public int getCircumference() {
		return 2 * (this.height + this.width);
	}

	@Override
	public String toString() {
		return "Rectangle{width=" + width + ", height=" + height + "}";
	}

	@Override
	public boolean equals(Object other) {
		if (this == other)
			return true;
		if (other == null || getClass() != other.getClass())
			return false;
		Rectangle rectangle = (Rectangle) other;
		return getWidth() == rectangle.getWidth() && getHeight() == rectangle.getHeight();
	}

}
