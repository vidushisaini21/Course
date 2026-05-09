package collections;
import java.util.*;

public class Map {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        map.put("Four", 4);

        System.out.println("HashMap: " + map);

        // Using for-each loop to iterate through the HashMap
        System.out.println("Iterating using for-each loop:");
        for(String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }

        // Using iterator to iterate through the HashMap
        // System.out.println("Iterating using iterator:");
        // Iterator<Entry<String, Integer>> iterator = map.entrySet().iterator();
        // while (iterator.hasNext()) {
        //     Entry<String, Integer> entry = iterator.next();
        //     System.out.println(entry.getKey() + ": " + entry.getValue());
        // }

        // Methods of HashMap
        System.out.println("Size of HashMap: " + map.size());
        System.out.println("Value for key 'Two': " + map.get("Two"));
        map.remove("Three");
        System.out.println("HashMap after removing key 'Three': " + map);
        map.clear();
        System.out.println("HashMap after clearing: " + map);

        // HashTable example
        Hashtable<String, Integer> hashtable = new Hashtable<>();   
        hashtable.put("A", 1);
        hashtable.put("B", 2);
        System.out.println("HashTable: " + hashtable);
    }


}
