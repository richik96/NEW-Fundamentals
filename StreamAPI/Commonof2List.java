package StreamAPI;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

public class Commonof2List {

    public static void main(String[] args) {
        
        List<Integer> arr1 = Arrays.asList(10,15,8,49,20,98,32);
        List<Integer> arr2 = Arrays.asList(10,15,8,49,20,98,32, 100, 200, 300);

        //filter(predicate) --> to filter a stream
        //collect() --> to collect the stream into a list
        
        List<Integer> common = arr1.stream().filter(arr2::contains).collect(Collectors.toList());

        System.out.println(common);
    }
}
