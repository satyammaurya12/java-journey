
import java.util.HashSet;

public class  hashset{
    public static void main(String[] args) {
        HashSet<Integer>set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(10);
        set.add(30);
        System.out.println("HashSet: "+set);
        System.out.println("Contains 20: " +set.contains(20));
        set.remove(10);
        System.out.println("After removal: "+set);
    }

}