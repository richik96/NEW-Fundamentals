
class A {

    int huge;

    public void show() {  //non static method, so we need a object to access it
        System.out.println("In Show A");
    }

    static class B {

        public void config() {

            System.out.println("In config B");
        }
    }
}

public class DemoInnerClass {
    
    public static void main(String[] args) {
        
        A a = new A();
        a.show();

        A.B b = new A.B(); 
        //as class B is inside class A, it is accessed by A.B and to create a object of inner class B, you need object of A class 
        // so a.new B() here we create inner class B as static so we can directly call it by A.B()
        b.config();


        // this same can be done through a different method

        A a1 = new A()
        {
            public void show() {
                System.out.println("Inside the new A show");
            } 
        };              //here we are creating a new inner class and overriding it. this is also called annonymous **inner class**
        a1.show();
    }
}
