package SerializeDemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        
        //Serialization
        Employee emp = new Employee();
        emp.setId(1);
        emp.setName("John");
        
        FileOutputStream fileOut = new FileOutputStream("C:\\Users\\drich\\OneDrive\\Desktop\\Codes\\JAVA\\fundamentals\\Outputs\\Demo_serialize_1.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(emp);
        out.close();
        fileOut.close();
        
        //Deserialization
        FileInputStream fileIn = new FileInputStream("C:\\Users\\drich\\OneDrive\\Desktop\\Codes\\JAVA\\fundamentals\\Outputs\\Demo_serialize_1.ser");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        Employee empDeserialized = (Employee) in.readObject();
        System.out.println("Employee : " + empDeserialized.getName());
        in.close();
        fileIn.close();
    }
}
