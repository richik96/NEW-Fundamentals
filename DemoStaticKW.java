
class Student {
    int roll;//instance variables : variables created in a class outside a method
    int marks;
    String name; 

}

public class DemoStaticKW {

    public static void main(String[] args) {

        //Static Context: By declaring the main method as static, 
        //it can be called without needing an object of the class, 
        //which is essential for the JVM to start the execution of the program.


        Student s1 = new Student();
        s1.roll = 101;
        s1.name = "John";
        s1.marks = 90;

        Student s2 = new Student();
        s2.roll = 102;
        s2.name = "Doe";
        s2.marks = 80;

        Student s3 = new Student();
        s3.roll = 103;
        s3.name = "Smith";
        s3.marks = 70;

        Student students[] = new Student[3];

        students[0] = s1;
        students[1] = s2;
        students[2] = s3;


        //Enhanced for loop : 
        for (Student stud : students) {
            System.out.println("Roll: " + stud.roll + " Name: " + stud.name + " Marks: " + stud.marks);
        }
        
    }
}


