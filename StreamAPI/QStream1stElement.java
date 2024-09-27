
import java.util.List;
import java.util.Arrays;


public class QStream1stElement {

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(10,15,8,49,20,98,32);

        arr.stream().findFirst().ifPresent(n -> System.out.println(n));
    }
}
