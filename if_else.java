
import java.util.Scanner;

public class if_else {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age of voter");
        int voter = sc.nextInt();
        if (voter > 18) {
            System.out.println("you can vote");

        } else {
            System.out.println("you cannot vote ");
        }
    }
}
