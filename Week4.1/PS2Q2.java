import java.text.SimpleDateFormat;
import java.util.Date;

public class PS2Q2 {

    public static void main(String[] args) {
        // Get the current date and time
        Date now = new Date();

        // Create a SimpleDateFormat object with the desired format
        SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:ss a");

        // Format and print the time
        String formattedTime = formatter.format(now);
        System.out.println("Current time: " + formattedTime);
    }
}