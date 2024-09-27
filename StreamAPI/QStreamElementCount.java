
import java.util.List;
import java.util.Arrays;

public class QStreamElementCount {

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(10,15,8,49,20,98,32, 10, 15, 20, 32);

        System.out.println("Total elements : "+arr.stream().count());
    }
}
