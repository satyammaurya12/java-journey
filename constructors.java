
class Student {

    String name;
    int age;

    Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name" + name);
        System.out.println("age" + age);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Satyam",18);
        Student s2 = new Student("Aman",19);
        s1.display();
        s2.display();
    }
}
