
//Java Database Connectivity (JDBC) is an application programming interface (API) for the programming language Java,
//which defines how a client may access a database.
//It is part of the Java Standard Edition platform, from Oracle Corporation.

/*
* Steps to connect to a database in Java
* 1. import the package --> import java.sql.*;
* 2. Load and register the driver --> com.mysql.jdbc.Driver
* 3. Create a connection
* 4. Create a statement
* 5. Execute the query
* 6. Process the results
* 7. Close
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class App {
    public static void main(String[] args) throws Exception {

            String url = "jdbc:mysql://localhost:3306/richikdb";
            String uname = "root";
            String pass = "Rd@sql123";
            String query = "select * from students";

        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, uname, pass);
            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(query);

            //rs.next();
            while(rs.next()){
                String name = rs.getString("name");
                System.out.println(name);
            }

            //clearing up step 6
            rs.close(); 
            st.close();
            con.close();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
            System.out.println(e);
        }
    }
}
