package threading;

public class InnerPrintWithThreads {

    public static void main(String[] args) {        
        PrintWithThreads pwt = new PrintWithThreads();
        Thread t1 = new Thread(pwt);
        Thread t2 = new Thread(pwt);
        Thread t3 = new Thread(pwt);

        t1.start();
        t2.start();
        t3.start();
    }    
}