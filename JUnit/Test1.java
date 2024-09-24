package JUnit;

public class Test1 {
    
    public static void main(String[] args) {
        DemoUnitTest1 demo = new DemoUnitTest1();
        
        int result = demo.divide(15, 5);
        
        //performing Assertion = verify the result

        if(result == 3) {
            //alerting developer
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }

    }
}
