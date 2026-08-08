public class method_overloading{
    static void show( int a) {
        System.out.println("Number" + a);
    }
    static void show( String name){
        System.out.println("Name:" + name);
    }
    public static void main(String[] args) {
        show(10);
        show("satyam");
       
    }
}