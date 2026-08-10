public class oops{
    String name;
    void showName(){
        System.out.println("Name: "+ name);
    }
    public static void main(String[] args) {
        oops s = new oops();
        s.name = "Satyam";
        s.showName();
    }
}