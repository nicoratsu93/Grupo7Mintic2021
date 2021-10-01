
package conexionmysql_s27;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ConexionMySQL_s27 {

    
    public static void main(String[] args) {
        // Código del programa
        Scanner consola=new Scanner(System.in);
        //Definición de los parámetros de conexión
        String usuario,clave,url,driver,sql;
        //Definición de variables de Conexión y Statement(ejecutar sentencias SQL)
        Connection con=null;
        Statement stmt=null;
        ResultSet rs;
        //PAsignar valores a los parametros de conexión
        usuario="root";
        clave="123456";
        url="jdbc:mysql://localhost:3306/biblioteca_s27";
        driver="com.mysql.cj.jdbc.Driver";
        
        try {
            //Primera parte: La conexión
            //Punto 1) Activar el driver
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            System.out.println("Error en el Driver");
            System.exit(0);
        }
        try {
            //Punto 2) Realizar la conexión
            con=DriverManager.getConnection(url, usuario, clave);
        } catch (SQLException ex) {
            System.out.println("Error en la conexión");
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
        sql="insert into tema values('11','TEMA 11')";
        try {
            stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            System.out.println("Error en la sentencia SQL");
            System.exit(0);
        }
        
        System.out.println("Operación realizada correctamente");
        
        
        
        
        
        
        
        
        
    }
    
}
