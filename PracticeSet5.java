public class PracticeSet5 {
    public static void question1(){
        int rows = 5;

        for (int i = rows; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println(); // Move to the next line
        }
    }

    public static void question2(int n){
         
        int sum = 0;
        int currentEvenNumber = 2; // Starting from the first even number

        int count = 0;
        while (count < n) {
            sum += currentEvenNumber;
            currentEvenNumber += 2; // Move to the next even number
            count++;
        }

        System.out.println("Sum of first " + n + " even numbers is: " + sum);
    }

    public static void question3(int n){
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

    public static void question4(){
        int n =10;
        for (int i = 10; i >= 1; i--) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

    public static void question5(int n){
        int number = n;
        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of " + number + " is: " + factorial);
    }

    public static void main(String[] args) {
        
        System.out.println("Question 1:");
        question1();

        
        System.out.println("\nQuestion 2:");
        question2(5); 

        
        System.out.println("\nQuestion 3:");
        question3(7); 

        
        System.out.println("\nQuestion 4:");
        question4();

       
        System.out.println("\nQuestion 5:");
        question5(5); 
    }


}
