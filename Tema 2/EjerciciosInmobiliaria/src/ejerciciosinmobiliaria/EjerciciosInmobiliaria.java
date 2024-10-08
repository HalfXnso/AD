/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosinmobiliaria;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author AlfonsoGaitanPerez
 */
public class EjerciciosInmobiliaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {

        Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/inmobiliaria", "root", "");
        Scanner tec = new Scanner(System.in);
        System.out.print("Escribe un importe:");
        double importe = tec.nextDouble();
        tec.nextLine();
        listarSegunPrecio(miConexion, importe);

        System.out.println("-----------");

        System.out.print("Escribe una dirección: ");
        String direccion = tec.nextLine();
        listarSegunDireccion(miConexion, direccion);
        System.out.println("-----------");

        System.out.print("Escribe una dirección: ");
        String poblacion = tec.nextLine();
        listarSegunPoblacion(miConexion, poblacion);
        miConexion.close();
    }

    public static void listarRegistros(Connection conexion) throws SQLException {
        Statement sentencia = conexion.createStatement();
        ResultSet resultado = sentencia.executeQuery("SELECT * FROM alquileres");

        while (resultado.next()) {
            int idAlquiler = resultado.getInt("idAlquiler");
            String direccion = resultado.getString("direccion");
            String poblacion = resultado.getString("poblacion");
            int codPostal = resultado.getInt("codPostal");
            double precioAlquiler = resultado.getDouble("precioAlquiler");
            String idContacto = resultado.getString("idContacto");
            String telefono = resultado.getString("telefono");

            System.out.println("ID Alquiler: " + idAlquiler);
            System.out.println("Dirección: " + direccion);
            System.out.println("Población: " + poblacion);
            System.out.println("Código Postal: " + codPostal);
            System.out.println("Precio de Alquiler: $" + precioAlquiler);
            System.out.println("ID Contacto: " + idContacto);
            System.out.println("Teléfono: " + telefono);

        }
    }

    public static void listarSegunPrecio(Connection conexion, double importe) throws SQLException {
        PreparedStatement sentencia = conexion.prepareStatement("SELECT * FROM alquileres WHERE precioAlquiler >= ?");
        sentencia.setDouble(1, importe);

        ResultSet resultado = sentencia.executeQuery();

        while (resultado.next()) {
            int idAlquiler = resultado.getInt("idAlquiler");
            String direccion = resultado.getString("direccion");
            String poblacion = resultado.getString("poblacion");
            int codPostal = resultado.getInt("codPostal");
            double precioAlquiler = resultado.getDouble("precioAlquiler");
            String idContacto = resultado.getString("idContacto");
            String telefono = resultado.getString("telefono");

            System.out.println("ID Alquiler: " + idAlquiler);
            System.out.println("Dirección: " + direccion);
            System.out.println("Población: " + poblacion);
            System.out.println("Código Postal: " + codPostal);
            System.out.println("Precio de Alquiler: $" + precioAlquiler);
            System.out.println("ID Contacto: " + idContacto);
            System.out.println("Teléfono: " + telefono);
        }
    }

    public static void listarSegunDireccion(Connection conexion, String direccionIntr) throws SQLException {
        PreparedStatement sentencia = conexion.prepareStatement("SELECT * FROM alquileres WHERE direccion LIKE ?");
        sentencia.setString(1, "%" + direccionIntr + "%");
        ResultSet resultado = sentencia.executeQuery();

        while (resultado.next()) {
            int idAlquiler = resultado.getInt("idAlquiler");
            String direccion = resultado.getString("direccion");
            String poblacion = resultado.getString("poblacion");
            int codPostal = resultado.getInt("codPostal");
            double precioAlquiler = resultado.getDouble("precioAlquiler");
            String idContacto = resultado.getString("idContacto");
            String telefono = resultado.getString("telefono");

            System.out.println("ID Alquiler: " + idAlquiler);
            System.out.println("Dirección: " + direccion);
            System.out.println("Población: " + poblacion);
            System.out.println("Código Postal: " + codPostal);
            System.out.println("Precio de Alquiler: $" + precioAlquiler);
            System.out.println("ID Contacto: " + idContacto);
            System.out.println("Teléfono: " + telefono);
        }

    }

    public static void listarSegunPoblacion(Connection conexion, String poblacionStr) throws SQLException {
        PreparedStatement sentencia = conexion.prepareStatement("SELECT * FROM alquileres WHERE poblacion LIKE ?");
        sentencia.setString(1, "%" + poblacionStr + "%");
        ResultSet resultado = sentencia.executeQuery();

        while (resultado.next()) {
            int idAlquiler = resultado.getInt("idAlquiler");
            String direccion = resultado.getString("direccion");
            String poblacion = resultado.getString("poblacion");
            int codPostal = resultado.getInt("codPostal");
            double precioAlquiler = resultado.getDouble("precioAlquiler");
            String idContacto = resultado.getString("idContacto");
            String telefono = resultado.getString("telefono");

            System.out.println("ID Alquiler: " + idAlquiler);
            System.out.println("Dirección: " + direccion);
            System.out.println("Población: " + poblacion);
            System.out.println("Código Postal: " + codPostal);
            System.out.println("Precio de Alquiler: $" + precioAlquiler);
            System.out.println("ID Contacto: " + idContacto);
            System.out.println("Teléfono: " + telefono);
        }

    }
}
