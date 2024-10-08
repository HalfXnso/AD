/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8t0;

/**
 *
 * @author AlfonsoGaitanPerez
 */
public class Mueble {

    String codigo;
    String material;
    double precio;

    public Mueble(String codigo, String material, double precio) {
        this.codigo = codigo;
        this.material = material;
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Mueble{" + "codigo=" + codigo + ", material=" + material + ", precio=" + precio + '}';
    }

    public double calculaIva() {
        return this.precio * 1.21;
    }

    public double calculaIva(int porcIva) {
        porcIva /= 100;
        double precioIva = this.precio * porcIva;
        return precioIva;

    }
}
