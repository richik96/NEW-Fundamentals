
abstract class A {

    //defining abstract methods in a abstract class
    public abstract void show();

    public abstract void config();
}


public class DemoAbstractInnerClass {
    
    public static void main(String[] args) {
        

        //defining the abstract methods through **annonymous inner class**
        A a = new A() {
            public void show() {
                System.out.println("In Show A");
            }

            public void config() {
                System.out.println("In config A");
            }
        };


        a.show();
        a.config();

    }
}
