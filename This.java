class Animal {
    String name;

    Animal(String name) {
        this.name = name;       // this refers to current class variable
    }

    void show() {
        System.out.println("Animal name: " + name);
    }
}

class Dog extends Animal {
    String name;

    Dog(String name) {
        super(name);            // Calls parent class constructor
        this.name = name;       // Refers to Dog's variable
    }

    void show() {
        System.out.println("Dog name: " + this.name);
        System.out.println("Animal name: " + super.name);
        super.show();           // Calls parent class method
    }
}

public class This  {
    public static void main(String[] args) {
        Dog d = new Dog("Bruno");
        d.show();
    }
}