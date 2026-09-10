
import java.util.ArrayList;

class Arraylist {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Mango");
        list.add("Banana");
        list.add("Orange");
        System.out.println("First element : " + list.get(0));
        list.remove("banana");
        System.out.println("After removing : " + list);
        System.out.println("Size: " + list.size());
        System.out.println("Elements: ");
        for (String fruit : list) {
            System.out.println(fruit);
        }
    }

}
