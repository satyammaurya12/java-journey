
public class Exceptiondemo {

    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
        } catch (Exception e) {
            System.out.println("cannot divide by zero");
        }
        System.out.println("Program continues......");
    }
}
