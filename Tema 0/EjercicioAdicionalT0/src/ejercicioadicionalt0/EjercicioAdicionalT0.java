/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioadicionalt0;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;

/**
 *
 * @author AlfonsoGaitanPerez
 */
public class EjercicioAdicionalT0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Evento miEvento = new Evento("1231ara", "Pos un concierto", 132, "Madriz", LocalDate.of(2020, Month.MARCH, 6),
                LocalTime.of(12, 0), 600);
        Evento miEvento2 = new Evento("1231ara", "Pos un concierto", 132, "Valencia", LocalDate.of(2022, Month.MARCH, 6),
                LocalTime.of(12, 0), 1200);
        Concierto miConcierto = new Concierto("Edgal y las nesas", 1, "Funk", "121ASDFA", "pOS UN GRUPO", 132, "mÁLAGA", LocalDate.MIN, LocalTime.NOON, 1);
        Concierto miConcierto2 = new Concierto("Edgal y las nesas", 2, "Funk", "121ASDFA", "pOS UN GRUPO", 132, "mÁLAGA", LocalDate.MIN, LocalTime.NOON, 1);

        ArrayList<Evento> misEventos = new ArrayList();
        misEventos.add(miEvento);
        misEventos.add(miEvento2);

        ArrayList<Concierto> misConciertos = new ArrayList();
        misConciertos.add(miConcierto);
        misConciertos.add(miConcierto2);
        System.out.println(listaConcierto(misConciertos));
        System.out.println(listaEventosFecha(LocalDate.of(2020, Month.MARCH, 3), misEventos));
        System.out.println(listaEventosLugar("Madriz", misEventos));
        System.out.println(listaEventosPrecio(1200, misEventos));

    }

    public static ArrayList<Evento> listaEventosFecha(LocalDate fecha, ArrayList<Evento> eventos) {
        ArrayList<Evento> eventosPosteriores = new ArrayList();
        for (Evento evento : eventos) {
            if (evento.getFecha().isAfter(fecha)) {
                eventosPosteriores.add(evento);
            }
        }
        return eventosPosteriores;
    }

    public static ArrayList<Evento> listaEventosLugar(String lugar, ArrayList<Evento> eventos) {
        ArrayList<Evento> eventoLugar = new ArrayList();
        for (Evento evento : eventos) {
            if (evento.getLugar().equals(lugar)) {
                eventoLugar.add(evento);
            }
        }
        return eventoLugar;
    }

    public static ArrayList<Evento> listaEventosPrecio(double precio, ArrayList<Evento> eventos) {
        ArrayList<Evento> eventoPrecio = new ArrayList();
        for (Evento evento : eventos) {
            if (evento.getPrecio() == precio) {
                eventoPrecio.add(evento);
            }
        }
        return eventoPrecio;
    }

    public static ArrayList<Concierto> listaConcierto(String estilo, ArrayList<Concierto> conciertos) {
        ArrayList<Concierto> conciertoEstilo = new ArrayList();
        for (Concierto concierto : conciertos) {
            if (concierto.getEstilo() == estilo) {
                conciertoEstilo.add(concierto);
            }
        }
        return conciertoEstilo;

    }

    public static ArrayList<Concierto> listaConcierto(String estilo, int numMaxComp, ArrayList<Concierto> conciertos) {
        ArrayList<Concierto> conciertoEstilo = new ArrayList();
        for (Concierto concierto : conciertos) {
            if (concierto.getEstilo() == estilo) {
                conciertoEstilo.add(concierto);
            }
        }
        return conciertoEstilo;

    }

    public static ArrayList<Concierto> listaConcierto(ArrayList<Concierto> conciertos) {
        ArrayList<Concierto> conciertoEstilo = new ArrayList();
        for (Concierto concierto : conciertos) {
            if (concierto.getNumComponentes() == 1) {
                conciertoEstilo.add(concierto);
            }
        }
        return conciertoEstilo;

    }
}
