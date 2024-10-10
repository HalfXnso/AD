/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicat1ad;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author AlfonsoGaitanPerez
 */
@XmlRootElement
@XmlType(propOrder = {"nombre", "capital","superficie","habitantes", "costero"})
public class Pais {

    private String nombre;
    private String capital;
    private double superficie;
    private int habitantes;
    private boolean costero;

    public Pais() {
    }

    public Pais(String nombre, String capital, double superficie, int habitantes, boolean costero) {
        this.nombre = nombre;
        this.capital = capital;
        this.superficie = superficie;
        this.habitantes = habitantes;
        this.costero = costero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public int getHabitantes() {
        return habitantes;
    }

    public void setHabitantes(int habitantes) {
        this.habitantes = habitantes;
    }

    public boolean isCostero() {
        return costero;
    }

    public void setCostero(boolean costero) {
        this.costero = costero;
    }

    @Override
    public String toString() {
        return "Pais{" + "nombre=" + nombre + ", capital=" + capital + ", superficie=" + superficie + ", habitantes=" + habitantes + ", costero=" + costero + '}';
    }

}
