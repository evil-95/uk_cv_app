/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connectionBD;
import java.sql.*;
/**
 *
 * @author LENOVO
 */
public class ConnexionBD {
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.jbdc.Driver");
            Connection connect = DriverManager.getConnection("jbdc:mysql://localhost/etudiants" , "root" , "");
            
            Statement stat = connect.createStatement();
            
            ResultSet res = stat.executeQuery("SELECT * FROM Etudiants");
      
            while(res.next()){
                System.out.println();
            }
            
        }catch(Exception e){
            System.out.println("ERROR :"+e.getMessage());
        }
    }
}