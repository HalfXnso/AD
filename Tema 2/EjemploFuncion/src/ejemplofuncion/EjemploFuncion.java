/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplofuncion;

import java.sql.*;

/**
 *
 * @author AlfonsoGaitanPerez
 */
public class EjemploFuncion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/bancos", "root", "");
        String sentencia = "{?=CALL consultaSaldo(?)}";
        CallableStatement funcion = miConexion.prepareCall(sentencia);
        
        funcion.setInt(2, 1);
        funcion.registerOutParameter(1, Types.DECIMAL);
        
        
       funcion.executeUpdate();
        System.out.println("Saldo: "+ funcion.getDouble(1));
        miConexion.close();
            }

}
