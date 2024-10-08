/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioadicionalt0;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author AlfonsoGaitanPerez
 */
public class Concierto extends Evento {

    private String grupoCantante;
    private int numComponentes;
    private String estilo;

    public Concierto(String grupoCantante, int numComponentes, String estilo, String codigo, String descripcion, int aforo, String lugar, LocalDate fecha, LocalTime hora, double precio) {
        super(codigo, descripcion, aforo, lugar, fecha, hora, precio);
        this.grupoCantante = grupoCantante;
        this.numComponentes = numComponentes;
        this.estilo = estilo;
    }

    public String getGrupoCantante() {
        return grupoCantante;
    }

    public void setGrupoCantante(String grupoCantante) {
        this.grupoCantante = grupoCantante;
    }

    public int getNumComponentes() {
        return numComponentes;
    }

    public void setNumComponentes(int numComponentes) {
        this.numComponentes = numComponentes;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    @Override
    public String toString() {
        return super.toString() + "Concierto{" + "grupoCantante=" + grupoCantante + ", numComponentes=" + numComponentes + ", estilo=" + estilo + '}';
    }

}
