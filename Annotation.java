class Student {

    @Override
    public String toString() {
        return "Student Class";
    }
}

public class Annotation {
    public static void main(String[] args) {

        Student s = new Student();

        System.out.println(s.toString());
    }
}