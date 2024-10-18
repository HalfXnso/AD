/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1t3ad;

import Controlador.NewHibernateUtil;
import Modelos.Socios;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author AlfonsoGaitanPerez
 */
public class Ejercicio1T3AD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Logger.getLogger("org.hibernate").setLevel(Level.SEVERE);
        SessionFactory miConexion = NewHibernateUtil.getSessionFactory();

        BigDecimal precio = new BigDecimal(5.50);

        System.out.println(consultaPelicula(miConexion, 69));
        System.out.println("\n");
        borraSocios(miConexion, 1288);
        List<Socios> listaSocios = listaSocios(miConexion);
        for (Iterator<Socios> iterator = listaSocios.iterator(); iterator.hasNext();) {
            Socios next = iterator.next();
            System.out.println(next);
        }

        miConexion.close();
    }

    public static void altaPelicula(SessionFactory miConexion, Socios miSocio) {
        Session sesion = miConexion.openSession();
        Transaction transaccion = sesion.beginTransaction();

        sesion.save(miSocio);
        transaccion.commit();

        sesion.close();
        System.out.println("Los semáforos son como las pastillas: Rojas,verdes y amarillas");

    }

    public static Socios consultaPelicula(SessionFactory miConexion, int codSocio) {
        Session sesion = miConexion.openSession();
        Transaction transaccion = sesion.beginTransaction();

        Socios miSocio = (Socios) sesion.get(Socios.class, codSocio);

        transaccion.commit();

        sesion.close();
        System.out.println("Los semáforos son como las pastillas: Rojas,verdes y amarillas");
        return miSocio;
    }

    public static List<Socios> listaSocios(SessionFactory miConexion) {
        Session sesion = miConexion.openSession();
        Transaction transaccion = sesion.beginTransaction();

        Query registros = sesion.createQuery("from Socios");
        List<Socios> lista = registros.list();

        transaccion.commit();
        sesion.close();
        return lista;
    }

    public static void borraSocios(SessionFactory miConexion, int codSocio) {
        Session sesion = miConexion.openSession();
        Transaction transaccion = sesion.beginTransaction();

        Socios miSocio = new Socios();
        miSocio.setCodsocio(codSocio);

        sesion.delete(miSocio);
        transaccion.commit();
        sesion.close();
    }

    public static void actualizaSocios(SessionFactory miConexion, Socios miSocio) {
        Session sesion = miConexion.openSession();
        Transaction transaccion = sesion.beginTransaction();

        sesion.update(miSocio);
        transaccion.commit();
        sesion.close();

    }

}
