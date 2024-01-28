package Week2.PracticeSet3;

class CellPhone{
    public void ringing(){
        System.out.println("Ringing...");
    }
    public void vibrating(){
        System.out.println("Vibrating...");
    }
    public void calling(){
        System.out.println("Calling...");
    }
}
public class Q2 {
    public static void main(String[] args) {
        CellPhone cp = new CellPhone();
        cp.calling();
        cp.ringing();
        cp.vibrating();
    }
}