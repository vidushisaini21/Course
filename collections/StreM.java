package collections;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


public class StreM {
    public static void main(String[] args) {
       
        List<Integer> nums = Arrays.asList(4,5,7,6,8,9,10);
        Stream<Integer> s1 = nums.stream();

        s1.forEach(n -> System.out.println(n));
        // we can also use method reference instead of lambda expression
        // s1.forEach(System.out::println)
;
        // we can also use filter method to filter out the even numbers
        Stream<Integer> s2 = s1.filter(n -> n%2==0);
        s2.forEach(n -> System.out.println("Even number: " + n));

        // we can also use map method to perform an operation on each element in the stream
        Stream<Integer> s3 = s2.map(n -> n*2);
        s3.forEach(n -> System.out.println("Even number multiplied by 2: " + n));

    }
}
