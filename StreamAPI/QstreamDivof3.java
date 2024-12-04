

import java.util.Arrays;

public class QstreamDivof3 {


    public static void main(String[] args) {
        
        int[] arr = {2, 4, 6, 8, 2, 10, 4, 12, 6};

        Arrays.stream(arr).peek(n -> System.out.println("before " +n)).map(x -> (x%3 == 0)? x*x : x).forEach(i -> System.out.println("After " +i));
    }
}
