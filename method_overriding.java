class Vehicle{
    void start(){
        System.out.println( " Vehicle starts");
    }
}
class Car extends Vehicle{
    void start(){
        System.out.println("Car starts with a key");
    }
}
public class method_overriding{
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
    }
}