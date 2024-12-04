
/**
 * Human
 */
class Human {
    private int age;                // private access modifier - mode of encapsulation
    private String name;            //private variables can only be accessed within the same class
                                    //one of the best practice is to make instance variables private
                                    //and provide public getter and setter methods to access and modify the values of the instance variables
    public Human(int age, String name) { //parameterized constructor
        this.age = age;
        this.name = name;
        System.out.println("Inside parameterized constructor");
    }
    public Human() {  //default constructor
        this.age = 12;
        this.name = "Vik123";
        System.out.println("Inside default constructor");
    }
    public int getAge() { //getters
        return age;
    }
    //accessed within the same class
    public String getName() {
        return name;
    }
    public void setAge(int age) { //setters
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
        //Instance Variable Reference: When a method parameter or local variable has the same name as an instance variable, 
        //this is used to refer to the instance variable.
        //Current Object Context: this provides a way to refer to the current object within an instance method or constructor.
        //Method Chaining: It can also be used to return the current object from a method, enabling method chaining.
    }

    //IDE has a automation to generate the getters and setters through source action button
}

public class Demo3 {

    public static void main(String[] args) {
        
        Human h1 = new Human();
        System.out.println("Name: " +h1.getName() + " Age: " + h1.getAge());

        Human h = new Human(69, "R.P.Dutta");
        System.out.println("Name: " +h.getName() + " Age: " + h.getAge());
        //h.age = 20;  
        //h.name = "John"; --> error - cannot access directly
        h.setAge(20);
        h.setName("John");

        System.out.println("with setter");
        System.out.println("Name: " +h.getName() + " Age: " + h.getAge());
        //System.out.println();
        
    }
}
