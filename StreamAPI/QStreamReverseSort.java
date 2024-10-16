
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import java.util.stream.Collectors;



public class QStreamReverseSort {


    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(10,15,8,49,20,98,32);

        List<Integer>result= arr.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        System.out.println(result);
    }
}
