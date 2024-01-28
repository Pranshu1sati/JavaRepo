package Week2.PracticeSet3;

class TommyVecetti{
    public void hitting(){
        System.out.println("Hitting...");
    }
    public void running(){
        System.out.println("Running...");
    }
    public void firing(){
        System.out.println("Firing...");
    }
}
public class Q5 {
    public static void main(String[] args) {
        TommyVecetti player = new TommyVecetti();
        player.running();
        player.hitting();
        player.firing();
    }
}