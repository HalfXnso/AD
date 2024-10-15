/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicat2ad;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author AlfonsoGaitanPerez
 */
public class PracticaT2AD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/eventos", "root", "");
        transaccionVentaEntradas(miConexion, 13, 4);
    }

    public static void transaccionVentaEntradas(Connection miConexion, int numEntradas, int idEvento) throws SQLException {
        int registrosAforo;
        int registrosNumEntradas;
        int registroRecaudacion;
        int registrosAforoInicial;
        int entradas = 0;
        int numAforo = 0;
        //Lo más importante es saber el orden de las cosas, qué es lo primero que necesito para ejecutar el codigo, necesito saber cuantas entradas quedan,etc
        ResultSet resultado;
        String sentenciaActualizaNumEntradas = "UPDATE entradas SET entradasVendidas = entradasVendidas + ? WHERE idEvento = ?";
        String sentenciaActualizaRecaudacion = "UPDATE entradas SET recaudacionEvento = entradasVendidas * precioEvento WHERE idEvento =? ";
        String sentenciaConsultaAforoEvento = "SELECT aforoEvento FROM entradas WHERE idEvento= ?";
        String sentenciaConsultaNumEntradas = "SELECT entradasVendidas FROM entradas WHERE idEvento= ?";

        miConexion.setAutoCommit(false);
        
        PreparedStatement sentencia = miConexion.prepareStatement(sentenciaConsultaNumEntradas);
        sentencia.setInt(1, idEvento);
        resultado = sentencia.executeQuery();
        while (resultado.next()) {
            entradas = resultado.getInt("entradasVendidas");
        }
         sentencia = miConexion.prepareStatement(sentenciaActualizaNumEntradas);
        sentencia.setInt(1, numEntradas);
        sentencia.setInt(2, idEvento);
        registrosNumEntradas = sentencia.executeUpdate();
        System.out.println(registrosNumEntradas);
         
        sentencia = miConexion.prepareStatement(sentenciaConsultaAforoEvento);
        sentencia.setInt(1, idEvento);
        resultado = sentencia.executeQuery();
        while (resultado.next()) {
            numAforo = resultado.getInt("aforoEvento");
        }
        
          
         sentencia = miConexion.prepareStatement(sentenciaActualizaRecaudacion);
        sentencia.setInt(1, idEvento);
        registrosAforo = sentencia.executeUpdate();
        System.out.println(registrosAforo);
        
        if (numAforo < (entradas+numEntradas)) {
            // deshacemos cambios
            miConexion.rollback();
            System.out.println("No quedan entradas disponibles");
        } else {
            // Confirmamos la transaccion
            System.out.println("Compra de entradas Realizada");
            miConexion.commit();    
        }
        miConexion.setAutoCommit(true);
    }
}
