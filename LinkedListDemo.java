
import java.util.LinkedList;


class LinkedListDemo {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("apple");
        list.add("banana");
        list.add("Mango");
        System.out.println("LinkedList : " +list);
        list.addFirst("orange");
        list.addLast("Grapes");
        System.out.println("after removing: " +list);
        System.out.println("first element: "+list.getFirst());
        System.out.println("elements:");
        for(String fruit : list){
            System.out.println(fruit);
        }

    }
}
