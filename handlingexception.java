
public class handlingexception {

    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            System.out.println(a / b);

        } catch (ArithmeticException e) {
            System.out.println("cannot divide by zero");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array");
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format ");
        }
        System.out.println("Program continues......");
    }
}
