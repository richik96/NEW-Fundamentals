package threading;

public class InnerPrintWithThreads {

    public static void main(String[] args) {        
        for(int i=1; i<=100; i++) {
            PrintWithThreads pwt = new PrintWithThreads(i);

            Thread t = new Thread(pwt);
            t.start();
        }
    }    
}