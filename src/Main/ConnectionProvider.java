/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;
import java.sql.*;


public class ConnectionProvider {
   
    public static Connection getConn() {
        try 
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/billing system","root","");
            return con;
        }catch(Exception e)
        {
            return null;
        }
    }
}
