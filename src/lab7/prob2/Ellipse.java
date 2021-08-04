package lab7.prob2;

public class Ellipse implements ClosedCurve {

	private double semiMA;
	private double ellip;

	public Ellipse(double a, double e) {
		this.semiMA = a;
		this.ellip = e;
	}

	public double getA() {
		return semiMA;
	}

	public void setA(double a) {
		this.semiMA = a;
	}

	public double getE() {
		return ellip;
	}

	public void setE(double e) {
		this.ellip = e;
	}

	@Override
	public double computePerimeter() {
		return 4 * semiMA * ellip;
	}
}
