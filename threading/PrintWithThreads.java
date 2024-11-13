package threading;

public class PrintWithThreads implements Runnable{

    int numToPrint = 1;
    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName()+ " is printing i=" +numToPrint);
        numToPrint++;
    }
    // public PrintWithThreads(int i) {
    //     this.numToPrint = i;
    // }

}

/**
 * InnerPrintWithThreads
 */

