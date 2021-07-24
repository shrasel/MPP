package lab3.prob3b;

public class Cylinder {
    private double height;
    private Circle circle;

    public Cylinder(double radius, double height) {
        this.height = height;
        circle = new Circle(radius);
    }

    public double computeVolume() {
        return circle.computeArea() * height;
    }
}
