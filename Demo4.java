
        //every class in java extends to object class
        // this() method executes the same class
        //super() method executes the super class

class A extends Object{  //by default, we don't have to type extends Object

    public A(){
        super();  //this basically calls a constructor of the object class i.e. --> Object()
        System.out.println("Inside A");
    }

    public A(int x) {
        System.out.println("Inside A with Int");
    }
}

class B extends A {

    public B() {
        super();  //calling the paramiterized super class i.e.= A(int x)
        System.out.println("Inside B");
    }

    public B(int x) {
        this();   //it will execute the constructor of the same class and as there is no parameter so it will call B() class
        //super(x);                    //there is a hidden super method inside all constructor by default
        System.out.println("Inside B with Int");
    }
}


public class Demo4 {

    public static void main(String[] args) {
        B b1 = new B(5);
    }
}
