abstract class Pen{
    abstract void write();
    abstract void refill();
}
// Q2
class FountainPen extends Pen{
    @Override
    void write() {
        System.out.println("Writing....");
    }
    @Override
    void refill() {
        System.out.println("Refilling....");
    }
    void changeNib(){
        System.out.println("Changing the Nib....");
    }
}
public class Q1_2 {
    public static void main(String[] args) {
        FountainPen fountainPen = new FountainPen();
        fountainPen.write();
        fountainPen.refill();
        fountainPen.changeNib();
    }
}