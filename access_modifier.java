
class Student {

    public String name = "Rahul";
    private int age = 18;
    protected String city = "lucknow";
    String college = "ABC college";

    public void show() {
        System.out.println("Name" + name);
        System.out.println("age" + age);
        System.out.println("City" + city);
        System.out.println("College" + college);

    }

}

public class access_modifier {

    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.name);
        System.out.println(s.city);
        System.out.println(s.college);
        System.out.println();
        s.show();
    }
}
