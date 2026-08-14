class Animal {
    void sound (){
        System.out.println("Animal makes a noise");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dogs barks");
    }
}
public class inheritance{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        d.bark();
    }
}