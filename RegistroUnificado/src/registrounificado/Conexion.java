/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registrounificado;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    public static Connection getConnetion(){
        String conexionURL = "jdbc:sqlserver://localhost:1433;"
                + "database=Registro;"
                + "user=sa;"
                + "password=mauri3011;"
                + "loginTimeout=30;";
        try{
            Connection con = DriverManager.getConnection(conexionURL);
            return con;
        }catch(SQLException ex){
            System.out.println(ex.toString());
            return null;
        }
    } 
}
