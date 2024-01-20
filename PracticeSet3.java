import java.util.ArrayList;
import java.util.List;

public class PracticeSet3 {

    public static String Question1(String Name) {
        return Name.toLowerCase();
    }

    public static String Question2(String input) {
        return input.replace(" ", "_");
    }

    public static String Question3(String Name) {
        String a = "Dear , how are you?";
        return a.replaceFirst(",", Name + ","); // Corrected replacement
    }

    public static String Question4(String Input) {
        int i1 = Input.indexOf("  ");
        int i2 = Input.indexOf("   ");
        String ans1 = "the index of double space: " + i1;
        String ans2 = " the index of triple space: " + i2;
        return ans1 + ans2;
    }

    public static void Question4Modified(String Input) {
        List<Integer> doubleSpaceIndexes = new ArrayList<>();
        List<Integer> tripleSpaceIndexes = new ArrayList<>();

        for (int i = 0; i < Input.length(); i++) {
            if (i < Input.length() - 1 && Input.charAt(i) == ' ' && Input.charAt(i + 1) == ' ') {
                doubleSpaceIndexes.add(i);
            }
            if (i < Input.length() - 2 && Input.charAt(i) == ' ' && Input.charAt(i + 1) == ' ' && Input.charAt(i + 2) == ' ') {
                tripleSpaceIndexes.add(i);
            }
        }
        
        for (int k : doubleSpaceIndexes) System.out.println("Double space at: " + k);
        for (int j : tripleSpaceIndexes) System.out.println("Triple space at: " + j);
    }

    public static void question5(String Input) {
        String[] words = Input.split("\\s+");
        StringBuilder output = new StringBuilder();
        int wordCount = 0;

        for (String word : words) {
            output.append(word).append(" ");
            wordCount++;

            if (wordCount % 2 == 0) {
                output.append("\n");
            }
        }

        System.out.println(output.toString().trim());
    }

    public static void main(String[] args) {
        // Test the methods here
        System.out.println(Question1("ExampleName"));
        System.out.println(Question2("This is a test"));
        System.out.println(Question3("Harry"));
        Question4Modified("This  is  a   test");
        question5("Dear Ma'am nice training thankyou");
    }
}
