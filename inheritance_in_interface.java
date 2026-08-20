interface Animal{
    void eat();
}
interface Dog extends Animal{
    void bark();
}
class Puppy implements Dog{
    public void eat(){
        System.out.println("Puppy eats food");
    }
    public void bark(){
        System.out.println("Puppy barks....");
    }
}
public class inheritance_in_interface{
    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.eat();
        p.bark();
    }
}
