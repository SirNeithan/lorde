import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TellTime {
    public static void main(String[] args) {
        // Get the current time
        LocalTime currentTime = LocalTime.now();

        // Format the time using a DateTimeFormatter
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedTime = currentTime.format(formatter);

        // Print the current time
        System.out.println("Current time is: " + formattedTime);
    }
}
