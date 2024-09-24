import java.util.Arrays;
import java.util.List;
//import java.util.function.Consumer;
import java.util.stream.Stream;

public class DemoStreamAPI {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList( 10, 5, 20, 15);

        // int sum = 0;
        // for(int n : nums) {
        //     if(n%2 == 0) {
        //         n = n*2;
        //         sum =+ n;
        //     }
        // }

        // Consumer<Integer> con = new Consumer<Integer>() {  //Consumer is a finctional interface 
        //     @Override
        //     public void accept(Integer n) {
        //         System.out.println(n);
        //     }
        // };
        // to lambda expression
        // Consumer<Integer> con = n -> System.out.println(n);
        // nums.forEach(con);                              // con is nothing but n -> System.out.println(n)

        nums.forEach(n -> System.out.println("Without Stream : " +n));      //forEach method is defined in Iterable interface which accepts
        // Consumer as a parameter.
        //System.out.println("Original List: " + nums);
        //System.out.println("Sum of even numbers: " + sum);

        //Use of **Stream**

        // Stream<Integer> s1 = nums.stream();
        // s1.forEach(n -> System.out.println("Using Stream : " +n));  
        // //you can use stream only once so we take a new stream for nums
        // Stream<Integer> s2 = nums.stream().filter(n -> n%2 == 0);
        // Stream<Integer> s3 = s2.map(n -> n*2);
        // int result = s3.reduce(0, (c,e) -> c+e);
        //In this case, the reduction operation starts with an initial value of 0. The lambda expression (c, e) -> c + e defines 
        //the binary operator that will be applied to the elements of the stream. Here, c represents the accumulated result 
        //(starting with the initial value of 0), and e represents the current element of the stream. 
        //The lambda expression specifies that the current element e should be added to the accumulated result c.

        int result = nums.stream()
                        .filter(n -> n%2 == 0) // filter takes a Predicate type which is a functional interface with a boolean test method (true/ false)
                        //Predicate<Integer> p = new Predicate<>(){
                        //     @Override
                        //     public boolean test(Integer n) {
                        //         return n%2 == 0;
                        //     };
                        .map(n -> n*2) //map takes a Function type which is a functional interface with apply() method
                        //Function<Integer, Integer> f = new Function<>(){
                        //     @Override
                        //     public Integer apply(Integer n) {
                        //         return n*2;
                        //     };
                        .reduce(0, (c, e) -> c+e); //single line //reduce will give a single output of Integer type.
                        // c = carry, e= current element

        System.out.println("Result: " + result);
    }
}
