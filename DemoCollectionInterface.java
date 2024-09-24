import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class DemoCollectionInterface {
    
    public static void main(String[] args) {
        
        Collection<Integer> nums = new ArrayList<>(); //by default collection will take objects
        //always put the type for the object to avoid errors
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);

        //System.out.println(nums); //prints [1, 2, 3, 4]

        System.out.println("ArrayList : ");
        for (Integer n : nums) {
            System.out.println(n);
        }

        Set<Integer> nums2 = new HashSet<>();

        nums2.add(12);
        nums2.add(13);
        nums2.add(14);
        nums2.add(15);
        nums2.add(12); //in set duplicate values are not allowed

        System.out.println("Hashset : ");
        for (Integer n : nums2) {
            System.out.println(n);  //output may not be in sorted format
        }

        Collection<Integer> nums3 = new TreeSet<>();

        nums3.add(22);
        nums3.add(23);
        nums3.add(24);
        nums3.add(25);
        nums3.add(22); //in set duplicate values are not allowed

        System.out.println("TreeSet : ");
        for (Integer n : nums3) {
            System.out.println(n);  //output will be in sorted format
        }

        Iterator<Integer> values = nums.iterator(); //Iterator is the top most Interface

        while (values.hasNext()) {
            System.out.println(values.next()); //prints 1 2 3 4
        }
    }

}
