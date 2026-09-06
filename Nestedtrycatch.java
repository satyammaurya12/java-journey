
public class Nestedtrycatch {

    public static void main(String[] args) {
        try {
            System.out.println("Outer try block");
            try {
                System.out.println("Inner try block");
                int a = 10 / 0;
            } catch (ArithmeticException e) {
                System.out.println("Inner catch :cannot divide by zero");
                int[] numbers = {1,2,3};
            }
        } catch (ArrayIndexOutOfBoundsException e) {System.out.println("Outer catch:Array index is out of bounds");
        }
        System.out.println("Program continues....................");
    }
}
