/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplomysql;

import java.sql.*;

/**
 *
 * @author AlfonsoGaitanPerez
 */
public class EjemploMySQL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {

        Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/videoclub", "root", "");

        consultaPelicula(miConexion, 6);
        eliminaPelicula(miConexion, 6);
        consultaPelicula(miConexion, 6);
        miConexion.close();
    }

    public static void listaPeliculas(Statement sentencia) throws SQLException {
        ResultSet resultado = sentencia.executeQuery("SELECT * FROM PELICULAS");
        while (resultado.next()) {
            String codpelicula = resultado.getString("codpelicula");
            String titulo = resultado.getString("titulo");
            String tema = resultado.getString("tema");
            int duracion = resultado.getInt("duracion");
            double precio = resultado.getDouble("precio");
            System.out.println("Codigo Pelicula: " + codpelicula);
            System.out.println("Título: " + titulo);
            System.out.println("Tema: " + tema);
            System.out.println("Duración: " + duracion);
            System.out.println("Precio: " + precio);
            System.out.println("Precio con IVA: " + precio * 1.21);
            System.out.println("******************************");
        }
    }

    public static void consultaPelicula(Connection conexion, int cod) throws SQLException {
        PreparedStatement sentencia = conexion.prepareStatement("SELECT * FROM peliculas WHERE codpelicula = ?");

        sentencia.setInt(1, cod);
        ResultSet resultado = sentencia.executeQuery();
        while (resultado.next()) {
            int codPelicula = resultado.getInt("codpelicula");
            String titulo = resultado.getString("titulo");
            String tema = resultado.getString("tema");
            int duracion = resultado.getInt("duracion");
            double precio = resultado.getDouble("precio");
            System.out.println("Código película: " + codPelicula);
            System.out.println("Título: " + titulo);
            System.out.println("Tema: " + tema);
            System.out.println("Duración: " + duracion);
            System.out.println("Precio: " + precio);
        }
    }

    public static void insertaPelicula(Connection conexion,
            int codPelicula, String titulo, String tema, int duracion, double precio) throws SQLException {
        PreparedStatement sentencia = conexion.prepareStatement("INSERT INTO peliculas VALUES (?,?,?,?,?)");
        sentencia.setInt(1, codPelicula);
        sentencia.setString(2, titulo);
        sentencia.setString(3, tema);
        sentencia.setInt(4, duracion);
        sentencia.setDouble(5, precio);

        int numRegistros = sentencia.executeUpdate();
        if (numRegistros == 0) {
            System.out.println("Película NO insertada.");
        } else {
            System.out.println("Película insertada.");
        }
    }

    public static void eliminaPelicula(Connection conexion, int codPelicula) throws SQLException {

        PreparedStatement sentencia = conexion.prepareStatement("DELETE FROM peliculas WHERE codpelicula = ?");
        sentencia.setInt(1, codPelicula);

        int numRegistros = sentencia.executeUpdate();
        if (numRegistros == 0) {
            System.out.println("Película NO eliminada.");
        } else {
            System.out.println("Película eliminada.");
        }
    }

    public static void actualizaPrecio(Connection conexion, int codPelicula, double precio) throws SQLException {
        PreparedStatement sentencia = conexion.prepareStatement("UPDATE peliculas SET precio = ? WHERE codpelicula = ?");
        sentencia.setInt(2, codPelicula);
        sentencia.setDouble(1, precio);
        int numRegistros = sentencia.executeUpdate();
        if (numRegistros == 0) {
            System.out.println("Película NO actualizada.");
        } else {
            System.out.println("Película actualizada.");
        }

    }
}
