/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicat3ad;

import controlador.NewHibernateUtil;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author AlfonsoGaitanPerez
 */
public class PracticaT3AD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Logger.getLogger("org.hibernate").setLevel(Level.SEVERE);
        SessionFactory miConexion = NewHibernateUtil.getSessionFactory();

        //Mostrar los equips de la marca HP
        String sentencia = "FROM Equipos p WHERE p.marca = 'HP' ";
        muestraDatos(miConexion, sentencia);
        System.out.println("\n");
        //Mostrar los equipos de menos de 15 pulgadas.
        sentencia = "FROM Equipos p WHERE p.pulgadasPantalla < 15";
        muestraDatos(miConexion, sentencia);
        System.out.println("\n");
        //Mostrar los equipos de más de 4 Gb de Memoria y más de 500Gb de disco duro.
        sentencia = "FROM Equipos p WHERE p.gbMemoria > 4 AND p.capacidadDisco > 500";
        muestraDatos(miConexion, sentencia);
        System.out.println("\n");
        //Mostrar los equipos de menos de 1000 euros o con 8GB de Memoria RAM.
        sentencia = "FROM Equipos p WHERE p.precio < 1000 OR p.gbMemoria = 8";
        muestraDatos(miConexion, sentencia);
        System.out.println("\n");
        //Mostrar los equipos que en la descripción contenga la palabra ultrabook.
        sentencia = "FROM Equipos p WHERE p.descripcion LIKE '%ultrabook%'";
        muestraDatos(miConexion, sentencia);
        miConexion.close();
    }

    public static void muestraDatos(SessionFactory miConexion, String sentencia) {
        Session sesion = miConexion.openSession();
        Transaction transaccion = sesion.beginTransaction();

        Query consulta = sesion.createQuery(sentencia);

        List resultado = consulta.list();
        transaccion.commit();
        sesion.close();

        Iterator iterador = resultado.iterator();
        while (iterador.hasNext()) {
            System.out.println(iterador.next());
        }
    }
}
