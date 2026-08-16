
class Vehicle {

    void start() {
        System.out.println("Vehicle starts");

    }
}

class Car extends Vehicle {

    void start() {
        System.out.println("Car starts");
    }
}

class Bike extends Vehicle {

    void start() {
        System.out.println("Bike starts");
    }
}

public class dyndispatch {

    public static void main(String[] args) {
        Vehicle v;
        v = new Car();
        v.start();
        v = new Bike();
        v.start();
    }
}
