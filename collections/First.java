package collections;
import java.util.*;
public class First {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("Java");
        list.add("Programming");

        System.out.println("ArrayList: " + list);

        // Using for-each loop to iterate through the ArrayList
        System.out.println("Iterating using for-each loop:");
        for (String str : list) {
            System.out.println(str);
        }

        // Using iterator to iterate through the ArrayList
        System.out.println("Iterating using iterator:");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Methods of ArrayList
        System.out.println("Size of ArrayList: " + list.size());
        System.out.println("Element at index 1: " + list.get(1));       
        list.remove(2);
        System.out.println("ArrayList after removing element at index 2: " + list);
        list.clear();
        System.out.println("ArrayList after clearing: " + list);





        
}
}
