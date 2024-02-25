import java.util.ArrayList;

public class PS2Q1 {

    public static void main(String[] args) {

        // Create an ArrayList to store names
        ArrayList<String> names = new ArrayList<>();

        // Add 10 Indian boy names to the ArrayList
        names.add("Pranshu");
        names.add("Rahul");
        names.add("Aryan");
        names.add("Kartik");
        names.add("Vikram");
        names.add("Arjun");
        names.add("Siddhant");
        names.add("Kabir");
        names.add("Dev");
        names.add("Akshay");

        // Print the names using a for-each loop
        System.out.println("Names:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}