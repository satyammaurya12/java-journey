public class varargs{
    static void sum(int... numbers) {
        int total = 0;

        for (int n : numbers) {
            total = total + n;
        }

        System.out.println("Sum = " + total);
    }

    public static void main(String[] args) {
        sum(10, 20);
        sum(10, 20, 30);
    }
}