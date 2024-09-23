
class Mobile {
    
    String brand; //instance variable
    static String model;
    int price;

    public Mobile() {
        //this is a constructor
        brand = "";
        //model = "Galaxy"; //static variable should be classed only once
        price = 70000;

        System.out.println("In Constructor");
        //everytime a class is called by created a object, it will run/call the constructor
    }

    //without object the JVM will not load the class. 
    //but this can be bypassed by just calling class method

    static {
    //static blocks are always called first because class loads first then objects gets instantiated

        model = "Galaxy";
        System.out.println("In static block");
    }
    
    public void show() {
        System.out.println("Brand: " + brand + " model: " +model + " price: " +price);
    }

    public static void show1(Mobile obj) {
        System.out.println("Model: " + model); //only static variables can be called directly inside a satic method
        //non static variables cannot be called directly inside a static method

        System.out.println("Brand: " + obj.brand + " price: " + obj.price); //

        System.out.println("In static method");
    }
}

public class Demo2 {
    
    public static void main(String args[]) throws ClassNotFoundException { 

    //without object the JVM will not load the class. 
    //but this can be bypassed by just calling class method

        //Class.forName("Mobile"); //o/p= In static block


        Mobile obj1 = new Mobile();
        obj1.brand = "Samsung";
        Mobile.model = "Galaxy";
        obj1.price = 10000; 


        Mobile obj2 = new Mobile();
        
        

        //Mobile.model = "IQOO"; //static is called for something common for all, 
        //and we call it with the class name instead of object. 
        //But we can pass objects inside the static method/variable to get a certain value

        // Static variables are shared b/w different objects

        /*obj1.show();
        obj2.show();
        */

        //Mobile.show(); //non static methods cannot be called by class
        Mobile.show1(obj1);
    }
}
