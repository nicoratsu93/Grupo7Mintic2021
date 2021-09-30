/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conectorsqlg7;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP dw1071
 */
public class ConectorSQLG7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner consola=new Scanner(System.in);
        String usuario,clave,url,driver,sql;
        Connection con = null;
        Statement stmt = null;
        ResultSet rs; 
        usuario="root";
        clave="Santafe1963";
        url="jdbc:mysql://localhost:3306/larockola_g7_mintic";
        driver="com.mysql.cj.jdbc.Driver";
        try {
            Class.forName(driver);
           } 
        catch (ClassNotFoundException ex){
               System.out.println("Error en el driver");
               System.exit(0);
           }
        try {
            con=DriverManager.getConnection(url, usuario, clave);
           } 
        catch (SQLException ex){
               System.out.println("Error en el driver");
               System.exit(0);
           }
        
        try {
            //Segunda parte=> Statement
            //Punto 1) Crear el Statement
            stmt=con.createStatement();
        } catch (SQLException ex) {
            System.out.println("Error en el Statement");
            System.exit(0);
        }
        //Punto 2)Ejecutar sentencias SQL
        sql="insert into compositor values('001','Bob Dylan')";
        try {
            stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            System.out.println("Error en la sentencia SQL");
            System.exit(0);
        }
        
        System.out.println("Operación realizada correctamente");
        
    }
    
}
