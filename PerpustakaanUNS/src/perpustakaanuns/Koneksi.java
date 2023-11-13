/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpustakaanuns;
import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author acer
 */
public class Koneksi {
    private static Connection MYSQLConfig;
    public static Connection configIO() throws SQLException{
        try{
            String url = "jdbc:mysql:// localhost:3306/sistemadminperpus";
            String user = "root";
            String pass = "";
            
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            MYSQLConfig = DriverManager.getConnection(url, user, pass);
            
        }catch(SQLException e) {
            System.out.println("KONEKSI KE DATABASE GAGAL" + e.getMessage());
        }
        return MYSQLConfig;
    }
    
}
