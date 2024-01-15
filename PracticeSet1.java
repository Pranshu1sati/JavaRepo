import java.util.Scanner;
import java.util.*;

public class PracticeSet1 {
    public static void Question1(int a, int b, int c) {
        System.out.println("Question 1 Answer " + a + b + c);
    }

    public static float Question2(float a, float b, float c) {
        return ((a + b + c) / 3);
    }

    public static void Question3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name for Question 3:");
        String name = sc.nextLine();
        System.out.println("Hello " + name + " have a good day");
        sc.close();
    }

    public static double Question4(double kilometers) {
        return kilometers * 0.621371;
    }

    public static void Question5() {
        System.out.println("Enter any number for Question 5:");
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.hasNextInt());
        sc.close();
    }

    public static void main(String[] args) {
        // Calling Question 1
        System.out.println("Calling Question 1");
        Question1(1, 2, 3);

        // Calling Question 2
        System.out.println("Calling Question 2");
        float average = Question2(1.0f, 2.0f, 3.0f);
        System.out.println("The average is: " + average);

        // Calling Question 3
        System.out.println("Question 3");
        Question3(); 

        // Calling Question 4
        System.out.println("Calling Question 4\n"+ "enter your kilometers");
        double miles = Question4(10.0);
        System.out.println("10 kilometers is " + miles + " miles.");

        // Calling Question 5
        System.out.println("Calling Question 5");
        Question5(); 
    
    }
}
