import java.util.Calendar;

public class PS2Q3 {

    public static void main(String[] args) {
        // Get the current date and time using Calendar
        Calendar now = Calendar.getInstance();

        // Extract hour, minute, second, and AM/PM indicator
        int hour = now.get(Calendar.HOUR_OF_DAY);
        int minute = now.get(Calendar.MINUTE);
        int second = now.get(Calendar.SECOND);
        int amPm = now.get(Calendar.AM_PM);

        // Format the time string manually
        String formattedTime = String.format("%02d:%02d:%02d %s", hour, minute, second, amPm == Calendar.AM ? "AM" : "PM");

        // Print the formatted time
        System.out.println("Current time: " + formattedTime);
    }
}