/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9t0;

/**
 *
 * @author AlfonsoGaitanPerez
 */
public class Mesa extends Mueble {

    double ancho;
    double largo;

    public Mesa(double ancho, double largo, String codigo, String material, double precio) {
        super(codigo, material, precio);
        this.ancho = ancho;
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    @Override
    public String toString() {
        return super.toString() + "Mesa{" + "ancho=" + ancho + ", largo=" + largo + '}';
    }

}
