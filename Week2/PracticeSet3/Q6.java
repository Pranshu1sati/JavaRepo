package Week2.PracticeSet3;

class Circle{

    float radius;
    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float calculateArea(){
        return (float) (Math.PI*radius*radius);
    }
    public float calculatePerimeter(){
        return (float) (2*Math.PI*radius);
    }

}
public class Q6 {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.setRadius(13);
        System.out.println("Area: "+c.calculateArea()+" for Radius: "+c.radius);
        System.out.println("Perimeter: "+c.calculatePerimeter()+" for Radius: "+c.radius);
    }
}