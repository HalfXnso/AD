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
public class Silla extends Mueble{
    int numPatas;
    String materialTapizado;
    boolean respaldo;

    public Silla(int numPatas, String materialTapizado, boolean respaldo, String codigo, String material, double precio) {
        super(codigo, material, precio);
        this.numPatas = numPatas;
        this.materialTapizado = materialTapizado;
        this.respaldo = respaldo;
    }

    public int getNumPatas() {
        return numPatas;
    }

    public void setNumPatas(int numPatas) {
        this.numPatas = numPatas;
    }

    public String getMaterialTapizado() {
        return materialTapizado;
    }

    public void setMaterialTapizado(String materialTapizado) {
        this.materialTapizado = materialTapizado;
    }

    public boolean isRespaldo() {
        return respaldo;
    }

    public void setRespaldo(boolean respaldo) {
        this.respaldo = respaldo;
    }

    @Override
    public String toString() {
        return super.toString()+"Silla{" + "numPatas=" + numPatas + ", materialTapizado=" + materialTapizado + ", respaldo=" + respaldo + '}';
    }
    
    
}
