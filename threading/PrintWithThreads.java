package threading;

public class PrintWithThreads implements Runnable{

    int numToPrint;
    @Override
    public void run() {
        // TODO Auto-generated method stub
        System.out.println(Thread.currentThread().getName()+ " is printing i=" +numToPrint);
    }
    public PrintWithThreads(int i) {
        this.numToPrint = i;
    }

}

/**
 * InnerPrintWithThreads
 */

