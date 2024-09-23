
//abstact class cannot be instantiated or we cannot create a object for a abstract class


abstract class Car {                //abstract class can have normal class or abstract class
                                    //it is compulsory to define all the abstract methods in the child class   

    public abstract void drive();  //declaring a method --> have to use abstract keyword 

    public void playMusic() {       // defining a method--> called concrete method
        System.out.println("Playing Music");
    }
}

class Audi extends Car {  //can be called concrete class

    public void drive() {
        System.out.println("Audi is driving");
    }
}



public class DemoAbstract {
    
    public static void main(String[] args) {
        
        // Car c = new Car();  //cannot create object for abstract class

        /*In summary, the line Car a = new Audi(); is a powerful example of polymorphism in Java, 
        allowing for more flexible, scalable, and maintainable code by decoupling the code 
        that uses the Car type from the specific implementations of its subclasses.*/

        Car a = new Audi();  //creating object of the subclass which is concrete class
                                //here we have created a reference of the parent class which refers to the child class object
        a.drive();
        a.playMusic();
    }
}
