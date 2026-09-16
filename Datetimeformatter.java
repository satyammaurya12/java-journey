
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Datetimeformatter {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String dateString = "16-09-2026 21:30:45";
        LocalDateTime dateTime = LocalDateTime.parse(dateString, formatter);
        System.out.println("Parsed DateTime: " + dateTime);

    }
}
