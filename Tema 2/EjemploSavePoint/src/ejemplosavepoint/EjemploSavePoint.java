/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosavepoint;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Savepoint;

/**
 *
 * @author AlfonsoGaitanPerez
 */
public class EjemploSavePoint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/bancos", "root", "");

        String sentenciaSQL = "INSERT INTO cuentas VALUES (?,?,?)";
        PreparedStatement sentencia = miConexion.prepareStatement(sentenciaSQL);
        miConexion.setAutoCommit(false);

        sentencia.setInt(1, 3);
        sentencia.setString(2, "Joel");
        sentencia.setDouble(3, 3000);
        sentencia.executeUpdate();

        Savepoint punto = miConexion.setSavepoint();
        sentencia.setInt(1, 4);
        sentencia.setString(2, "ASDFADF");
        sentencia.setDouble(3, 8000);
        sentencia.executeUpdate();

        miConexion.rollback(punto);
        miConexion.commit();
        
        miConexion.close();

    }

}
