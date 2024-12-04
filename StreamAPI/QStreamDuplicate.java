
//import java.util.stream.*;
import java.util.List;
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;


public class QStreamDuplicate {

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(10,15,8,49,20,98,32, 10, 15, 20, 32);

        //arr.stream().distinct().forEach(System.out::println);  //fetches non duplicate values

        //fetching only duplicates
        Set<Integer> set = new HashSet<>();
        System.out.println("duplicates :");
        arr.stream().filter(n -> !set.add(n)).forEach(System.out::println);

        List<String> str = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
        Set<String> set1 = new HashSet<>();
        str.stream().filter(n -> set1.add(n)).forEach(System.out::println);
    }
}
