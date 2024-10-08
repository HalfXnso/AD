/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio30t2ad;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

/**
 *
 * @author AlfonsoGaitanPerez
 */
public class Ejercicio30T2AD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        
          Connection miConexion = DriverManager.getConnection
        ("jdbc:mysql://localhost:3306/inmobiliaria", "root", "");
        String sentencia = "{?=CALL devuelveIvaAnual(?)}";
        CallableStatement funcion = miConexion.prepareCall(sentencia);
        
        funcion.setInt(2, 1);
        funcion.registerOutParameter(1, Types.DECIMAL);
        
        
       funcion.executeUpdate();
        System.out.println("Saldo: "+ funcion.getDouble(1));
        miConexion.close();
        
        System.out.println("Carles putero");
    }
    
}
