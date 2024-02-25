import java.util.HashSet;

public class PS2Q5 {

    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();

        names.add("Pranshu");
        names.add("Harsh");
        names.add("Arnav");
        names.add("Pranshu"); // Duplicate

        System.out.println("Number of names: " + names.size()); // Prints 3 (only unique elements)

        // Checking for specific element (same principle applies to all elements)
        if (names.contains("Pranshu")) {
            System.out.println("Pranshu is present in the set.");
        } else {
            System.out.println("Pranshu is not present in the set."); // Won't be printed
        }
        for (String s : names){
            System.out.println(s+" Occurs Once");
        }
    }
}