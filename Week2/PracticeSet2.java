import java.util.Scanner;

public class PracticeSet2 {
    static void printTable(int num){
        for (int i = 1; i <= 10; i++){
            System.out.println(num+" X "+i+" = "+num*i);
        }
    }
    static void printPattern(int n){
        // half pyramid
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static int sumOfNaturalNumsRecursive(int limit){
        // base condition -> limit will stop at 1
        if (limit==1){
            return 1;
        }
        return limit+(sumOfNaturalNumsRecursive(limit-1));
    }
    static void printPattern2(int n){
        // ulta half pyramid
        for (int i = n; i > 0; i--){
            for (int j = 0; j < i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static int printFibonacci(int num){
        if (num==1 || num==2){
            return num-1;
        }
        return printFibonacci(num-1)+printFibonacci(num-2);
    }

    static float findAverage(float ...nums){
        float avg = 0;
        for (float num:nums){
            avg += num;
        }
        return avg/ nums.length;
    }

    static float temperatureConv(float tempCel){
        return ((tempCel*9/5.0f)+32.0f);
    }


    static void printPatternRecursive(int n){
        if (n>0){
            for (int i = n; i > 0; i--){
                System.out.print("*");
            }
            System.out.println();
            printPatternRecursive(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        // Call printTable
        System.out.print("Enter a number for the multiplication table: ");
        int number = inp.nextInt();
        printTable(number);

        // Call printPattern
        System.out.print("Enter the number of rows for the half pyramid pattern: ");
        int rows = inp.nextInt();
        printPattern(rows);

        // Call sumOfNaturalNumsRecursive
        System.out.print("Enter the limit for the sum of natural numbers: ");
        int limit = inp.nextInt();
        System.out.println("Sum of natural numbers up to " + limit + ": " + sumOfNaturalNumsRecursive(limit));

        // Call printPattern2
        System.out.print("Enter the number of rows for the inverted half pyramid pattern: ");
        int invertedRows = inp.nextInt();
        printPattern2(invertedRows);

        // Call printFibonacci
        System.out.print("Enter the position for Fibonacci sequence: ");
        int fibNum = inp.nextInt();
        System.out.println(fibNum + "th number in Fibonacci sequence: " + printFibonacci(fibNum));

        // Call findAverage
        System.out.println("Enter three numbers to find their average: ");
        float num1 = inp.nextFloat();
        float num2 = inp.nextFloat();
        float num3 = inp.nextFloat();
        System.out.println("Average: " + findAverage(num1, num2, num3));

        // Call temperatureConv
        System.out.print("Enter temperature in Celsius to convert to Fahrenheit: ");
        float tempCel = inp.nextFloat();
        System.out.println("Temperature in Fahrenheit: " + temperatureConv(tempCel));

        // Call printPatternRecursive
        System.out.print("Enter the number of rows for the recursive pattern: ");
        int recursiveRows = inp.nextInt();
        printPatternRecursive(recursiveRows);

        inp.close();
    }
}
