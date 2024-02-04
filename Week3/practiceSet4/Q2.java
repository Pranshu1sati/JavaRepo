import java.util.Scanner;

public class Q2 {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("What's your name ? ");
        String name = sc.nextLine();
        System.out.println("Hi you "+name+" !");
        sc.close();
    }
}
