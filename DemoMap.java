import java.util.HashMap;
import java.util.Map;

public class DemoMap {
    
    public static void main(String[] args) {
    
        Map<String, Integer> students = new HashMap<>();

        students.put("Richik", 84);
        students.put("Rahul", 90);
        students.put("Rohan", 78);
        students.put("Rohan", 80); //overwrites the previous value
        students.put("Rupam", 85); 
        //put = add a key, if key already exists replace it

        System.out.println(students); //output full key value pair

        System.out.println(students.keySet()); //shows only keys

        System.out.println("with for loop :");
        for (String key : students.keySet()) {
            System.out.println(key + " : " + students.get(key));
        }
    }

    
}
