//Use Comparable when you want to define a default sorting order for your objects.
//Use Comparator when you need to define multiple sorting orders or when you cannot modify the class to implement Comparable.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class Student implements Comparable<Student> { //Integer class implements comparable interface 
                                                //comparable has a comareTo() method
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {              //this method is responsible for the data output for students object
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student that) { //overriding comapareTo method from Comparable interface
        return this.age - that.age;
    }
}

public class DemoCollectionsSort {
    
    public static void main(String[] args) {
        Comparator<Integer> com = new Comparator<Integer>() {                   //annonymous class
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2; //ascending order

                //If the result is negative (o1 - o2 < 0), it means o1 is less than o2, and o1 should come before o2 in the sorted order.
                //If the result is zero (o1 - o2 == 0), it means o1 is equal to o2, and their order relative to each other does not change.
                //If the result is positive (o1 - o2 > 0), it means o1 is greater than o2, and o1 should come after o2 in the sorted order.
            }
        };

        //Lambda expression
        //Comparator<Integer> com = (o1, o2) -> o1 - o2;     //(functional interface)-> comparator<>

        List<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(5);
        nums.add(20);
        nums.add(15);

        Collections.sort(nums, com);
        System.out.println(nums);

        List<Student> students = new ArrayList<>();
        students.add(new Student(20, "Richik"));
        students.add(new Student(18, "Rahul"));
        students.add(new Student(22, "Rohan"));
        students.add(new Student(21, "Rupam"));

        // Comparator<Student> com1 = (o1, o2) -> {   //taking 2 student type and compares Student.age
        //     // if(o1.age > o2.age)
        //     //     return 1;                           // return 1 means it will swap
        //     // else if(o1.age < o2.age)
        //     //     return -1;                          //return -1 means it will not swap
        //     // else
        //     //     return 0;                           //equal, no swap
        //     return o1.age - o2.age;                     // in short
        // };

        //Collections.sort(students, com1); //this uses the overriden comparator com1 object method in main
        Collections.sort(students);     //this uses the compareTo method from Comparable Interface implemented in Student class
        for(Student s : students)
            System.out.println(s);
    }
}
