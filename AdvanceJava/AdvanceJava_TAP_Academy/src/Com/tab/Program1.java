package Com.tab;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Program1 {
    public static void main(String[] args) throws SQLException {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con=  DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbctap","root","@Deepanshu9129");
            System.out.println(con);

        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }

    }
}
