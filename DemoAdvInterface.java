
//functional interface/SAM : this interface can have a single abstract method
//SAM - single abstract method

@FunctionalInterface  //this annotation helps us with the code errors
interface A {

    void show(int i);
}


public class DemoAdvInterface {

    //creating inner class
    public static void main(String[] args) {

        /*A obj = new A() {
            public void show(int i) {
                System.out.println("In Show A " + i);
            }
        };
        obj.show(5);
        */

        //using **lambda expression**
        A obj1 = (i) -> System.out.println("In Show A " + i);  
        obj1.show(6);

        //lambda expression doesn't create a inner class file after compilation
    }
    
}
