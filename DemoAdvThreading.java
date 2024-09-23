//The synchronized keyword ensures that the increment method is executed atomically, preventing race conditions.

class Counter {

    int count;

    //The synchronized keyword in the increment method ensures that only one thread can execute the method at a time
    // on the same Counter object. This prevents race conditions and ensures that the count variable
    // is updated correctly when accessed by multiple threads. 
    synchronized void increment() { 
        count++;
    } 
}

public class DemoAdvThreading {
    
    public static void main(String[] args) throws InterruptedException {
        
        Counter c = new Counter();
        Runnable obj1 = () -> {
            for(int i=0; i<100; i++) {
                c.increment();
            }
        };

        Runnable obj2 = () -> {
            for(int i=0; i<100; i++) {
                c.increment();
            }
        };
        
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
        //join() method in Java is used to pause the execution of the current thread (in this case, the main thread) until 
        //the thread t1 has finished executing. 
        //This ensures that the main thread waits for t1 to complete before proceeding to the next line of code.

        t1.join(); //wait for thread t1 to finish
        t2.join(); //wait for thread t2 to finish

        System.out.println(c.count);

    }
}
