/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplohql;

import controlador.NewHibernateUtil;
import java.util.Iterator;
import java.util.List;
import java.util.logging.*;
import org.hibernate.*;
import sun.util.logging.PlatformLogger;

/**
 *
 * @author AlfonsoGaitanPerez
 */
public class EjemploHQL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Logger.getLogger("org.hibernate").setLevel(Level.SEVERE);
        SessionFactory miConexion = NewHibernateUtil.getSessionFactory();
        String sentencia = "FROM Peliculas p where p.tema = 'sexual'";
        consultaHQL(miConexion, sentencia);
        miConexion.close();

    }

    public static void consultaHQL(SessionFactory miConexion, String sentencia) {
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
