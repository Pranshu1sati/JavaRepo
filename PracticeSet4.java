import java.util.Scanner;
import java.util.Random;

public class PracticeSet4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1 = stone, 2 = paper, 3 = scissor, Now enter what you want to pick: ");
        int a = sc.nextInt();

        String[] choices = {"stone", "paper", "scissor"};

        // Assuming a valid input (1, 2, or 3)
        System.out.println("You have picked " + choices[a - 1] + ".");

        Random ran = new Random();
        int b = ran.nextInt(1, 4);

        System.out.println("PC has picked " + choices[b - 1] + ".");

        if (a == b) {
            System.out.println("The game is draw");
        } else if ((a == 1 && b == 3) || (a == 2 && b == 1) || (a == 3 && b == 2)) {
            System.out.println("You are the winner");
        } else {
            System.out.println("PC is the winner");
        }

        sc.close();
    }
}
