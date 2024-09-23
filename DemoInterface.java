//every method in interface is by default **public abstract**

//interface is a blueprint of a class
//interface is a collection of abstract methods
//interface cannot be instantiated

interface A {
    
    //All the variables inside interface are **final and static**
    int i = 5;  //by default it is public static final

    void show();   //by default it is public abstract
    void config();
}

interface C {
    void run();
}

//class -> class = extends
//class -> interface = implements
//interface -> interface = extends

interface X extends C {

}

class B implements A,X
{
    public void show() {
        System.out.println("Show");
    }

    public void config() {
        System.out.println("Config");
    }

    public void run() {
        System.out.println("Run");
    }
}

public class DemoInterface {

    public static void main(String[] args) {
            
        A obj = new B();
        obj.show();
        obj.config();

        //we have to create a object reference of type X to implement class X
        X obj1 = new B();
        obj1.run();
    }
    
}
