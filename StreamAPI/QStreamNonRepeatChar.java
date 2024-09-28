

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.LinkedHashMap;


public class QStreamNonRepeatChar {

    public static void main(String[] args) {
        String str = "Hello World";
        // str.chars().mapToObj(n -> (char) n).distinct().forEach(n -> System.out.print(n));

        Character result = str.chars()//Stream of string
                                    .mapToObj(s-> Character.toLowerCase(Character.valueOf((char)s))) //First convert to character object then lowercase
                                    .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting())) //stores chars in the map with count
                                    .entrySet()
                                    .stream()
                                    .filter(e -> e.getValue() == 1L)
                                    .map(e -> e.getKey())
                                    .findFirst()
                                    .get();
        System.out.println("First non repeating character: "+result);
    }
}
