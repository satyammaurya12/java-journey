class Animal{
    Animal(){
        System.out.println("Animal constructor is called");
    }
}
class Dog extends Animal{
    Dog(){
        super();
        System.out.println("Dog constructor is called");
    }
}
public class constructor_inheritance{
    public static void main(String[] args) {
        Dog d = new Dog();
    }
}
