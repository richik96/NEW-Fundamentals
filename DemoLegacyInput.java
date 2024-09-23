import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class DemoLegacyInput {
    
    public static void main(String[] args) throws NumberFormatException, IOException {
        System.out.println("Enter a number ");
        //System is a class and out is a static method

        InputStreamReader in = new InputStreamReader(System.in); //

        BufferedReader bf = new BufferedReader(in);
        //opening the resource --> this has to be closed eventually

        int num = Integer.parseInt(bf.readLine()); //converting string to Int
        System.out.println("You entered: " + num);
        bf.close();
    }
}
