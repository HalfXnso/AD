/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploprocedimiento;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author AlfonsoGaitanPerez
 */
public class EjemploProcedimiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here

        Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/bancos", "root", "");

        String sentencia = "{CALL ingreso(?,?)}";
        //Creamos la llamada el procedimiento 
        CallableStatement procedimiento = miConexion.prepareCall(sentencia);

        procedimiento.setInt(1, 2);
        procedimiento.setDouble(2, 600);

        int exito = procedimiento.executeUpdate();
        if (exito == 0) {
            System.out.println("No ha sido posible ejecutar este procedimiento");
        } else {
            System.out.println("Procedimiento exitoso");
        }
        miConexion.close();

    }

}
