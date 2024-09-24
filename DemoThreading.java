
class Z {

}


// class A implements Runnable {

//     @Override
//     public void run() {
//         for (int i = 0; i < 5; i++) {
//             System.out.println("Hello");
//             try {
//                 Thread.sleep(10);
//             } catch (Exception e) {
//                 System.out.println(e);
//             }
//         }
//     }
// }

// class B extends Thread{

//     @Override
//     public void run() {
//         for (int i = 0; i < 5; i++) {
//             System.out.println("World");
//             try {
//                 Thread.sleep(10);
//             } catch (Exception e) {
//                 System.out.println(e);
//             }
//         }
//     }
// }

public class DemoThreading {
    
    public static void main(String[] args) {
     
        Runnable obj1 = new Runnable() {   //as A implements Runnable we can take a object of type Runnable
            //inner class/ annonymous class
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Hello");
                    try {
                        Thread.sleep(10);
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }
            }  
        };
        
        //using lambda
        Runnable obj2 = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("World");
                try {
                    Thread.sleep(10);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        };
        
        Thread t1 = new Thread(obj1); //Thread needs a runnable type object
        Thread t2 = new Thread(obj2);
        
        t1.start();
        t2.start();
    }
}
