
//we can create our very own custom exceptions
class MyException extends Exception {
    public MyException(String s) { //constructor
        super(s);
    }

    public MyException() {
        super();
    }
}

public class DemoCustomException {
    
    public static void main(String[] args) {
        //never put throws with main method to handle exception

        int i = 20;
        int j = 0;
        try {
            j = 18/i;
            if(j == 0)
                throw new MyException("custom exception caught"); //here we are passing a error message
        }

        catch (MyException e) {
            System.out.println("Caught an exception: " + e.getMessage()); //e.getMessage() method can be found under throwable
        }
    }
}
