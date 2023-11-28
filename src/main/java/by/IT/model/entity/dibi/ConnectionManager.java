package by.IT.model.entity.dibi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Objects;

public class ConnectionManager {
    private static final String URL ="jdbc:mysql://localhost:3306/po_2211";
    private static final String USER ="root";
    private static final String PASSWORD ="";

    private static Connection cn;

   static {
       try {
           Class.forName("com.mysql.cj.jdbc.Driver");
       } catch (ClassNotFoundException e) {
           e.printStackTrace();
       }
   }


    public static Connection getConnection() throws SQLException {
        if (Objects.isNull(cn) || cn.isClosed()){
            return DriverManager.getConnection(URL,USER,PASSWORD);
        }
        return  cn;
    }
}
