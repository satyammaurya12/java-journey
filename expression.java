public class expression
{
    public static void main(String[] args) {
        int a = 10;
        double b = 5.5;
        double result = a+b;
        System.err.println(result);
        System.err.println("post increment"+(a++));
        System.err.println("after increment"+a);
        System.err.println(" pre decrement" +(--a));
        System.err.println("final value "+a);
        
    }
}