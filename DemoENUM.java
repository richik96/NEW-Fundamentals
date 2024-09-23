// enum is a special class in java
// enum is a keyword
// enum is a collection of constants and methods
// enum is a special class that extends java.lang.Enum class
// enum can have fields, constructors and methods
// enum can implement interfaces
// enum cannot be instantiated
// enum can have abstract methods
// enum can have concrete methods
// enum can have main method
// enum can have constructor
// enum can have fields

enum Status {
    Running, Failed, Pending, Succcess; //constants or objects
}

public class DemoENUM {
    public static void main(String[] args) {
        

        int i = 5;
        Status status = Status.Running;

        System.out.println(status);
        System.out.println(status.ordinal());  //ordinal() will return the order of the current object 

        //getting all the enum objects available

        Status status1[] = Status.values();  //object.values() return a array of all the enums
        for(Status s: status1) {
            System.out.println(s);
        }

        // we can use switch case as well to get the objects

        switch (status) {
            case Running:
                System.out.println("Please wait");
                break;
        
            case Failed:
                System.out.println("Failed");
                break;

            case Pending :
                System.out.println("Pending");
                break;

            default:
                System.out.println("Success");
                break;
        }
    }
}
