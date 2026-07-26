

public class variable_datatype_operators {
    public static void main(String[] args) {

        // Variables with different Data Types
        int age = 20;
        double salary = 25000.50;
        char grade = 'A';
        boolean isStudent = true;
        String name = "Rahul";

        // Arithmetic Operator
        int marks1 = 80;
        int marks2 = 90;
        int total = marks1 + marks2;

        // Relational Operator
        boolean result = marks1 > marks2;

        // Logical Operator
        boolean eligible = (age >= 18 && isStudent);

        // Output
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Grade: " + grade);
        System.out.println("Is Student: " + isStudent);

        System.out.println("Total Marks: " + total);
        System.out.println("Marks1 > Marks2: " + result);
        System.out.println("Eligible: " + eligible);

        // Increment Operator
        age++;
        System.out.println("Age after increment: " + age);
    }
}