
import java.util.HashMap;

public class hashmap{
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put( 1, "Aman");
        map.put( 2, "Rahul");
        map.put( 3, "Priya");
        System.out.println("HashMap: " +map);
        System.out.println("Contains key 1: " +map.containsKey(1));
        map.remove(3);
        System.out.println("After deletion :" +map);
    }
}