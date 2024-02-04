package shape;

public class Circle extends Task2 {
    double radius;

    // Constructors
    public Circle(double radius) {
        this.radius = radius;
    }

    // Getters and setters
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calcVolume() {
        // Volume of a circle is not defined
        return 0.0;
    }

    public double calcSurfaceArea() {
        return Math.PI * radius * radius;
    }
    public static void main(String[] args) {
        Circle c1 = new Circle(4.6);
        System.out.println(c1.calcSurfaceArea());
    }
}