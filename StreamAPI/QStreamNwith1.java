
import java.util.Arrays;
import java.util.List;
// import java.util.Map;
// import java.util.stream.Collectors;

public class QStreamNwith1 {

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(10,15,8,49,20,98,32);

        arr.stream().map(s -> s+"").filter(s-> s.startsWith("1")).forEach(n -> System.out.println(n));
    }
}
