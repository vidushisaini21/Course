package collections;
import java.util.*;
public class Set {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Hello");
        set.add("World");
        set.add("Java");
        set.add("Programming");
        set.add("Hello"); // Duplicate element, will not be added

        System.out.println("HashSet: " + set);

        // Using for-each loop to iterate through the HashSet
        System.out.println("Iterating using for-each loop:");
        for (String str : set) {
            System.out.println(str);
        }

        // Using iterator to iterate through the HashSet
        System.out.println("Iterating using iterator:");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Methods of HashSet
        System.out.println("Size of HashSet: " + set.size());
        System.out.println("Contains 'Java': " + set.contains("Java"));
        set.remove("World");
        System.out.println("HashSet after removing 'World': " + set);

        // TreeSet example
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(2);
        treeSet.add(8);
        treeSet.add(1);
        treeSet.add(9);

        System.out.println("TreeSet: " + treeSet);

        // Using for-each loop to iterate through the TreeSet
        System.out.println("Iterating using for-each loop:");
        for (Integer num : treeSet) {
            System.out.println(num);
        }

        // Using iterator to iterate through the TreeSet
        System.out.println("Iterating using iterator:");
        Iterator<Integer> treeIterator = treeSet.iterator();
        while (treeIterator.hasNext()) {
            System.out.println(treeIterator.next());
        }
    }
}
