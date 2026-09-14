import java.util.GregorianCalendar;

public class Gregoriancalendar {
    public static void main(String[] args) {
        GregorianCalendar cal = new GregorianCalendar();

        System.out.println("Current Date: "
                + cal.get(GregorianCalendar.DAY_OF_MONTH) + "/"
                + (cal.get(GregorianCalendar.MONTH) + 1) + "/"
                + cal.get(GregorianCalendar.YEAR));

        System.out.println("Current Time: "
                + cal.get(GregorianCalendar.HOUR_OF_DAY) + ":"
                + cal.get(GregorianCalendar.MINUTE) + ":"
                + cal.get(GregorianCalendar.SECOND));
    }
}