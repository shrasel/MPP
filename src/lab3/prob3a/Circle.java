package lab3.prob3a;



public class Circle extends Cylinder {

    public Circle(double radius) {
        super(radius, 0);
    }

    @Override
    public double getRadius() {
        return super.getRadius();
    }

    public double computeArea() {
        return Math.PI * this.getRadius() * this.getRadius();
    }
}
