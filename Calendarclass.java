import java.util.Calendar;

public class Calendarclass {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();

        System.out.println("Current Date: "
                + cal.get(Calendar.DAY_OF_MONTH) + "/"
                + (cal.get(Calendar.MONTH) + 1) + "/"
                + cal.get(Calendar.YEAR));

        System.out.println("Current Time: "
                + cal.get(Calendar.HOUR_OF_DAY) + ":"
                + cal.get(Calendar.MINUTE) + ":"
                + cal.get(Calendar.SECOND));
    }
}