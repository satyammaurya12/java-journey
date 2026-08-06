
public class array {

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("Element of the array are:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index" + i + " = " + numbers[i]);
        }
        System.out.println("Array length: " + numbers.length);
    }
}
