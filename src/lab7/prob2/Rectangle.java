package lab7.prob2;

public class Rectangle implements Polygon {
	private double length, width;

//	private double[] sides = new double[4];
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
//		sides[0] =
	}

	@Override
	public double[] getSides() {
		return new double[] { length, width, length, width };
	}

	// @Override
	// public double computePerimeter() {
	// return 2 * length + 2 * width;
	// }

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

}
