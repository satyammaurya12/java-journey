
import java.util.Scanner;

public class else_if {

    public static void main(String[] args) {
        System.out.println(" Enter your age");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age < 5) {
            System.out.println("Child");
        } else if (age < 13) {
            System.out.println("Young child");
        } else if (age < 18) {
            System.out.println("Teenager");
        } else {
            System.out.println(" Adult");

        }

    }
}
