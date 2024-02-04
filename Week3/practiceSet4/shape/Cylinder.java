package shape;

public class Cylinder extends Circle {
    double height;

    // Constructors
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    // Getter and setter for height
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double calcVolume() {
        return Math.PI * super.getRadius() * super.getRadius() * height;
    }

    public double calcSurfaceArea() {
        return 2 * Math.PI * super.getRadius() * (super.getRadius() + height);
    }
    public static void main(String[] args) {
        Cylinder cy1 = new Cylinder(3.0, 5.0);
        System.out.println("Surface area of cylinder: " + cy1.calcSurfaceArea());
        System.out.println("Volume of cylinder: " + cy1.calcVolume());
    }
}