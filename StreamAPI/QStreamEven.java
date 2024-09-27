
import java.util.Arrays;
import java.util.List;
public class QStreamEven {


    public static void main(String[] args) {
        
        List<Integer> arr = Arrays.asList(10,15,8,49,20,98,32);

        arr.stream().filter(n -> n%2 == 0).forEach(n -> System.out.println(n));

    }
}
