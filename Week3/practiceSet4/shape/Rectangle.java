package shape;

public class Rectangle extends Task2 {
    private double length;
    private double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Getters and setters
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

    public double calcVolume() {
        // Volume of a rectangle is not defined
        return 0.0;
    }

    public double calcSurfaceArea() {
        return length * width;
    }
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(12, 16);
        System.out.println(r1.calcSurfaceArea());
    }
}
