import folder.folderl1.folderl2.*;
import shape.*;
public class Q4 {
    protected int proInt = 45;
    int defInt = 75;
    public static void main(String[] args) {
        Q3 q3Instance = new Q3();
        System.out.println("Folder nestig");

        Square sq = new Square(50);
        System.out.println("The Area of Square is :"+ sq.calcSurfaceArea());
        System.out.println("The Area of Square is :"+ sq.calcParameter());
    }
}

