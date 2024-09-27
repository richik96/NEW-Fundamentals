
import java.util.Arrays;
import java.util.List;


public class QStreamMaxValue {

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(10,15,8,49,20,98,32);

        arr.stream().max((n1, n2) -> n1.compareTo(n2)).ifPresent(n -> System.out.println(n));
    }
}
