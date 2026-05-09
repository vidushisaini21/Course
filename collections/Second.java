package collections;
import java.util.*;
import java.util.function.Consumer;
public class Second {
    public static void main(String[] args) {

        Comparator<Integer> com = new Comparator<Integer>() {
            public int compare(Integer a, Integer b){
                if(a%10 > b%10)
                    return 1;
                else 
                    return -1;
            }
        };
        
        List<Integer> nums = new ArrayList<>();
        nums.add(7);
        nums.add(3);
        nums.add(8);
        nums.add(5);

        Collections.sort(nums);
        System.out.println("Sorted List: " + nums);

        // Enhanced for loop to iterate through the sorted list
        System.out.println("Iterating using enhanced for loop:");
        for (Integer num : nums) {
            System.out.println(num);
     }

        // asList method to create a list from an array
        Integer[] arr = {10, 20, 30, 40};
        List<Integer> listFromArray = Arrays.asList(arr);
        System.out.println("List from array: " + listFromArray);

        // apply filter
        int sum = 0;
        for(int n : nums){
            if(n%2==0){
                n=n*2;
                sum = sum+n;
            }
        }
        System.out.println("Sum of even numbers multiplied by 2: " + sum);
        
// consumer interface to perform an action for each element in the list

        //   Consumer<Integer> consumer = new Consumer<Integer>() {
        //     public void accept(Integer n){
        //         System.out.println("Consumer accepted: " + n);
        //     }
        // };

// or we can directly use a lambda expression in the forEach method
        Consumer<Integer> consumer = n -> System.out.println("Consumer accepted: " + n);
   
        nums.forEach(consumer);
        
    }
}
