package shape;

public class Sphere extends Circle {
    // Constructor
    public Sphere(double radius) {
        super(radius);
    }

    public double calcVolume() {
        return 1.33 * Math.PI * super.getRadius() * super.getRadius() * super.getRadius();
    }

    public double calcSurfaceArea() {
        return 4 * Math.PI * super.getRadius() * super.getRadius();
    }
    public static void main(String[] args) {
        Sphere sp1 = new Sphere(8.01);
        System.out.println("Volume of Sphere: " + sp1.calcVolume());
        System.out.println("Surface area of sphere: " + sp1.calcSurfaceArea());
    }
}