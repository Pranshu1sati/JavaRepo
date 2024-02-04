package shape;

public class Square extends Rectangle {
    // Constructor
    public Square(double side) {
        super(side, side);
    }

    public double calcVolume() {
        // Volume of a square is not defined
        return 0.0;
    }

    public double calcSurfaceArea() {
        return super.getLength() * super.getLength() ;
    }
    public double calcParameter() {
        return super.getLength() *4;
    }

    public static void main(String[] args) {
        Square s1 = new Square(4.1);
        System.out.println(s1.calcSurfaceArea());
    }
}
