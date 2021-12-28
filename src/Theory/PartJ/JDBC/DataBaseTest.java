package Theory.PartJ.JDBC;

import java.sql.*;

public class DataBaseTest {
    public static void main(String[] args) throws SQLException{
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shivaDatabase", "root", "sanjay14");

        Statement stm = con.createStatement();

        ResultSet result = stm.executeQuery("select * from student");

        while(result.next()) {
            System.out.println(result.getString("name"));
        }

    }

}
