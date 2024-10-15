/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplohibernate;

import controlador.HibernateUtil;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Peliculas;
import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author AlfonsoGaitanPerez
 */
public class EjemploHibernate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Logger.getLogger("org.hibernate").setLevel(Level.SEVERE);
        SessionFactory miConexion = HibernateUtil.getSessionFactory();

        BigDecimal precio = new BigDecimal(5.50);

        System.out.println(consultaPelicula(miConexion, 69));
        System.out.println("\n");
        List<Peliculas> listaPeliculas = listaPeliculas(miConexion);
        for (Iterator<Peliculas> iterator = listaPeliculas.iterator(); iterator.hasNext();) {
            Peliculas next = iterator.next();
            System.out.println(next);
        }
        miConexion.close();
    }

    public static void altaPelicula(SessionFactory miConexion, Peliculas miPelicula) {
        Session sesion = miConexion.openSession();
        Transaction transaccion = sesion.beginTransaction();

        sesion.save(miPelicula);
        transaccion.commit();

        sesion.close();
        System.out.println("Los semáforos son como las pastillas: Rojas,verdes y amarillas");

    }

    public static Peliculas consultaPelicula(SessionFactory miConexion, int codPelicula) {
        Session sesion = miConexion.openSession();
        Transaction transaccion = sesion.beginTransaction();

        Peliculas miPelicula = (Peliculas) sesion.get(Peliculas.class, codPelicula);

        transaccion.commit();

        sesion.close();
        System.out.println("Los semáforos son como las pastillas: Rojas,verdes y amarillas");
        return miPelicula;
    }

    public static List<Peliculas> listaPeliculas(SessionFactory miConexion) {
        Session sesion = miConexion.openSession();
        Transaction transaccion = sesion.beginTransaction();

        Query registros = sesion.createQuery("from Peliculas");
        List<Peliculas> lista = registros.list();

        transaccion.commit();
        sesion.close();
        return lista;
    }
    
    public static void borraPeliculas(SessionFactory miConexion, int codPelicula) {
        Session sesion = miConexion.openSession();
        Transaction transaccion = sesion.beginTransaction();

        Peliculas miPelicula = new Peliculas();
        miPelicula.setCodpelicula(codPelicula);
        
        transaccion.commit();
        sesion.close();
    }
    
}
