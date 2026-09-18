
interface Greeting {

    void sayHello();
}

public class Lambda {

    public static void main(String[] args) {
        Greeting obj = () -> {
            System.out.println("Hello from Lamda Expression");
        };
        obj.sayHello();

    }
}
