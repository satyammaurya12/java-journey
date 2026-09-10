
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

class Collectiondemo {

    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("satyam");
        students.add("naimish");
        students.add("Rudra");
        students.add("jitu");
        System.out.println("Students are: " + students);
        students.add("riya");
        students.remove("satyam");
        System.out.println("After change the list of students the name is : " + students);
        System.out.println("Students name : ");
        for (String name : students) {
            System.out.println(name);
        }
        HashSet<Integer> marks = new HashSet<>();
        marks.add(80);
        marks.add(90);
        marks.add(75);
        marks.add(80);
        System.out.println("Marks : " + marks);
        HashMap<Integer, String> map = new HashMap<>();
        map.put(101, "rahul");
        map.put(102, "Priya");
        map.put(103, "Neha");
        System.out.println("student Details: " +map);
        System.out.println("student with id 102: " +map.get(102));
    }
}
