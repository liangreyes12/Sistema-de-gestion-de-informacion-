package Conexiones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion{
    
    Connection con;
    
    public Connection getConexion(){
    
        try {
            String myBD = "jdbc:mysql://localhost:3306/ferreteria?serverTimezone=UTC";
            con = DriverManager.getConnection(myBD, "root", "");
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        
        return con;
    }
}