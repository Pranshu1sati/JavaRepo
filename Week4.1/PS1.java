public class PS1 {

    public static void main(String[] args) {
        try {
            // Code that may throw exceptions
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[1]); 
            // ArrayIndexOutOfBoundsException
            // System.out.println(numbers[10]);
            try {
                // More code that may throw exceptions or errors
                // String text = null;
                String text="22";
                System.out.println(text.length()); // NullPointerException

            } catch (NullPointerException e) {
                System.out.println("NullPointerException caught: " + e.getMessage());
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        } catch (Exception e) {
            // Catch any other unexpected exceptions
            System.out.println("Unexpected exception caught: " + e.getMessage());
        } catch (Error e) {
            // Catch critical errors (usually indicate severe problems)
            System.out.println("Error caught: " + e.getMessage());
        } finally {
            // Code that always executes, regardless of exceptions or errors
            System.out.println("This code is always executed.");
        }

        System.out.println("Execution continues after try-catch blocks.");
    }
}