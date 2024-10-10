/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplotransaccion;

import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author AlfonsoGaitanPerez
 */
public class EjemploTransaccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/bancos", "root", "");

        
        transaccion(miConexion,1,2,3000);
        
        miConexion.close();

    }

    public static void transaccion(Connection miConexion, int cuentaOrigen, int cuentaDestino, double cantidad) throws SQLException {

        int registrosOrigen;
        int registrosDestino;
        double saldoOrigen = 0;
        double saldoDestino = 0;

        ResultSet resultado;
        String sentenciaActualizaOrigen = "UPDATE cuentas SET saldo = saldo - ? WHERE numCuenta = ?";
        String sentenciaActualizaDestino = "UPDATE cuentas SET saldo = saldo + ? WHERE numCuenta = ?";
        String sentenciaConsultaSaldo = "SELECT saldo FROM cuentas  WHERE numCuenta = ?";

        miConexion.setAutoCommit(false);
        PreparedStatement sentencia = miConexion.prepareStatement(sentenciaActualizaOrigen);
        sentencia.setDouble(1, cantidad);
        sentencia.setInt(2, cuentaOrigen);
        registrosOrigen = sentencia.executeUpdate();

        sentencia = miConexion.prepareStatement(sentenciaActualizaDestino);
        sentencia.setDouble(1, cantidad);
        sentencia.setInt(2, cuentaDestino);
        registrosDestino = sentencia.executeUpdate();
        
        sentencia = miConexion.prepareStatement(sentenciaConsultaSaldo);
        sentencia.setInt(1, cuentaOrigen);

        resultado = sentencia.executeQuery();
        while (resultado.next()) {
            saldoOrigen = resultado.getDouble("SALDO");
        }
        if((registrosOrigen==0)||(registrosDestino==0)||
           (saldoOrigen<0)||(saldoDestino<0)){
            // deshacemos cambios
            miConexion.rollback();
            System.out.println("Transacción NO Realizada");
        } else {
            // Confirmamos la transaccion
            System.out.println("Transacción Realizada");
            miConexion.commit();
        }
        miConexion.setAutoCommit(true);
    }

}
