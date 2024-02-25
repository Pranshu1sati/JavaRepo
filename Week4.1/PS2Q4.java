import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PS2Q4 {

    public static void main(String[] args) {
        // Get the current date and time using LocalDateTime
        LocalDateTime now = LocalDateTime.now();

        // Create a DateTimeFormatter with the desired format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss a");

        // Format and print the time
        String formattedTime = formatter.format(now);
        System.out.println("Current time: " + formattedTime);
    }
}